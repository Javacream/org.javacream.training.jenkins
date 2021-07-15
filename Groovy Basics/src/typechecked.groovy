import groovy.transform.TypeChecked

@TypeChecked
all() {
/*
Dieses Skript zeigt die verschiedenen Deklarations-Möglichkeit
 */

    def message = "Hello, World"
    def number = 9
//Compiler error    message2 = "Goodbye World"

    println(message)
//Compiler error        println(message2)

    message = 42

    println(message + message)

    String message3 = "Hello"
    println(message3)

    message3 = 42
    println(message3)


//printMessage()
//printMessage("Hello")
    printMessage("Hello", 42)
//printMessage(1, 2, 3)
    println(message3 + message3)

    printMessageTyped("Hello", 42)
//Compiler error        printMessageTyped(9, 42)
}

def printMessage(m, i){
    println("Param1=${m}")
    println("Param2=${i}")
}
void printMessageTyped(String m, Integer i){
    println("Typed Param1=${m}")
    println("Typed Param2=${i}")
    m = 42
}
all()

