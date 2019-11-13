package abtractfactory;

/**
 * 具体产品1 实现了抽象产品
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1展示");
    }
}
