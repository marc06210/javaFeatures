package com.mgu.java16.record;

import java.util.Objects;

public class MySampleAsClass {
    private String name;
    private String firstname;

    public MySampleAsClass(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MySampleAsClass that = (MySampleAsClass) o;
        return Objects.equals(name, that.name)
                && Objects.equals(firstname, that.firstname);
    }

    @Override
    public String toString() {
        return "MySampleAsClass{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstname);
    }
}
