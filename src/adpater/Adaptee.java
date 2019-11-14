package adpater;

/**
 * 适配者（Adaptee）类：
 * 它是被访问和适配的现存组件库中的组件接口
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("设配者内部方法");
    }
}
