function Biggestnumber (arr){
    let biggest = arr[0];
    for(let i = 1; i < arr.length; i++){
        if(arr[i] > biggest){
            biggest = arr[i];
        }
    }
    return biggest;
}

console.log(Biggestnumber([1, 2, 3, 4, 5]));