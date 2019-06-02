package com.ypc.mysql.json.model;

/**
 * @Author: ypcfly
 * @Date: 19-5-30 21:45
 * @Description:
 */
public class Child {

    private String name;

    private String gender;

    private Integer age;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
