globalOuter = "globalOuter"
//Script-Scope{
def outer = "outer"
f2()
f1()
println "done"
//}
def f1(){
    def inF1 = "inF1"
    println "inF1: ${inF1}"
}


def f2(){
    def inF2 = "inF2"
    //println "inF1: ${inF1}"
    println "globalOuter: ${globalOuter}"
    println "inF2: ${inF2}"
    
}
