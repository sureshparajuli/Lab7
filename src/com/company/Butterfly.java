package com.company;

/**
 * Created by sparajul on 12/21/15.
 */
public class Butterfly extends Insect {

    private String wingColor;
    private String favoriteFlower;

    public String getWingColor()
    {
        return wingColor;
    }

    public void setWingColor(String wc)
    {
        this.wingColor = wc;
    }

    public String getFavoriteFlower()
    {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String ff)
    {
        this.favoriteFlower = ff;
    }

    // creating Butterfly constructor
    public Butterfly(String n, String wc, int nw, String ff)
    {
        this.setName(n);
        this.wingColor = wc;
        this.setNumberOfWings(nw);
        this.favoriteFlower = ff;
    }

    // Creating methods for printing the info for a Butterfly object
    public void printSpeciesData()
    {
        System.out.println("Name: " + this.getName() + ", Wing Color: " + this.getWingColor() +
                        ", Number of Wings: " + this.getNumberOfWings()+ ", Favorite Flower: " +
                        this.getFavoriteFlower() + ", Number of legs: " +this.getLegs());
    }
}
