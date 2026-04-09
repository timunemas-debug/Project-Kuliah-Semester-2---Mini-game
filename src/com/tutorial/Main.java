package com.tutorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character player1 = new Character("Ksatria", 100, 100);
        Enemy goblin = new Enemy("Goblin", 200, 30);
        Enemy dragon = new Enemy("Dragon", 800, 70);

        // Pertumpahan darah
        while(true){
        System.out.println("---------------------------------------------------------------");
        System.out.print("1.Menyerang Musuh | 2.Menambah Darah | 3.Menampilkan profil : ");
        String memilih = input.nextLine();

        if(memilih.equals("1")){
            System.out.print("1.Goblin | 2.Dragon : ");
            String memilihEnemy = input.nextLine();
            if(memilihEnemy.equals("1")){
                player1.show();
                goblin.show();
                player1.attackCharacter(goblin);
                goblin.attackCharacter(player1);
                goblin.show();
                player1.show();
                goblin.eliminasiBy(player1);
            }else{
                player1.attackCharacter(dragon);
                dragon.show();
                dragon.eliminasiBy(player1);
                if(dragon.hp <= 0){
                    player1.getChest();
                }
            }
        }
        else if(memilih.equals("2")){
            player1.menambahDarah();
            player1.show();
        }else if(memilih.equals("3")){
            player1.show();
        }
        else{
            System.out.println("Pilihan anda tidak ada dalam daftar!!!");
         }
      }
   }
}
