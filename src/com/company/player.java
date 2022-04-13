package com.company;

import java.util.Scanner;

public class player {
    private String name;
    private String  weapon;
    private int health;
    private final boolean armour;

    public player(String name,String weapon,int health,boolean armour){
        this.name=name;
        this.weapon=weapon;
        this.health=health;
        this.armour=armour;
    }

    public void damageByWeapon1() {
        if(armour){
            this.health-=30;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is on.Got hit by "+getWeapon()+",Health is reduced by 30. "+"New health is "+this.health);
        }
        if(!armour){
            this.health-=40;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is off.Got hit by "+getWeapon()+",Health is reduced by 40. "+"New health is "+this.health);
        }
        if (this.health == 0) {
            System.out.println(getName()+" is dead");
        }
    }
    public void damageByWeapon2(){
        if(armour){
            this.health-=29;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is on.Got hit by "+getWeapon()+",Health is reduced by 29. "+"New health is "+this.health);
        }
        if(!armour){  
            this.health-=39;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is off.Got hit by "+getWeapon()+",Health is reduced by 39. "+"New health is "+this.health);
        }
        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }


    public void gunDamage(){

    }
    public void showHealth(){
        System.out.println(getHealth());
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
