package org.example.DR4;

import org.example.DR4.data.Student;
import org.example.DR4.data.Teacher;
import org.example.DR4.data.UserComparator;
import org.example.DR4.service.TeacherService;
import org.example.DR4.view.StudentView;
import org.example.DR4.view.TeacherView;
import java.time.LocalDate;
import java.util.List;

/**
 * Создать класс УчительСервис и реализовать аналогично проделанному на семинаре
 * Создать класс УчительВью и реализовать аналогично проделанному на семинаре
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Петр",
                "Петров", "Петрович", LocalDate.now());
        Student student2 = new Student("Сидр",
                "Сидоров", "Сидорович", LocalDate.now());
        UserComparator<Student> comparator = new UserComparator<>();
        System.out.println(comparator.compare(student1, student2));

        StudentView studentView = new StudentView();
        System.out.println(studentView.sendOnConsole(List.of(new Student("Иван",
                "Иванов", "Иванович", LocalDate.now()))));

        TeacherService teacherService = new TeacherService();
        teacherService.create("teacher1_1",
                "teacher1_2", "teacher1_3", LocalDate.now()); // если нет - добавить

        TeacherView teacherView = new TeacherView();
        System.out.println(teacherView.sendOnConsole(List.of(new Teacher("teacher1",
                "teacher2", "teacher3", LocalDate.now()))));
    }
}
