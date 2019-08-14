package com.interview.programs;


public class PeopleData implements Comparable<PeopleData>{
		int age;
		int weight;
		int height;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		
	
		PeopleData(int age, int weight, int height){
			this.age = age;
			this.weight = weight;
			this.height = height;
		}
		public int compareTo(PeopleData o) {
			// TODO Auto-generated method stub
			return this.height - o.height;
			
		}
		
		@Override
		public String toString(){
			
			return "Height:" +height;
			
		}
		
		
		
	
}
