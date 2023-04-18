package org.example.CW2.task2;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
 принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей,
 обновление состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей
 в очереди в различных статусах
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human(); // создали человека, который будет делать заказ
        Market mac = new Market(); // создали магазин, где все будет происходить
        mac.acceptToMarket(human);
        mac.takelnQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);
    }
}
