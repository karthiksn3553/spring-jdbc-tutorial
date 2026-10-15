package com.telusko.myJDBCApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // this allows multiple objects to be created of Alien else one object multiple reference
public class Aliens {

    private int id;
    private String Name;
    private String Tech;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTech() {
        return Tech;
    }

    public void setTech(String tech) {
        Tech = tech;
    }

    @Override
    public String toString() {
        return "Aliens{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Tech='" + Tech + '\'' +
                '}';
    }
}
