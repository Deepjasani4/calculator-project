function palindrome(str){
    let reverceStr = str.split('').reverse().join('');
    if(str === reverceStr){
        return true;
    }else{
        return false;
    }
}
console.log(palindrome('ABA'));
console.log(palindrome('ABCD'));