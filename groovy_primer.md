# Eine kurze Einführung in Groovy

* Als Sprache ist Groovy 
  * Objekt-Orientiert
    * Attribute und Methoden sind einem Objekt-zugeordnet
    * Abstraktion durch eine Klassen-Hierarchie
  * Eine Skript-Sprache
    * Top-Level-Funktionen können in einer Sequenz von Anweisungen aufgerufen werden
  * Typisierte Sprache
    * Variablen, Paramater, Rückgabewerte haben eine Typen
  * Untypisierte Programmierung ist ebenfalls

* Groovy ist eine Compiler-Sprache
  * Die Compilierung kann zur Laufzeit erfolgen
  * Klassiches Compilieren erzeugt Runtime-Artefakte

* Groovy ist eine Bytecode-Sprache
  * Ausführung erfolgt in einer Java Virtual Machine
  * Interoperabilität mit Java
  * Die Runtime-Artefakte sind JAR

* Syntactic Sugar
  * Syntax der Sprache ist relativ flexibel
    * println("Hello World");
    * println "Hello World"

* Eine funktionale Sprache
  * Funktionen können als Variable/Parameter/Rückgabewerte benutzt werden
  * Häufig wird der funktionale Ansatz genutzt in der Framework-Programmierung
    * Die komplizierte Logik ist in einem Framework fertig implementiert, die eigene Logik wird über eine Callback-Funktion beigesteuert
