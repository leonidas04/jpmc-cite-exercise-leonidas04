package object;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String fname;
    private String lname;

    public Person(){

    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String emailAddress;

    public void setFirstName(String firstName) {
        this.firstName=firstName;

    }

    public String getFirstName() {

        return firstName;
    }

    /* hi!!!!!!!!! TODO create a public method that introduce yourself.... returns

    Hi I'm + Firstname

     */

    public String introToMyself (){

        return "Hi Im " + firstName + " " + lastName;
    }


    public Person (String fname, String lname){

        this.fname = lname;
        this.lname = fname;
    }



}
