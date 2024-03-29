package builder;

/**
 * 建造者模式
 * 指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，
 * 这样的设计模式被称为建造者模式。它是将一个复杂的对象分解为多个简单的对象，
 * 然后一步一步构建而成。它将变与不变相分离，即产品的组成部分是不变的，
 * 但每一部分是可以灵活选择的。
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.contruct();
        System.out.println(product.shpw());
    }
}
