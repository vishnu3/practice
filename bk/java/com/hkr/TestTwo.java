package com.hkr;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTwo {

    public static List<Integer> commonPrefix(List<String> inputs) {
        // Write your code here

        List<Integer> lenght =  new ArrayList<>();

        lenght.add(inputs.size());

        StringBuilder input= null;
        for(String s : inputs){
            input.append(s);
        }
        String ip = input.toString();
        char[] charArr = input.toString().toCharArray();

        for(int i =0;i<charArr.length;i++){
             for(int j =i;j<charArr.length;j++){
                 StringBuilder local = new StringBuilder();
                 local.append(charArr[j]);

                if(ip.startsWith(local.toString())){
                   ip.com
                }


             }

        }







    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
    }
}
