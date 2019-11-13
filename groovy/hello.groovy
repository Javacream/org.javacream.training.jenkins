def collectionsLiterals(){
    //List
    def names = ["Hugo", "Emil", "Fritz"]
    //Map
    def states = ["München": "Bayern", "Karlsruhe": "BW", "Augsburg": "Bayern"]
    //Map of List
    def statesReverse = ["Bayern": ["Augsburg", "München"], "BW": ["Karlsruhe"]]
    //Range
    def range = 1..10

    //Element-Zugriff
    println(names[0])
    println(states["Karlsruhe"])
    println(statesReverse["Bayern"][0])

    //Iterationen
    for (name in  names){
        println("name: ${name}")
    }
    for (city in statesReverse["Bayern"]){
        println("city of bavaria: ${city}")
    }
    for (number in range){
        println(number)
    }
}

def mainAppl(){
    def message = "Hello World!!!"
    def number = 42
    def anotherNumber = 47.11
    println ("message=${message}, number=${number}")

    message = message + 5
    println ("message=${message}")
    message = number
    message = message + 5
    println ("message=${message}")
    demoControlStructures()
}

def demoControlStructures(){
    
    for (def number = 0; number < 20; number++){
        if ((number % 2) == 0){
            println("number ${number} is even")
        }
        else{
            println("number ${number} is odd")
        }
    }
}
/*
    Operatoren:
    +, -, *, /, %
    <, >, <=, >= ==, !, !=
    &&, || (AND bzw. OR-Operator)
*/
collectionsLiterals()
