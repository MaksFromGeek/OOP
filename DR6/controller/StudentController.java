package org.example.DR6.controller;

import org.example.DR6.data.Student;
import org.example.DR6.data.Teacher;
import org.example.DR6.service.StudentGroupService;
import org.example.DR6.service.StudentService;
import org.example.DR6.view.StudentView;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        studentView.sendOnConsole(dataService.getAll());
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
//        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
//        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
//        studentView.sendOnConsole(students);
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
//        studentView.sendOnConsole(students);
    }
}
