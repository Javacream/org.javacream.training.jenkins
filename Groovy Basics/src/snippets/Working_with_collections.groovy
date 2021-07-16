List elements = ["A", "C", "B", "AA", "Z1", "FF"]
Map states = ["München": "Bayern", "Stuttgart": "BW", "Augsburg": "Bayern"]
 
for (String element in elements){
	println element
}

for (def element in states){
	println element
}
println ("#################")

for (String statesKey in states.keySet()){
	print statesKey
	print "::"
	def valueForKey = states.get(statesKey)
	print valueForKey
	println "${statesKey} :: ${states.get(statesKey)}"
}
println ("#################")

for (String value in states.values()){
	println value
}



