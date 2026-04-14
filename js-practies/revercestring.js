// Reverce String
// function reverces(str){
//     rev = str.split("").reverse().join("");
//     return rev;
// }

// console.log(reverces("Hello World"));
// console.log(reverces("Welcome To JavaScript"));
// console.log(reverces("123456789"));


// write a function that reverses a string and prints it to the console.
// withot using reverse method

function reverceString(str){
    let result = '';
    for(let i = str.length - 1;  i >= 0; i--){
        result += str[i];
    }
    return result;
}

console.log(reverceString('Hello World','fferfe'));

