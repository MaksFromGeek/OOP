package org.example.CW4.view;

import org.example.CW4.data.Student;
import org.example.CW4.data.User;

import java.util.List;

/**
 * - Модифицировать ранее созданный класс ЮзерВью
 * - Сделать его интерфейсом
 * - Типизировать его T наследующегося от типа Юзер
 * - Внести в метод sendOnConsole типизацию
 * - Создать класс СтудентВью реализующий созданный интерфейс
 * - Внести правки в метод sendOnConsole согласно типизации
 * - Перенести в него ранее созданные другие методы(включая те, которые могли быть созданы
 * в процессе домашней работы)
 */
public interface UserView<T extends User> {
    public T sendOnConsole(List<Student> userList);
}
