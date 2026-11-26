function NumberDouble(){
    const [count, setCount] = useState(0);
    const [num,setNum] = useState(0);
    let result = useMemo(()=>doubleNum[num],[num]);

    function incr(){
        setCount(count + 1);
    }
    function double(){
        for(let i=1;i<=100000000000;i++){
            return num*2;
        }
    }
}