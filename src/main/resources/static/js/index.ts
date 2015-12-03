class Greeter {
    constructor(public greeting: string) { }
    greet() {
        return "<div class='bl'>" + this.greeting + "</div>";
    }
}

var greeter = new Greeter("Hello, Макс!");

$(document).ready(function() {
    document.body.innerHTML = greeter.greet();
});