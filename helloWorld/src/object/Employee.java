package object;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person{

    private String department;
    private Float payGrade;
    private Integer employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Float getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(Float payGrade) {
        this.payGrade = payGrade;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    // override

    public String introToMyself() {

        return "Hi Im Employee" + " " + getFirstName() + " " + getLastName();
    }


    public Integer introToMyself(int numberMoney) {

        return numberMoney;
    }

}
