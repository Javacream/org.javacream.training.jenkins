//message = variable, an diese Variable wird zugewiesen ein String-Literal
def message = "Hello World"
def number = 9
def state = true
def names = ["Hugo", "Emil"]
def postalCode = [81373: "München", 71234: "Stuttgart"]
//myFunc ist eine Variable, an diese Variable wird zugewiesen ein Funktions-Literal
def myFunc = {x, y -> return x + y}
println myFunc(1, 2)

