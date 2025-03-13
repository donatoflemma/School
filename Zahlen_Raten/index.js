let number;
list = []

function startGuessNumbers(){
    var n = Math.random() * 100;
        n = Math.ceil(n);
        number = n;   
        list.push(n)
        console.log(number);
}
    


function checkInput(){
   guestNumber= parseInt(document.getElementById("input").value); // prendo l´imput e lo rendo int 
   alert(list[0]);

   console.log(guestNumber);
    if (number == guestNumber){
    document.getElementById("answer");
   }
}