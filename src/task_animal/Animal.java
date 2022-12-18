package task_animal;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal (){

    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

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

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        String choose = "ні";
        if (tail)  choose = "так";
        return "Ім'я: = " + name +
                ", вік = " + age +
                ", хвіст = " + choose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
