package factorymethod;

/**
 * 具体产品2 实现了抽象产品
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2展示");
    }
}
