package com.hfnbd.zhjmaho.baseproject;

/**
 * Created by ZHJMAHO on 2018/2/9
 * On purpose of
 */

class User {
    private String name;
    private String age;
    private String photo;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public User(String name, String age, String photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
    }
}
