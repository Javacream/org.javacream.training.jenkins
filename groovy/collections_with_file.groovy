
new File("data.txt").readLines().stream().filter({String element -> element.startsWith("f")}).distinct().map({String element -> element.toLowerCase()}).sorted({e1, e2 -> e2.compareTo(e1)}).forEach({element -> println element} )

