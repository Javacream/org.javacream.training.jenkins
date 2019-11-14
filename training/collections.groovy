def demoList(){
    def names = new ArrayList()
    names.add("Hugo")
    names.add("Emil")
    names.add("Fritz")

    println(names.get(2))
    println(names.size()) //3
    names.add("Hugo")
    println(names.size()) //4
    collectionIterator(names)
    names.remove(1)
    println(names.size())
    names.clear()
    println(names.size())
}

def demoMap(){
    def postalCodes = new HashMap()
    postalCodes.put(81377, "München")
    postalCodes.put(30000, "Berlin")
    postalCodes.put(76666, "Stuttgart")
    collectionIterator(postalCodes)
    collectionIterator(postalCodes.keySet())
    collectionIterator(postalCodes.values())

    println(postalCodes.get(81377))
    println(postalCodes.size())
    postalCodes.clear()
    println(postalCodes.size())

}
def demoSet(){
    def names = new HashSet()
    names.add("Hugo")
    names.add("Emil")
    names.add("Fritz")
    println(names.size()) //3
    names.add("Hugo")
    println(names.size()) //3
    collectionIterator(names)
}

def collectionIterator(collection){
    for (def element in collection){
        println(element)
    }
}

def demoString(){
    def message = new String("Hello")
    def firstLetter = message.charAt(0)
    println(firstLetter)
}

//demoList()
demoMap()
//demoSet()