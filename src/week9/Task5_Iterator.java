package week9;


import java.sql.SQLOutput;
import java.util.ArrayList;

/*5. Write a Java program to iterate through all elements in an array list using
Iterator.*/
public class Task5_Iterator {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        carList.add("Audi");
        carList.add("BMW");
        carList.add("HONDA");
        carList.add("KIA");
        carList.add("TESLA");
        carList.add("MAZDA");
        System.out.println("Arraylist: " + carList);
        System.out.println("Iterating over ArrayList using for loop:  ");
        int i;
        for (i = 0; i < carList.size(); i++) ;
        System.out.println(carList.get(i));
        System.out.println(",");
    }

}
