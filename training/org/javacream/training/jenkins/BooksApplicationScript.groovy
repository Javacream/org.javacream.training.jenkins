import org.javacream.training.jenkins.Book
import org.javacream.training.jenkins.Publisher

def book = new Book(isbn: "ISBN", title: "Groovy in Action", price: 19.99, pages: 380)
def book2 = new Book(isbn: "ISBN2", title: "Java in Action", price: 9.99, pages: 1080)
println(book.info())
println(book.price)
println(book2.info())
println(book.info())

def publisher = new Publisher("Addison")
publisher.addBook(book)

println(publisher.findBookByIsbn("ISBN"))
