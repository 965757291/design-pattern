package factorymethod;

/**
 * 具体工厂1 生产具体产品1
 */
public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1 --》具体产品1");
        return new ConcreteProduct1();
    }
}
