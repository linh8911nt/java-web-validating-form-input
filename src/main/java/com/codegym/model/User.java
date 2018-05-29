package com.codegym.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty(message = "Not empty")
    @Size(min = 2, max = 30)
    private String name;

    @NotNull(message = "Not blank")
    @Min(18)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
