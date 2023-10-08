package com.severinboegli;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Random random = new Random();
        double highNumber = 0.0;
        double lowNumber = 6.0;

        for (int i = 0; i < 20; i++) {
            double temp = random.nextInt(51) / 10.0 + 1;
            numbers.add(temp); // Zufällige Numer zwischen 1.0 und 6.0
            if (highNumber < temp){
                highNumber = temp; // Falls Temp grösser ist, wie die grösst Nummer => temp wird zur highNumber
            }
            if (lowNumber > temp){
                lowNumber = temp; // Falls Temp kleiner ist, wie die kleinste Nummer => temp wird zur lowNumer
            }
        }
        
        numbers.remove(highNumber); // Grösste Nummer entfernen
        numbers.remove(lowNumber); // Kleinste Nummer entfernen


        double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum / numbers.size(); // Durchschnitt ungerundet
        
        double averageRounded = Math.round(average*2) / 2.0; // Durchschnitt gerundet.

        System.out.println("Der Durchschnitt ist: " + averageRounded );
    }

}
