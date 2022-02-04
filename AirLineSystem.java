/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesystem;
import java.util.*;


/**
 *
 * @author N0ur
 */
class aiport {
    String airpor_name;
    public aiport(){
            System.out.println("Enter the airport you choose : ");
            Scanner s =new Scanner(System.in);
            String temp1 = s.nextLine();
            this.airpor_name = airpor_name;

    }
    //end the class
}
class Person {
    String name,address ;
   public Person(){
       System.out.println("enter your name ");
       Scanner scanner=new Scanner(System.in);
      String name=scanner.nextLine();
      this.name=name;
       System.out.println("enter your address");
      String address=scanner.nextLine();
      this.address=address;
      
      
   }
   //end the class 
}
class passenger extends Person {
    int num;
    public passenger(){
        Random r=new Random();
        int rand=25;
        int num=r.nextInt(25);
        this.num=num;
        
        
    }
    //end the class
    
}

class Describe_flight {

String travel_from,tranel_to ;
int capaity;
int no_department;
int arrival;
public Describe_flight(){
    System.out.println("travel from airport >>");
    Scanner f=new Scanner(System.in);
    String from =f.nextLine();
    this.travel_from=travel_from;
    System.out.println("tranel to airport >>");
    String tranel_to =f.nextLine();
    this.tranel_to=tranel_to;
    Random rand = new Random();
    int upperbound=20;
    int no_department=rand.nextInt(20);
    this.no_department=no_department;
    int arrival=rand.nextInt(20);
    this. arrival=arrival;
        int capacity_rondom=rand.nextInt(500);
        this.capaity=capaity;
           
}
//end the class
}
class schedule extends Describe_flight{
    String data;
public schedule(){
            System.out.println("Enter the month u choose to travel : ");
            Scanner s =new Scanner(System.in);
            String data = s.nextLine();
        this.data = data;

    }    
}
 class AirlineReservation extends schedule{
    
}



public class AirLineSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        passenger obj1=new passenger();
        AirlineReservation obj=new AirlineReservation();
        System.out.println();
           System.out.println("sucssesful Reservation !");
                   System.out.println("You Are Travelling From : " + obj.travel_from+ "   To : "+obj.tranel_to);
                           System.out.println("Department Time is : "+ obj.no_department);
                                 System.out.println("arrival Time is : "+ obj.arrival);
                                 System.out.println("capaity of plane is : "+ obj.capaity);
                                         System.out.println("The Date You Choose : " +obj.data);
                                                 System.out.println("Your Id is : "+obj1.num);
                                                 System.out.println("Thank u and wish u happy and safe flight");

        
     
    }
    
}

    
    

