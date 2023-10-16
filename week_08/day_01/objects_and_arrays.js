// ARRAYS
emptyArray = [];
numbers = [1, 2, 3, 4, 5];
letters = ["a", "b", "c"];
badIdea = [0, "a", true, numbers]; //do not do this.

shoppingList = ["milk", "eggs", "bread"]; 

shoppingList.push("apples");
shoppingList.pop(); //just takes last thing and removes it.

shoppingList.unshift("coffee");
shoppingList.shift(); //like pop, do not need to pass anything into it but at the beginning of array, returns array lenght too.


item1 = shoppingList[1]; //prints out thing from index in the array.

console.log("item1", item1);

// console.log(shoppingList.length); //number of items in array.

console.log("Shopping List: ", shoppingList);



//OBJECTS
alice = {
    name: "Alice",
    age: 25,
    favouriteColour: "blue"

};

bob = {
    age: 25,
    name: "Bob",
    favouriteColour: "yellow"
};



alice.occupation = "student";

console.log("Alice object: ", alice);


//note: keys cannot start with number, should be unique and follow good naming.

console.log("Alice's fave colour: ", alice["favouriteColour"]);
console.log("Alice's fave colour: ", alice.favouriteColour); // same as above

someObject = {
    name: "Amazing Object",
    "weird-key": "value 1234"
}

console.log(someObject["weird-key"]);

cat = {
    name: "Cuddles",
    age: 32
}

key = "name";
cat[key] = "Fluffy";

key = "age";
cat[key] = 43;


console.log("Cat name: ", cat.name);
console.log(cat);


