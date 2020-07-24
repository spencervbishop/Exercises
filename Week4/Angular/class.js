class Person{


	constructor(name,age){
		this.name=name;
		this.age = age;
	}

	live(){}
	payTax(){}
	die(){}
}

// var Person2 = (function(){
// 	function Person(name, age){
// 		this.name = name;
// 		this.age = age;
// 	}

// 	Person.live() = function(){}
// 	Person.payTax() = function(){}
// 	Person.die() = function(){}

// 	return Person;
// })()

var p1 = new Person("Spencer", 24);
//var p2 = new Person2("Tyler",  25);

//no types!
var p3 = new Person(()=>{console.log("a sandwich")}, true);
console.log(p3);