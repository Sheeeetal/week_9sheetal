package week9;

import java.util.HashMap;
import java.util.Map;

public class Task10 {
        public static void main(String[] args) {
            HashMap metropolitanLine = new HashMap<>();
            metropolitanLine.put(1, "BakerStreet");
            metropolitanLine.put(2, "King Cross");
            metropolitanLine.put(3, "MoorGate");
            metropolitanLine.put(4, "Liverpool");
            metropolitanLine.put(5, "Aldgate");
            metropolitanLine.put(6, "great portland street");
            metropolitanLine.put(7, "Ferringdon");
            metropolitanLine.put(8, "Barbican");
            for (Object metropolitanline : metropolitanLine.entrySet()) {
                System.out.println(metropolitanline);


            }

        }
    }

