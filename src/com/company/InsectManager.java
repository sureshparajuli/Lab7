package com.company;
import java.util.*;

public class InsectManager {

    public static void main(String[] args) {

        LinkedList<Insect> insects = new LinkedList<Insect>();

        //Create and add some Butterfly and Bee objects to the list
        Butterfly monarch = new Butterfly("Monarch", "orange and black", 4, "milkweed" );
        Butterfly swallowtail = new Butterfly("Yellow Swallowtail","yellow and black", 4, "milk parsley");

        Bee honey = new Bee("Honey bee", "yellow and black",true,"Jasmine", 4 );
        Bee bumble = new Bee(" Bumble bee","yellow, black and white", false, "clover", 4);

        insects.add(monarch);
        insects.add(swallowtail);

        insects.add(honey);
        insects.add(bumble);


        for (Insect i : insects) {
            i.printSpeciesData();
        }

    }

}
