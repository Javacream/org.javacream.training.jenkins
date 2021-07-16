package books

class Book{
	String isbn
	String title
	int pages
	double price
	boolean available

	Book(String isbn, String title, int pages, double price, boolean available){
		this.isbn=isbn
		this.title = title
		this.pages=pages
		this.price=price
		this.available=available
	}
}

class BooksController{
	private Map books = [:]
	private int counter = 0
	String create(String title){
		def isbn = "ISBN${counter++}"
		def book = new Book(isbn, title, 100, 19.99, false)
		books[isbn] = book
		return isbn
	}
	Book findByIsbn(String isbn){
		return books[isbn]
	}
	def findAll(){
		return books.values()
	}
	void deleteByIsbn(String isbn){
		books.remove(isbn)
	}
	void update(Book book){
		books[book.isbn] = book
	}

}

def booksController = new BooksController()
def isbn = booksController.create("Groovy")
println("Generated ISBN: " + isbn)
def searchResult = booksController.findByIsbn(isbn)
println("Search Titel: $searchResult.title")
def allBooks = booksController.findAll()
allBooks.each {book -> println("Buch: ISBN $book.isbn , title = $book.title")} //Buch: Isbn = 0815, title = Groovy
booksController.deleteByIsbn(isbn)