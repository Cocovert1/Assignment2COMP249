// -----------------------------------------------------
// Assignment 2
// Written by: Nicholas Pop 40210550 and Alessio Cipriano-Kardous 40210549
// -----------------------------------------------------
/*
This driver initializes 16 objects of different classes. It will run a series of tasks like finding its they're equal, copying
and finding the least and most expensive drone in an array of objects. This driver also has the copyFlyingObjects method that will
copy and array of objects.
 */

package com.company;

//importing the packages
import com.company.Package1.Airplane;
import com.company.Package2.Helicopter;
import com.company.Package2.Quadcopter;
import com.company.Package3.Multirotor;
import com.company.Package4.UAV;
import com.company.Package5.AgriculturalDrone;
import com.company.Package5.MAV;

public class Driver2 {

    public static void main(String[] args) {

        //welcoming message
        System.out.println("Welcome to the Flying objects program.");

        //creating objects of different classes
        Airplane a1 = null;
        Airplane a2 = new Airplane("Boeing", 100000, 2000);
        Airplane a3 = new Airplane("Boeing", 100000, 2000);
        Airplane a4 = new Airplane(a3);
        Helicopter h1 = new Helicopter("Toyota", 10, 100, 20, 1980, 180);
        Helicopter h2 = new Helicopter("Corola", 300, 250, 15, 2002, 40);
        Helicopter h3 = new Helicopter(h2);
        Helicopter h4 = null;
        Quadcopter q1 = new Quadcopter("Mercedes", 3000, 600, 50, 2015, 6, 270);
        Quadcopter q2 = new Quadcopter("BMW", 1560, 467, 20, 30, 12, 36);
        Quadcopter q3 = new Quadcopter(q1);
        Multirotor m1 = new Multirotor("Nissan", 13000, 12000, 120, 1700, 500, 700);
        Multirotor m2 = new Multirotor(m1);
        Multirotor m3 = new Multirotor("Boetang", 16000, 12500, 220, 1700, 500, 600);
        Multirotor m4 = null;
        UAV u1 = new UAV(1000, 100000);
        UAV u2 = new UAV(2000, 20000000);
        AgriculturalDrone ag1 = new AgriculturalDrone(2000, 20000, "Santa", 230);
        AgriculturalDrone ag2 = new AgriculturalDrone(1250, 15600, "Claus", 127);
        MAV mav1 = new MAV(3000, 30000, "Maverick", 540);
        MAV mav2 = new MAV(5200, 26780, "Delta", 730);

        //making an array with the different objects
        Object[] objArr = {a1, a2, a3, h1, h2, h3, q1, q2, m1, m2, m3, u1, u2, ag1, ag2, mav1, mav2}; //array with UAV
        Object[] objArr2 = {a1, a2, a3, a4, h1, h2, h3, h4, q1, q2, q3, m1, m2, m3, m4}; //array without UAV

        //printing out the toString of at least 15 objects
        System.out.println("Printing out the toStrings: ");
        for(int i = 0; i < objArr.length; i++){
            if(objArr[i] == null){
                continue;
            }
            System.out.println(objArr[i].toString());
        }

        System.out.println();

        //testing the equals method
        System.out.println("Testing out the equals method: ");
        System.out.println(m1.equals(q3));
        System.out.println(q1.equals(q2));
        System.out.println(a2.equals(a3));

        System.out.println();

        //finding the least and most expensive UAV from an array with and without a UAV class
        System.out.println("Finding the least and most expensive UAV in array: ");
        System.out.print("Array with UAV: ");
        findLeastAndMostExpensiveUAV(objArr);
        System.out.print("Array without UAV: ");
        findLeastAndMostExpensiveUAV(objArr2);

        //testing out the copyFlyingObjects method
        System.out.println();
        System.out.println("Now copying an array of flying objects.");
        copyFlyingObjects(objArr2);

        //closing system and message
        System.out.println();
        System.out.println("This has been all we can show you, thank you for watching.");
        System.exit(0);

    }

    public static void findLeastAndMostExpensiveUAV(Object[] arr){
        //Drone counter
        int counter = 0;
        //for loops that check for drone classes in array
        for(Object o : arr){
            if(o == null){ //skips for a null object
                continue;
            }
            if(o.getClass() == UAV.class || o.getClass() == MAV.class || o.getClass() == AgriculturalDrone.class){
                counter++;
            }
        }
        //initializing uav array
        UAV[] uavArr = new UAV[counter];

        //if there is 1 drone class in array
        if(counter == 1){
            for(Object o : arr){ //checks which type of drone there is and puts it in the drone array
                if(o.getClass() == UAV.class){
                    uavArr[0] = (UAV) o;
                } else if(o.getClass() == MAV.class){
                    uavArr[0] = (MAV) o;
                } else if(o.getClass() == AgriculturalDrone.class){
                    uavArr[0] = (AgriculturalDrone) o;
                }
            }
            System.out.println(uavArr[0].toString() + " It is the least and most expensive UAV."); //prints the single drone object

            //if there are more than 1 drone classes in array
        } else if (counter > 1){
            int countercounter = 0;
            for(int i = 0; i < arr.length; i++){ //checks which type of drone there is and puts it in the drone array
                if(arr[i] == null){ //skips for a null object
                    continue;
                }
                if(arr[i].getClass() == UAV.class){
                    uavArr[countercounter] = (UAV) arr[i];
                    countercounter++;
                } else if(arr[i].getClass() == MAV.class){
                    uavArr[countercounter] = (MAV) arr[i];
                    countercounter++;
                } else if(arr[i].getClass() == AgriculturalDrone.class){
                    uavArr[countercounter] = (AgriculturalDrone) arr[i];
                    countercounter++;
                }
            }

            //finds the max price drone
            double maxValue = uavArr[0].getPrice();
            for(int i = 1; i < uavArr.length; i++){
                if(uavArr[i].getPrice() > maxValue){
                    maxValue = uavArr[i].getPrice();
                }
            }

            //finds the min price drone
            double minValue = uavArr[0].getPrice();
            for(int i = 1; i < uavArr.length; i++){
                if(uavArr[i].getPrice() < minValue){
                    minValue = uavArr[i].getPrice();
                }
            }

            //sorts the drone array to find
            for(int i = 0; i < uavArr.length; i++){
                if(uavArr[i].getPrice() == maxValue){
                    System.out.println(uavArr[i].toString() + " This is max");
                }
                if(uavArr[i].getPrice() == minValue){
                    System.out.println(uavArr[i].toString() + " This is min");
                }
            }

            //if there are no drones in array
        } else {
            System.out.println("none");

        }

    }

    public static void copyFlyingObjects(Object[] arr){

        //make a copy array of the same size
        Object copyArray[] = new Object[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }

        //prints out the toString of every object in array
        System.out.println("Original:");
        for (int i=0; i< arr.length; i++) {
            if(arr[i] == null){
                continue;
            }
            System.out.print(arr[i].toString() + "\n");
        }

        System.out.println();

        //prints out the toString of every object in the copy array
        System.out.println("CopyArray:");
        for (int i=0; i< copyArray.length; i++) {
            if(arr[i] == null){
                continue;
            }
            System.out.print(copyArray[i].toString() + "\n");
        }

    }

}
