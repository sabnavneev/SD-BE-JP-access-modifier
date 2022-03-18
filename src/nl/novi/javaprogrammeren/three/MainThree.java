package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Human;
import nl.novi.javaprogrammeren.three.Doctor;

public class MainThree {

    public static void main(String[] args) {

        Doctor hans = new Doctor("1");
        System.out.println(hans.getSofiNumber());


        // De code werkt nu niet. Voeg de klasse Doctor toe.
        // Doctor is een subklasse van Human. Pas de klasse Doctor zo aan dat de code in MainThree gaat werken.

   }
}
