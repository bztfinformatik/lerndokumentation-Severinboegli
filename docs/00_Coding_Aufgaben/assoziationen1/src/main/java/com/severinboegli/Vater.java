package com.severinboegli;

public class Vater
{
    /**
    * refKindist eine Referenzvariable vom Typ Kind.
    * Sie muss auf etwas zeigen, hier eben auf null
    */
    private Kind refKind = null;
    // Eine normale Wertvariable
    private int alterVater = 18;
    /**
    * refKind wird auf das Kind gesetzt
    * also auf das Kind, welches zum Vater gehört!*/

    public void setIhrKind(Kind refKind)
    {
        this.refKind = refKind;
    }

    public Kind getIhrKind()
    {
        return refKind;
        /* Hinweis: Man erhält eine etwas komische Ausgabe, 
        * den von einer oberen Klasse abgeleiteten Hashwert.
        * Wir sagen dem hier einfach anschaulich Adresse*/
    }

    public void setAlterVater(int alterVater)
    {
        this.alterVater = alterVater;
    }
    public int getAlterVater()
    {
        return alterVater;
    }
}
