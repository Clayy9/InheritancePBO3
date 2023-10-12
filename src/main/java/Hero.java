/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Hero
{
    // Atribute
    String name;
    double attackPower, health;
    
    //Constructor
    Hero(String nameInput, double attackInput, double healthInput)
    {
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }
    
    //Method Attack
    void attack(Hero enemy)
    {
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }
    
    void takeDamage(double damage)
    {
        System.out.println(this.name + " receive damage " + damage);
        this.health -= damage;
    }
    
    void display()
    {
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.attackPower);
    }
}
