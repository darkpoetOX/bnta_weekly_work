const User = require("./User");

const Employee = function(name, email, role){ 
    User.call(this, name, email) // this line works similar to the 'super' in java constructors.
    this.role = role;
}

// to inherit from the User prototype, we do the below line of code
Object.setPrototypeOf(Employee.prototype, User.prototype); // basically means 'Employee.prototype.prototype = User.prototype'.

module.exports = Employee;

// const jack = new Employee("jack", "jack@jill.com", "Software Engineer");
// jack.setName("Jake")

// console.log(jack instanceof Employee); // checks if object is an instance/type of another thing i.e. using something like a method from another module.
// console.log(jack instanceof User);