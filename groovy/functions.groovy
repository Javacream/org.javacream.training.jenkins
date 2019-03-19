def app(){
    //def result = functionName("Hugo", 42)
    //println(result)
    //functionName("Hugo")
    //functionName("Hugo", 42, false)    

    def message = "Hello"
    def names = ["Hugo", "Emil", "Egon"]
    println("in app: message=${message}, names=${names}")
    parameters(message, names)
    println("in app: message=${message}, names=${names}")
}
def functionName(param1, param2){
    println("param1=${param1}, param2=${param2}")
    return true
}

def parameters(string, list){
    println("in parameters: param1=${string}, param2=${list}")
    string = "CHANGED"
    //list=[1, 2, 3]
    list[1] = "Gregor"
    println("in parameters: param1=${string}, param2=${list}")

}

//Was ist message, Was ist "..."?
//message ist eine Referenz auf ein Objekt vom Typ String
//"..." Literal, dieses erzeugt das Objekt vom Typ String und gibt die Referenz zurück
def message = "Hello"
def number = 42
//x ist eine Referenz auf ein Objekt vom Typ function
def x = { param -> println("param=${param}")}

x("Hugo")
app()

