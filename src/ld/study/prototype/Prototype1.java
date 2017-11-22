package ld.study.prototype;

import java.io.*;

//该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
// 本小结会通过对象的复制，进行讲解。在Java中，复制对象是通过clone()实现的，先创建一个原型类：
public class Prototype1 implements Cloneable,Serializable{

    private static final long serialVersionID = 1l;
    private String string;
    private SerializableObject obj;
    private int number;

    /*浅复制*/
    public Object clone()throws CloneNotSupportedException{
        System.out.println("before1::"+this.string);
        System.out.println("before2::"+this.number);
        Prototype1 proto = (Prototype1)super.clone();
        System.out.println("after1::"+proto.string);
        System.out.println("after2::"+proto.number);
        this.string = "I want learn much";
        this.number = 222;
        System.out.println("before11::"+this.string);
        System.out.println("before22::"+this.number);

        System.out.println("after11::"+proto.string);
        System.out.println("after22::"+proto.number);
        return proto;
    }

    /*深复制*/
    public Object deepClone() throws IOException, ClassNotFoundException {
        System.out.println("this::"+this.string);

        /*写入当前对象的二进制流*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /*读出二进制流产生的新对象*/
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public static long getSerialVersionID() {
        return serialVersionID;
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Prototype1 p = new Prototype1();
        p.setString("I want learn");
        p.setNumber(111);
        try {
//            Prototype1 obj = (Prototype1)p.deepClone();
            Prototype1 obj = (Prototype1)p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}