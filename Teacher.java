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
// This is our Teacher class for The Zombie War Team Project for Week 5
public class Teacher extends Survivor{ // The Teacher class extends the Survivor class
    
     // This is our HEALTH variable which is set to 50 and which the modifier is a private static final int
    private static final int HEALTH = 50;
    // This is our ATTACK variable which is set to 5 and which the modifier is a private staatic final int
    private static final int ATTACK = 5;
   
    
   // This is our Teacher no default constructor        
    public Teacher(){
        super(Survivor.TEACHER, HEALTH, ATTACK); // The supper class holds the survivor.TEACHER, HEALTH and ATTACK
        
    }
    }
      
 
    
    


