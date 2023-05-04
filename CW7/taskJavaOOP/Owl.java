package org.example.CW7.taskJavaOOP;

public class Owl extends Animal{

    private boolean isDomesticated;
    private int hunger;

    public Owl(boolean isDomesticated, int hunger) {
        this.isDomesticated = isDomesticated;
        this.hunger = hunger;
    }

    @Override
    public void feed(int hunger) { // делаем базовую реализацию

    }

    @Override
    public void voice() {

    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

//    @Override
//    public String toString() {
//        return "Owl{" +
//                "isDomesticated=" + isDomesticated +
//                ", hunger=" + hunger + name + age + // дописали name и age вручную
//                '}';
//    }

    @Override
    public String toString() {
        return "Owl{" +
                "isDomesticated=" + isDomesticated +
                ", hunger=" + hunger +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
