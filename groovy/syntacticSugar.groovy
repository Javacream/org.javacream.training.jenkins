def app(param){
    println "param=${param}"
}

def fnWithStringParam(param){
    println "param=${param}"
}

def fnWithFunctionParam(number, param){
    for (int i = 0; i < number; i++){
        param("greetings from fnWithFunctionParam")
    }
}

def fn = { param -> println("param=${param}")}

//fn("Hugo")

def message = "A"
def x = message
fnWithStringParam(x)
fnWithFunctionParam 3, { param -> println("param=${param}")}

//app "Hello"

