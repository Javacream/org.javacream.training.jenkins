//message ist Referenz auf ein String-Objekt erzeugt durch das String-Literal ""
def message = "Hello"
//number ist Referenz auf ein Integer-Objekt erzeugt durch das Integer-Literal 42
def number = 42 

//simpleFunction ist Referenz auf ein Funktions-Objekt erzeugt durch das Funktions-Literal {p -> {impl}}
def simpleFunction = {param -> 
        return "in function, param=${param}"
}


//var1 ist eine Referenz auf das selbe String-Objekt wie message, = : COPY VALUE OF REFERENCE
def var1 = message

//x ist eine Referenz auf das selbe Funktions Objekt wie f2, = : COPY VALUE OF REFERENCE
def x = simpleFunction


println(message) //OK
println(simpleFunction) //OK
println(simpleFunction("Param")) //OK
//println(message()) //NEIN, message ist keine Referenz auf ein Funktionsobjekt!
