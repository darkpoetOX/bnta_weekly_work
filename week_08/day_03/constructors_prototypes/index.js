// Use the Node.js require() function to import modules.
const User = require("./User");
const Employee = require("./Employee");
const Customer = require("./Customer");



const user1 = new Employee("Colin", "colin@bla.com", "Coder"); // to use a constructor like a class, you have to use the 'new' keyword.
const user2 = new Customer("Richard", "richard@bla.com", "123 The Moon"); 
user1.setName("Steve");
user2.setName("James");
console.log(user1);
console.log(user2);
console.log(user1 instanceof User);
console.log(user2 instanceof User);
