let number;
let tries =0;
function startGuessNumbers(){
    var n = Math.random() * 100;
        n = Math.ceil(n);
        number = n; 
        alert("                                       Ready !!! \n                         10 tries than Game Over \n                                    Good Luck !!");
        document.getElementById("game-text2").textContent = "";  
}
    
function checkInput() {
    event.preventDefault();
    let answer = parseInt(document.getElementById("input").value);
    if (tries !== 10){
        document.getElementById("Lose").textContent = "";
        console.log(answer);
        console.log(number);
        if(number == answer){
            document.getElementById("game-text2").textContent = "Won !!";
            document.getElementById("game-text2").style.color = "green"
            console.log(tries);
        }
        else if (number !== answer && number > answer){
            document.getElementById("game-text2").textContent = "Try agein" + "your number is too small ";
            document.getElementById("game-text2").style.color = "red"
            tries ++
            console.log(tries);
        }
        else if (number !== answer && number < answer){
            document.getElementById("game-text2").textContent = "Try agein \n" + "your number is too big ";
            document.getElementById("game-text2").style.color = "blue"
            tries ++
            console.log(tries);
        }
    }
    else{
        document.getElementById("Lose").textContent = "Yuo Lose !!! Push the window for restart the play";
        document.getElementById("game-text2").textContent = "";
        number = 0;
        tries = 0;
    }

}


   
   
