secretNumber = 5;
userGuess = 5;

if(userGuess === secretNumber){
    console.log("Congrats, good guess");
} else if (userGuess > secretNumber){
    console.log("Guessed too high!");
} else {
    console.log("Guess too low, guess again");
}

//TRUTHY OR FALSY

//Falsy values:

//false
//0
//"" //empty string
//NaN
//null //when you intentionally make value mean nothing
//undefined // when you forget to return value

//Every other thing is truthy.