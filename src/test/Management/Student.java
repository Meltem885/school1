package test.schoolmanagementSystem;
//This class responsible for keep in the track of students fees, name,grade and fees paid
public class Student {

    //private is an access specifier or modifier to protect somebody from

  private String name;
  private int id;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  //create an cunstractor
    //
    public Student (int id,String name,int grade,int feesPaid,int feesTotal){

        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=30000;

    }
    //values that the change over time should be set
    public void setGrade(int grade){
        this.grade=grade;

    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
//return name of student
    public String getName() {

        return name;
    }
//return id of student.
    public int getId() {

        return id;
    }
//return grade of student.
    public int getGrade() {

        return grade;
    }
//return feesPaid of student.
    public int getFeesPaid() {

        return feesPaid;
    }
//return feestoatl of student.
    public int getFeesTotal() {

        return feesTotal;
    }



    //return the remaining fees.
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
     //control o

    @Override
    public String toString() {
        return "Student's name : "+name+
                "Total fees paid so far £"+feesPaid;

    }
}
