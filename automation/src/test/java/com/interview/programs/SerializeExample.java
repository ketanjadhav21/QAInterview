package com.interview.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
	public static void main(String[] args){
		StudentSerialize s = new StudentSerialize();
		s.name = "Ketan Jadhav";
		s.address = "1255 Elm Lake Crt, San Jose";
		s.rollNo = 21;
		s.roomNo = 1255;
		try{
			FileOutputStream fileOut = new FileOutputStream("/Users/ketanjadhav/Desktop/Serialize.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(s);
			out.close();
			fileOut.close();
			System.out.println("Object is serialized nd stored in 'Serialize.ser'");
		}catch(IOException is){
			is.printStackTrace();
		}
	}

}
