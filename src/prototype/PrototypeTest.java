package prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        Prototype pt1 = new Prototype();
        Prototype pt2 = null;
        try {
            pt2 = (Prototype) pt1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(pt1 == pt2 ? "是一个对象" :"不是一个对象");
    }
}
