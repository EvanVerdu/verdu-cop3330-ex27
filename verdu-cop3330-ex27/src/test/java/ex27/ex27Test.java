package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */


import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ex27Test {

    public static void main(String[] Args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String first_name = scanner.nextLine();

        System.out.print("Enter the last name: ");
        String last_name = scanner.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip = scanner.nextLine();

        System.out.print("Enter the employee ID: ");
        String id = scanner.nextLine();

        validateInput(first_name, last_name, zip, id);


    }

    public static int first_name (String first_name){

        int error = 0;

        if (first_name.length() < 2){
            System.out.println("The first name must be at least 2 characters long. ");
            error = 1;
        }

        if (first_name.isEmpty()){
            System.out.println("The first name must be filled in. ");
            error = 2;
        }

        return error;
    }

    public static int last_name (String last_name){

        int error = 0;

        if (last_name.length() < 2){
            System.out.println("The last name must be at least 2 characters long. ");
            error = 1;
        }

        if (last_name.isEmpty()){
            System.out.println("The last name must be filled in. ");
            error = 2;
        }

        return error;


    }

    public static int ZIP_code (String zip){

        int error = 0;

        if (zip.matches("[0-9]+") && zip.length() == 5) {
            error = 0;
        }
        else{
            System.out.println("The zipcode must be a 5 digit number. ");
            error = 1;
        }

        return error;

    }

    public static int ID (String id){

        int error = 0;

        if (id.matches("[A-Za-z]{2}-[0-9]{4}")){
            error = 0;
        }
        else {
            System.out.println("The employee id must be in the format of AA-1234. ");
            error = 1;
        }

        return error;

    }

    public static void validateInput(String first_name, String last_name, String zip, String id){

        int validate1;
        int validate2;
        int validate3;
        int validate4;

        validate1 = first_name(first_name);
        validate2 = last_name(last_name);
        validate3 = ZIP_code(zip);
        validate4 = ID(id);

        if (validate1 == 0 && validate2 == 0 && validate3 == 0 && validate4 == 0){
            System.out.print("There were no errors found. ");
        }

    }
}