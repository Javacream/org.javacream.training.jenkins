# Groovy Revisited

## Historie

* Ursprüngliche Konzeption sah vor, dass Groovy eine Art Spielwiese für neue Java-Features war
* Dieses Konzept war sehr erfolgreich, und damit ist Groovy fast absolet
* Einem Groovy-Programm stehen alle Klassen, Bibliotheken und Frameworks der Java-Welt zur Verfügung

## Aktuell

* Groovy wird vorwiegend für reine Skript-Anwendungen benutzt
  * Wie möchten auf einen komplexen Build- und Deployment-Vorgang verzichten
  * Groovy-Skripte werden genutzt, um in vorhandenen Anwenudngen Erweiterungen/Customizing durchzuführen
    * Eine Web-Anwendung in einem Web Server
    * Abfrage in einer z.B. NoSQL-Datenbank
    * Jenkins
    * Jira
  
 ## Groovy als Skriptsprache
 
 * Skript-Sprachen tendieren zu untypisierter Programmierung
 *  Schlüsselwort "def" deklariert einer Variablen, einer Funktion, eines Attributs, einer Methode
   * Klassen sind weiterhin typisiert und enthalten Typ-Angaben
 * Zum Testen eines Skriptes müssen die Java-Bibliotheken, die im Skript benutzt werden, vorhanden sein in der Entwicklungsumgebung
 * Die Ausführung der Skripte muss ebenfalls in der Umgebung erfolgen, in der die Typen vorhanden sind
   * Eine Test-Umgebung, die die reale Umgebung (Jenkins/Jira) simuliert ist schwer aufzusetzen
