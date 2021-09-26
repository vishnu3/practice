package com.tp;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static List<String> processData(ArrayList<String> array) {
        /*
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a List containing the
         * appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        List<String> retVal = new ArrayList<String>();
        List<saleData> saleDataList =  new ArrayList<>();

        for(String val : array){
            String[] arr = val.split(",");
            int day = Integer.parseInt(arr[2].trim());
             String[] priceArr = arr[4].trim().split(" ");
            int price =  Integer.parseInt(priceArr[1].trim());
            saleDataList.add(new saleData(arr[0].trim(),arr[1].trim(),day,arr[3].trim(),price,arr[5].trim()));
        }

        Map<String, List<saleData>> storeBysale = saleDataList.stream().collect(Collectors.groupingBy(saleData::getStoreName));

       for(Map.Entry<String, List<saleData>> entry: storeBysale.entrySet()){
           int max = entry.getValue().stream().max(Comparator.comparing(saleData::getPrice)).get().getPrice();
           List<String> cusName = entry.getValue().stream().filter(i->i.getPrice()==max).map(j->j.getName()).collect(Collectors.toList());
           retVal.addAll(cusName);
       }

        return retVal.stream().distinct().collect(Collectors.toList());
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        Scanner in = new Scanner(System.in);
        /*while(in.hasNextLine())
            inputData.add(in.nextLine());*/


        String s2 ="Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash";
        String s3 ="Mohit Gupta, Baner, 1, Samsung Battery, Rs 900, Credit Card";
        String s4 ="Rajan Patil, Aundh, 3, Samsung Battery, Rs 1000, Cash";
        String s5 ="Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card";
        String s6 ="T Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card";
        String s7 ="Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card";
        String s8 ="Rajan Patil, Shivajinagar, 21, Earphones, Rs 550, Credit Card";
        String s9 ="Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI";
        String s10 ="Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash";
        String s11 ="Nina Kothari, Baner, 24, USB Cable, Rs 200, UPI";
        String s12 ="Mohit Gupta, Baner, 25, USB Cable, Rs 150, UPI";

        inputData.addAll(Arrays.asList(s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12));


        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
}


class saleData{

    String name;
    String storeName;
    int date;
    String productName;
    int price;
    String paymentType;

    public saleData(String name, String storeName, int date, String productName, int price, String paymentType) {
        this.name = name;
        this.storeName = storeName;
        this.date = date;
        this.productName = productName;
        this.price = price;
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}



