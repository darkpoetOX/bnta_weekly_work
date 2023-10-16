const numbers = [1,2,3,4,5]
const letters = ['a','b','c','d','e']

const printElement = (arrayElement) => {
    console.log(arrayElement);
}

// numbers.forEach(printElement);
// letters.forEach(printElement);

const doubledNumbers = numbers.map((number)=>{
    return number * 2;
});
 
// console.log(doubledNumbers);
// console.log(numbers);

const oddNumbers = numbers.filter((number) => {
    return number % 2 === 1;
})

// console.log(oddNumbers);


const total = numbers.reduce((number, reducer) => {
    return number + reducer
}, 0); //starting from 0

console.log(total);

const colin = {
    name: "Colin",
    age: 21
}

const anna = {
    name: "Anna",
    age: 19
}

const zsolt = {
    name: "Zsolt",
    age: 14
}

const trainers = [colin, anna, zsolt];
const totalAge = trainers.reduce((reducer, trainer) => {
    return reducer + trainer.age;
}, 0) // reducer = 0 to start, then fo every iteration, it adds the number (trainer.age) to itself i.e. reducer becomes a running sum

console.log(totalAge);



