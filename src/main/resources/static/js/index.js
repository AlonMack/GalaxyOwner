var Greeter = (function () {
    function Greeter(greeting) {
        this.greeting = greeting;
    }
    Greeter.prototype.greet = function () {
        return "<div class='bl'>" + this.greeting + "</div>";
    };
    return Greeter;
})();
var greeter = new Greeter("Hello, Макс!");
//$(document).ready(function () {
    document.body.innerHTML = greeter.greet();
//});
//# sourceMappingURL=index.js.map