package org.example.DR6.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Student extends User {
        private Long teacherId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long countMaxId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.id = null;
    }

    public Long getStudentId() {
        return id;
    }

    public void setStudentId(Long teacherId) {
        this.id = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + id +'\'' +
                '}';
    }

    public static class StudentComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
