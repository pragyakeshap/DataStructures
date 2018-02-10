package com.mylearnings.codility;

import java.util.ArrayList;
import java.util.Collections;

public class SharingCandies {
   static ArrayList<Long> factors(long n){
       ArrayList<Long> list=new ArrayList<Long>();
       int up = (int)(Math.sqrt(n));
       for(int i=1;i <= up; i+= 1){
           if(n%i == 0){
               list.add((long) i);
               if(i != n/i){
                   long b=n/i;
                   list.add(b);
               }
           }
       }
       Collections.sort(list);

       return list;
   }
    static long getCandies(long n, long p) {
        ArrayList<Long> factor=factors(n);
        System.out.println(factor.toString());
        if(factor.size()>(int)p){
            p=p-1;
            return factor.get((int)p);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SharingCandies.getCandies(10,3));
    }

}