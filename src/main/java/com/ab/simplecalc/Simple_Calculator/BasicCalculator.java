package com.ab.simplecalc.Simple_Calculator;

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator {
  
    		int m1,m2, m3;
    		
    		public void GetNumbers(){
    		System.out.println("Enter Numbers to perform calculation:  ");
    		Scanner sc = new Scanner(System.in);
    		m1=sc.nextInt();
    		Scanner ab = new Scanner(System.in);
    		m2=sc.nextInt();
    		Scanner cd = new Scanner(System.in);
    		m3=sc.nextInt();
    	   }

    	public long Add() {
    		int cal = m1+m2+m3;
    		System.out.println("The Addition of numbers is : "+ cal);
			return cal;
    	}
    	public void Subtract() {
    		int cal = m1-m2;
    		System.out.println("The Subtraction of 1st two numbers is : "+ cal);
    	}
    	public void Multiply() {
    		int cal = m1*m2*m3;
    		System.out.println("The Multiplication of numbers is : "+ cal);
    	}
    	public void Divide() {
    		int cal = m1/m2;
    		System.out.println("The Division of 1st two numbers is : "+ cal);
    	}
    		public int selectChoice()
    		{
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Provide an appropriate number for below operations:");
    		System.out.println("1.Add 2 Subtract 3.Multiply 4.Divide");
    		int choice = sc.nextInt();
    		return choice;
    		}

    		public void performCalculation(int choice)
    		{
    		switch(choice)
    			{
    		case 1:this.Add();
    		break;
    		case 2:this.Subtract();
    		break;
    		case 3:this.Multiply();
    		break;
    		case 4:this.Divide();
    			}
    		}
    		public static void main(String[] args) {
    		// TODO Auto-generated method stub
    			BasicCalculator obj  = new BasicCalculator();
    			obj.GetNumbers();
    			int userchoice = obj.selectChoice();
    			obj.performCalculation(userchoice);
    		}
    	}
   

