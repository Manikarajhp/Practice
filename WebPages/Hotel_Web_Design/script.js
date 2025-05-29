document.addEventListener("keydown", (event) => {
    if (event.keyCode === 123 || 
        (event.ctrlKey && event.shiftKey && ["I", "J", "C"].includes(event.key.toUpperCase())) || 
        (event.ctrlKey && event.key.toUpperCase() === "U")) {
        event.preventDefault();
    }
});
document.addEventListener("contextmenu", (event) => event.preventDefault());