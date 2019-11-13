package factorymethod;

/**
 * 工厂模式
 * 定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AbstractFactory cf1 = new ConcreteFactory1();
        Product cp1 = cf1.newProduct();
        cp1.show();
        AbstractFactory cf2 = new ConcreteFactory2();
        Product cp2 = cf2.newProduct();
        cp2.show();
    }
}
