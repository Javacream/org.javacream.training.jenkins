//message = variable, an diese Variable wird zugewiesen ein String-Literal
def message = "Hello World"
def number = 9
def state = true
def names = ["Hugo", "Emil", "Fritz", "Egon", "Anton"]
def postalCode = [81373: "München", 71234: "Regishausen"]
//myFunc ist eine Variable, an diese Variable wird zugewiesen ein Funktions-Literal
def myFunc = {x, y -> return x + y}
//println myFunc(1, 2)

//Herleitung
def functionName(p1, p2){
    return 42
}
//Lambda-Funktion, Closure-Function
def functionVar = {p1, p2 -> return 42}

//Anwendung mit Collection
//def iteratorFunction = {element -> println(element)}
//names.each(iteratorFunction)

//names.each({element -> println(element)})
names.each {element -> println element}