package com.company;

/**
 * Created by sparajul on 12/21/15.
 */
public abstract class Insect {
    private String name;
    private int numberOfWings;
    private final int LEGS = 6;
// creating methods for insect class
    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
       //Insect(Object).setName("Suresh")
        this.name = n;
    }

    public int getNumberOfWings()
    {
        return numberOfWings;
    }

    public void setNumberOfWings(int nw )
    {
        this.numberOfWings = nw;
    }

    public int getLegs()
    {
        return LEGS;
    }

    public abstract void printSpeciesData();

}

