/*
Dieses Skript zeigt die verschiedenen Deklarations-Möglichkeit
 */

def message = "Hello, World"
def number = 9
//Vermeiden Sie die Benutzung nicht-deklarierter Variable
message2 = "Goodbye World"

println(message)
println(message2)

message = 42

println(message + message)

String message3 = "Hello"
println(message3)

message3 = 42
println(message3)
println(message3 + message3)

def printMessage(m, i){
    println("Param1=${m}")
    println("Param2=${i}")
}


//printMessage()
//printMessage("Hello")
printMessage("Hello", 42)
//printMessage(1, 2, 3)



