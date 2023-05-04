package org.example.CW6.task1;

/**
 * Провести рефакторинг кода из задания (оптимизировать, убрать лишнее). Согласно принципа открытости-закрытости (2)
 * мы не меняем ничего в уже рабочем методе, а создаем новый метод с необходимыми изменениями.
 */
public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 1.0);
        Calculator calc = new Calculator();
        calc.calculateSwitch( add ); // проверили работу метода calculateSwitch в классе Calculator
        System.out.println(add.getResult());
    }
}
