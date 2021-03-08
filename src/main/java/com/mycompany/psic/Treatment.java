/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.psic;
  
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author justi
 */
import java.util.HashMap; // import the HashMap class

public class Treatment {
    int option1=0;
    int option2=0;
    int option3=0; 
    int option4=0;
    static Scanner input = new Scanner(System.in);
    static HashMap<String, String[]> areasToDoctor = new HashMap<String, String[]>();
    Appointment apt=new Appointment();   

    public void diver(){
       String[] doctor1={"Daine","Alison"};
       String[] doctor2={"Joseph","Daine"};
       String[] doctor3={"Susan","Joseph"};
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
                       int t=0;
                       for (String d : docs) {
                           t++;
                           System.out.println("Press " + t + " for " + d);
                       }
                        option4 = input.nextInt();   
                        switchFunction(option4,docs);
                       break;
                   }
               case 2:
                   {
                       String[] docs=areasToDoctor.get("Osteopathy");
                       int t=0;
                       for (String d : docs) {
                           t++;
                           System.out.println("Press " + t + " for " + d);
                       }
                        option4 = input.nextInt();   
                        switchFunction(option4,docs);
                       break;
                   }
               case 3:
                   {
                       
                       String[] docs=areasToDoctor.get("Rehabilitation");
                       int t=0;
                       for (String d : docs) {
                           t++;
                           System.out.println("Press " + t + " for " + d);
                       }
                        option4 = input.nextInt();   
                        switchFunction(option4,docs);
                       break;
                   }
               default:
                   System.out.println("invalid option");
                   break;
                   
                 
           }
             
            break;

            case 2:
                ArrayList<String> docsArrList = new ArrayList<String>();
                for(String[] arrayOfDocs : areasToDoctor.values())
                {     
                    
                    

                   for(String docs:arrayOfDocs){
                    if(docsArrList.indexOf(docs)==-1)
                    {
                        docsArrList.add(docs);
                    }
                        }
                }
                int v=0;
                 for(String c:docsArrList)
                    {
                        v++;
                        System.out.println("Press "+v+" for "+c);
                    }
                 option3=input.nextInt();
                 switch(option3){
                     case 1:
                         apt.listAppointment("Daine");
                         System.out.println("On monday");
                         break;
                     case 2:
                         apt.listAppointment("Alison");
                         System.out.println("On thesday");
                         break;
                     case 3:
                         System.out.println("On friday");
                         break;
                     case 4:
                         apt.listAppointment("Joseph");
                         System.out.println("On wenesday");
                         break;
                     default:
                         System.out.println("invalid option");
                         break;
                 }
                break;
            
            default:
                System.out.println("invalid option");
                break;
        }
       System.out.println(option1);

    }

    private void switchFunction(int option4,String[] docs) {
    switch (option4)
    {   
        case 1:
            apt.listAppointment(docs[(option4-1)]);
            break;
        case 2:
            apt.listAppointment(docs[(option4-1)]);
            break;
        default:
            System.out.println("Invalid option");
    }
    }
}
