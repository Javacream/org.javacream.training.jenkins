class Person implements Addressable{
    public String lastname
    public String firstname
    public Integer height
    private Character gender
    public String sayHello(){
        return "Person: lastname= ${lastname}"
    }

    Person(String lastname){
        this.lastname = lastname
    }

    @Override
    String getAddress() {
        return null
    }
}

class Student extends Person{
    Student(String lastname) {
        super(lastname)
    }
}


interface Addressable{
    String getAddress()
}
