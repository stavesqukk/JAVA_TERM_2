package models;

import java.util.Arrays;

public class order {
    String name; //initializing the values required
    int phonenumber;

    int[] code;
    int[] price;
    int itemnumber;
//GETTER SETTER FOR THE ABOVE VALUES
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }
//CONSTRUCTOR FOR INTIALIZING THE VALUES
    public order(String name, int[] code, int[] price, int phonenumber, int itemnumber) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.code = code;
        this.price = price;
        this.itemnumber = itemnumber;
    }
//FUNCTION CALLED DISPLAYINFORMATION FOR STORING THE VALUES FROM THE PARAMETER AND DISPLAYING IT
    public void displayInformation() {
        String name = this.name;
        int itemnumber = this.itemnumber;
        int[] code = this.code;
        int[] price = this.price;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tBill\t\t\t\t\t\t\t\t\t\t\t");
            System.out.println("Name: " + name);
            System.out.println("Phone number: " + phonenumber);
            System.out.println("Items: " + (Arrays.toString(code)));
            System.out.println("Price: " + (Arrays.toString(price)));
            System.out.println("Discount: "+ 0+"Percent");
            System.out.println("Vat: "+ 13 + "Percent");
        int totalprice = 0;
        //LOOP FOR CALCULATING THE TOTAL PRICE
        for (int i = 0; i < itemnumber; i++) {
            int pp = price[i];
            totalprice += pp;
        }
        //GETTING THE TOTAL-AMOUNT WHEN VAT IS ADDED AFTER THE TOTAL PRICE IS CALCULATED
        int vat = (int)(0.13 * totalprice);
        int totalamount = vat + totalprice;
        System.out.println("TOTAL AMOUNT: " + totalamount);

    }
        }


