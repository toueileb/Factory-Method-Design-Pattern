package org.sid;

public class Main {

    public static void main(String[] args) {

        ProductFactory produitFactory1 = new ProductFactoryA1();
        ProductFactory produitFactory2 = new ProductFactoryA2();

        ProductA productA = null;

        System.out.println("Utilisation de la premiere fabrique");
        productA = produitFactory1.getProductA();
        productA.methodA();

        System.out.println("Utilisation de la seconde fabrique");
        productA = produitFactory2.getProductA();
        productA.methodA();
    }
}
