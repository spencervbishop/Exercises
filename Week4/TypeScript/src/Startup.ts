import{Person} from './person';

class Startup{
	public static main(): number{
	const p = new Person("Spencer", 24);
	console.log(`${p.name} is ${p.age} years old`);
	return 0;
	}
}

Startup.main();