function createBook() {
    alert("New Book Added\nYou can check added book on View page");
}

function goBack() {
    window.history.back();
}

function goMain() {
    window.location.href = "/index";
}

function onException() {
    alert("Sorry but Book Not Found\nPlease click OK and try again!");
    window.history.back();
}

function onDelete() {
    alert("Book Deleted\nYou can check if book deleted on View Page")
}

function onUpdate() {
    alert("Book Updated\nYou can check if book updated on View Page")
}