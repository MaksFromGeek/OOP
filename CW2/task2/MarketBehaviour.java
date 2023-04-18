package org.example.CW2.task2;

import java.util.List;

public interface MarketBehaviour { // отвечает за сам магазин, человек может войти в магазин, может выйти
    // и не вставать в очередь
    void acceptToMarket(Human human);
    void releaseFromMarket(Human human);
    void update();
}
