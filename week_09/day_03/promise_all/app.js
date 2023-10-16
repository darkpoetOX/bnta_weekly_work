// Create multiple fetch requests with similar URLS
// Only difference between urls is a page number
// Use promise.all magic

const allPromises = []; // this array will hold our fetch requests

for(let i = 1; i < 3; i++){
    allPromises.push(
        fetch(`https://api.disneyapi.dev/character?page=${i}&pageSize=300`) //we use back ticks here as it is easier to format; insert your i variable in page= bit.
        .then((response) => response.json())
    )
}

Promise.all(allPromises)
.then((allResults) => {
    console.log(allResults); 

    const allCharacters = allResults.map((result) => result.data).flat() // returns only data part; flat 'unnests' the arrays within the arrays
    console.log(allCharacters); 

    const characterList = document.querySelector("ul");

    allCharacters.forEach((character) => {
        const characterLi = document.createElement("li");

        const characterAnchor = document.createElement("a");
        characterAnchor.textContent = character.name;
        characterAnchor.href = character.sourceUrl;

        characterLi.appendChild(characterAnchor);


        characterList.appendChild(characterLi);

    })
})