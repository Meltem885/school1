package Management1;

import java.util.List;

public class School {

    //many teachers,many students implement teacher and student using ArrayLists.
// Command N (getter and setter).
//Ok sign you can choose all of them.
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;//sonradan static ekledik.if we add static.We can access the method.
    // otherwise we can access the istance of the method.
    private static int totalMoneySpent;//sonradan static ekledik.

    //new school object created.
//list of student and teacher.
    public School(List<Teacher> teachers,List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    //return the list of teachers in the school.
    public List<Teacher> getTeachers() {
        return teachers;
    }
    //adds a teacher to the school.
    //teacher the teacher to be added.
    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);
    }
    //the list of students in the school.
    public List<Student> getStudents() {

        return students;
    }
    //adds a student to the school.
    public void addStudent(Student student) {
        students.add(student);

    }
    //return the total money earned by the school.
    public int getTotalMoneyEarned() {

        return totalMoneyEarned;
    }
    //adds the total money earned by the school.
    public static void updateTotalMoneyEarned (int MoneyEarned) {//sonradan static yaptik.

        totalMoneyEarned += MoneyEarned;
    }
    //the total money spent by the school.
    public int getTotalMoneySpent() {

        return totalMoneySpent;
    }
    //update the money that is spent by the school which is the salary given
// by the school to its teachers.the money spent by school.
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent =totalMoneyEarned- moneySpent;
        totalMoneyEarned-=moneySpent;
    }
}







}
