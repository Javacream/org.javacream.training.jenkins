def doWorkflow(step){
    println("Starting workflow")
    step()
    println("workflow finished")

}

println "Hello"

doWorkflow { 
    println "executing step"
}

doWorkflow { 
    println "executing another step"
}


def doStep(name, step){
    println("Starting step ${name}")
    step()
    println("finished step ${name}")

}

doStep ("STEP1",  { 
    println "executing step"
})

doStep ("STEP1")  { 
    println "executing step"
}

doStep "STEP1",   { 
    println "executing step"
}

