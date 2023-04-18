package org.example.CW2.task1;

public class Human extends Actor {

    @Override
    public String getName() {
        return name; // отдали имя нашего пользователя
    }
    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }
    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }
}
