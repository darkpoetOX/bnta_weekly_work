//WITHOUT destructing
const numbers = [10, 20, 30, 40];

// const ten = numbers[0];
// const twenty = numbers[1];

// console.log(ten);
// console.log(twenty);

//WITH destructing
const [ten, twenty, ...rest] = numbers;

console.log(ten);
console.log(twenty);
console.log(numbers);

let a, b;
({a, b} = { a: 10, b: 20}) //object literal
console.log(a);
console.log(b);

const person = {
    name: "Sally",
    age: 25
}

// const name = person.name; // person['name']
// const age = person.age;

const { name, age } = person;

console.log(name);
console.log(age);

