package com.xworkz.policestation;

import com.xworkz.policestation.offiers.Officer;
import com.xworkz.policestation.station.PoliceStation;

import java.util.Scanner;

public class OfficerEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No Officers to be added");
        int size = sc.nextInt();
        PoliceStation policeStation = new PoliceStation(size);

        for (int index = 0; index < size; index++) {

            Officer officer = new Officer();
           // System.out.println("Enter the officer id");
          //  officer.setOfficerId(sc.nextInt());
            System.out.println("Enter the name");
            officer.setName(sc.next());
            System.out.println("Enter the Gender");
            officer.setGender(sc.next());
            System.out.println("Enter the Age");
            officer.setAge(sc.nextInt());
            System.out.println("Enter the postName");
            officer.setPostName(sc.next());
            System.out.println("Enter the BloodGroup");
            officer.setBloodGroup(sc.next());
            System.out.println("Enter the Address");
            officer.setAddress(sc.next());

            policeStation.addOfficers(officer);

        }policeStation.getAllOfficer();




        String input=null;

        do{
            System.out.println("Press 1 to getAllOfficer ");
            System.out.println("Press 2 to getAddressById");
            System.out.println("Press 3 to getOfficeInfoByname ");
            System.out.println("Press 4 to getOfficerAgeByName");
            System.out.println("Press 5 to getPostNameByName");

            int options= sc.nextInt();
            switch (options)
            {
                case 1:
                    policeStation.getAllOfficer();
                    break;

                case 2:
                    System.out.println("Enter the ID to get Address");
                String address =  policeStation.getAddressById(sc.nextInt());
                    System.out.println(address);
                    break;

                case 3:
                    System.out.println(" Enter the Officer Name to get Information ");
                    Officer name = policeStation.getOfficeInfoByname(sc.next());
                    System.out.println(name);
                    break;

                case 4:
                    System.out.println("Enter the Officer Name to get age");
                    int age =policeStation.getOfficerAgeByName(sc.next());
                    System.out.println(age);
                    break;

                case 5:
                    System.out.println("Enter the Officer Name to get postName");
                    String postName =policeStation.getPostNameByName(sc.next());
                    System.out.println(postName);

                    break;
                default:
                    System.out.println("select available option only");
            }
            System.out.println("Do you what to continue Yes/No");
            input=sc.next();

        }while (input.equals("Yes"));

        System.out.println("Thank you for ur time");
    }

}

