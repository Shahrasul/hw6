package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(20);
        boss.setHealth(200);
        Weapon weapon = new Weapon("pistol","FiveSeven");
        boss.setWeapon(weapon);
        System.out.println(boss.getDamage());
        System.out.println(boss.getHealth());
        System.out.println("Имя оружия босса - " + boss.getWeapon().getName() +  "\n" +
                "Тип оружия босса - " + boss.getWeapon().getType());

    }
}
