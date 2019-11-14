package proxy;

/**
 * 真实主题类
 * 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("访问真实代理。。。。");
    }
}
