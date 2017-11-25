package ld.study.iterator;

import javafx.beans.binding.ObjectExpression;

public interface Iterator {

    //前移
    public Object previous();

    //是否有下一个
    public boolean hasNext();
    //下一个
    public Object next();

    //第一个
    public Object getFirst();

}
