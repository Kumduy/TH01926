package com.example.ktnc_th01926_final;

public class TongSoChan {

    public  int tongSoChan(){
        int sum = 0 ;
        for (int i = 1 ; i <= 50 ; i++){
            if (i % 2 == 0 && i % 8 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

