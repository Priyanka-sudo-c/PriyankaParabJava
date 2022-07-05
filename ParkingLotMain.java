package com.edu.over;

import java.util.Scanner;
class ParkingLot{
 int vno;
 int hours;
 double bill;
 void input() {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter vehicle number ");
  vno=sc.nextInt();
  System.out.println("Enter the hours vehicle was parked");
  hours=sc.nextInt();
 }
 void calculate() {
  double normalfee=3;
  if(hours<=1) {
   bill=normalfee;
  }else if(hours>=1) {
   bill=(normalfee*hours)+(1.50*hours);
  }else {
   System.out.println("Invalid input");
  }
 }
 void display() {
  System.out.println("Vehicle number "+vno);
  System.out.println("Was parked for "+hours+". ");
  System.out.println("Bill amount of a vehicle is :"+bill);
 }
}
public class ParkingLotMain {
 public static void main(String[] args) {
	 //TODO Auto-generated method stub
  ParkingLot plob=new ParkingLot();
        plob.input();
        plob.calculate();
        plob.display();
 }
}