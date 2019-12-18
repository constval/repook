package com.constval.repook.model;

import javax.persistence.*;

@Entity
@Table(name = "configuration")
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String testValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }
}
