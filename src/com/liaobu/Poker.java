package com.liaobu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
       //洗牌
        String[] color = {"♠","♣","♦","♥"};
        String[]  number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        List<String>  poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        for (String col : color) {
            for (String num : number) {
                poker.add(col+num);
                Collections.shuffle(poker);
            }
        }
        List player1 = new ArrayList();
        List player2 = new ArrayList();
        List player3 = new ArrayList();
        List dipai = new ArrayList();
        //发牌
        for (int i = 0; i < 54; i++) {
            if (i > 50) {
                dipai.add(poker.get(i));
            }else {
                if (i%3==0){
                    player1.add(poker.get(i));
                }else if (i%3==1){
                    player2.add(poker.get(i));
                }else if (i%3==2){
                    player3.add(poker.get(i));
                }
            }
        }
        //看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
