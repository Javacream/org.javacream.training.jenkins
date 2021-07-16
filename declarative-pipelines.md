# Declarative Pipelines

## Übersicht 

* Vereinfachte Syntax zur Definition einer Pipeline
  * Leider nicht mehr Groovy, nur ein bisschen Groovy
* Faktisch eine eigene, neue Programmiersprache
  * Eigentlich nur bekannt in der Groovy-Community
  * Problem: Es gibt dafür wenig bis gar keine Untersützung außerhalb von Jenkins, sondern das Project "Blue Ocean"

## Continuous Integration / Continuous Delivery (CI/CD)

* Auslöser: Push auf einen master/main-Branch in einem Software-Repository
* Jenkins ist ale Listener beim Source Code Management registriert
* Idee: Jenkinsfile
  * Die Build-Pipeline liegt im Source Repository

## Definition der Build-Umgebung

* node (skripted pipeline) agent (declarative pipeline) wählen den ausführenden Agent / Build-Rechner
  * node ('Linux') -> Build-Prozess muss auf einer Linux-Maschine laufen
  * node ('Windows') -> Build-Prozess muss auf einer Windows-Maschine laufen
  * Auswahl der Build-Umgebung erfolgt heute unter Verwendung von Build-Containern
    * Build-Container werden in der Regel über Docker-Images bereitgestellt
