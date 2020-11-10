package com.gmail.voenkomat2020;

public class Human {
    private String name;
    private String lastname;
    private int age;
    private String sex;

    public Human(String name, String lastname, int age, String sex) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    public Human(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                "имя: '" + name + '\'' +
                ", Фамилия:'" + lastname + '\'' +
                ", возраст:" + age +
                ", пол:'" + sex + '\'';
    }
}
