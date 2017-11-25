package ld.study.composite;


import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> childs = new Vector<TreeNode>();



    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }



//    添加孩子节点
    public void add(TreeNode node){
        childs.add(node);
    }

//    删除孩子节点
    public void remove(TreeNode node){
        childs.remove(node);
    }


    public Enumeration<TreeNode> getChild(){
        return  childs.elements();
    }

}
