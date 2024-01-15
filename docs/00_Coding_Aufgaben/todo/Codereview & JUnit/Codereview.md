# Codereview Checkliste

Dies ist die Codereview Checkliste für das Java-Projekt von Silas Hardegger.

# 1. Die verschiedenen Phasen des Codereviews

### Phase 1:
Silas und ich haben gegenseitig unsere Projekte gezeigt und uns die Funktionalitäten erklärt. Sein Projekt scheint auf den ersten Blick sehr komplex und gut durchdacht zu sein. Er hat sich sehr viel Mühe gegeben.

### Phase 2:
Ich habe die Checkliste durchgearbeitet und habe meine Kommentare und Verbesserungsvorschläge aufgeschrieben. Dabei habe ich nur sehr wenige Verbesserungsvorschläge gefunden. Der Code entspricht den Kriterien der Checkliste.

### Phase 3:
Silas und ich sind nochmals zusammengesessen und haben unsere Erkenntnise nochmals zusammen besprochen. Silas hat bei meinem Projekt kleine Änderungen gefunden.

### Phase 4:
Die Besprochenen Änderungen habe ich umgesetzt, es war vor allem die Verwendung von `this` und die Verwendung von Regex bei der E-Mail Überprüfung. Ich finde es sehr gut,dass sich Silas meinen Code angeschaut hat, da man so nochmals einen anderen Blickwinkel auf das Projekt bekommt.

### Phase 5:
Nun haben wir uns noch ein letztes Mal zusammengesessen und haben die Änderungen kontrolliert. Silas und ich haben beide die Änderungen machen können.

## Übersicht

| Checklist Item                                    | Erklärung                                                                                | Status |
|---------------------------------------------------|------------------------------------------------------------------------------------------|--------|
| Use Intention-Revealing Names                     | Namen (Klassen, Funktionen, Variablen) sollen den Verwendungszweck abbilden              | ok     |
| Use Solution/Problem Domain Names                 | Namen (Klassen, Funktionen, Variablen) sollen der Aufgabenstellung gemäss genutzt werden | ok     |
| Klassen gross                                     | Klassen sind gross geschrieben                                                           | ok     |
| Functions should be small!!                       | Methoden sind klein geschrieben                                                          | ok     |
| Do one Thing                                      | Eine Methode soll genau eine Aufgabe erfüllen                                            | ok     |
| Don't Repeat Yourself (Avoid Duplication)         | Keine Repetition im Source-Code                                                          | ok     |
| Explain yourself in code                          | Kommentar im Source-Code!                                                                | ok     |
| Make sure the code formatting is applied          | Code soll formatiert sein                                                                | ok     |
| Don't return Null                                 | Achten Sie darauf, dass nie/wenn möglich `null` zurückgegeben wird                       | ok     |
| Avoid duplication of code                         | Kein duplizierter Code                                                                   | ok     |
| Minimize the accessibility of classes and members | Zugriffsmodifizierer sind angewendet                                                     | ok     |

## Details



### Use Intention-Revealing Names
Verwendungszweck wird abgebildet: Ja
Die Klassen, Methoden & Attribute werden so bennant, dass es ersichtlich ist, was deren Funktion ist.
Das Namenskonzept ist einheitlich und verständlich gewählt.

| Filename       | Kommentar                    | Status |
|----------------|------------------------------|--------|
| Mieter.java    |  Namen sind einheitlich      | ok     |
| Wohnung.java   |  Namen sind einheitlich      | ok     |
| WC.java        |  Namen sind einheitlich      | ok     |

### Use Solution/Problem Domain Names
Die Namen werden sinnvoll verwendet. Die Logik dahinter macht Sinn.

| Filename        | Kommentar                              | Status |
|-----------------|----------------------------------------|--------|
| Wohnzimmer.java | Namen entsprechen der Aufgabenstellung | ok     |
| Moebel.java     | Namen entsprechen der Aufgabenstellung | ok     |
| Zimmer.java     | Namen entsprechen der Aufgabenstellung | ok     |

### Klassen gross
Die Klassen werden gross geschrieben und entsprechen der Code Richtlinie vom BZTF.

| Filename     | Kommentar        | Status |
|--------------|------------------|--------|
| Sofa.java    | Klasse ist gross | ok     |
| WC.java      | Klasse ist gross | ok     |
| Wohnung.java | Klasse ist gross | ok     |

### Functions should be small!!
Funktionen werden alle kleingeschrieben. Getter und Setter werden richtig geschrieben.

| Filename        | Kommentar                  | Status |
|-----------------|----------------------------|--------|
| Mieter.java     | alle Funktionen sind klein | ok     |
| WC.java         | alle Funktionen sind klein | ok     |
| Wohnzimmer.java | alle Funktionen sind klein | ok     |

### Do one Thing
Eine Methode macht genau eine Aufgabe.

| Filename          | Kommentar                      | Status |
|-------------------|--------------------------------|--------|
| Moeber.java       | die Methoden machen eine Sache | ok     |
| Schlafzimmer.java | die Methoden machen eine Sache | ok     |
| Zimmer.java       | die Methoden machen eine Sache | ok     |

### Don't Repeat Yourself (Avoid Duplication)
Es werden keine Repetitionen gemacht und der Code enthält auch keine unnötige Redundanz.

| Filename        | Kommentar                      | Status |
|-----------------|--------------------------------|--------|
| Badezimmer.java | Der Code wird nicht wiederholt | ok     |
| Moebel.java     | Der Code wird nicht wiederholt | ok     |
| Mieter.java     | Der Code wird nicht wiederholt | ok     |

### Explain yourself in code
Der Code ist selbsterklärend und so aufgebaut, dass er sich selbst erklährt. Die Struktor ist übersichtlich gemacht.
**Der Code enthält Kommentare!**

| Filename     | Kommentar                                                    | Status |
|--------------|--------------------------------------------------------------|--------|
| Moebel.java  | Der Code beinhaltet Javadoc Kommentare, jedoch keine anderen | ok     |
| Wohnung.java | Der Code beinhaltet Javadoc Kommentare, jedoch keine anderen | ok     |
| Zimmer.java  | Der Code beinhaltet Javadoc Kommentare, jedoch keine anderen | ok     |

### Make sure the code formatting is applied

> Der Code ist über alle Klassen hinweg klar formatiert und mit einheitlicher Struktur

| Filename | Kommentar                                     | Status |
|----------|-----------------------------------------------|--------|
| *.java   | Alle Dateien sind strukturiert und formatiert | ok     |

### Don't return Null
Null wird nur bei Stellen, die sinnvoll genutzt und zurückgegeben.

| Filename | Kommentar                                                                                                                                            | Status |
|----------|------------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| *.java   | Es gibt gewisse Stellen mit 'null' als Rückgabewert, jedoch werden diese sinnvoll eingesetzt. Könnte jedoch auch ohne 'null' ausprogrammiert werden. | ok     |

### Avoid duplication of code
Es wird kein Code dupliziert und an einer anderen Stelle genau gleich verwendet.

| Filename        | Kommentar                       | Status |
|-----------------|---------------------------------|--------|
| WC.java         | Der Code wurde nicht dupliziert | ok     |
| Badezimmer.java | Der Code wurde nicht dupliziert | ok     |
| Lavabo.java     | Der Code wurde nicht dupliziert | ok     |


### Minimize the accessibility of classes and members
Es wurden Zugriffsmodifizierer angewendet und auch sinnvoll genutzt.

| Filename | Kommentar                                                                                                  | Status |
|----------|------------------------------------------------------------------------------------------------------------|--------|
| *.java   | Die Zugriffsmodifizierer wurden sinnvoll verwendet. Es gibt eine einheitliche Struktur bei der Verwendung. | ok     |


# Persönliche Verbesserungen für mein To-Do Projekt von Silas
Dies sind die Notizen zum Codereview bei der Besprechung zu meinem Projekt.

## Codereview Checklisten für Bearbeitung

- [x] Get in Variabel
- [x] Passwort wird wiederholt --> isPasswordCorrect
- [x] Konstruktoren, ohne "this"

Dies sind die Punkte, die ich nach der Besprechung verbessern konnte.



# Reflektion

**1. Wie habe ich mich beim Codereview gefühlt?**

Während des Codereviews fand ich es gut, dass ich meinen Code mit jemandem zusammen besprechen konnte. Ich hatte so die Möglichkeit, mein Projekt zu präsentieren und beurteilen zu lassen. Die Verbesserungsvorschläge konnte ich danach direkt anwenden. Ich fand es bereichernd, dass wir beim Codereview den Code gegenseitig angeschaut und dadurch auch Inspiration gesammelt haben. Silas hat mir konstruktive Kritik gegeben, die ich gut umsetzen konnte, wodurch ich das Gefühl bekam, dass mein Projekt gelungen ist. Es war eine positive Erfahrung, die zu einem verbesserten Verständnis und einer höheren Qualität meiner Arbeit beigetragen hat.

**2. Was habe ich gelernt (im Vorgehen)?**

Beim Codereview habe ich gelernt, dass es wichtig ist, seinen Code von einer weiteren Person überprüfen zu lassen. Durch das gegenseitige Durchlesen konnte ich weitere Fehler beheben. Die verschiedenen Phasen, die wir abgearbeitet haben, werde ich mir für die Zukunft merken und wieder anwenden.

**3. Was habe ich gelernt (technisch)?**

Nach dem Codereview habe ich gelernt, dass es bei einem fertigen Projekt immer noch Verbesserungspotenzial gibt. Die richtige Verwendung von `this` habe ich mit Silas zusammen gelernt. Er zeigte mir, wie man doppelte Konstruktoren vermeiden kann, indem man die Parameter mit `this` kombiniert. Außerdem habe ich gelernt, wie man "Regex" in Java verwendet, um beispielsweise eine E-Mail-Adresse zu überprüfen. Dies habe ich erst umgesetzt, nachdem Silas mich darauf hingewiesen hatte.

# Abschluss

Alles in allem habe ich während des Projekts viele neue Dinge gelernt. Neben JUnit und Codereview habe ich mich auch intensiver mit Beziehungen auseinandergesetzt. All diese Erkenntnisse werde ich in mein nächstes Projekt einfliessen lassen. Ich finde es jedoch sinnvoll dein Codereview gegebenfalls schon vor dem Beenden des Projektes zu machen, da man so auch noch weitere Ideen des Gegenübers einbringen kann.
