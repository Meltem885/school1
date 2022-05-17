package Management1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    //psvm write there for public static void main.
    public static void main(String[] args) {


        Teacher(id:1, name:Lizzy", salary;500);
        Teacher melisa = new Teacher(id:2, name:"melisa", salary:700);
        Teacher vanderhorn = new Teacher(id:3, name:"vanderhorn", salary:600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(melisa);
        teacherList.add(vanderhorn);


        Student Tamasha = new Student(id:1,name:"Tamasha",grade:4);
        Student rakshith = new Student(id:2,name:"rakshit",grade:12);
        Student rabbi = new Student(id:3,name:"rabbi",grade:5);

        List<Student> studentList= new ArrayList<>();
        studentList.add(Tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList,studentList);


        tamasha.payFees(fees:5000);

        rakshith.payFees(fees:6000);
        //sou//
        System.out.println("GHS has earned £"+ ghs.getTotalMoneyEarned());
        System.out.println("------Makingn SCHOOL GHS PAY SALARY------");
        Lizzy.receiveSalary(Lizzy.getSalary);
        System.out.println("GHS has spent for salary to " + Lizzy.getName()
                +" and how has £" + ghs.getTotalMoneyEarned());
        vanderhorn.receiveSalary(vanderhorn.getSalary);
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and how has £" + ghs.getTotalMoneyEarned());
        System.out.println(rakshith);
        melisa.receiveSalary(melisa.getSalary());
        System.out.println(melisa);
    }
}

