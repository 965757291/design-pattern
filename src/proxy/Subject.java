package proxy;

/**
 * 抽象主题
 * 通过接口或抽象类声明真实主题和代理对象实现的业务方法
 */
public interface Subject {
    void request();
}
