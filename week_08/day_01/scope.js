numbers = [1, 2, 3, 4, 5];

let numberToPrint; // variable equals null here for now
//const numberToPrint = 0; //error in for loop as we are trying to reassign to a const

for (let number of numbers){
    numberToPrint = number; // we are reassigning the existing variable
    console.log("value of numberToPrint inside loop: ", numberToPrint);
}

console.log("value of numberToPrint OUTSIDE loop: ", numberToPrint);

const numbersSquared = [];
for (const number of numbers){
    numbersSquared.push(number ** 2);
}

console.log(numbersSquared);

const song = {
    title: "Jolene",
    artist: "Dolly P"
}

song.title = "9 t0 5";
console.log(song);
