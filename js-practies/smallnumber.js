// write a function that finds the smallest number among three numbers and prints it to the console.

function findSmallestNumber(num1, num2, num3){
    if(num1 < num2 && num1 < num3){              // number 1 check
        return num1;
    } else if(num2 < num1 && num2 < num3){       // number 2 check
        return num2;
    } else if(num3 < num1 && num3 < num2){       // number 3 check
        return num3;
    }
    return num1;
}

console.log(findSmallestNumber(18, 50, 100));


//Array shorting using bubble sort

// function ArrayShort(arr){
//     for(let i = 0; i < arr.length; i++){
//         for(let j = 0; j < arr.length - i -1; j++){
//             if(arr[j] > arr[j + 1]){
//                 let temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
//     return arr;
// }

// console.log(ArrayShort([ 0, 50, 100, 500,  1,  5, 10, 15,  20,  25, 30, 35, 40, 45]));