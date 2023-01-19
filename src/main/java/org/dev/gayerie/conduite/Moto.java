package org.dev.gayerie.conduite;

public class Moto extends Vehicule {

    public Moto(String marque, String type) {
        super(marque, type);
        this.pneus = new Pneu[]{new Pneu(), new Pneu()};
    }

    @Override
    protected void test() {
        super.test();
        System.out.println(" -- protected");
    }
}
