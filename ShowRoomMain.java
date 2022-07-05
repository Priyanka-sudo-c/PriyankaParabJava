package com.edu.over;

import java.util.Scanner;

class ShowRoom{
	String name;
	long mobno; 
	double cost;
	double dis;
	double amount;
	ShowRoom() {
		 name = "null";
		 mobno=0;
		 cost=0.0;
		 dis=0.0;
		 amount=0.0;
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name:");
		name = sc.nextLine();
		System.out.println("Enter Mobile No:");
		mobno = sc.nextLong();
		System.out.println("Enter a Cost: ");
		cost = sc.nextDouble();
		
	}
	void calculate() {
		if(cost<=10000) {
			dis=(cost*5)/100;
		}else if(cost>=10000 && cost <=20000) {
			dis=(cost*10)/100;
		}else if(cost >=2000 && cost <=35000) {
			dis=(cost*15)/100;
		}else if(cost>=35000) {
			dis=(cost*20)/100;
		}
	}
	void display() {
		System.out.println("Your name is:"+name);
		System.out.println("Your Mobile No:"+mobno);
		System.out.println("Your cost is:"+(cost-dis));
		
		
	}
}
public class ShowRoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom obj=new ShowRoom();
		obj.input();
		obj.calculate();
		obj.display();
	}
}

