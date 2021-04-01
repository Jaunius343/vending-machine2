package myPackage.myClass;

import java.util.Date;

public class Snack extends Product {
    private float weight;     //in kilos
    private int calories;     //for 100 grams

    public Snack(){
        this("Snack", 0, new Date(), 0, 0);
    }

    public Snack(String n, float p, Date d, float w, int cal){
        super(n, p, d);
        weight = w;
        calories = cal;
    }

    public float getSize(){return weight;}
    public void setSize(float x) {weight = x;}

    public int getCal(){return calories;}
    public void setCal(int x) {calories = x;}

    private String type = "Snack";
    public String getType(){return type;}

    public String toString(){
        return (super.toString() + "\n" + "Product type: " + type + "\n" + "Calories per 100g: " + calories);
    }

    public float pricePerSize (){
        return price / weight;
    }

    public float totalCalWorth(){
        return calories * weight * 10;
    }

    public boolean isHealthy(){
        if (totalCalWorth() >= (weight * 1000)){        // if ratio is 1:1 with weight or there are more calories, then unhealthy
            return false;
        } else {
            return true;
        }
    }
}

