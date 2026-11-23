import stud from 'AIML_codes-\Frontend\HTML\MyCodes\students.json';

function StudentInfo(){
    return(
        <div>
            <h3 className='comp1h3'>Students Information</h3>
            <table border='2' width='50%'height='200px' align='center'>
                <tr>
                    <th>ID</th><th>Name</th><th>Gender</th><th>Class</th><th>Email</th>
                </tr>
                {
                    stud.map((element)=>
                    <tr>
                        <td>{element.ID}</td>
                        <td>{element.Name}</td>
                        <td>{element.Gender}</td>
                        <td>{element.Class}</td>
                        <td>{element.Email}</td>
                    </tr>)
}
            </table>
        </div>
    )
}

export default StudentInfo;
