package com.company;

import java.util.Scanner;

public class Rated_R_AdmissionCalc {

    public static void main(String[] args) {

        System.out.println("What is the age of first patron?");
        Scanner scanner = new Scanner(System.in);
        String PatronAge = scanner.nextLine();
        int age = Integer.parseInt(PatronAge);

        System.out.println("What is the age of second patron?");
        Scanner scanner2 = new Scanner(System.in);
        String PatronAge2 = scanner2.nextLine();
        int age2 = Integer.parseInt(PatronAge2);

        if(age2 != 0) {
            if (age < 17 || age2 < 17) {
                    boolean isYoungerThan17 = age < 17 && age2 < 17 ? true : false;
                    boolean isOlderthan21 = age >= 21 || age2 >= 21 ? true : false;
                    if (isOlderthan21) {
                        System.out.println("Minor is with adult so admission is permitted");
                    }//closes isOlderthan21 if
                        else if(isYoungerThan17) {
                            System.out.println("Patrons not old enough to be admitted");
                    }//closes if one patron YoungerThan 17 else if
                        else {
                        System.out.println("Minor party is not of age to be admitted");
                        } //closes neither party else
                }//closes either party under 17 if
            else {
                System.out.println("Both parties are of age and can be admitted");
                }//closes if 21 else
            }//close if more than one person

        else if(age2 == 0 ) {
            if (age >= 17) {
                    System.out.println("Admission permitted");
                }//closes is older than 17 if

            else{
                System.out.println("Admission not permitted patron too young");
            }//closes age 2 present else
        }//closes age2 present else if
    }//closes main
}//close class
