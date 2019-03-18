def app(){
    def sentence = "space the final frontier these are the voyages of the starship enterprise it's five year mission"
    def words = sentence.split(" ")
    longestWord(words)
    shortestWord(words)
    index(words)
}


def index(words){
    def result = [:]
    for (word in words){
        def firstLetter = word.charAt(0)
        def list = result.get(firstLetter)
        if (list == null){
            list = []
            result.put(firstLetter, list)
        }
        list.add(word)
    }
    println(result)
}


def longestWord(words){
    def result = -1
    for (word in words){
        def length = word.length()
        if (length > result){
            result = length
        }
    }
    println("Longest word = ${result}")
}

def shortestWord(words){
    def result = 100000
    for (word in words){
        def length = word.length()
        if (length < result){
            result = length
        }
    }
    println("Shortest word = ${result}")
    
}

app()