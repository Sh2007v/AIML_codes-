// import {useState} from 'react'


// function Textchange(){
//     let[text,setText] = useState('Hello')

//     function changeText(){
//         setText('Hi')
//     }
//     return (
//         <div>
//             <h2>{text}</h2>
//             <button onClick = {changeText}>ChangeText</button>
//         </div>
//     )
// }

// export default Textchange


// function toggleText(){

//     let[text,setText] = useState('Hello')
//     function changeText(){
    //         setText('Hi')
    //     }
    //     return(
        //         <div>
        //             <h2>{text}</h2>
        //             <button onClick = {changeText}>ChangeText</button>
        //         </div>
        //     )
        // }
        
        
// import { useState } from "react";

// function Toggle(){
//     let[val,setVal] = useState('Hello');

//     function changeVal(){
//         if(val === 'Hello'){
//             setVal('Hi');
//         }
//         else{
//             setVal('Hello');
//         }
//     }
//     return(
//         <div>
//             <h2>{val}</h2>
//             <button onClick={changeVal}>Click to toggle </button>
//         </div>
//     )
// }

// export default Textchange


//4
// import { useState } from "react"
// function Counter(){
//     let[count,setCount] = useState(0)

//     function incr(){
//         setCount(count + 1)
//     }

//     return (
//         <div>
//             <h2>{count}</h2>
//             <button onClick = {incr}>Increment</button>
//             <button onClick = {() =>setCount(count - 1)}>Decrement</button>
//         </div>
//     )
// }
// export default Textchange


//
// import { useState } from "react";

// let date = [
//     {name:'Alok' ,city: 'Noida', email: 'alok123@gmail.com'},
//     {name:'Suresh',city: 'Delhi', email: 'suresh@gmail.com'},
// ]
// let[mydata,setMyData] = useState(data);
// function showData(){
//     mydata = data;
//     setMyData(mydata);
// }
// function clearData(){
//     mydata = [];
//     setMyData(mydata);
// }
// return (
//     <div>
//         <h2>Data coming from an Array</h2>
//         {
//             mydata.map((element)=>
//             <h3> Name: {element.name},City: {element.city},Email: {element.email}</h3>)
//         }
//         <button onClick={showData}>Show Data</button>
//         <button onClick={clearData}>Clear Data</button>
//     </div>
// )
// export default Textchange


// import { useState } from "react";
// function Arrays(){
//     var obj = [
//         {id:0, name:'Alok', city: 'Noida', email: 'alok123@gmail.com'},
//         {id:1, name: 'Suresh', city: 'Delhi', email: 'suresh@gmail.com'},
//         {id:2, name: 'Swati', city: 'Lucknow', email: 'swati@gmail.com'}
//     ];
//     var[data,setData] = useState(obj);

//     return(
//         <div>
//             {
//                 data.map((element)=>{
//                     return (
//                         <h3 key = {element.id}>Name:{element.name},City:{element.city},Email:{element.email}
//                         <button onClick={() => removeElement(element.id)}>Details</button></h3>
//                     )
//                 })
//             }
//         </div>
//     )
// }

// export default Textchange