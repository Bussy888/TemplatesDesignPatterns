package TemplatesP1.T3_FactoryMethod;

public class ConcreteProduct implements IProduct {

    @Override
    public void create() {
        System.out.println("Creando ConcreteProduct1");

    }
}
