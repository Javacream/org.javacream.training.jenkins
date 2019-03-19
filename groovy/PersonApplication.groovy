

class Person {

	String lastname
	String firstname
	Integer height
	Person partner
	
	String greet(){
		return "Hello, my name is ${firstname} ${lastname}"
	}
	
	Person(String pLastname, String pFirstname, Integer height){
		lastname = pLastname
		firstname = pFirstname
		this.height = height
	}

	boolean marry(Person newPartner){
		if ((this.partner == null) && (newPartner != null) && (newPartner.partner == null) &&(this != newPartner)){
			this.partner = newPartner
			newPartner.partner = this
			return true
		}
		else{
			return false
		}
	}

	boolean divorce(){
		if (this.partner != null){
			this.partner.partner = null
			this.partner = null
			return true
		}
		else{
			return false
		}

	}
}

Person sawitzki = new Person("Sawitzki", "Rainer", 183)
Person sawitzki2 = new Person("Sawitzki", "Klaus", 183)
Person musterfrau = new Person("Musterfrau", "Hanna", 176)

println(sawitzki.greet())
println(sawitzki2.greet())

println("sawitzki marries musterfrau ${sawitzki.marry(musterfrau)}")
//println(sawitzki.partner.lastname)
//println(musterfrau.partner?.lastname)
println("sawitzki2 marries musterfrau ${sawitzki2.marry(musterfrau)}")
println("musterfrau divorce ${musterfrau.divorce()}")
println("sawitzki divorce ${sawitzki.divorce()}")
println("sawitzki2 marries musterfrau ${sawitzki2.marry(musterfrau)}")
