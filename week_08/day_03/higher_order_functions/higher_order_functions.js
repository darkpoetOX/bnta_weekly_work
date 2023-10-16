const sum = (number1, number2) => {
    console.log(number1 + number2);
}

const subtract = (number1, number2) => {
    console.log(number1 - number2);
}

const multiply = (number1, number2) => {
    console.log(number1 * number2);
}

const doCalculation = (number1, number2, callback) => { //when we pass a function into another, it's called a call back; it's called in the line of code below.
    callback(number1, number2);
};

doCalculation(2, 3, sum);

doCalculation(2, 3, subtract);

doCalculation(2, 3, multiply);

const divide = (number1, number2) => {
    console.log(number1/number2);
}
doCalculation(2, 3, divide);

