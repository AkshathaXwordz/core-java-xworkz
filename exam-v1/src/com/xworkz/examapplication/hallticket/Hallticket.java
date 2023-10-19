package com.xworkz.examapplication.hallticket;

public class Hallticket {

    int candidateId;
    String subjectName;
    String subjectCode;
    String candidateName;
    String usnNO;

    public Hallticket (int candidateId,String subjectName,String subjectCode,String candidateName,String usnNO){
        this.candidateId=candidateId;
        this.subjectName=subjectName;
        this.subjectCode=subjectCode;
        this.candidateName=candidateName;
        this.usnNO=usnNO;

    }
    public void displayDetails(){
        System.out.println("candidateId is" +candidateId);
        System.out.println("Subject name is" +subjectName);
        System.out.println("Subject code is" +subjectCode);
        System.out.println("candidate Name is" +candidateName);
        System.out.println("candidate usn NO is" +usnNO);
    }

}
