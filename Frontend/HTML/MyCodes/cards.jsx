function Cards(props){
    return (
        <div className='cards'>
            <h3>Name: {props.name}</h3>
            <h4>Role: {props.role}</h4>
            <h4>Dept.: {props.dept}</h4>
        </div>
        
    )
}