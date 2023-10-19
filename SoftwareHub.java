package com.xworkz.playstore.stor;

import com.xworkz.playstore.application.Application;

import java.util.Arrays;

public class  SoftwareHub{
    Application application [];

    public SoftwareHub(size){
application=new Application[size];

    }
            int index;
    private Arrays arrays;

    public boolean addApplications(Application application){
        boolean isAdded = false;
        if(application != null){
        this.application[index++] = application;
        isAdded = true;
        }
        return isAdded;
        }


public void getAllApplication() {
        System.out.println("The list of application details are:");

        for (int i = 0; i < index; i++) {
        System.out.println(
        application[i].getAppId() + " " +
        application[i].getAppName() + " " +
        application[i].getAppVersion() + " " +
        application[i].getReleaseDate() + " " +
        application[i].getCompanyName() + " " +
        application[i].getAppType() );

        }
        }

public Application getApplicationByName(String appName) {
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
        if (application[appIndex].getAppName()== appName) {
        application1 = application[appIndex];
        System.out.println("Application found.. please collect it executor");
        }
        }
        return application1;
        }
    public Application getApplicationByType(String appType){
        Application application1 = null;
        for(int appIndex = 0; appIndex <this.application.length; appIndex++){
            if(application[appIndex].getAppType()== appType){
                application1 = application[appIndex];
                System.out.println("application found..");
            }
        }
        return application1;
    }

    public Application getApplicationById(int appId){
        Application application1 = null;
        for(int appIndex = 0; appIndex <this.application.length; appIndex++){
            if(application[appIndex].getAppId()== appId){
                application1 = application[appIndex];
                System.out.println("application found..");
            }
        }
        return application1;
    }

    public String getApplicationNameByType(String appType
    ){

        String appName = null;
        System.out.println("invoking the method get getApplicationNameByType");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppType()== appType){
                appName = application[i].getAppName();
            }
        }
        return appName;
    }

    public String getApplicationTypeByName(String appName){

        String appType = null;
        System.out.println("invoking the method get getApplicationTypeByName");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppName()== appName){
                appType = application[i].getAppType();
            }
        }
        return appType;
    }

    public String getApplicationCompanyNameByName(String appName){

        String companyName = null;
        System.out.println("invoking the method get getApplicationCompanyNameByName");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppName()== appName){
                companyName = application[i].getCompanyName();
            }
        }
        return companyName;
    }

    //upadate operation
    public boolean updateAppVersionByAppName(String updateVersion, String existingAppName){


        boolean isVersionUpdated = false;
        System.out.println("invoking the method get updateAppVersionByAppName");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppName()== existingAppName){
                application[i].setAppVersion(updateVersion);
                isVersionUpdated = true;
                System.out.println("application found..");
            }
        }
        return isVersionUpdated;
    }
    //delete operation
    public void deleteApplicationByAppName(String appName){
        System.out.println("invoking");
        int index, newIndex;
        for (index=0, newIndex = 0; index<this.application.length; index++){
            if(application[index].getAppName() != appName){
                application[index++] = application[index];
                System.out.println("application found");
            }
        }

         application = Arrays.copyOf(application, newIndex);
        getAllOfficersName(application);
    }

    public void getAllOfficersName(Application application[]){
        System.out.println("--------------------------------");
        System.out.println("Get all new officers details");
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppId()+" "+application[index].getAppName()+" "+application[index].getAppType()+" "+application[index].getCompanyName()+" "+application[index].getAppVersion()+" "+application[index].getReleaseDate());
        }
    }


}

