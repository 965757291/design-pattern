package singleton;

public class SingletonTest {

    public static void main(String[] args) {
        PresidentLazySingleton pls1 = PresidentLazySingleton.getInstance();
        pls1.getName();
        PresidentLazySingleton pls2 = PresidentLazySingleton.getInstance();
        pls2.getName();
        if (pls1 == pls2){
            System.out.println("是同一人");
        }else {
            System.out.println("不是同一人");
        }
    }
   /* public static void main(String[] args) {
        PresidentHungrySingleton pls1 = PresidentHungrySingleton.getInstance();
        pls1.getName();
        PresidentHungrySingleton pls2 = PresidentHungrySingleton.getInstance();
        pls2.getName();
        if (pls1 == pls2){
            System.out.println("是同一人");
        }else {
            System.out.println("不是同一人");
        }
    }*/

}

class PresidentLazySingleton{
    private static volatile PresidentLazySingleton instance = null;
    private PresidentLazySingleton(){
        System.out.println("产生一个总统！");
    }
    public static synchronized PresidentLazySingleton getInstance(){
        if (instance == null) {
            instance = new PresidentLazySingleton();
        }else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }
    public void getName(){
        System.out.println("美国总统：奥巴马");
    }
}

class PresidentHungrySingleton{
    private static final PresidentHungrySingleton instance = new PresidentHungrySingleton();
    private PresidentHungrySingleton(){
        System.out.println("产生一个总统！");
    }
    public static PresidentHungrySingleton getInstance(){
        return instance;
    }
    public void getName(){
        System.out.println("美国总统：奥巴马");
    }
}
