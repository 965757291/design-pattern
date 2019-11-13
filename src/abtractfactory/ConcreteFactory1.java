package abtractfactory;

/**
 * 具体工厂1 生产具体产品1
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ConcreteProduct1 newProduct1() {
        System.out.println("具体工厂1 --》具体产品1");
        return new ConcreteProduct1();
    }

    @Override
    public ConcreteProduct2 newProduct2() {
        System.out.println("具体工厂1 --》具体产品2");
        return new ConcreteProduct2();
    }
}
