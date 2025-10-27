package net.bytem0use.marvel.enums;

public enum PowerType {
    COMMON("Common"),
    RARE("Rare"),
    EPIC("Epic"),
    LEGENDARY("Legendary");

    private String tag;

    private PowerType(String tag){this.tag = tag;}

    public String toString(){return this.tag;}
}
