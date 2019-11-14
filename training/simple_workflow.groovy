def doWorkflow(name, step){
    println("Starting workflow ${name}")
    step()
    println("workflow finished")

}

def step1 = { println("executing step")}
def step2 = { println("executing another step")}

doWorkflow("STEP1", step1)
doWorkflow("STEP2", step2)