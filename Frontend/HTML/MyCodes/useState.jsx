// function editElement(id){
//     let filterdata = data.filter((element)=> {
//         if(id == element.id){
//             element.email = prompt(`Enter new value for ${element.email}`);
//             element.name = prompt(`Enter new value for ${element.name}`);
//         }
//         return(
//             <h3 key = {element.id}>Name : {element.name}, City: {element.city},Email:{element.email};
//             <button onClick={()=>removeElement(element.id)}>DELETE</button>
//             <button onClick={()=>editElement(element.id)}>EDIT</button></h3>
//         )
//     })
//     SVGMetadataElement(filterdata);
// }


// function Login(){
//     let[myemail,setMyemail] = useState('');
//     let[myowd,setMypwd] = useState('');

//     console.log(myemail,mypwd);
// }

// return(
//     <Fragment>
//         <form className="myForm">
//             <fieldset>
//                 <legend>User Login</legend>
//                 <label htmlFor='email'>Email</label>
//                 <input type = "email" name = "email" id = "email" autoComplete = 'off' value = {myemail} onChange = {(e) => setMyemail(e.target.value)}/>
//                 <label htmlFor='pwd'>Password</label>
//                 <input type="password" name = "pwd" id = "pwd" autoComplete='off'value={myPwd} onChange={(e) => setMypwd(e.target.value)}/>
//                 <button className="btn" type = "submit">Login</button>
//  =             </fieldset>
//         </form>
//     </Fragment>
// )

// function submitForm(e){
//     e.preventDefault();
//     document.getElementById('em').innerText = "Username:"+myemail;
//     document.getElementById('pw').innerText = "Password: "+mypwd;
// }

// setMyemail('');
// setMypwd('');

// return(
//     <Fragment>
//         <form className="myForm"onSubmit={submitForm}></form>
//     </Fragment>
// )


// function Add(){
//     let [result, setResult] = useState('');
//     let [num1,setNum1] = useState(0);
//     let[num2,setNum2] = useState(0);
// }

// useEffect(()=> {console.log("Component mounted!")},[]);
// useEffect(()=>{console.log("Component updated!")},[result]);
// useEffect(()=>()=> {console.log("unmount")},[]);

// return(
//     <div>
//         <App/><br /><br />
//         Enter 1st number: <input type = "number" value={num1} onChange={(e)=>setNum1(e.target.value)}/><br/>
//         Enter 2nd number: <input type = "number" value={num2} onChange={(e) => setNum1(e.target.value)}/><br/>
//         <button onClick={() => setResult(parseInt(num1)+parseInt(num2))}>ADD</button>
//         <h4> Sum of {num1} and {num2} is {result}.</h4>
//     </div>
// )

// export default Add

// import React, {userState, useEffect} from 'react';

// function TitleCounter(){
//     let [count,setCount] = useState(0);

//     useEffect(() => {
//         document.title = `${count} message(s)`;
//     });

//     return (
//         <div>
//             <p>Click to recieve message</p>
//             <button onClick={() => setCount(count+1)}>Get Message</button>
//         </div>
//     );
// }

// export default TitleCounter 

// import React, { useState, useEffect } from "react";

// function TitleCounter() {
//   const [count, setCount] = useState(0);
//   useEffect(() => {
//     document.title = count === 0 ? "No new messages" : `${count} message(s)`;
//   }, [count]);

//   return (
//     <div>
//       <p>Click to receive message</p>
//       <button onClick={() => setCount(count + 1)}>Get Message</button>
//       <button onClick={() => setCount(0)}>Read Messages</button>
//     </div>
//   );
// }

// export default TitleCounter;


function readMessage(){
    document.title = `No new messages`;
    count = 0;
}
return(
    <div>
        <p>Click to recieve message</p>
        <button onClick={() => setCount(count+1)}>Get Message</button>
        <button onClick={readMessage}>Read Messages</button>
    </div>
);