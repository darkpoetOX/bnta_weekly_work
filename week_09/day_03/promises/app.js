const fetchDogImage = async () => { //async means an asynchronous function
    const response = await fetch("https://dog.ceo/api/breed/corgi/images"); //waits for fetch to finish THEN does the next thing
    const jsonData = await response.json(); //the json() bit does deserialisation

    const imageContainer = document.createElement("div");

    jsonData.message.forEach(url => {
        const dogImage = document.createElement("img");
        dogImage.src = url;
        imageContainer.appendChild(dogImage);
    });

    document.querySelector("body").appendChild(imageContainer);
}

document.querySelector("#dog-button").addEventListener("click", fetchDogImage);