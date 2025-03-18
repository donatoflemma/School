let notIngame = true ;
let listImg = ["./img/Rock.png","./img/Paper.png","./img/Scissors.png"]
let i = 0 ;
let timeRandom = setInterval(randomImg,500);
let ScoreGamer = 0;
let ScoreComputer = 0;


    
function randomImg(){
      document.getElementById("face").src = "./img/vs.png" ;
      document.getElementById("result").innerHTML="Play your Game !!!";
    if(notIngame){
         if (i < 3){
            document.getElementById("random").src = listImg[i];
            i++ ;
            if (i >= listImg.length) {
                document.getElementById("face").src = "./img/vs.png" ;
                i = 0;
            }
        }
    }
}



function bild(ind){
    document.getElementById("imgGgamer").src = listImg[ind] ;
}


function Start(){
    notIngame = false;
    if (!notIngame){
        let n = Math.ceil(Math.random() * 3);
        n = n - 1;
        console.log(n)
        document.getElementById("random").src = listImg[n];
        
        if (random.src === imgGgamer.src) {
            document.getElementById("face").src = "./img/pareggio.png" ;
            console.log("Pareggio");
            document.getElementById("result").innerHTML="tie !!!";
            document.getElementById("ScoreGamer").innerHTML= ScoreGamer + 1;
            document.getElementById("ScoreComputer").innerHTML= ScoreComputer + 1;
        } 
        else if (
            (imgGgamer.src === "./img/Rock.png" && random.src === "./img/Scissors.png") ||
            (imgGgamer.src === "./img/Paper.png" && random.src === "./img/Rock.png") ||
            (imgGgamer.src === "./img/Scissors.png" && random.src === "./img/Paper.png")
        ) {
            console.log("Hai vinto");
            document.getElementById("face").src = "./img/win.png" ;
            document.getElementById("result").innerHTML="Win !!!";
            document.getElementById("ScoreGamer").innerHTML= ScoreGamer +1;
        } else {
            console.log("Hai perso");
            document.getElementById("face").src = "./img/Lose.png" ;
            document.getElementById("result").innerHTML="Lose !!!";
            document.getElementById("ScoreComputer").innerHTML= ScoreComputer + 1;
        }

    }
    setTimeout( function Restart(){
        notIngame = true;
    },4000)
  }

