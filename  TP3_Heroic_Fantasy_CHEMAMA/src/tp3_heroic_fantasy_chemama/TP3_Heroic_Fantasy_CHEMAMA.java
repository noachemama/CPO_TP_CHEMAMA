/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_chemama;

import java.util.ArrayList;

/**
 *
 * @author Noa Chemama
 */
public class TP3_Heroic_Fantasy_CHEMAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Epee Excalibur=new Epee(7,5,"Excalibur");
      Epee Durandal=new Epee(4,7,"Durandal");
      
      Baton Chene=new Baton(4,5,"Chene");
       Baton Charme=new Baton(4,5,"Charme"); 
       
       ArrayList<String> Tab = new ArrayList<String>();  
            Tab.add("Excalibur");      
            Tab.add("Durandal");
             Tab.add("Chene");     
            Tab.add("Charme");
       
       System.out.println("arme"+Excalibur);
    }
    
}
