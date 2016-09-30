import com.sun.xml.internal.bind.v2.TODO;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import object.Animal;
import object.Customer;
import object.Employee;
import object.Exercises.MyCollection;
import object.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyCollection.printFriendList();
        MyCollection.printGirFriendlList();
        MyCollection.printRelationshipList();

        System.out.println( MyCollection.printFriendList() + " " + MyCollection.printRelationshipList()+ " " + MyCollection.printGirFriendlList());

      /*  int i = 1;


        do {

            System.out.print("[" + i + "]");

            i++;
        }

        while (i < 7) ;
        */





     String[] myInstructor = {"Niel", "Bert", "Amille"};
        int i;


      for (i=0; i<=2; i++ ){

          //System.out.println("My Instructors are " + myInstructor[i]);

          if (myInstructor[i] == "Bert" ) {

             //System.out.println("Amante");

          }else{

              //System.out.println(myInstructor[i]);
          }


      }




    }




/*

        byte byteVariable = 127;
        short mediumDecimal = 30456;
        int decimalVariable = 328292929;
        long myLong = 23456679090909L;
        char mychar = '\u0042';
        boolean myboolean = true;
        float myfloat = 87.3445789f;
        double verylargenumber = 2345.99685988888;
        System.out.println("Hello World!");
        int myInteger = 123;
        myLong = myInteger;
        double additionVar = verylargenumber + myfloat;



        System.out.println(byteVariable);
        System.out.println(mediumDecimal);
        System.out.println(decimalVariable);
        System.out.println(myLong);
        System.out.println(mychar);
        System.out.println(myboolean);
        System.out.println(myfloat);
        System.out.println(verylargenumber);
        System.out.println("Answer: " + additionVar );
        System.out.println("Char: " + mychar);

*/

   // Customer person = new Customer();
        //person.setFirstName("Leo");
        //person.setLastName("Pascubillo");
       // person.setEmailAddress("lheoreg@yahoo.com");
       // String myName = person.getFirstName();
        //String myLastName = person.getLastName();
       // String myEmail = person.getEmailAddress();



        //Employee employee = new Employee();

        // override

       // employee.setFirstName("Lheee");
        //employee.setLastName("Bat-og");

        //String introduce = employee.introToEmployee();
       // System.out.println(introduce);

       // Customer customer = new Customer();
       // customer.setFirstName("Lheeenardo");
        //customer.setLastName("Batman");

        // public method calling string


        //String intro = person.introToMyself();

       // System.out.println(intro);

       // System.out.println(myName);
       // System.out.println(myLastName);
       // System.out.println(myEmail);
       // System.out.println(myName);

        // from Employee

       // System.out.println(employee.introToMyself());
       // System.out.println(person.introToMyself());
       // System.out.println(employee.introToMyself());
        //System.out.println(intro);
       // System.out.println(customer.introToMyself());
        //System.out.println(customer.introToMyself("Bicycle"));
        //System.out.println(employee.introToMyself(4000));





        // Answer to Assignment


       /* Animal animal = new Animal();
        animal.setSpecies("Mammal");
        String mySpecies = animal.getSpecies();
        System.out.println(mySpecies);

        animal.setWeight(50);
        Integer animalWeight = animal.getWeight();
        System.out.println(animalWeight);

        animal.setCanSwim(false);
        Boolean canSwim = animal.isCanSwim();
        System.out.println(canSwim);*/


        // Costumer





    }

   /* TODO is to create an animal with 3 proterties, getters and setters (one is integer, string, & boolean) */


