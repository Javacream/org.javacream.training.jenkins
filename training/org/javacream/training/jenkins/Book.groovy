package org.javacream.training.jenkins

import groovy.transform.Immutable

@Immutable
class Book {
    String isbn
    String  title
    Integer pages
    Double price

    String info(){
        return "a book: isbn=${this.isbn}"
    }
}

class Publisher{

    Publisher(String name){
        this.name = name
    }
    String name
    //"LIST OF BOOK"
    Map<String, Book> books = new HashMap()

    void addBook(Book book){
        books.put(book.isbn, book)
    }
    void removeBook(Book book){
        books.remove(book.isbn)
    }

    Book findBookByIsbn(String isbn){
        books.get(isbn)
    }

}
