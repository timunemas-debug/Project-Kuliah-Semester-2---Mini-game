package com.tutorial;

class Character {
    String username;
    double hp;
    double attackpower;
    
    Character(String username, double hp, double attackpower){
        this.username = username;
        this.hp = hp;
        this.attackpower = attackpower;
    }
    
    void attackCharacter(Character enemy){
        System.out.println(this.username + " Menyerang " + enemy.username + " Dengan power :" + this.attackpower);
        enemy.hp -= this.attackpower;
    }
    
    void getChest(){
        this.attackpower += 20;
        System.out.println("Selamat!, "+ this.username +" mendapatkan attack 20!");
    }
    
    void menambahDarah(){
        this.hp += 50;
        System.out.println(this.username + " anda menambah darah 50 Hp");
    }

    void eliminasiBy(Character eliminasi){
        if(this.hp <= 0){
            System.out.println("Kamu Berhasil Mengalahkan " + this.username);
        }else{
            System.out.println(this.username + " Still Alive!!!");
        }
    }
    
    void show(){
        System.out.println("--------------------------------");
        System.out.println("Name   : " + this.username);
        System.out.println("Hp     : " + this.hp);
        System.out.println("Attack : " + this.attackpower);
        System.out.println("--------------------------------");
    }
    
}

class Enemy extends Character{
    Enemy(String username, double hp, double attackpower){
        super(username, hp, attackpower);
    }

    @Override
    void attackCharacter(Character player){
        System.out.println(this.username + " Menyerang " + player.username);
        player.hp -= this.attackpower;
    }
 }
