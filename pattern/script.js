function generatePattern() {

     const input = document.getElementById('patternInput').value;
     const num = parseInt(input);

     if(num < 3 || num > 20){
        document.getElementById('Output').innerHTML = "please enter a number between 3 and 20";
     }

     for(let i = 1; i <= num; i++){
        document.getElementById('Output').innerHTML += "*".repeat(i) + "\n";
     }

    }