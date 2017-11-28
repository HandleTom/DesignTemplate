package ld.study.visitor;

public class Test {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);

    }
}
