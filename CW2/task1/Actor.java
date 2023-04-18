package org.example.CW2.task1;

public abstract class Actor implements ActorBehavoir {
    protected String name;

    protected boolean makeOrder;

    protected boolean takeOrder;

    public boolean isMakeOrder() {
        return makeOrder;
    }
    public boolean isTakeOrder() {
        return takeOrder;
    }
    public abstract String getName();
}

