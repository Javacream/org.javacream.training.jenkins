List names = ["Hugo", "Emil", "Fritz", "Egon", "Anton"]

List filteredByE = names.findAll {e -> return e.startsWith("E")}
filteredByE.each {e -> println(e)}

List sorted = names.toSorted {e1, e2 -> return e1.compareTo(e2)}
sorted.each {e -> println(e)}

List transformed = names.collect {e -> return e.length()}
transformed.each {e -> println(e)}
