package com.ypc.mysql.json.model;

import java.util.List;

/**
 * @Author: ypcfly
 * @Date: 19-5-30 21:41
 * @Description:
 */
public class Family {

    private String father;

    private String mother;

    private String spouse;

    private List<Child> children;

    @Override
    public String toString() {
        return "Family{" +
                "father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", spouse='" + spouse + '\'' +
                ", children=" + children +
                '}';
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
