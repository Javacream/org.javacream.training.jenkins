def iterate(iterable){
    for (def element in iterable){
        println element
    }

    return "OK"
}

def iterate(iterable, text){
    for (def element in iterable){
        println "${text}: ${element}"
    }

    return "OK"
}


iterate(1..3)
iterate(["Eg", "Al"])
iterate("Hello", "World")
println "Result of iterate is ${iterate(true)}"
