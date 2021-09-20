//message: a reference to an object in HEAP, "...": String Literal
def message = "Hello"
//number: a reference to an object in HEAP, 42: Integer Literal
def number = 42

//a_function: a reference to an object in HEAP , {} Function literal = lambda expression
def a_function = {-> }

def a_function_with_params = {p1, p2 -> return "Hello"}

def result = a_function_with_params(2, 40)

def x = a_function_with_params
result = x(2, 40)


def f(p){
    return p(true false)
}

List<String> names = ["Hugo", "Emil"]

names.findAll({name -> return name.startsWith("E")}).toSorted ({name1, name2 -> return name1.compareTo(name2)}).collect({name -> name.length()})