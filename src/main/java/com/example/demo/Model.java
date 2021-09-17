package com.example.demo;

import org.springframework.hateoas.EntityModel;

public class Model extends EntityModel<Model> {
    private String value;

    public Model(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Model{" +
                "value='" + value + '\'' +
                '}';
    }
}
