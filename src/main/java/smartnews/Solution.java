package smartnews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

interface OnlineAccount {
    int basePrice = 120;
    int regularMoviePrice = 45;
    int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;


    public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }

    public int monthlyCost() {
        return basePrice +
                this.noOfRegularMovies * regularMoviePrice +
                this.noOfExclusiveMovies * exclusiveMoviePrice;
    }

    @Override
    public int compareTo(Account o) {
        return this.monthlyCost() - o.monthlyCost();
    }

    public String toString() {
        return "Owner is " + this.ownerName + " and monthly cost is " + this.monthlyCost() + " USD.";
    }

}

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();

        int t = Integer.parseInt(sub);

        ArrayList<Account> list = new ArrayList<Account>();

        for (int i = 0; i < t; i++) {
            String[] input = sc.nextLine().split(" ");
            list.add(new Account(input[0],
                    Integer.parseInt(input[1]),
                    Integer.parseInt(input[2])));
        }

        Collections.sort(list);

        System.out.println("Most valuable account details:");
        System.out.println(list.get(list.size() - 1));
    }
}