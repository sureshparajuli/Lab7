package com.company;

/**
 * Created by sparajul on 12/21/15.
 */
public class Bee extends Insect{
    private String beeColor;
    private boolean makesHoney;
    private String favoriteFlower;

    public String getBeeColor()
    {
        return beeColor;
    }

    public void setBeeColor(String bc)
    {
        this.beeColor = bc;
    }
    public boolean getMakeHoney()
    {
        return makesHoney;
    }
    public void setMakesHoney(boolean mh)
    {
        this.makesHoney = mh;
    }
    public String getFavoriteFlower()
    {
        return favoriteFlower;
    }
    public void setFavoriteFlower(String ff)
    {
        this.favoriteFlower = ff;
    }

    // Creating constructor for Bee
    public Bee(String n, String c, boolean mh, String ff, int nw )
    {
        this.setName(n);
        this.beeColor = c;
        this.makesHoney = mh;
        this.favoriteFlower = ff;
        this.setNumberOfWings(nw);
    }
    // Methods calling for Bee
    public void printSpeciesData()
    {
        System.out.println("Name: " + this.getName() + ", Bee Color: " + this.getBeeColor() +
                ", Number of Wings: " + this.getNumberOfWings()+ ", Favorite Flower: " +
                this.getFavoriteFlower() + ", Number of legs: " +this.getLegs() +
                ", Makes Honey: " + this.getMakeHoney());
    }
}
