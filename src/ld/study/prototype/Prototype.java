package ld.study.prototype;
//该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
// 本小结会通过对象的复制，进行讲解。在Java中，复制对象是通过clone()实现的，先创建一个原型类：
public class Prototype implements Cloneable{

    public Object clone()throws CloneNotSupportedException{
        Prototype proto = (Prototype)super.clone();
        return proto;
    }

}
