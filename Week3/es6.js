// function testVar(){
// 	var x = 5;

// 	{
// 		var x = 10;
// 	}

// 	console.log(x); //will print 10 because var means that the variable is subject to hoisting
// }

//testVar(); 

// function testLet(){
// 	let y = 5;
// 	{
// 	let y = 10;
// 	}
// 	console.log(y);
// }
// //testLet();



// const day = "Wednesday";
// console.log(day);
// //day = "Thursday";

// class Person{
// 	constructor(name, age){
// 	this.name = name;
// 	this.age = age;
// 	}
// 	live(){}
// }

// class Student extends Person{
// 	constructor(name, age, major){
// 		super(name, age);
// 		this.major = major
// 	}
// }

// let people = new Map();
// people.set(1,new Person("Walker", 24))
// .set(2, new Person("Erica", 24));

// people.forEach((person)=>{
// 	console.log(`${person.name} is ${person.age} years old`) //template strings
// }); //lambda

// let items = new Map([
// 	["grapes", 2.99],
// 	["cheddar", 1.75],
// 	["bread", 2.99]
// 	])

// for(let k of items.keys()){
// 	console.log(`${k} is on sale for ${items.get(k)}`);
// }

function sum(a,b){
	if(b!=undefined){
	return a+b;
	}
return function(z){
	return a+z;
}
}


console.log(sum(2,3));
console.log(sum(2)(3));

// 	var arr = ["Design project", "Code Project", "Sleep"];
// 	function makeList(b){
// 		for(i=0; i<b.length; ++i){
// 			console.log(b[i]);
// 	}
// }
// 	 makeList(arr);