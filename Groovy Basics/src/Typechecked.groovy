import groovy.transform.TypeChecked

@TypeChecked
def app(){
	List list = ["A", "B", "A", "C"]
	List numbers = [12, 42, 17]

	printList(list)
	printList(numbers)
//	printList("Hugo") //Compiler error
//	printList(42)	  //Compiler error
}

def printList(List listToPrint){
	for (def i = 0; i < listToPrint.size(); i++){
		println(listToPrint.get(i))
	}
}

app()

