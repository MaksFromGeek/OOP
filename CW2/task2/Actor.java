package org.example.CW2.task2;

import org.example.CW2.task1.ActorBehavoir;

public abstract class Actor implements ActorBehavoir {
    protected String name;

    protected boolean makeOrder; // отдал заказ

    protected boolean takeOrder; // взял заказ

    public boolean isMakeOrder() { // проверка статуса

        return makeOrder;
    }
    public boolean isTakeOrder() {

        return takeOrder;
    }
    public abstract String getName(); // чтобы узнать имя
}


