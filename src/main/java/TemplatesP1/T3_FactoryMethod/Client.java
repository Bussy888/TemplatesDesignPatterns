package TemplatesP1.T3_FactoryMethod;

public class Client {
    public static void main (String[]ars){
        IProduct prod1 = new ConcreteCreatorProduct1().factoryMethod();
        prod1.create();
    }
}
