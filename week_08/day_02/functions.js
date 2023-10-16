// Named functions
// NOTE: Javascript hoists named functions. In other words, we can put the function AFTER calling it and it will get pushed to the top when read by the programme.

function greet(timeOfDay, name){
    console.log(`Good ${timeOfDay}, ${name}!`);
}

greet("morning", "Anna");
greet("afternoon", "Colin");


// Anonymous functions
// No hoisting takes place with this type of function

const sum = function(number1, number2){
    return number1 + number2;
}

total = sum(1, 2);
console.log(total);

// Arrow functions
// ES6

// const multiply = (number1, number2) => {
//     return number1 * number2;
// }

const multiply = (number1, number2) => number1 * number2;

console.log(multiply(2, 5));

