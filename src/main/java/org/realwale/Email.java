package org.realwale;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private int mailCapacity = 1000;
    private String companyIdentifier = "decagon.dev";
    private String password;
    private String department;
    private String alternateEmail;
    private String changePassword;

    public Email(String firstName, String lastName) throws InterruptedException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = generateRandomPassword(20);
        this.email =  firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+companyIdentifier;

        System.out.println("Generating your details....");

        Thread.sleep(5000);

        System.out.println("Your first-name: "+firstName+"\nYour last-name: "+lastName +"\nYour department: "+ department +"\nYour email: "+email +"\nYour password: "+ password);
    }
    private String setDepartment() {
        System.out.print("Departments:\n1 for IT\n2 for Human Resource\n3 for Accounting\n0 for None\nEnter your department: ");

        Scanner in = new Scanner(System.in);

        int departmentSelected = in.nextInt();

        if (departmentSelected == 1) {
            return "IT";
        } else if (departmentSelected == 2) {
            return "Human Resource";
        }else if (departmentSelected == 3) {
            return "Accounting";
        }else if (departmentSelected == 0) {
            return "No Department";
        }else{
            return " ";
        }

    }

    private String generateRandomPassword(int randomLen){
        String passwordSet = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$5%^</|>&*abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[randomLen];

        for (int i = 0; i<randomLen; i++){
           int gen = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(gen);
        }
        return new String(password);

    }

    public void setMailCapacity(int mailCapacity) {
        this.mailCapacity = mailCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setChangePassword(String changePassword) {
        this.changePassword = changePassword;
    }

    public int getMailCapacity() {
        return mailCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getChangePassword() {
        return changePassword;
    }
}