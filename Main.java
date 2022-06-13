package com.home.triaxyd;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
    /*JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setTitle("Zoo");
    frame.setSize(700,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.pack(); */


        int answer;
        boolean valid=false;
        ArrayList<AnimalsID> animals= new ArrayList<AnimalsID>();
        System.out.println("-Welcome to the Zoo-");
        System.out.println("***************");
        System.out.println("1.See Available Animals");
        System.out.println("2.Add Animal");
        System.out.println("3.Search for Animal (Based On Name)");
        System.out.println("4.Search for Animal (Based on Unique Code)");
        System.out.println("5.Edit Existing Animal (Based on Unique Code)");
        System.out.println("6.Delete Animal (Based on Unique Code)");
        System.out.println("7.Exit Application");
        System.out.println("***************");
        do {
            System.out.print("Pick an Option (1-7): ");
            Scanner userInput = new Scanner(System.in);
            if (userInput.hasNextInt()) {
                answer = userInput.nextInt();
                valid = true;
                switch (answer) {
                    case 1:
                        System.out.print("All Animals:");
                        break;
                    case 2:
                        AnimalsID animal = new AnimalsID();
                        System.out.print("Add Unique ID: ");
                        Scanner userId = new Scanner(System.in);
                        int id = userId.nextInt();
                        System.out.print("Add Name: ");
                        Scanner userName = new Scanner(System.in);
                        String name=userName.next();
                        System.out.print("Add Weight: ");
                        Scanner userWeight = new Scanner(System.in);
                        int weight=userWeight.nextInt();
                        System.out.print("Add Average Age: ");
                        Scanner userAge = new Scanner(System.in);
                        int age=userAge.nextInt();
                        System.out.print("Add Homotaxy: ");
                        Scanner userHomotaxy = new Scanner(System.in);
                        String homotaxy=userHomotaxy.next();
                        animal.setId(id);
                        animal.setName(name);
                        animal.setWeight(weight);
                        animal.setAge(age);
                        animal.setHomotaxy(homotaxy);
                        animals.add(animal);
                        break;
                    case 3:
                        System.out.print("Enter the Name: ");
                        Scanner userSearchName= new Scanner(System.in);
                        String searchName=userSearchName.next();
                        for(AnimalsID an: animals){
                            an.getClass();
                        }

                        break;
                    case 4:
                        System.out.println("Option 4");
                        break;
                    case 5:
                        System.out.println("Option 5");
                        break;
                    case 6:
                        System.out.println("Option 6");
                        break;
                    case 7:
                        System.out.println("Program Terminated");
                        valid=false;
                        break;
                    default:
                        System.out.println("Please Pick a Valid Option!");
                }
            } else {
                System.out.println("Please Pick a Valid Option!");
                valid=true;
                userInput.next();
            }

        }while(valid);
    }
}
