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

// This is our Child for The Zombie War Team Project for Week 5
public class Child extends Survivor{ // The Child class extends the Survivor class
 
    // This is our HEALTH variable which is set to 20 and which the modifier is a private static final int
    private static final int HEALTH = 20;
    
// This is our ATTACK variable which is set to 2 and which the modifier is a private static final int
    private static final int ATTACK = 2;
    
    
    // This is our Child no default constructor
    public Child () {
        
    super(Survivor.CHILD, HEALTH, ATTACK); // The supper class holds the survivor.CHILD, HEALTH and ATTACK
        
    }
}
