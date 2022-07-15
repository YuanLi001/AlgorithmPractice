package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.Objects;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/20 10:52
 */
public class Student {

    private String name;

    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
