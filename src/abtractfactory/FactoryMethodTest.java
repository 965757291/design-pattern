package abtractfactory;

/**
 * 工厂模式
 * 定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AbstractFactory cf1 = new ConcreteFactory1();
        Product cp11 = cf1.newProduct1();
        cp11.show();
        Product cp12 = cf1.newProduct2();
        cp12.show();
        AbstractFactory cf2 = new ConcreteFactory2();
        Product cp21 = cf2.newProduct1();
        cp21.show();
        Product cp22 = cf2.newProduct2();
        cp22.show();
    }
}
