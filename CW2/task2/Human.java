package org.example.CW2.task2;

import org.example.CW2.task1.Actor;

public class Human extends Actor { // наследуется от Actor

    @Override
    public String getName() {
        return name; // отдали имя нашего пользователя
    }
    @Override
    public void setMakeOrder() {
        makeOrder = true;
    } // отдать заказ
    @Override
    public void setTakeOrder() {
        takeOrder = true;
    } // взять заказ
}
