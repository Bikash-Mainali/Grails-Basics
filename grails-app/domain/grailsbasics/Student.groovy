package grailsbasics

class Student {

    String name ;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name
        this.rollNo = rollNo
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getRollNo() {
        return rollNo
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo
    }
    static constraints = {
    }
}

