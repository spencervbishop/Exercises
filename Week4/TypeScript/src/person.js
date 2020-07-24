"use strict";
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    Person.prototype.live = function () { };
    Person.prototype.payTax = function () { };
    Person.prototype.die = function () { };
    return Person;
}());
exports.Person = Person;
