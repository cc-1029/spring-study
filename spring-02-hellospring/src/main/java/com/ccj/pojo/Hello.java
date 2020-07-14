package com.ccj.pojo;

/**
 * @author ccj
 * @create 2020-07-13
 */
public class Hello {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
    
    public void show() {
        System.out.println("Hello"+name);
    }
}
