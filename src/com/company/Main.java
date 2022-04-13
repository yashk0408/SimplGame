package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	player player1 = new player("player1","phantom",100,true);

            Scanner sc = new Scanner(System.in);
            String zoop = sc.nextLine();
            if(Objects.equals(zoop, "aaa")){
                player1.damageByWeapon2();
            }
            else{
                System.out.println("nope");
            }

    }

}
