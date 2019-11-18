package com.interview.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class MemoryLeak {
	public static void main(String[] args) throws IOException{
		MemoryLeak ml = new MemoryLeak();
		ml.mLeak();
	}

	private void mLeak() throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		StringBuilder input = new StringBuilder();
		URLConnection conn = new URL("www.google.com").openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),StandardCharsets.UTF_8));
		
		while(br.readLine()!=null){
			input.append(br.readLine());
		}
	}

}
