shoppingList = ["milk", "eggs", "bread","apples", "kimchi", "tea"]; 

// for-of loop (for arrays)
for (item of shoppingList){        //note that 'item' is just a temporary variable.
    console.log(item.toUpperCase());
} 

// classic for loop

for (index = 0; index < shoppingList.length; index++){
    console.log(shoppingList[index]);
}

// while loop

counter = 0;

while (counter < 10){
    counter++;
    console.log(counter);
}

while (true){
    rand = Math.random();
    console.log(rand);
    if (rand > 0.8){
        break;
    }
}

// objects - for...in loop

tea = {
    name: "Yorkshire",
    manufacturer: "Taylors",
    caffeine: true
}

for (key in tea){
    value = tea[key];
    console.log(`The ${key} is ${value}`);
}