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
