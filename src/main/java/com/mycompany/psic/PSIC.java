/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.psic;
import java.util.*;
/**
 *
 * @author justi
 */
public class PSIC {
    
    
       static Patient patient=new Patient();
       static Treatment treat=new Treatment();
       static Scanner input = new Scanner(System.in);
       static int option=0;
       static int uniqId=100;
       public static void main(String[] args) {
       List<Patient> list=new ArrayList<Patient>();     
           do{
              System.out.println("Press 1 to Register a patient");
              System.out.println("Press 2 to Book a treatment appointment");
              System.out.println("Press 3 to Change booking");
              System.out.println("Press 0 to exit");
              option = input.nextInt();
              switch(option){
                  case 1:
                  {
                     ++uniqId;
                     Patient p=new Patient(patient.patientDetailsInput(uniqId));
                     list.add(p);
                     System.out.println(":"+list);
                     break;
                  }
                  case 2:
                  {
                      System.out.println("case 2");
                      treat.diver();
                      break;
                  }
                  case 3:
                  {
                      System.out.println("case 3");
                      break;
                  }
                  case 0:
                  {
                      System.out.println("exiting..");
                        for(Patient b:list){  
                       System.out.println(b.getUniqId()+" "+b.getFirstName()+" "+b.getLastName()+" "+b.getAddress()+" "+b.getMobile());  
                        }
                      break;
                  }
                  default:
                  {
                      System.out.println("invaild option");
                      break;
                  }
                  
                  
              }
           }
           while(option!=0);
           
            

    }
}
