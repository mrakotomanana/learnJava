package org.dev.gayerie.conduite;

public class Vehicule {
    private static int nbInstances = 0;

    protected String marque;
    protected String type;
    protected Pneu[] pneus;

    public Vehicule(String marque, String type) {
        ++nbInstances;
        this.marque = marque;
        this.type = type;
    }

    public static int getNbInstances() {
        return nbInstances;
    }

    public Pneu[] getPneus() {
        return pneus;
    }

    protected void test() {
        System.out.println("test on vehicule : " + marque + " - " + type);
    }

    protected void tete() {
        System.out.println("test static final vehicule");
    }
}
