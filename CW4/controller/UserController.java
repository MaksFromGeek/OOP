package org.example.CW4.controller;

import org.example.CW4.data.Student;
import org.example.CW4.data.Teacher;
import org.example.CW4.service.DataService;
import org.example.CW4.service.StudentGroupService;
import org.example.CW4.view.StudentView;

import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView userView = new StudentView();

    public void createStudent(String firstName, String secondName, String patronymic, String dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<Student> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup() {
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}