const User = require("./User");

const Customer = function(name, email, billingAddress){ 
    User.call(this, name, email)
    this.billingAddress = billingAddress;
}

Customer.prototype.getBillingAddress = function() { return this.billingAddress}
Customer.prototype.setBillingAddress = function(billingAddress){ return this.billingAddress = billingAddress}
Object.setPrototypeOf(Customer.prototype, User.prototype);

module.exports = Customer;
