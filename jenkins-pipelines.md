# Übersicht: Was ist eine Pipeline

* Sequenz von Befehlen, die von Jenkins ausgeführt werden
* Konfiguration: Wann und unter welchen Kriterien soll die Pipeline ausgeführt

## Beispiel

* Hole die Quellcode
* Compiliere den Code
* Packe den Code
* Test den Code
* Veröffentliche den Code

## Potenziell: Parallelisierung von Vorgängen

## Beispiel mit parallelem Testen

* Hole die Quellcode
* Compiliere den Code
* Packe den Code
* Test den Code
  * Quellcode-Analyse
  * Fachliche Tests: Funktioniert die Anwendung
  * Weitere Tests: Performance, Speicherprobleme...
* Veröffentliche den Code
