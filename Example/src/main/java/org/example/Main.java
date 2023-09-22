package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      


    }
    public int getINdex(int[]arr, int n){
        if(arr == null) return -3;
        else {
            if (arr.length < 3) return -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) return i;
            }

        }
        return -2;
    }


}