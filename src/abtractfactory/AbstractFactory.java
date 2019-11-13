package abtractfactory;

/**
 * 抽象工厂：提供工厂接口
 */
public interface AbstractFactory {

    ConcreteProduct1 newProduct1();
    ConcreteProduct2 newProduct2();
}
