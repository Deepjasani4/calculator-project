function  factorial(n) {
    if ( n === 0 || n === 1){
        return 1;
    } else if (n < 0){
        return "Factorial is not defined for negative numbers.";
    }
    return n * factorial (n - 1);
}

console.log("2! is...." + factorial(2));
console.log("3! is...." + factorial(3));
console.log("4! is...." + factorial(4));
console.log("5! is...." + factorial(5));
console.log("6! is...." + factorial(-6));