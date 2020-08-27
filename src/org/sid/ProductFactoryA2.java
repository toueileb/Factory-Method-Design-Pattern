package org.sid;

public class ProductFactoryA2 extends ProductFactory{
    @Override
    protected ProductA createProductA() {
        return new ProductA2();
    }
}
