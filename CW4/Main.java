package org.example.CW4;

import org.example.CW4.data.Student;
import org.example.CW4.data.Teacher;
import org.example.CW4.data.UserComparator;
import org.example.CW4.view.StudentView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teat1 = new Teacher("Denis",
                "Pupki", "Valerievich", "date");
        Teacher teat2 = new Teacher("Denis",
                "Pupkin", "Valerievich", "date");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teat1, teat2));

        StudentView studentView1 = new StudentView();
        studentView1.sendOnConsole(List.of(new Student("FirstName",
                "Secondname", "Patronymic", "456456546")));
        System.out.println(studentView1.sendOnConsole(List.of(new Student("FirstName",
                "Secondname", "Patronymic", "546456546"))));
    }
}
