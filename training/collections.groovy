def demoList(){
    def names = new ArrayList()
    names.add("Willibald")
    names.add("Emil")
    names.add("Fu")
    names.add("Gregor")
    names.add("Hanna")
    names.add("Friedrike")

    println(names)
    def sortFn = {n1, n2 -> n2.charAt(1).compareTo(n1.charAt(1))}
    println(names.sort(sortFn))
    names.each({println(it)})
    def result = sortFn("Hugo", "Hogo")
    println(result)
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

demoList()
//demoMap()
//demoSet()