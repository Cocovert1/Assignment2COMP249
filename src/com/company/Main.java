package com.company;

import com.company.Package1.Airplane;
import com.company.Package2.Helicopter;
import com.company.Package2.Quadcopter;
import com.company.Package3.Multirotor;
import com.company.Package4.UAV;
import com.company.Package5.AgriculturalDrone;
import com.company.Package5.MAV;

public class Main {

    public static void main(String[] args) {

        Airplane a1 = null;
        Airplane a2 = new Airplane("aa", 10, 20);
        Airplane a3 = new Airplane("aa", 10, 20);
        Helicopter h1 = new Helicopter("toyota", 10, 100, 20, 30, 40);
        Helicopter h2 = new Helicopter("toyota", 10, 100, 20, 30, 40);
        Quadcopter q1 = new Quadcopter("toyota", 10, 100, 20, 30, 40, 100);
        Multirotor m1 = new Multirotor("nasus", 10, 100, 20, 30, 40, 250);
        UAV u1 = new UAV(1000, 100000);
        UAV u2 = new UAV(2000, 20000000);
        AgriculturalDrone ag1 = new AgriculturalDrone(2000, 20000, "yoyo", 230);
        MAV mav1 = new MAV(3000, 30000, "hello", 540);

        Object[] objArr = {a2, a3, h1, h2, q1, m1, u1, u2, ag1, mav1};
        Object[] objArr2 = {a2, a3, h1, h2, q1, m1, mav1, u2};

        System.out.println(a2.equals(a1));
        System.out.println(a2.equals(h1));
        System.out.println(a2.equals(a3));
        System.out.println(h2.equals(h1));
        System.out.println(h1.equals(q1));
        System.out.println(h1.equals(m1));
        System.out.println(u1.equals(u2));
        System.out.println(ag1.equals(u2));
        System.out.println(mav1.equals(u1));

        findLeastAndMostExpensiveUAV(objArr);

    }

    public static void findLeastAndMostExpensiveUAV(Object[] arr){
        int counter = 0;
        for(Object o : arr){
            if(o.getClass() == UAV.class || o.getClass() == MAV.class || o.getClass() == AgriculturalDrone.class){
                counter++;
            }
        }
        UAV[] uavArr = new UAV[counter];

        if(counter == 1){
            for(Object o : arr){
                if(o.getClass() == UAV.class){
                    uavArr[0] = (UAV) o;
                } else if(o.getClass() == MAV.class){
                    uavArr[0] = (MAV) o;
                } else if(o.getClass() == AgriculturalDrone.class){
                    uavArr[0] = (AgriculturalDrone) o;
                }
            }
            System.out.println(uavArr[0].toString() + " It is the least and most expensive UAV.");

        } else if (counter > 1){
            int countercounter = 0;
            for(int i = 0; i < arr.length; i++){
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

            double maxValue = uavArr[0].getPrice();
            for(int i = 1; i < uavArr.length; i++){
                if(uavArr[i].getPrice() > maxValue){
                    maxValue = uavArr[i].getPrice();
                }
            }

            double minValue = uavArr[0].getPrice();
            for(int i = 1; i < uavArr.length; i++){
                if(uavArr[i].getPrice() < minValue){
                    minValue = uavArr[i].getPrice();
                }
            }

            for(int i = 0; i < uavArr.length; i++){
                if(uavArr[i].getPrice() == maxValue){
                    System.out.println(uavArr[i].toString() + " This is max");
                }
                if(uavArr[i].getPrice() == minValue){
                    System.out.println(uavArr[i].toString() + " This is min");
                }
            }

        } else {
            System.out.println("none");

        }

    }
}
