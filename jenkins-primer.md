# Was ist dieser Jenkins?

* Level 0: Scheduler
* Level 1: mit Web Frontend
* Level 2: Master-Agent-Architektur

# Was kann dieser Jenkins?

* Ausführung einer beliebigen Anzahl von Job-Definitionen
* Detailliertes Reporting inklusive Fehleranalyse
* Job-Abhängigen

# Was ist der Jenkins NICHT

* Source Code Management (Git)
* Build-Werkzeug (!) (Apache Maven)
* Ablage für die gebauten Runtime-Artefakte, diese Aufgabe übernimmt ein Artefakt-Repository (Nexus, Artifeactory) 

# Wie beliebt / notwendig ist denn der Jenkins heutzutage?

* Für das klassiche Bauen von Anwendungen ist Jenkins nicht mehr notwendig
  * Trend geht hier eher zu Komplettlösungen, z.B. GitLab CI/CD
  * Historisch gewachsene Build-Umgebungen benutzen aber häufig immer noch Jenkins
* Jenkins viel flexibler als "nur Software bauen"

# Job-Definitionen

* Level 0: mvn package
* Level 1: Nach welchen Kriterien wird der Job gestartet? Welche Reports? ...
* Level 2: Zusätzliche vorrangige/nachrangige Aktionen ausgeführt in eigenen Job-Stages /Schritte
* Level 3: Auswahl des für einen Schritte geeigneten Agents