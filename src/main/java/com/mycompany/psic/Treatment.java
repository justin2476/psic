/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.psic;
  
import java.util.Scanner;
/**
 *
 * @author justi
 */
import java.util.HashMap; // import the HashMap class

public class Treatment {
    int option1=0;
    int option2=0;
    static Scanner input = new Scanner(System.in);
    static HashMap<String, String[]> areasToDoctor = new HashMap<String, String[]>();
        

    public void diver(){
       String[] doctor1={"Daine","Alison"};
       String[] doctor2={"Joseph","Daine"};
       String[] doctor3={"Susan"};
       areasToDoctor.put("Physiotherapy", doctor1);
       areasToDoctor.put("Osteopathy", doctor2);
       areasToDoctor.put("Rehabilitation", doctor3);
       
       
       System.out.println("Press 1 to List areas of expertise");
       System.out.println("Press 2 to List doctors");
       option1 = input.nextInt();
        switch (option1) {
            case 1:
                int j=0;
                for(String i : areasToDoctor.keySet())
                {
                    j++;
                    System.out.println("Press "+j+" for "+i);
                }    
                option2 = input.nextInt();
             switch (option2) {
               case 1:
                   {
                       String[] docs=areasToDoctor.get("Physiotherapy");
                       for (String d:docs)
                           System.out.println(d);
                       break;
                   }
               case 2:
                   {
                       String[] docs=areasToDoctor.get("Osteopathy");
                       for (String d:docs)
                           System.out.println(d);
                       break;
                   }
               case 3:
                   {
                       String[] docs=areasToDoctor.get("Rehabilitation");
                       for (String d:docs)
                           System.out.println(d);
                       break;
                   }
               default:
                   System.out.println("invalid option");
                   break;
           }
            break;

            case 2:
                for(String i : areasToDoctor.keySet())
                    System.out.println(i);
                break;
            default:
                System.out.println("invalid option");
                break;
        }
       System.out.println(option1);

    }
}
