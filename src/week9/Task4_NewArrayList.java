package week9;

import java.util.ArrayList;


/*4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/
public class Task4_NewArrayList {


    public static void main(String []args){
        ArrayList <String> favoriteColours= new ArrayList();
        favoriteColours.add("Blue");
        favoriteColours.add("Green");
        favoriteColours.add("Yellow");
        favoriteColours.add("Red");
        favoriteColours.add("Black");
        favoriteColours.add("Purple");
        favoriteColours.add("White");


            System.out.println(favoriteColours);
        }
    }

