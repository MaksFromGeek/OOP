package org.example.CW7.taskJavaOOP;

public class Cat extends Animal{

    private boolean isInGoodMood; // в каком настроении кот
    private int hunger; // шкала голода для подкрепления лососем (Salmon)

    public Cat(boolean isInGoodMood, int hunger) { // пересоздали конструктор после рефакторинга
        this.isInGoodMood = isInGoodMood;
        this.hunger = hunger;
    }

    @Override
    public void feed(int hunger) { // делаем базовую реализацию

    }

    @Override
    public void voice() {

    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }

    public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isInGoodMood=" + isInGoodMood +
                ", hunger=" + hunger +
                '}';
    }
}
