var arr = [];
arr[99] = "hello";

// for(var i = 0; i< arr.length; i++){
// 	console.log(arr[i]);
// }

// for(var o of arr){
// 	console.log(o);
// }

// for(var o in arr){
// 	console.log(o);
// }


////Creating Objects

//object literal: becomes an object that becomes difficult to use everywhere
//more like a "throwaway" object
var p = {
	name: "Tyler",
	age: 24,
	doWork: function(){
		console.log("Ferrari");
	}
}

// console.log(p.name + " is " + p.age + " years old");
// p.doWork();
// p.retire = function(){
// 	console.log("I quit"); //this is called duck typing
// } 
// p.retire();

//Creating functions

//using a function: becomes objects that you will use over and over again
function Person(name, age){
	this.name = name;
	this.age = age;
}

Person.prototype = Object.create(Object.prototype); //creates a Person class which extends object
Person.prototype.live = function(){
	console.log("I love mondays");
}

Person.prototype.die = function(){
	console.log("has died");
}

Person.prototype.payTaxes = function(){
	console.log("Paying taxes");
}

//Person.gotoWork = function(){} //this won't work because you can only do this on the Person class, not the object
// var p1 = new Person("Tyler", 24);
// console.log("p1.__proto__:" + p1.__proto__);
// console.log(p1);
// p1.live();
// p1.payTaxes();
// p1.die();

// Person.prototype.someValue = 10;

// console.log(p1.someValue);

function Student(name, age, major){
	//Person(name, age) can't use this because it will bind name and age 
	//to Person and not to Student

	//bind the student to name and age
	//not Person
	Person.call(this, name, age);
	this.major = major;
}

Student.prototype = Object.create(Person.prototype);
Student.prototype.goToClass = function(day){
	if(day && day === 'Thursday'){ //we write it this way because it accounts for the case where no parameter is entered.
								// if not defined, then day returns undefined and
								// undefined && day==='Thursday' returns falsy
		return true;
	}
	return false;
}

var s1 = new Student("John", 20, "Humanities");
console.log("s1.__proto__: " + s1.__proto__);
console.log(s1);
s1.live();
console.log("Should I go to class today?");
console.log(s1.goToClass("Tuesday")? "Oh my favorite class is Sociology": "Not today");