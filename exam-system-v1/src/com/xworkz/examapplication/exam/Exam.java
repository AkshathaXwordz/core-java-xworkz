package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;

public class Exam {

    public int feees;
    HallTicket ticket ;
        int fees;

        public boolean write(HallTicket ticket){
            boolean isAllowed =false;

            if(fees<=1200){
                System.out.println("fees is paid..collect the HallTicket");
                if(ticket!=null){
                    System.out.println("issuing the HallTicket");
                    this.ticket=ticket;
                    this.ticket.displayDetails();
                    System.out.println(" HallTicket details are found... proceed to write exam");
                    isAllowed=true;
                }
                else{
                    System.out.println("HallTicket details is not found");
                }
            }
            else{
                System.out.println(" pay the fee first");
            }
            return isAllowed;
        }

}
