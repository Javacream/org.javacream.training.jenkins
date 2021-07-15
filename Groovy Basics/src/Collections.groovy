//Definition einer Liste
def names = ["Hugo", "Emil", "Fritz"]
//Zugriff auf Listenelemente erfolgt über einen Index
println(names[0])
//println(names[3])
names[3] = "Franz"

//Iterieren
for (def i = 0; i < names.size(); i++){
    println("Element ${i + 1}: ${names[i]}")
}

//Definition einer Map
def colors = ["red": "#FF0000", "green": "#00FF00", "blue": "#0000FF"]
println (colors["blue"])
def colorValueList = colors.values()
def colorKeySet = colors.keySet();
println(colorValueList)
println(colorKeySet)
