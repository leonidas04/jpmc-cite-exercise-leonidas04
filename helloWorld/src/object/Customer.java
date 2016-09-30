package object;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Customer extends Person{

    private String address;
    private Integer telephoneNumber;
    private Integer customerId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Integer telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    public String introToMyself() {

        return "Hi Im Costumer" + " " + getFirstName() + " " + getLastName();
    }

    public String introToMyself(String product) {

        return "Hi Im Costumer I want to buy " + product;
    }


}
