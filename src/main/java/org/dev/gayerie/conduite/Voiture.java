package org.dev.gayerie.conduite;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "voiture", namespace = "ns/voiture")

public class Voiture extends Vehicule {
    protected String marque;

    public Voiture(String marque, String type) {
        super(marque, type);
        this.marque = marque;
        this.pneus = new Pneu[]{new Pneu(), new Pneu(), new Pneu(), new Pneu()};
    }

    protected void tete() {
        System.out.println("test static final voiture");
        System.out.println("marque voiture : " + this.marque + " - marque vehicule : " + super.marque);
    }
}
