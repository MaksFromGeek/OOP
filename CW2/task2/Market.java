package org.example.CW2.task2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Human> mylist = new ArrayList<>();
    Queue<Human> mylist2 = new LinkedList<>();

    @Override
    public void acceptToMarket(Human human) {
        mylist.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {

        mylist.remove(human);
    }

    @Override
    public void update() {
    }

    @Override
    public void takelnQueue(Human human) {
        mylist2.add(human);
    }

    @Override
    public void takeOrders() {
        mylist2.peek().setTakeOrder();
    }

    @Override
    public void giveOrders() {
        mylist2.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        mylist2.poll();
    }
}
