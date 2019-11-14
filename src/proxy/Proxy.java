package proxy;

/**
 * 代理（Proxy）类：
 * 提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题预处理。。。。");
    }

    public void postRequest(){
        System.out.println("访问真实主题后续处理。。。。");
    }
}
