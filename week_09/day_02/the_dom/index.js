const paragraph = document.querySelector(".paragraph"); //querySelector finds the first place it sees query in HTML; querySelectorAll finds it in all places it appears.
console.log(paragraph);

const heading = document.querySelector("#main-heading");
console.log(heading);
heading.innerText = "Cool stuff I've learned about the DOM"

const paragraphs = document.querySelectorAll(".paragraph");
console.log(paragraphs);

paragraphs[0].innerText = "The DOM is a hierarchical representation of the HTML elements in your document.";
paragraphs[1].innerText = "It provides us with an API which allows us to traverse our HTML doc."

// Important javascript actions
document.querySelector("h2").innerText = "Important Methods & Properties";

const listItem1 = document.createElement("li"); //creates a whole new element.
listItem1.innerText = "About us"

const listItem2 = document.createElement("li");
listItem2.innerText = "Contact us"

const list = document.querySelector(".list")

list.appendChild(listItem1);
list.appendChild(listItem2);

list.removeChild(list.lastChild);