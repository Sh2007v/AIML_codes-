from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")

db = client["CollegeDB"]
students = db["Students"]

print("Database and collection selected successfully.")

student = {
    "_id": 1,
    "RollNo": 101,
    "Name": "Aman",
    "Group": "CSE",
    "Semester": 4,
    "Marks": 85
}

result = students.insert_one(student)
print("\nInserted student ID:", result.inserted_id)

student_list = [
    {
        "_id": 2,
        "RollNo": 102,
        "Name": "Simran",
        "Group": "G1",
        "Semester": 4,
        "Marks": 92
    },
    {
        "_id": 3,
        "RollNo": 103,
        "Name": "Rahul",
        "Group": "G2",
        "Semester": 3,
        "Marks": 78
    },
    {
        "_id": 4,
        "RollNo": 104,
        "Name": "Priya",
        "Group": "G3",
        "Semester": 4,
        "Marks": 88
    },
    {
        "_id": 5,
        "RollNo": 105,
        "Name": "Karan",
        "Group": "G4",
        "Semester": 3,
        "Marks": 65
    }
]

result = students.insert_many(student_list)
print("Number of students inserted:", len(result.inserted_ids))

print("\n--- All Students ---")
for s in students.find().sort("_id", 1):
    print(s)

print("\n--- Student with RollNo 103 ---")
s = students.find_one({"RollNo": 103})
print(s)

print("\n--- Students scoring above 80 ---")
for s in students.find({"Marks": {"$gt": 80}}):
    print(s["Name"], "-", s["Marks"])

print("\n--- G1 Group Students ---")
for s in students.find({"Group": "G1"}):
    print(s["Name"])

query = {"Marks": {"$gte": 75, "$lte": 90}}

print("\n--- Students scoring between 75 and 90 ---")
for s in students.find(query):
    print(s["Name"], "-", s["Marks"])

query = {
    "Group": "G1",
    "Marks": {"$gt": 80}
}

print("\n--- G1 students scoring above 80 ---")
for s in students.find(query):
    print(s)

client.close()
print("\nMongoDB connection closed.")