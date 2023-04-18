package org.example.CW2.task1;

public interface ActorBehavoir { // доп. интерфейс, чтобы отделять наших сотрудников от других посетителей
    public void setMakeOrder();

    public void setTakeOrder();

    public boolean isMakeOrder();

    public boolean isTakeOrder();
}
