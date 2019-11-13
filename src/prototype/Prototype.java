package prototype;

/**
 * 原型模式
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象
 */
public class Prototype implements Cloneable{

    Prototype(){
        System.out.println("创建一个原型");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("复制当前原型");
        return (Prototype) super.clone();
    }
}
