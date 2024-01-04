package models;

import java.util.Arrays;

public class tshirt {
    String[] name;//DECLARING THE REQUIRED VARIABLES
    int[] product;
    int[] price;
    String[] brand;
    String[] description;
    String[] sizes;
//USING GETTER AND SETTER
    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getProduct() {
        return product;
    }

    public void setProduct(int[] product) {
        this.product = product;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public String[] getBrand() {
        return brand;
    }

    public void setBrand(String[] brand) {
        this.brand = brand;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }
    int itemnumber;

    public int getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(int itemnumber) {
        this.itemnumber = itemnumber;
    }
//DEVELOPING CONSTRUCTOR FOR INTIALIZING
    public tshirt(int[] product, int itemnumber, String[] name, int[] price, String[] brand, String[] description, String... sizes) {
        this.product = product;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
        this.itemnumber = itemnumber;
    }
//THE displayInformation function is created in order to assign the values from the parameter to the variable and print them accordingly
    public void displayInformation(){
        int[] product = this.product;
        String[] name = this.name;
        int[] price = this.price;
        String[] brand = this.brand;
        String [] description = this.description;
        String[] sizes = this.sizes;
//loop is used to get the required items with it price separately rather than in an array
        for(int i=0; i<itemnumber; i++){
            System.out.println("Item name:"+name[i]);
            System.out.println("Description: "+description[i]);
            System.out.println("Product code: "+product[i]);
            System.out.println("Price: "+ price[i]);
            System.out.println("Sizes: "+ (Arrays.toString(sizes)));

        }


    }
}