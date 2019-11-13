def message = "Hello"
def number = 42
def list = ["A", "B", "C"]
def range = 5..1
//range = 'a'..<'c'

// for (def i = 0; i < 5; i++){
//     println i
// }

for (def i in 1..3){
    println i
}

for (def element in list){
    println element
}

for (def element in message){
    println element
}