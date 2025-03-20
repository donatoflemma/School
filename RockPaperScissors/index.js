let notIngame = true;
let listImg = ["./img/Rock.png", "./img/Paper.png", "./img/Scissors.png"];
let i = 0;
let timeRandom = setInterval(randomImg,500);
let intervalID; 
let Stop = 0;
let ScoreGamer = 0;
let ScoreComputer = 0;




function randomImg() {
    if (notIngame) {
        document.getElementById("face").src = "./img/vs.png";
        document.getElementById("result").innerHTML = "Play your Game !!!";
        if (i < 3) {
            document.getElementById("random").src = listImg[i];
            i++;
            if (i >= listImg.length) {
                document.getElementById("face").src = "./img/vs.png";
                i = 0;
            }
        }
    }
}



function bild(ind) {
    document.getElementById("imgGgamer").src = listImg[ind];
}

function getFileName(path) {
    return path.split("/").pop();
}


function Start() {
    notIngame = false;

    
    if (intervalID) {
        clearInterval(intervalID);
    }

    let n = Math.ceil(Math.random() * 3);
    n = n - 1;
    document.getElementById("random").src = listImg[n];

    // Condizione di pareggio
    if (document.getElementById("random").src === document.getElementById("imgGgamer").src) {
        ScoreGamer++;
        ScoreComputer++;
        document.getElementById("ScoreGamer").innerHTML = ScoreGamer;
        document.getElementById("ScoreComputer").innerHTML = ScoreComputer;

        intervalID = setInterval(() => {
            Stop++;
            if (Stop < 300 && !notIngame) {
                document.getElementById("result").innerHTML = "tie !!!";
                document.getElementById("face").src = "./img/pareggio.png";
            } else if (Stop >= 300) {
                randomImg();
                notIngame = true;
                Stop = 0;
            }
        }, 10);

    }
    
    else if (
        (getFileName(document.getElementById("imgGgamer").src) === "Rock.png" && getFileName(document.getElementById("random").src) === "Scissors.png") ||
        (getFileName(document.getElementById("imgGgamer").src) === "Paper.png" && getFileName(document.getElementById("random").src) === "Rock.png") ||
        (getFileName(document.getElementById("imgGgamer").src) === "Scissors.png" && getFileName(document.getElementById("random").src) === "Paper.png")
    ) {
        ScoreGamer++;
        document.getElementById("ScoreGamer").innerHTML = ScoreGamer;

        intervalID = setInterval(() => {
            Stop++;
            if (Stop < 300 && !notIngame) {
                document.getElementById("face").src = "./img/Lose.png";
                document.getElementById("result").innerHTML = "Win !!!";
            } else if (Stop >= 300) {
                randomImg();
                notIngame = true;
                Stop = 0;
            }
        }, 10);
    }
    
    else {
        ScoreComputer++;
        document.getElementById("ScoreComputer").innerHTML = ScoreComputer;

        intervalID = setInterval(() => {
            Stop++;
            if (Stop < 300 && !notIngame) {
                document.getElementById("face").src = "./img/win.png";
                document.getElementById("result").innerHTML = "Lose !!!";
            } else if (Stop >= 300) {
                randomImg();
                notIngame = true;
                Stop = 0;
            }
        }, 10);
    }
}