package grailsbasics

import java.lang.reflect.Array

class StudentController {

/*    def index = {
        render "This is index method which is default in every controller"

    }*/

    def index() {
        render "This is another way of writing index()";
    }

    def studentData() {
        def name = "Bikash Mainali";
        def rollNo = 101;
        [name: name, roll: rollNo];
    }

    List<Student> students = new ArrayList<>();

    def getStudentModel() {
        Student student = new Student();
        student.setName("Bikash");
        students.add(new Student("Bikash", 101));
        students.add(new Student("Ram", 201));
        println("list of students info is :" + Student.list())
    }
}
