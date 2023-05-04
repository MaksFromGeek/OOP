package org.example.CW7.taskJavaOOP;

public class Dog extends Animal{
    private String breed;
    private int hunger;

    public Dog(String breed, int hunger) {
        this.breed = breed;
        this.hunger = hunger;
    }

    @Override
    public void feed(int hunger) { // делаем базовую реализацию

    }

    @Override
    public void voice() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", hunger=" + hunger +
                '}';
    }
}
