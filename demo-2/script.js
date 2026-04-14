let modeBtn = document.querySelector(".mode-btn button");
let currentMode = "light";

modeBtn.addEventListener("click", () => {
    if (currentMode === "light") {
        document.body.style.backgroundColor = "black";
        currentMode = "dark";
    } else {
        document.body.style.backgroundColor = "white";
        currentMode = "light";
    }
});

document.getElementById("aboutLink").addEventListener("click", function() {
    window.location.href = "about.html";
});