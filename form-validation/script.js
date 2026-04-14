function validateForm() {

let isValid = true;

let username = document.getElementById("username").value;
let email = document.getElementById("email").value;
let password = document.getElementById("password").value;
let number = document.getElementById("pnumber").value;


document.getElementById("userError").innerHTML = "";
document.getElementById("emailError").innerHTML = "";
document.getElementById("passwordError").innerHTML = "";   
document.getElementById("numberError").innerHTML = "";     

let usernamePattern = /^[A-Za-z]+$/;
if (!username.match(usernamePattern)){
    document.getElementById("userError").innerHTML = "please enter correct username";
    return false;
}
let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
if (!email.match(emailPattern)){
    document.getElementById("emailError").innerHTML = "please enter correct email";
    return false;
}
let passwordPattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
if (!password.match(passwordPattern)){
    document.getElementById("passwordError").innerHTML = "password must be at least 8 characters long and contain at least one letter and one number";
    return false;
}
let numberPattern = /^[0-9]{10}$/;
if(!number.match(numberPattern)){
    document.getElementById("numberError").innerHTML = "please enter correct number";
    return false;
}
  if (isValid) {
        window.location.href = "success.html";
    }
    return false;
}
