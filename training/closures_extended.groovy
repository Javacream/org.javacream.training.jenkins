//Script Scope{
def message = "Hello"
def simpleFunction = {param -> 
        return "in function, param=${param}, message=${message}"
}

//}
def simpleFunctionClassic(param){ 
        return "in function, param=${param}"
}


//println(simpleFunction("Param")) //OK
//println(simpleFunctionClassic("Param")) 


def demo = {param -> 
        //Was ist der Gültigkeitsbereich von internal?
        //internal hat den "function scope", gegebenenfalls verlängert
        def internalFunction = {  
                println("in function, param=${param}")
        }
        //internalFunction()
        return internalFunction
}


def f =demo("Hugo") 
def g =demo("Emil") 
f()
g()
f()

