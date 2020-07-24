function testVar(){
	var x = 5;

	{
		var x = 10;
	}

	console.log(x); //will print 10 because var means that the variable is subject to hoisting
}

testVar(); 



const day = "Wednesday";
console.log(day);
day = "Thursday";