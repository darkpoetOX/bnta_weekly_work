const button = document.querySelector("#btn"); //what user interacts with
const box = document.querySelector("#box"); 
const caption = document.querySelector("#caption"); 
const input = document.querySelector("#text-input");
const dropdown = document.querySelector("#color-picker");
const history = document.querySelector("#history");




//button click

const printButtonConfirmation = () => {
    console.log("button clicked");
}

button.addEventListener("click", printButtonConfirmation) //two arguments: event to listen for and the callback function.

//text input

input.addEventListener("input", (event) => { //the second argument is passed automatically by the browser, 'event'
    caption.innerText = event.target.value; //updating caption variable from value entered in event (text input)
})


// dropdown

const createAndAppendListItem = (content) => { //the second argument is passed automatically by the browser, 'content'
    const newListItem = document.createElement("li");
    newListItem.innerText = content;
    history.appendChild(newListItem);
}

dropdown.addEventListener("change", (event) => { //the second argument is passed automatically by the browser, 'event'
    const newColour = event.target.value; 
    box.setAttribute("style", `background-color: ${newColour}`);
    createAndAppendListItem(newColour);
})