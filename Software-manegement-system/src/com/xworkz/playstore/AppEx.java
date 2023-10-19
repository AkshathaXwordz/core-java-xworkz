package com.xworkz.playstore;

import com.xworkz.playstore.application.Application;
import com.xworkz.playstore.stor.SoftwareHub;



public class AppEx {
    public static void main(String[] args) {
        Application app=new Application();
        app.setAppId(1);
        app.setAppName("Whatsapp");
        app.setAppVersion("2.23");
        app.setReleaseDate("26-3-2023");
        app.setCompanyName("Meta");
        app.setAppType("SocialMedia");


        Application app1=new Application();
        app1.setAppId(2);
        app1.setAppName("Snapchat");
        app1.setAppVersion("2.3");
        app1.setReleaseDate("8-7-2021");
        app1.setCompanyName("SnapInc");
        app1.setAppType("socialMedia");

        Application app3=new Application();
        app3.setAppId(3);
        app3.setAppName("yono SBI");
        app3.setAppVersion("4.2");
        app3.setCompanyName("SBI");
        app3.setReleaseDate("24-11-2017");
        app3.setAppType("financial app");



        SoftwareHub softwareHub=new SoftwareHub();

        softwareHub.addApplications(app);
        softwareHub.addApplications(app1);
        softwareHub.addApplications(app3);
        softwareHub.getAllApplication();

        softwareHub.updateAppVersionByAppName("2.5", "Snapchat");
                softwareHub.getAllApplication();

                SoftwareHub.deleteApplicationByAppName();


        Application appByName = softwareHub.getApplicationByName("Whatsapp");
        System.out.println(appByName.getAppId() +" "+ appByName.getAppName() +" "+ appByName.getAppType() +" "+ appByName.getAppVersion() +" "+ appByName.getCompanyName() + " "+ appByName.getReleaseDate());

        Application appByType = softwareHub.getApplicationByType("socialMedia");
        System.out.println(appByType.getAppId() +" "+ appByType.getAppName() +" "+ appByType.getAppType() +" "+ appByType.getAppVersion() +" "+ appByType.getCompanyName() + " "+ appByType.getReleaseDate());

        Application appById = softwareHub.getApplicationById(2);
        System.out.println(appById.getAppId() +" "+ appById.getAppName() +" "+ appById.getAppType() +" "+ appById.getAppVersion() +" "+ appById.getCompanyName() + " "+ appById.getReleaseDate());

        String appName = softwareHub.getApplicationNameByType("socialMedia");
        System.out.println("app name is fetched by the type:" +appName);

        String appType = softwareHub.getApplicationTypeByName("Whatsapp");
        System.out.println("app type is fetched by the name:" +appType);

        String comanyName = softwareHub.getApplicationCompanyNameByName("Whatsapp");
        System.out.println("company name is fetched by the name:" +comanyName);


    }
}