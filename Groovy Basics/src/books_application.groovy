def controller = new BooksController()
String isbn1 = controller.create("Title1")
String isbn2 = controller.create("Title2")


def b1 = controller.findBookByIsbn(isbn1)
def b2 = controller.findBookByIsbn(isbn2)

def printBookInfo(Book b){
    println("Book: ${b.isbn}, ${b.title}")
    b.title = "CHANGED"
}

println(b1.title)

printBookInfo(b1)
printBookInfo(b2)

println(b1.title)


