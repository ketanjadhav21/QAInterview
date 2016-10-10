package com.interview.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
	public static void main(String[] args){
		StudentSerialize s = null;
		try{
			FileInputStream fileIn = new FileInputStream("/Users/ketanjadhav/Desktop/Serialize.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			s = (StudentSerialize) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i){
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c){
			System.out.println("StudentSerialize class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserilized Results:\n");
		System.out.println("Name:" +s.name);
		System.out.println("Address:" +s.address);
		System.out.println("Roll No:" +s.rollNo);
		System.out.println("Room No:" +s.roomNo);
	}

}
