package Management1;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned=0;

    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    //return name of the teacher.
    public String getName(){

        return this.name;
    }
    //return id of the teacher.
    public int getId(){

        return this.id;
    }
    //return the salary of the teacher.
    public int getSalary(){

        return this.salary;
    }
    //set the salary.

    public void setSalary(int salary){

        this.salary=salary;
    }
    //adds to salaryEarned.
    //removes from the total money earned by the school.
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneyEarned(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+ name
                +" Total salary earned so far £"
                + salaryEarned;
    }
}



}

