package com.severinboegli;

public class Kind
{
    /**
    * DasKind hat noch keine Kenntnis von dem Vater,
    * zeigt auf null
    */
    private Vater refVater = null;
    // Normale Wertvariable
    private int geburtsJahr= 0;
    /**
    * Es findet eine Parameterübergabe statt.
    * Die Klasse Kind macht einen Verweis zum Vater.
    * Das Kind kennt nun seinen Vater.
    */
    public void setSeinenVater(Vater refVater)
    {
        this.refVater = refVater;
    }
    public Vater getSeinenVater()
    {
        return refVater;
    }
}