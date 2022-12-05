/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abdullahi Mohamed
 * Course: CSC 422 - Software Engineering
 * Instructor: Professor Susan Furtney
 * Created: 12/3/2022
 * Updated: 12/4/2022
 */
// This is our Solider class for The Zombie War Team Project for Week 5
public class Soldier extends Survivor { // The Solider class extends the Survivor class
    
    // This is our HEALTH variable which is set to 100 and which the modifier is a private static final int

    private static final int HEALTH = 100;
    
  // This is our ATTACK variable which is set to 10 and which the modifier is a private static final int

    private static final int ATTACK = 10;
    
    
    // This is our Solider no default constructor
    
    public Soldier() {
        
        super(Survivor.SOLDIER, HEALTH, ATTACK); // The supper class holds the survivor.SOLIDER, HEALTH and ATTACK
        
    }
}
