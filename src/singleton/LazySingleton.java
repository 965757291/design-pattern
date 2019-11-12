package singleton;

/**
 * 某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
 * 懒汉式单例：
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null; //保证 instance 在所有线程中同步

    private LazySingleton(){};//私有化构造函数，避免在类外调用构造函数

    public static synchronized LazySingleton getInstance(){
        //方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
