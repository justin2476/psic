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
public class Appointment {

    @Override
    public String toString() {
        return "appointment of" + " doctor: " + doctor + " at slot: " + slot;
    }
    static Scanner input = new Scanner(System.in);

    private String doctor, slot, patient;
    private boolean booked = false;

    public Appointment() {
        setAppointment();
    }

    public Appointment(String d, String s) {
        this.doctor = d;
        this.slot = s;
    }
    static ArrayList<Appointment> aptList = new ArrayList<Appointment>();

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public static void setAppointment() {
        aptList.add(new Appointment("Alison", "1pm-2pm"));
        aptList.add(new Appointment("Alison", "2pm-3pm"));
        aptList.add(new Appointment("Alison", "3pm-4pm"));
        aptList.add(new Appointment("Alison", "9am-10am"));
        aptList.add(new Appointment("Alison", "10am-11am"));
        aptList.add(new Appointment("Daine", "1pm-2pm"));
        aptList.add(new Appointment("Daine", "2pm-3pm"));
        aptList.add(new Appointment("Daine", "3pm-4pm"));
        aptList.add(new Appointment("Joseph", "9am-10am"));
        aptList.add(new Appointment("Joseph", "10am-11am"));
    }

    public void listAppointment(String doc) {
        int i = 0;
        int opt = 0;
        for (Appointment list : aptList) {
            if (list.doctor == doc && list.booked == false) {
                i++;
                System.out.println("Press " + i + " for " + list.toString());
            }
        }

        if (i == 0) {
            System.out.println("All slots has been booked for doc " + doc);
        } else {
            opt = input.nextInt();
              System.out.println("Please enter your patient Id");
                    int id=0;
                    id=input.nextInt();
            this.bookAppointment(doc, opt, id);
        }
    }

    public void bookAppointment(String doc, int opt, int id) {
        int pos = 0;
        int index = 0;
        int out=0;
        for (Appointment list : aptList) {

            if (list.doctor == doc && list.booked == false) {
                pos++;
                if (pos == opt) {
                    Appointment obj = aptList.get(index);
                    obj.booked = true;
                    obj.patient= String.valueOf(id);
                    aptList.set(index, obj);
                    System.out.println(aptList.get(index).toString() + " is Booked for patient "+obj.patient);
                    out=1;
                }

            }
            index++;
        }
        if(out==0)
            System.out.println("Enter valid option");
    }
}
