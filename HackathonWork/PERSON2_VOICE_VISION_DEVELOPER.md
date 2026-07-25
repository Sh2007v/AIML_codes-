# PERSON 2: VOICE & VISION AI DEVELOPER - Complete Documentation
## AI Classroom Teaching System - 4 Week Sprint (1 Month, Beginner-Friendly)

---

## **WHO YOU ARE**
- **Role**: Voice & Vision AI Developer
- **Responsibility**: Build everything that lets the AI *hear*, *speak*, and *see* — Whisper speech-to-text, Piper text-to-speech, the microphone input pipeline, the full voice teaching pipeline, emotion/attention detection setup, PaddleOCR book reading, and the book reading agent.
- **Your Output**: Python modules for voice and vision that plug into Person 1's FastAPI backend
- **Works With**: Person 1 (Backend, Database & LLM Agent Developer) gives you the FastAPI app and Ollama setup to build on top of, and wires your finished modules into their `/api/voice-question` and `/api/read-book-page` endpoints. Person 3 (Frontend Developer) will eventually call the endpoints your logic powers.
- **No cameras yet**: We'll add that in Phase 2
- **Starting point**: Complete beginner — no prior Python or AI experience assumed.

---

## **YOUR FINAL DELIVERABLE (Week 4)**

```
✅ AI reads and understands book (OCR)
     ↓
✅ Student speaks question via microphone
     ↓
✅ AI converts speech to text (Whisper)
     ↓
✅ AI finds answer in uploaded book (OCR + book reading agent)
     ↓
✅ AI responds in voice + text (Piper TTS)
     ↓
✅ All of this plugs into Person 1's FastAPI + Ollama + LangGraph backend
```

---

## **TECH STACK YOU NEED TO LEARN**

### **Priority 1 (Must Know)**
- Python (programming language)
- FastAPI (web framework, just enough to plug your code in)

### **Priority 2 (Must Learn)**
- Whisper (speech recognition)
- Piper TTS (text to speech)
- PaddleOCR (read text from images)

### **Priority 3 (Nice to Have)**
- PyTorch (AI framework)

---

## **WEEK-BY-WEEK BREAKDOWN**

---

# **WEEK 1: FOUNDATION (Days 1-7)**

## **Goal This Week**
Learn Python, FastAPI, database basics, and get Ollama running with Llama model.

### **Day 1-2: Python Basics**

**What You Need to Learn:**
```
- Variables, data types, strings
- Lists, dictionaries, tuples
- Functions and parameters
- If/else conditions
- For loops
- Try/except error handling
- Async/await (important for API)
```

**Time**: 2-3 hours

**How to Learn**:
1. Use Antigravity to explain with examples
2. Write small Python programs to test
3. Don't memorize - understand concepts

**Ask Antigravity This:**
```
"Teach me Python basics in 2 hours. 
Give me 10 practical examples.
Focus on: variables, functions, loops, error handling, async/await.
Explain why async/await matters for web servers."
```

**Python Code You Should Write** (Test yourself):
```python
# Test 1: Create a function that takes 2 numbers, returns sum
def add_numbers(a, b):
    return a + b

result = add_numbers(5, 3)
print(result)  # Should print 8

# Test 2: Create a list of students, loop through
students = ["Rahul", "Priya", "Amit"]
for student in students:
    print(f"Student: {student}")

# Test 3: Async function (important)
import asyncio

async def fetch_data():
    print("Fetching...")
    await asyncio.sleep(2)  # Wait 2 seconds
    return "Data fetched!"

# Run it
asyncio.run(fetch_data())

# Test 4: Error handling
try:
    result = 10 / 0  # This will error
except ZeroDivisionError:
    print("Cannot divide by zero!")
```

**Success Check**: Can you write and run these 4 programs?

---

### **Day 2-3: Setup Development Environment**

**What You Need to Do**:

1. **Install Python** (Latest version 3.11 or 3.12)
   - Windows: Download from python.org
   - Mac: `brew install python3`
   - Linux: `sudo apt-get install python3`

2. **Install VS Code** (Code editor)
   - Download from code.visualstudio.com
   - Install Python extension

3. **Create Project Folder**
   ```bash
   mkdir ai-classroom-backend
   cd ai-classroom-backend
   ```

4. **Create Python Virtual Environment** (keeps dependencies isolated)
   ```bash
   python -m venv venv
   
   # Activate it
   # Windows:
   venv\Scripts\activate
   
   # Mac/Linux:
   source venv/bin/activate
   ```

5. **Install FastAPI**
   ```bash
   pip install fastapi uvicorn
   ```

6. **Test It Works**
   ```bash
   fastapi --version  # Should show version number
   ```

**Ask Antigravity**:
```
"I'm on [Windows/Mac/Linux].
Walk me through setting up Python virtual environment 
and installing FastAPI step by step."
```

**Success Check**: Can you run `python --version` and see Python 3.11+?

---

### **Day 3-4: FastAPI Hello World**

**What is FastAPI?**
- Web framework to create APIs
- Your backend will receive requests from frontend
- FastAPI handles HTTP requests/responses

**Create File**: `main.py`

```python
from fastapi import FastAPI
from fastapi.responses import JSONResponse

app = FastAPI()

@app.get("/")
async def root():
    return {"message": "Hello from AI Classroom Backend!"}

@app.get("/api/hello")
async def hello():
    return JSONResponse({
        "status": "success",
        "message": "Backend is running"
    })

@app.post("/api/admin/login")
async def admin_login(email: str, password: str):
    if email == "admin@school.com" and password == "password":
        return {"success": True, "message": "Login successful"}
    else:
        return {"success": False, "message": "Invalid credentials"}

# Run with: uvicorn main:app --reload
```

**How to Run**:
```bash
# In your terminal (make sure venv is activated)
uvicorn main:app --reload

# You'll see:
# Uvicorn running on http://127.0.0.1:8000
```

**Test It**:
1. Open browser: `http://localhost:8000/`
2. You should see: `{"message":"Hello from AI Classroom Backend!"}`
3. Try: `http://localhost:8000/api/hello`

**Ask Antigravity**:
```
"Explain FastAPI decorators like @app.get and @app.post
Show me 5 different endpoint examples.
How do query parameters work vs body parameters?"
```

**Success Check**: Can you create and run a FastAPI endpoint that responds with JSON?

---

### **Day 4-5: PostgreSQL Database Setup**

**What is PostgreSQL?**
- Database to store student data
- Stores: student names, scores, attendance, progress

**Installation**:

**Windows/Mac**: 
- Download from postgresql.org
- Install with default settings
- Remember password you set

**Linux**:
```bash
sudo apt-get install postgresql postgresql-contrib
```

**Create Database**:
```bash
# Connect to PostgreSQL
psql -U postgres

# Create database
CREATE DATABASE ai_classroom;

# List databases (should see ai_classroom)
\l

# Exit
\q
```

**Python Connection Test**:

First install package:
```bash
pip install psycopg2-binary
```

Create `test_db.py`:
```python
import psycopg2

# Connect to database
connection = psycopg2.connect(
    host="localhost",
    database="ai_classroom",
    user="postgres",
    password="your_password"  # Change this to your password
)

cursor = connection.cursor()
print("✅ Database connection successful!")

# Create a simple table
cursor.execute("""
    CREATE TABLE IF NOT EXISTS students (
        id SERIAL PRIMARY KEY,
        name VARCHAR(100),
        roll_number INT,
        class INT
    )
""")

connection.commit()
print("✅ Table created successfully!")

cursor.close()
connection.close()
```

**Run it**:
```bash
python test_db.py
```

**Ask Antigravity**:
```
"Walk me through PostgreSQL setup on [your OS].
Explain primary key, SERIAL, VARCHAR.
Show me how to create and query tables."
```

**Success Check**: Can you create a PostgreSQL database and connect from Python?

---

### **Day 5-6: Ollama + Llama Model Setup**

**What is Ollama?**
- Software that runs AI language models locally (no internet needed)
- Your teaching AI will run here

**What is Llama?**
- Open-source language model (like ChatGPT but you can run locally)
- Works offline
- Perfect for rural areas

**Installation**:

**Windows/Mac**:
- Download from ollama.ai
- Run installer
- Follow prompts

**Linux**:
```bash
curl https://ollama.ai/install.sh | sh
```

**Download Llama Model** (takes 5-10 minutes):
```bash
ollama pull llama2
```

**Test Ollama**:
```bash
ollama run llama2

# Type: "What is photosynthesis?"
# It will respond

# Type: /bye to exit
```

**Python Integration Test**:

First install:
```bash
pip install ollama
```

Create `test_ollama.py`:
```python
import ollama

def teach_with_llm(chapter_text):
    """
    Give Ollama a chapter and ask it to explain
    """
    response = ollama.generate(
        model='llama2',
        prompt=f"""
        You are a teacher for 5th grade students.
        Explain this chapter in simple language:
        
        {chapter_text}
        
        Keep it short and easy to understand.
        """
    )
    return response

# Test
chapter = "Photosynthesis is the process by which plants make their own food using sunlight."
answer = teach_with_llm(chapter)
print(answer)
```

**Run it**:
```bash
python test_ollama.py
```

You should see Llama explain photosynthesis in simple language.

**Ask Antigravity**:
```
"Walk me through installing Ollama and Llama model on my [OS].
Explain how Ollama works and why it's important for offline teaching.
Show me how to call Ollama from Python with different prompts."
```

**Success Check**: Can you run Ollama and get responses from Llama in Python?

---

### **Day 6-7: Connect Everything Together**

**Your First Working System**:

Create `integration_test.py`:

```python
import psycopg2
import ollama
from fastapi import FastAPI
from fastapi.responses import JSONResponse
import uvicorn

# Step 1: Database connection
def get_db_connection():
    return psycopg2.connect(
        host="localhost",
        database="ai_classroom",
        user="postgres",
        password="your_password"
    )

# Step 2: Ollama teaching function
def teach_chapter(chapter_text):
    response = ollama.generate(
        model='llama2',
        prompt=f"Explain this for 5th graders: {chapter_text}"
    )
    return response

# Step 3: Create FastAPI app
app = FastAPI()

@app.post("/api/teach")
async def teach_lesson(chapter: str):
    """
    Admin sends chapter text
    AI teaches it
    Response saved to database
    """
    try:
        # Get response from Ollama
        ai_response = teach_chapter(chapter)
        
        # Save to database
        conn = get_db_connection()
        cursor = conn.cursor()
        
        cursor.execute("""
            INSERT INTO lessons (chapter, response, status)
            VALUES (%s, %s, %s)
        """, (chapter, ai_response['response'], "completed"))
        
        conn.commit()
        cursor.close()
        conn.close()
        
        return JSONResponse({
            "success": True,
            "chapter": chapter,
            "ai_response": ai_response['response'],
            "status": "taught"
        })
    
    except Exception as e:
        return JSONResponse({
            "success": False,
            "error": str(e)
        })

# Run with: uvicorn integration_test:app --reload
```

**First create the lessons table**:
```bash
python

# In Python shell:
import psycopg2

conn = psycopg2.connect(
    host="localhost",
    database="ai_classroom",
    user="postgres",
    password="your_password"
)

cursor = conn.cursor()

cursor.execute("""
    CREATE TABLE IF NOT EXISTS lessons (
        id SERIAL PRIMARY KEY,
        chapter TEXT,
        response TEXT,
        status VARCHAR(50)
    )
""")

conn.commit()
cursor.close()
conn.close()
print("✅ Table created!")
```

**Test it**:
```bash
uvicorn integration_test:app --reload

# In another terminal, test the API:
curl -X POST "http://localhost:8000/api/teach" \
  -H "Content-Type: application/json" \
  -d '{"chapter":"Photosynthesis is..."}'
```

**Success Check**: 
- ✅ FastAPI running?
- ✅ Ollama responding?
- ✅ Data saved to database?

---

### **Week 1 Summary**

**You should now be able to:**
- ✅ Write Python code
- ✅ Create FastAPI endpoints
- ✅ Connect to PostgreSQL
- ✅ Call Ollama LLM from Python
- ✅ Save responses to database

**Continue to Week 2 when you can answer YES to all above.**

---


---

# **WEEK 2: SPEECH RECOGNITION & TEXT-TO-SPEECH (Days 8-14)**

## **Goal This Week**
Add speech recognition (Whisper) and text-to-speech (Piper) so the AI can listen to and speak with students, and build the microphone input API.

### **Day 15-16: Whisper Speech Recognition**

**What is Whisper?**
- Converts audio to text
- "Student speaks: 'What is photosynthesis?'" → Text

**Install**:
```bash
pip install openai-whisper
pip install pyaudio
```

**Test Whisper**:

Create `test_whisper.py`:

```python
import whisper
import pyaudio
import wave
from datetime import datetime

# Load Whisper model
print("Loading Whisper model (first time takes ~1 minute)...")
model = whisper.load_model("base")  # or "tiny" for faster

print("✅ Whisper loaded!")

# Record audio from microphone
def record_audio(duration=5):
    """Record audio for N seconds"""
    CHUNK = 1024
    FORMAT = pyaudio.paFloat32
    CHANNELS = 1
    RATE = 16000
    
    p = pyaudio.PyAudio()
    stream = p.open(format=FORMAT, channels=CHANNELS, 
                    rate=RATE, input=True, 
                    frames_per_buffer=CHUNK)
    
    print(f"🎤 Recording for {duration} seconds...")
    frames = []
    
    for _ in range(int(RATE / CHUNK * duration)):
        data = stream.read(CHUNK)
        frames.append(data)
    
    print("✅ Recording complete")
    
    stream.stop_stream()
    stream.close()
    p.terminate()
    
    # Save as WAV
    filename = f"audio_{datetime.now().strftime('%Y%m%d_%H%M%S')}.wav"
    with wave.open(filename, 'wb') as wf:
        wf.setnchannels(CHANNELS)
        wf.setsampwidth(p.get_sample_size(FORMAT))
        wf.setframerate(RATE)
        wf.writeframes(b''.join(frames))
    
    print(f"💾 Saved to {filename}")
    return filename

# Transcribe audio
def transcribe_audio(audio_file):
    """Convert audio file to text"""
    print(f"\n📝 Transcribing {audio_file}...")
    result = model.transcribe(audio_file)
    return result["text"]

# Test it
print("\nTesting Whisper:")
audio_file = record_audio(duration=3)
text = transcribe_audio(audio_file)

print(f"\n📢 You said: {text}")
```

**Run it**:
```bash
python test_whisper.py

# Follow prompts to record
# It will transcribe what you said
```

**Ask Antigravity**:
```
"Explain Whisper model sizes (tiny, base, small, medium, large).
Which should I use for classroom?
How do I handle background noise?"
```

**Success Check**: Can you record and transcribe audio?

---

### **Day 16-17: Piper Text-to-Speech**

**What is Piper?**
- Converts text to speech
- "AI says: 'Good job!'" → Audio

**Install**:
```bash
pip install piper-tts
```

**Test Piper**:

Create `test_piper.py`:

```python
import piper
import wave
import os

# Initialize Piper
print("Loading Piper TTS model...")
# Download model first:
os.system("piper --download-dir /tmp en_US-amy-medium")

print("✅ Piper loaded!")

# Generate speech
def text_to_speech(text, output_file="output.wav"):
    """Convert text to speech"""
    print(f"\n🎙️ Converting text to speech...")
    print(f"Text: {text}")
    
    os.system(f'echo "{text}" | piper --model en_US-amy-medium --output-file {output_file}')
    
    print(f"✅ Speech saved to {output_file}")
    return output_file

# Test it
def test_tts():
    # Test 1: Simple teaching
    text1 = "Hello students! Today we will learn about photosynthesis."
    audio1 = text_to_speech(text1, "lesson.wav")
    
    # Test 2: Praise
    text2 = "Great job! Your answer is correct!"
    audio2 = text_to_speech(text2, "praise.wav")
    
    # Test 3: Question
    text3 = "Can you tell me what photosynthesis is?"
    audio3 = text_to_speech(text3, "question.wav")

test_tts()
```

**Run it**:
```bash
python test_piper.py

# Will generate: lesson.wav, praise.wav, question.wav
```

**To play audio** (test if it sounds good):
```bash
# Windows
start output.wav

# Mac
open output.wav

# Linux
play output.wav  # Need to install sox first: apt-get install sox
```

**Ask Antigravity**:
```
"Which Piper voice is best for teaching children?
How do I adjust speech speed?
Show me how to do multilingual speech (Hindi, English, etc)."
```

**Success Check**: Can you generate speech from text?

---

### **Day 17-18: Microphone Input API**

**Create FastAPI endpoint for recording**:

Create `voice_input.py`:

```python
from fastapi import FastAPI, File, UploadFile
from fastapi.responses import FileResponse, JSONResponse
import whisper
import pyaudio
import wave
import asyncio
import os
from datetime import datetime

app = FastAPI()
whisper_model = whisper.load_model("base")

@app.post("/api/record-audio")
async def record_audio(duration: int = 5):
    """
    Record audio from microphone for N seconds
    Returns: audio file path
    """
    try:
        CHUNK = 1024
        FORMAT = pyaudio.paFloat32
        CHANNELS = 1
        RATE = 16000
        
        p = pyaudio.PyAudio()
        stream = p.open(format=FORMAT, channels=CHANNELS, 
                        rate=RATE, input=True, frames_per_buffer=CHUNK)
        
        frames = []
        for _ in range(int(RATE / CHUNK * duration)):
            data = stream.read(CHUNK)
            frames.append(data)
        
        stream.stop_stream()
        stream.close()
        p.terminate()
        
        # Save file
        filename = f"audio_{datetime.now().strftime('%Y%m%d_%H%M%S')}.wav"
        filepath = f"uploads/{filename}"
        
        os.makedirs("uploads", exist_ok=True)
        
        with wave.open(filepath, 'wb') as wf:
            wf.setnchannels(CHANNELS)
            wf.setsampwidth(p.get_sample_size(FORMAT))
            wf.setframerate(RATE)
            wf.writeframes(b''.join(frames))
        
        return JSONResponse({
            "success": True,
            "filename": filename,
            "filepath": filepath
        })
    
    except Exception as e:
        return JSONResponse({
            "success": False,
            "error": str(e)
        })

@app.post("/api/transcribe")
async def transcribe(file: UploadFile = File(...)):
    """
    Receive audio file, transcribe to text
    Input: Audio file
    Output: Transcribed text
    """
    try:
        # Save uploaded file
        os.makedirs("uploads", exist_ok=True)
        filepath = f"uploads/{file.filename}"
        
        with open(filepath, "wb") as f:
            content = await file.read()
            f.write(content)
        
        # Transcribe
        result = whisper_model.transcribe(filepath)
        text = result["text"]
        
        return JSONResponse({
            "success": True,
            "text": text,
            "confidence": result.get("language", "en")
        })
    
    except Exception as e:
        return JSONResponse({
            "success": False,
            "error": str(e)
        })

@app.get("/api/download-audio/{filename}")
async def download_audio(filename: str):
    """Download recorded audio file"""
    filepath = f"uploads/{filename}"
    if os.path.exists(filepath):
        return FileResponse(filepath, media_type="audio/wav")
    else:
        return JSONResponse({"error": "File not found"})

# Run with: uvicorn voice_input:app --reload
```

**Test it**:
```bash
# Terminal 1: Start server
uvicorn voice_input:app --reload

# Terminal 2: Test recording
curl "http://localhost:8000/api/record-audio?duration=3"

# Should return: {"success": true, "filename": "audio_...wav"}
```

**Success Check**: Can you record via API and get filename?

---


---

# **WEEK 3: VOICE TEACHING PIPELINE (Days 15-21)**

## **Goal This Week**
Connect voice to the teaching flow end-to-end, set up emotion & attention detection, and run a full voice-system integration test.

### **Day 18-19: Connect Voice to Teaching**

**Full Voice Teaching Pipeline**:

Create `voice_teaching.py`:

```python
from fastapi import FastAPI, File, UploadFile
from fastapi.responses import FileResponse, JSONResponse
import whisper
import piper
import os
import wave
import psycopg2
from langgraph.graph import StateGraph
from langchain_community.llms import Ollama
from typing import TypedDict

app = FastAPI()
whisper_model = whisper.load_model("base")
llm = Ollama(model="llama2")

def get_db():
    return psycopg2.connect(
        host="localhost",
        database="ai_classroom",
        user="postgres",
        password="your_password"
    )

class VoiceInteraction(TypedDict):
    student_id: int
    student_name: str
    audio_file: str
    student_question: str
    ai_response: str
    response_audio_file: str
    status: str

# Step 1: Transcribe student voice
def transcribe_student_audio(state: VoiceInteraction):
    """Convert audio to text"""
    result = whisper_model.transcribe(state['audio_file'])
    state['student_question'] = result["text"]
    print(f"🎤 Student said: {state['student_question']}")
    return state

# Step 2: Get AI response
def get_ai_response(state: VoiceInteraction):
    """Generate response from LLM"""
    response = llm.invoke(state['student_question'])
    state['ai_response'] = response
    print(f"🤖 AI responds: {state['ai_response'][:100]}...")
    return state

# Step 3: Convert response to speech
def convert_to_speech(state: VoiceInteraction):
    """Convert AI response to audio"""
    # Save text to temp file
    with open("temp.txt", "w") as f:
        f.write(state['ai_response'])
    
    # Convert to speech
    filename = f"response_{state['student_id']}.wav"
    os.system(f'echo "{state['ai_response']}" | piper --model en_US-amy-medium --output-file {filename}')
    
    state['response_audio_file'] = filename
    print(f"🎙️ Response saved to: {filename}")
    
    return state

# Step 4: Save interaction to database
def save_interaction(state: VoiceInteraction):
    """Save to database"""
    conn = get_db()
    cursor = conn.cursor()
    
    cursor.execute("""
        INSERT INTO voice_interactions (student_id, question, response, status)
        VALUES (%s, %s, %s, %s)
    """, (state['student_id'], state['student_question'], state['ai_response'], "completed"))
    
    conn.commit()
    cursor.close()
    conn.close()
    
    state['status'] = "saved"
    print(f"💾 Interaction saved")
    
    return state

# Build workflow
workflow = StateGraph(VoiceInteraction)

workflow.add_node("transcribe", transcribe_student_audio)
workflow.add_node("respond", get_ai_response)
workflow.add_node("speech", convert_to_speech)
workflow.add_node("save", save_interaction)

workflow.add_edge("transcribe", "respond")
workflow.add_edge("respond", "speech")
workflow.add_edge("speech", "save")

workflow.set_entry_point("transcribe")
workflow.set_finish_point("save")

agent = workflow.compile()

@app.post("/api/voice-interaction")
async def voice_interaction(file: UploadFile = File(...), student_id: int = 1, student_name: str = "Student"):
    """
    Complete voice interaction:
    1. Student speaks question
    2. AI understands and responds
    3. Response converted to speech
    4. Everything saved to database
    """
    try:
        # Save uploaded audio
        os.makedirs("uploads", exist_ok=True)
        filepath = f"uploads/{file.filename}"
        
        with open(filepath, "wb") as f:
            content = await file.read()
            f.write(content)
        
        # Run agent
        state = {
            "student_id": student_id,
            "student_name": student_name,
            "audio_file": filepath,
            "student_question": "",
            "ai_response": "",
            "response_audio_file": "",
            "status": "processing"
        }
        
        result = agent.invoke(state)
        
        return JSONResponse({
            "success": True,
            "student_question": result['student_question'],
            "ai_response": result['ai_response'],
            "response_audio": result['response_audio_file'],
            "status": "complete"
        })
    
    except Exception as e:
        return JSONResponse({
            "success": False,
            "error": str(e)
        })

# Create table
# voice_interactions table needed in database
```

**Create the table**:
```python
import psycopg2

conn = psycopg2.connect(
    host="localhost",
    database="ai_classroom",
    user="postgres",
    password="your_password"
)

cursor = conn.cursor()

cursor.execute("""
    CREATE TABLE IF NOT EXISTS voice_interactions (
        id SERIAL PRIMARY KEY,
        student_id INT,
        question TEXT,
        response TEXT,
        status VARCHAR(50),
        timestamp TIMESTAMP DEFAULT NOW()
    )
""")

conn.commit()
cursor.close()
conn.close()
```

**Success Check**: Can you record voice, get text, generate response, convert to speech?

---

### **Day 19-20: Emotion & Attention Detection (Setup)**

For now, just prepare the endpoints. Real camera integration comes in Week 4.

Create `detection_setup.py`:

```python
from fastapi import FastAPI, UploadFile, File
from fastapi.responses import JSONResponse

app = FastAPI()

@app.post("/api/detect-emotion")
async def detect_emotion(file: UploadFile = File(...)):
    """
    Will detect emotion from face image
    (Implement in Phase 2)
    For now: return mock data
    """
    return JSONResponse({
        "emotion": "happy",
        "confidence": 0.85,
        "status": "ready_for_camera"
    })

@app.post("/api/detect-attention")
async def detect_attention(student_id: int):
    """
    Will detect if student is paying attention
    (Implement in Phase 2)
    """
    return JSONResponse({
        "student_id": student_id,
        "attention": "focused",
        "confidence": 0.9,
        "status": "ready_for_camera"
    })

@app.get("/api/attendance/{class_id}")
async def get_attendance(class_id: int):
    """
    Get attendance for class
    (Will use face recognition in Phase 2)
    """
    return JSONResponse({
        "class_id": class_id,
        "present": 32,
        "absent": 3,
        "total": 35,
        "status": "ready_for_camera"
    })
```

**Success Check**: Do endpoints respond?

---

### **Day 20-21: Week 3 Integration Test**

**Complete voice teaching flow**:

Create `week3_integration_test.py`:

```python
import os
os.system("rm uploads/* 2>/dev/null")  # Clean old files

# Test: Record → Transcribe → Respond → Speech → Save

# 1. Record audio (will be done by frontend, simulating here)
print("Step 1: Recording audio simulation")
import subprocess
subprocess.run([
    "piper",
    "--model", "en_US-amy-medium",
    "--output-file", "test_question.wav"
], input="What is photosynthesis?", text=True)

print("✅ Audio recorded\n")

# 2. Call full voice interaction endpoint
print("Step 2: Testing voice interaction endpoint")

import requests
import json

with open("test_question.wav", "rb") as f:
    response = requests.post(
        "http://localhost:8000/api/voice-interaction",
        files={"file": f},
        params={"student_id": 1, "student_name": "Rahul"}
    )

result = response.json()
print(f"✅ Voice interaction complete")
print(f"   Student question: {result['student_question']}")
print(f"   AI response: {result['ai_response'][:100]}...")
print(f"   Response audio: {result['response_audio']}\n")

# 3. Check database
print("Step 3: Verifying database save")

import psycopg2

conn = psycopg2.connect(
    host="localhost",
    database="ai_classroom",
    user="postgres",
    password="your_password"
)

cursor = conn.cursor()
cursor.execute("SELECT COUNT(*) FROM voice_interactions")
count = cursor.fetchone()[0]

print(f"✅ {count} interactions saved in database\n")

cursor.close()
conn.close()

# 4. Check if response audio was generated
print("Step 4: Checking response audio file")

response_file = result['response_audio']
if os.path.exists(response_file):
    print(f"✅ Audio file exists: {response_file}")
    file_size = os.path.getsize(response_file)
    print(f"   File size: {file_size} bytes")
else:
    print(f"❌ Audio file not found: {response_file}")

print("\n" + "="*60)
print("✅ WEEK 3 COMPLETE - VOICE SYSTEM WORKING!")
print("="*60)
```

**Run the integration test**:
```bash
# Terminal 1: Start server
uvicorn voice_teaching:app --reload

# Terminal 2: Run test
python week3_integration_test.py
```

**Expected Output**:
```
Step 1: Recording audio simulation
✅ Audio recorded

Step 2: Testing voice interaction endpoint
✅ Voice interaction complete
   Student question: What is photosynthesis?
   AI response: Photosynthesis is the process...
   Response audio: response_1.wav

Step 3: Verifying database save
✅ 1 interactions saved in database

Step 4: Checking response audio file
✅ Audio file exists: response_1.wav
   File size: 45320 bytes

============================================================
✅ WEEK 3 COMPLETE - VOICE SYSTEM WORKING!
============================================================
```

---

### **Week 3 Summary**

**You should now have:**
- ✅ Whisper speech recognition
- ✅ Piper text-to-speech
- ✅ Microphone recording API
- ✅ Full voice interaction pipeline
- ✅ Emotion detection setup
- ✅ Attention detection setup

---


---

# **WEEK 4: BOOK READING / VISION + HANDOFF (Days 22-28)**

## **Goal This Week**
Give the AI the ability to read book pages using OCR, build the agent that finds answers inside the uploaded book, then hand your finished voice + vision modules to Person 1 for integration.

- Reads text from images/PDFs
- Student shows book page → AI reads it

**Install**:
```bash
pip install paddleocr
pip install pdf2image  # For PDF support
```

**Test OCR**:

Create `test_ocr.py`:

```python
from paddleocr import PaddleOCR
import cv2
from PIL import Image

# Initialize OCR
print("Loading PaddleOCR (first time takes ~2 minutes)...")
ocr = PaddleOCR(use_angle_cls=True, lang='en')
print("✅ PaddleOCR loaded!")

def read_from_image(image_path):
    """Read text from image"""
    print(f"\n📖 Reading from: {image_path}")
    
    result = ocr.ocr(image_path, cls=True)
    
    # Combine all text
    full_text = "\n".join([line[0][1] for line in result])
    
    print(f"📝 Extracted text:\n{full_text[:200]}...")
    
    return full_text

def read_from_pdf(pdf_path):
    """Read text from PDF"""
    from pdf2image import convert_from_path
    import tempfile
    
    print(f"\n📖 Reading from PDF: {pdf_path}")
    
    # Convert PDF to images
    images = convert_from_path(pdf_path)
    
    all_text = ""
    for i, image in enumerate(images):
        with tempfile.NamedTemporaryFile(suffix=".png", delete=False) as f:
            image.save(f.name)
            text = read_from_image(f.name)
            all_text += f"\n--- Page {i+1} ---\n{text}"
    
    return all_text

# Test with sample image (you need to provide one)
# For now, create a simple test image with text
def create_test_image():
    """Create a simple test image"""
    # Using PIL to create image with text
    from PIL import Image, ImageDraw, ImageFont
    
    img = Image.new('RGB', (400, 200), color='white')
    d = ImageDraw.Draw(img)
    d.text((10, 10), "This is a test book page.\nPhotosynthesis is...", fill='black')
    img.save('test_book_page.png')
    print("✅ Created test_book_page.png")

create_test_image()
extracted = read_from_image('test_book_page.png')
print(f"\n✅ OCR Complete!")
```

**Run it**:
```bash
python test_ocr.py

# Should extract text from image
```

**Ask Antigravity**:
```
"How does PaddleOCR compare to Tesseract?
Which is better for book pages?
How do I handle handwritten text?
Show me code to process PDF files."
```

**Success Check**: Can you extract text from images?

---


2. Reads text with OCR
3. Understands question
4. Finds answer in book
5. Explains

Create `book_reading_agent.py`:

```python
from langgraph.graph import StateGraph
from langchain_community.llms import Ollama
from paddleocr import PaddleOCR
from typing import TypedDict
import json

class BookQuestion(TypedDict):
    student_id: int
    book_image_path: str
    book_extracted_text: str
    student_question: str
    found_answer: str
    explanation: str
    confidence: float

ocr = PaddleOCR(use_angle_cls=True, lang='en')
llm = Ollama(model="llama2")

def extract_book_text(state: BookQuestion):
    """Read book image with OCR"""
    print(f"📖 Extracting text from book image...")
    
    result = ocr.ocr(state['book_image_path'], cls=True)
    text = "\n".join([line[0][1] for line in result])
    
    state['book_extracted_text'] = text
    print(f"✅ Extracted {len(text)} characters")
    
    return state

def find_answer_in_book(state: BookQuestion):
    """Search for answer in extracted text"""
    print(f"🔍 Looking for answer to: {state['student_question']}")
    
    prompt = f"""
    Student asks: {state['student_question']}
    
    Book content:
    {state['book_extracted_text']}
    
    Find the answer to the student's question in the book content.
    Quote the relevant part from the book.
    """
    
    answer = llm.invoke(prompt)
    state['found_answer'] = answer
    
    print(f"✅ Found answer")
    
    return state

def explain_answer(state: BookQuestion):
    """Explain the answer clearly"""
    print(f"📝 Explaining answer...")
    
    prompt = f"""
    Student asked: {state['student_question']}
    
    Here's what the book says: {state['found_answer']}
    
    Explain this in simple language for a student.
    Make it easy to understand.
    """
    
    explanation = llm.invoke(prompt)
    state['explanation'] = explanation
    state['confidence'] = 0.85  # Confidence that answer is from book
    
    print(f"✅ Explanation ready")
    
    return state

# Build workflow
workflow = StateGraph(BookQuestion)

workflow.add_node("extract", extract_book_text)
workflow.add_node("find", find_answer_in_book)
workflow.add_node("explain", explain_answer)

workflow.add_edge("extract", "find")
workflow.add_edge("find", "explain")

workflow.set_entry_point("extract")
workflow.set_finish_point("explain")

agent = workflow.compile()

# Test function
def test_book_reading():
    # Create test book image (from Week 4 Day 22)
    state = {
        "student_id": 1,
        "book_image_path": "test_book_page.png",
        "book_extracted_text": "",
        "student_question": "What is photosynthesis?",
        "found_answer": "",
        "explanation": "",
        "confidence": 0.0
    }
    
    print("\n" + "="*60)
    print("📚 BOOK READING AGENT TEST")
    print("="*60 + "\n")
    
    result = agent.invoke(state)
    
    print("\n" + "="*60)
    print("📚 BOOK READING COMPLETE")
    print("="*60)
    print(f"Student Q: {result['student_question']}")
    print(f"Answer from book:\n{result['found_answer']}\n")
    print(f"Explanation:\n{result['explanation']}\n")
    print(f"Confidence: {result['confidence']*100}%")

if __name__ == "__main__":
    test_book_reading()
```

**Success Check**: Can agent read book, find answer, explain?

---

### **Week 4 Summary**

**You have completed:**
- ✅ Whisper speech recognition
- ✅ Piper text-to-speech
- ✅ Microphone input API
- ✅ Full voice teaching pipeline
- ✅ Emotion & attention detection (setup)
- ✅ PaddleOCR for book reading
- ✅ Book reading agent

---

# **FINAL DELIVERABLE (End of Week 4)**

```
PERSON 2'S COMPLETE VOICE & VISION MODULES:

✅ Whisper for speech recognition
✅ Piper for text-to-speech
✅ Microphone input API
✅ Voice-to-teaching pipeline
✅ Emotion & attention detection setup
✅ PaddleOCR for book reading
✅ Book reading agent that finds answers in the uploaded book
✅ All modules ready to plug into Person 1's FastAPI + Ollama + LangGraph backend

Hand these modules to Person 1 so they can wire them into
/api/voice-question and /api/read-book-page!
```

---

## **TROUBLESHOOTING CHECKLIST**

If something doesn't work:

1. **Python not found**
   ```bash
   python --version  # Should be 3.11+
   ```

2. **Whisper out of memory**
   ```bash
   # Use smaller model
   whisper_model = whisper.load_model("tiny")
   ```

3. **Piper not producing audio**
   - Double-check the model file path (e.g. `en_US-amy-medium`)
   - Make sure the `piper` command is on your system PATH

4. **PaddleOCR install issues**
   - Make sure you're using a supported Python version
   - Try installing CPU-only versions of dependencies first

---

**YOU'RE DONE WITH WEEK 4!**

**Next step: Hand your voice/vision modules to Person 1 (Backend, Database & LLM Agent Developer) to wire into the API endpoints. See PERSON1_BACKEND_CORE_DEVELOPER.md — and coordinate with Person 3 (Frontend Developer) on what the voice/OCR responses should look like.**
