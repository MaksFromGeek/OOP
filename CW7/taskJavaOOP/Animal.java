package org.example.CW7.taskJavaOOP;

public abstract class Animal {
    protected String name; // Сделали рефакторинг. Перенесли базовые строки из классов-наследников

    protected int age; // в абстрактный класс Animal

    public abstract void voice(); // голос у животных
    public abstract void feed(int hunger); // покормить животных


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
