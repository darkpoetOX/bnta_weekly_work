// By convention, constructor functions (below) are capitalised.
// can't use a lambda function (arrow function) for a constructor, use anonymous functions.

const User = function(name, email){ 
    this.name = name;
    this.email = email;
    
    // We could put the below method here, but then it's created for every object the constructor builds. Inefficient and waste of memeory!
    // this.setName = (newName) => {
    //     this.name = newName;
    // }
}

User.prototype.setName = function(newName){
    this.name = newName;
}

User.prototype.setEmail = function(email){
    this.email = email;
}
User.prototype.getName = function(){
    return this.name
}

User.prototype.getEmail= function(){
    return this.email
}

// this exposes User to other files
module.exports = User;
