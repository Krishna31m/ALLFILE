function upDate(previewPic) {
    // Log event trigger (for debugging)
    console.log("Mouse over: " + previewPic.src);

    // Get the div with id 'image'
    let imageDiv = document.getElementById("image");

    // Change background image and text
    imageDiv.style.backgroundImage = `url('${previewPic.src}')`;
    imageDiv.innerHTML = previewPic.alt;
    imageDiv.style.color = "white"; // Make text visible if needed
}

function undo() {
    // Log event trigger (for debugging)
    console.log("Mouse out, resetting...");

    // Reset the div to default text and remove background image
    let imageDiv = document.getElementById("image");
    imageDiv.style.backgroundImage = "none";
    imageDiv.innerHTML = "Hover over an image below to display here.";
    imageDiv.style.color = "gray"; // Reset text color
}

