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
public class Patient {
        
        static Scanner input = new Scanner(System.in);
        private String fristName="";
        private String lastName="";
        private String address="";
        private String mobile="";
	public Patient(String fristName,String lastName,String address,String mobile) {
		this.setFristName(fristName);
		this.setLastName(lastName);
		this.setAddress(address);
                this.setMobile(mobile);
	}
        public Patient(Patient obj){
        	this.setFristName(obj.getFirstName());
		this.setLastName(obj.getLastName());
		this.setAddress(obj.getAddress());
                this.setMobile(obj.getMobile());
        }
	public Patient()
	{
		this.fristName = "Anonymous";
                this.lastName="secondName";
		this.address = "1 street";
		this.mobile = "01254887";
	}
	
	public String getFirstName()
	{
		return this.fristName;
	}
	
	public void setFristName(String firstName)
	{
		this.fristName = firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
        public String getMobile()
	{
		return this.mobile;
	}
	
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	
	public String toString()
	{
		return "Name: " +this.fristName+" "+this.lastName+ " Address: " +this.address+ " Mobile: " +this.mobile;
	}
        
        public Patient patientDetailsInput() {
               String fristName="";
               String lastName="";
               String address="";
               String mobile="";

            System.out.println("Enter the patient first name:");
            fristName = input.nextLine();
            this.setFristName(fristName);
            System.out.println("Enter the patient last name:");
            lastName = input.nextLine();
            this.setLastName(lastName);
            System.out.println("Enter the patient address:");
            address = input.nextLine();
            this.setAddress(address);
            System.out.println("Enter the patient Mobile Number:");
            mobile = input.nextLine();
            this.setMobile(mobile);
            return this;
    }
}
