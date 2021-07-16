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
* findAll(): List
* deleteByIsbn(isbn:String) : void
* update(book: Book): void

## Simple Anwendungs-Skript

* Instanziere einen BooksController
* Anlegen, Suchen, ...

## Hinweis

* Innerhalb des BooksControllers ist eine Map sinnvoll
* Optionale Erweiterung durch Hinzufügen weiterer find-Operationen
  * findByTitle(title:String) : Book
  * findByPriceRange(range): List
* Sie können gerne alles in einer Datei realisieren   