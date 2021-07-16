# Eigenständige Übung: Buch-Anwendung

## Datenstruktur Book

* isbn: String
* title: String
* price: Double
* pages: Integer
* available: Boolean

## Operationen auf Büchern: BooksController

* Stellt Methoden bereit zum Anlegen, Suchen, Löschen, Aktualisieren von Büchern
* create(title:String) : String
* findByIsbn(isbn:String) : Book
* deleteByIsbn(isbn:String) : void
* update(book: Book): void