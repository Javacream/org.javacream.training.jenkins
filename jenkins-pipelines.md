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

* Hole die Quellcode
* Compiliere den Code
* Packe den Code
* Test den Code
  * Quellcode-Analyse
  * Fachliche Tests: Funktioniert die Anwendung
  * Weitere Tests: Performance, Speicherprobleme...
* Veröffentliche den Code

## Gruppierung von Sequenzen

* Stage 1 (Source Code Management)
  * Hole die Quellcode
* Stage 2 (Bauen der Software)
  * Compiliere den Code
  * Packe den Code
* Stage 3 (Test)
  * Quellcode-Analyse
  * Fachliche Tests: Funktioniert die Anwendung
  * Weitere Tests: Performance, Speicherprobleme...
* Stage 4 (Beretitstellung)
  * Veröffentliche den Code

## Orchestrierung der Ausführung der Pipeline

* Node 1
  * Environment
    * Konfigurations-Informationen 
  * Stage 1 (Source Code Management)
    * Hole die Quellcode
  * Stage 2 (Bauen der Software)
    * Compiliere den Code
    * Packe den Code
  * Stage 3 (Test)
    * Quellcode-Analyse
    * Fachliche Tests: Funktioniert die Anwendung
    * Weitere Tests: Performance, Speicherprobleme...
  * Stage 4 (Beretitstellung)
    * Veröffentliche den Code

# Pipeline-Befehle

## Core Jenkins-Befehle

* node
* stage
* sh
* bat

## Jenkins PlugIns

* Eine Installation erfolgt über den Jenkins Marketplace
* Jedes PlugIn erweitert Jenkins um
  * Neue Pipeline-Befehle
  * Neuer Satz von Konfigurationseinstellungen im Jenkins
  * Erweiterungen des Web Frontends

# Build-Workspace

* Der Build-Prozess läuft in einem Dateisystem
* Jenkins archiviert Build-Workspaces für die unterschiedlichen Job-Ausführungen
  * Es ist Aufgabe eines Jobs, relevante Artefakte / Binaries aus dem Workspace in ein Repository zu kopieren
* Stages können einzelnen Nodes zugeordnet werden
  * Problem: Was passiert dem Workspace?
  * Lösung: Stashing
