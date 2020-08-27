package org.sid;

public class ProductFactoryA1 extends ProductFactory{
    @Override
    protected ProductA createProductA() {
        return new ProductA1();
    }
}
