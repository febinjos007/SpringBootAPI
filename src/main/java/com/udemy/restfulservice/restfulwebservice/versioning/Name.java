package com.udemy.restfulservice.restfulwebservice.versioning;

public class Name {

    private String firatName;
    private String lastName;

    public Name() {
        super();
    }

    public Name(String firatName, String lastName) {
        this.firatName = firatName;
        this.lastName = lastName;
    }

    public String getFiratName() {
        return firatName;
    }

    public void setFiratName(String firatName) {
        this.firatName = firatName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
