Person sawitzki = new Person("Sawitzki", "Rainer", 183)

println sawitzki.greet()

Bicycle b = new Bicycle("4Gang", sawitzki)
b.info()


Bicycle b2 = new Bicycle("2-Gang", null)

b2.info()
b2.owner?.greet()


class Bicycle{
	String type
	Person owner
	
	Bicycle(String type, Person owner){
		this.type =type
		this.owner = owner
	}
	
	String info(){
		println "${type}, owner is ${owner?.lastname}"
	}

}

class Person {

	String lastname
	String firstname
	Integer height
	
	String greet(){
		return "Hello, my name is ${firstname} ${lastname}"
	}
	
	Person(String pLastname, String pFirstname, Integer height){
		lastname = pLastname
		firstname = pFirstname
		this.height = height
	}
}
