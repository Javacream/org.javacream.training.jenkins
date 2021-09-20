class Book{
    String title
    String isbn
    double price
    int pages

    Book(String isbn, String title, double price, int pages) {
        this.title = title
        this.isbn = isbn
        this.price = price
        this.pages = pages
    }
}

class BooksController{
    Map<String, Book> books = new HashMap();
    Random r = new Random()
    String create(String title){
        String isbn = "ISBN: " + r.nextInt()
        Book newBook = new Book(isbn, title, 19.99, 200)
        books.put(isbn, newBook)
        return isbn
    }
    Book findBookByIsbn(String isbn){
        return books.get(isbn)
    }
    void deleteBookByIsbn(String isbn){
        Book removed = books.remove(isbn)
        if (removed != null){
            //isbn was there
        }
    }

    List<Book> findBookByTitle(String title){
        Closure c = {book -> book.title.equals(title)}
        books.entrySet().find(c)

        //Groovy ==
    }

}
