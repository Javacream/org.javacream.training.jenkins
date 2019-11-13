def message = "Hello"
def list = ["A", "B", "C"]

println("Das 1. Element von message: ${message[1]} vor Aufruf demoString")
demoString(message)
println("Das 1. Element von message: ${message[1]} nach Aufruf demoString")

// println("Das 1. Element von list: ${list[1]} vor Aufruf demoString")
// demoList(list)
// println("Das 1. Element von list: ${list[1]} nach Aufruf demoString")


def demoString(s){
    println("Entering demoString")
    println("Das 1. Element von s: ${s[1]}")
    s = "World"
    //s[1] = "x" //Runtime-Error, Strings sind immutable
    //s = "Hugo" + s
    println(s)
    println("Das 1. Element von s: ${s[1]}")
}

def demoList(l){
    println("Entering demoList")
    println("Das 1. Element von l: ${l[1]}")
    l[1] = "Hugo"
    println("Das 1. Element von l: ${l[1]}")
}

