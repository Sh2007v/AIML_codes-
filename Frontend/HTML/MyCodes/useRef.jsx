// function Login(){
//     const usernameRef = useRef(null);
//     const passwordRef = useRef(null);

//     function submit_form(e){
//         e.preventDefault();
//             console.log(usernameRef.current.value);
//             console.log(passwordRef.current.value);
        
//         return(
//             <form onSubmit={submit_form}>
//                 <input type='text'ref={usernameRef}id='username'/><br/>
//                 <input type='password' ref={passwordRef} id='password'/><br/>
//                 <input type='submit'value='SUBMIT FORM'/>
//             </form>
//         )
//     }
// }

//component does not get rerendered in useref
// function HiddenCounter(){
//     const countRef = useRef(0);

//     useEffect(()=>{console.log('re-render...')});
//     function incr(){
//         countRef.current++;
//         console.log(countRef.current);
//     }
//     return(
//         <>
//         <button onClick={incr}>Increment</button>
//         <h3>{countRef.current};</h3>
//         </>
//     );
// }

// <input type='text'>useRef OnClick={incr}</input>
// export default HiddenCounter


import { useState, useRef } from 'react';

function FocusInput() {
    const [name, setName] = useState('');
    const inputRef = useRef(null);

    function handleFocus() {
        inputRef.current.focus();
    }

    function handleClear() {
        setName('');
        inputRef.current.focus();
    }

    return (
        <div>
            <h2>Focus Input Example</h2>

            <input
                type="text"
                ref={inputRef}
                value={name}
                onChange={(e) => setName(e.target.value)}
                placeholder="Type your name here..."
            />

            <br /><br />

            <button onClick={handleFocus}>
                Focus Input
            </button>

            <button onClick={handleClear}>
                Clear & Focus
            </button>

            <h3>Character Count: {name.length}</h3>

            <h3>Preview: {name}</h3>
        </div>
    );
}

export default FocusInput;