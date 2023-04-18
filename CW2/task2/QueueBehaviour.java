package org.example.CW2.task2;

public interface QueueBehaviour { // в интервейсе Поведение очереди содержаться методы, которые отвечают
    // за функционал нашей очереди
    public void takelnQueue(Human human);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();

}
