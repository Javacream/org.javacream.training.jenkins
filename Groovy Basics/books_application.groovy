def b1 = new Book("ISBN1", "Title1", 19.99, 200)
def b2 = new Book("ISBN2", "Title2", 9.99, 20)

def printBookInfo(Book b){
    println("Book: ${b.isbn}, ${b.title}")
    b.title = "CHANGED"
}

println(b1.title)

printBookInfo(b1)
printBookInfo(b2)

println(b1.title)

