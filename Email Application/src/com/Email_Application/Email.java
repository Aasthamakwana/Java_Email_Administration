package com.Email_Application;

import java.util.Scanner;

public class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private String email;
        private int mailBoxCapacity = 500;
        private int passwordDefaultLength = 10;
        private String alternateEmail = "default@xyz.com";
        private String companySuffix = "xyzcompany";

        // Constructor to receive the first and last name
        public Email(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;

            // Call a method asking for a department - return the department
            this.department = setDepartment();
            // Call a method that returns a random password
            this.password = randomPassword(passwordDefaultLength);

            // Combine elements to generate email
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix + ".com";
        }
// Ask for the department
private String setDepartment(){
    System.out.println("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter Department Code: ");
    Scanner sc = new Scanner(System.in);
    int deptChoice = sc.nextInt();
    if(deptChoice == 1){
        return "Sales";
    }else if(deptChoice == 2){
        return "Development";
    } else if (deptChoice == 3) {
        return "Account";
    }else{
        return "";
    }
}

// Generate a random password
private String randomPassword(int length){
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#$!@%&*";
            char[] password = new char[length];
            for(int i=0;i<length;i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
             }
            return new String(password);
}

// Set the mailbox capacity
public void setMailBoxCapacity(int capacity){
            this.mailBoxCapacity = capacity;
}

// Set the alternate email
    public void setAlternateEmail (String altEmail){
            this.alternateEmail = altEmail;
    }

// Change the password
public void changePassword(String password){
this.password = password;
}

public int getMailBoxCapacity(){
            return mailBoxCapacity;
}

public String getAlternateEmail(){
            return alternateEmail;
}

public String getPassword(){
            return password;
}

public String showInfo(){
            return "Name: " + firstName + " " + lastName +
                    "\nYour Password: " + password +
                    "\nCompany Email: " + email +
                    "\nMailBox Capacity: " + mailBoxCapacity + "mb" + alternateEmail;
}

    }

