package builder;

/**
 *具体建造者：实现了抽象建造者接口。
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造A部分");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造B部分");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造C部分");
    }
}
