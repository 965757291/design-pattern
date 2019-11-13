package factorymethod;

/**
 * 具体工厂2 生产具体产品2
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2 --》具体产品2");
        return new ConcreteProduct2();
    }
}
