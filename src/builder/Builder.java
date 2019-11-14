package builder;

/**
 * 抽象建造者：包含创建产品各个子部件的抽象方法。
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    /**
     * 返回具体产品
     * @return
     */
    public Product getResult(){
        return product;
    }

}
