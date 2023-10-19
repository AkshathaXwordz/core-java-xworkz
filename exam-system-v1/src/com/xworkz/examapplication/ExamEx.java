package com.xworkz.examapplication;

import com.xworkz.examapplication.exam.Exam;
import com.xworkz.examapplication.exam.SupplementoryExam;
import com.xworkz.examapplication.hallticket.HallTicket;

public class ExamEx {

    public static void main(String vtuexam[]){
        System.out.println("calling for exam");
        HallTicket hallTicket=new HallTicket(1324,"Network thoery","18EC34","Akshatha","4UB19EC004");
      //  Exam exam=new Exam();
        Exam exam =new SupplementoryExam();

        exam.feees=1200;
        exam.write (hallTicket);
        SupplementoryExam SupplementoryExam = (SupplementoryExam)  exam;
        SupplementoryExam.write(hallTicket , 1200);



    }
}
