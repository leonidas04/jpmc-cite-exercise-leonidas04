package object.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jpmc on 9/30/2016.
 */
public class MyCollection {

    private  static Random random = new Random();
    private static int index;
    private static  String returnitems;



    public static String printFriendList() {
        List<String> myFriends = new ArrayList<String>();

        //int i;

        myFriends.add(0, " Anton ");
        myFriends.add(1, " Bert ");
        myFriends.add(2, " Camo ");
        myFriends.add(3, " Dante ");
        myFriends.add(4, " Enteng ");

        index = random.nextInt(myFriends.size());
        returnitems = myFriends.get(index);

        return returnitems;


       /* for (i = 0; i < myFriends.size(); i++) {

            System.out.println(myFriends.get(i));

        }
        */
        //System.out.println(myFriends);

    }

    public static String printGirFriendlList() {

        List<String> myGirlFriends = new ArrayList<String>();

        myGirlFriends.add(0, " Alison ");
        myGirlFriends.add(1, " Bembi ");
        myGirlFriends.add(2, " Chistina ");
        myGirlFriends.add(3, " Jean ");
        myGirlFriends.add(4, " Nellien ");

       /* for (int n = 0; n < myGirlFriends.size(); n++) {

            System.out.println(myGirlFriends.get(n));
        }
        */

        index = random.nextInt(myGirlFriends.size());
        returnitems = myGirlFriends.get(index);

        return returnitems;

    }


    public static String printRelationshipList() {
        List<String> myRelationship = new ArrayList<String>();

        int j;

        myRelationship.add("Lover");
        myRelationship.add(1, "Freindter");
        myRelationship.add(2, "Friend");
        myRelationship.add(3, "MUMU");
        myRelationship.add(4, "Exxxxxx");


        index = random.nextInt(myRelationship.size());
        returnitems = myRelationship.get(index);

        return returnitems;

    }

}
