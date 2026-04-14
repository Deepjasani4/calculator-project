function multiplicationTable (firstNum, LastNum){
    for(let i = 1; i <= LastNum; i++){
        console.log(`${firstNum} * ${i} = ${firstNum * i}`);
    }
}
multiplicationTable(5,10);