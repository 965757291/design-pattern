package adpater;

/**
 * 适配器模式（Adapter）
 * 将一个类的接口转换成客户希望的另外一个接口，
 * 使得原本由于接口不兼容而不能一起工作的那些类能一起工作
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
