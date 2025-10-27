package net.bytem0use.marvel.enums;

public enum AbilityCategory {
    ULTIMATE("Ultimate"),
    BLOCK("Block");

    private String tag;

    private AbilityCategory(String tag) {
        this.tag = tag;
    }

    public String toString() {
        return this.tag;
    }
}
