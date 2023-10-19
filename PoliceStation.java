package com.xworkz.policestation.station;


import com.xworkz.policestation.offiers.Officer;

import java.util.Arrays;

public class PoliceStation {

    Officer officer[];
    public PoliceStation(int size){
        officer=new Officer[size];
    }
    int index;
 int id;


    public boolean addOfficers(Officer officer){
        System.out.println("invoke addOfficers");
        boolean isAdded = false;
        if(officer != null){
            officer.setOfficerId(id++);
            this.officer[index++] = officer;
            isAdded = true;
        }
        return isAdded ;
    }
    public void getAllOfficer(){
        System.out.println("Officer lists are");
        for(int index = 0; index < officer.length; index++)
        {
            System.out.println(officer[index].getOfficerId()+" "
                    +officer[index].getName()+" "
                    +officer[index].getGender()+" "
                    +officer[index].getAge()+" "
                    +officer[index].getPostName()+" "
                    +officer[index].getBloodGroup()+" "+officer[index].getAddress());
        }
    }


    public String getAddressById(int id){
        String address = null ;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++)
        {
            if (officer[officerIndex].getOfficerId() == id)
            {
                address = officer[officerIndex].getAddress();
                System.out.println("address found");

            }
        }
        return address;
    }

    public Officer getOfficeInfoByname(String officerName){
        Officer officer1 = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == officerName ){
                officer1 = officer[officerIndex];
                System.out.println("officer information found by id");
            }
        }
        return officer1;
    }
    public int getOfficerAgeByName(String officerName){
        int age = 0;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == officerName ){
                age = officer[officerIndex].getAge();
                System.out.println("officer age found by name");
            }
        }
        return age;
    }
    public String getPostNameByName(String officerName){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == officerName ){
                postName = officer[officerIndex].getPostName();
                System.out.println("Postname found by name");
            }
        }
        return postName;
    }
    public String getPostNameById(int officerId){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getOfficerId() == officerId ){
                postName = officer[officerIndex].getPostName();
                System.out.println("postname found by id");
            }
        }
        return postName;
    }
    public boolean updatePostNameByOfficerName(String updatedPostName, String exisistingOfficerName){
        boolean isPostNameUpdated = false ;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == exisistingOfficerName ){
                officer[officerIndex].setPostName(updatedPostName);
                isPostNameUpdated = true;


            }
        }
        return isPostNameUpdated;
    }
    public void deleteOfficerById(int id) {
        System.out.println("invoked deleteOfficerById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.officer.length; index++) {
            if (officer[index].getOfficerId() != id) {
                officer[newIndex++] = officer[index];
            }
            else {
                System.out.println("Given Officer Name is been deleted ");
            }
        }
        officer = Arrays.copyOf(officer, newIndex);
        getAllOfficersName(officer);
    }

    public void getAllOfficersName(Officer application[]){
        System.out.println("--------------------------------");
        System.out.println("Get all new officers details");
        for (int index = 0; index < application.length; index++) {
            System.out.println(officer[index].getOfficerId()+" "+officer[index].getName()+" "+officer[index].getGender()+" "+officer[index].getAge()+" "+officer[index].getPostName()+" "+officer[index].getBloodGroup()+" "+officer[index].getAddress());
        }
    }


}
