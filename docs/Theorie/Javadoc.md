# Javadoc

Javadoc ist eine Möglichkeit, um eine Dokumentation zu erstellen. Diese Dokumentation wird aus den Kommentaren im Code erstellt. Javadoc ist eine Erweiterung von Java, die es ermöglicht, aus den Kommentaren eine Dokumentation zu erstellen. Diese Dokumentation wird in HTML erstellt und kann somit im Browser geöffnet werden. Javadoc ist vor allem nützlich, da man direkt im Code die Kommentare hinschreiben kann und somit nicht eine extra Datei erstellen muss.

Eine Javadoc kann man mit Hilfe von Maven erstellen. Dies wird mit dem Befehl ```mvn javadoc:javadoc``` gemacht.

> Die Javadoc wird im Ordner ```target/site/apidocs``` erstellt.

![Javadoc](javadoc.png)

## Javadoc Attribute

Damit man Javadoc ermöglichen kann die Kommentare und Notizen zu exportieren und auf der HTML-Seite anzuzeigen, muss man die Kommentare mit bestimmten Attributen versehen. Es werden dabei jedoch für Klasen andere Attribute verwendet als für Methoden.
Für Klassen werden normalerweise folgende Attribute verwendet:

> Klassenattribute
```java
/**
 * Hier wird eine Beschreibung der Klasse plaziert, manchmal bevorzuge ich auch noch weitere Notizen, die wichtig zu wissen sind.
 * @autor Severin Bögli --> Der Autor der Klasse
 * @version 1.0 --> Die Version der Klasse
 * @since 2021-05-11 --> Das Datum, an dem die Klasse erstellt wurde
 */
public class Test {
    // Diese Klasse ist leer.
}
```

> Methodenattribute
```java
/**
 * Hier kommt wieder eine Beschreibung hinzu, diese beschreibt nun jedoch die Methode.
 * @param args Beschreibt die Parameter, die in der Methode verwendet werden. Es sollten alle Parameter aufgelistet werden.
 * @return Hier wird der Rückgabewert beschrieben.
 */
public static void main(String[] args) {
    // Dies ist die main-Klasse.
}
```

## Weitere Tags
* ```@see``` --> Verlinkt auf eine andere Klasse oder Methode.
* ```@link```, kann verwendet werden, um auf eine andere Klasse zu verlinken. Dies wird wie folgt gemacht: ```{@link Test}```. Dies wird dann in der Javadoc als Link angezeigt.
* ```@since``` --> Gibt an, seit wann die Klasse existiert.
* ```@exception``` --> Hier wird angegeben, welche Fehler auftreten können werden, respektive genau gemeldet werden.
* ```@inheritDoc``` --> Dies kopiert die Beschreibung der Oberklasse auf die aktuelle Klasse.
