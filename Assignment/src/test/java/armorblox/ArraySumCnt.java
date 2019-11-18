package armorblox;

//public class Solution {
//	
//		  public static void main(String[] args) {
//		  int[] array ={2, 3, 4, 1, 5, 0};
//		    int sum = 5;
//		    getSumCnt(array, sum);
//		    
//		  }
//		    public static void getSumCnt(int[] array, int sum){
//		      for(int i=0; i<array.length; i++){
//		        for(int j=i+1; j<array.length; j++){
//		          if(array[i] + array[j] == sum){
//		            System.out.println( "["+array[i]+","+ array[j]+"]");
//		          }
//		        }
//		        }
//		    }
//		  
//		}




public class ArraySumCnt {
	public static void main(String[] args){
		int[] array = {2,3,4,1,5,0};
		int sum = 5;
		getSumCnt(array, sum);
	}

	private static void getSumCnt(int[] array, int sum) {
		// TODO Auto-generated method stub
		for(int i=0; i<array.length; i++){
			for(int j=i+1; i<array.length; j++){
				if(array[i] + array[j] == sum){
					System.out.println("["+array[i]+","+array[j]+"]");
				}
			}
		}
		
	}
}


//public class Solution{
//	public static void main(String[] args){
//		int[] array = {2,3,4,1,5,0};
//		int sum = 5;
//		getSum(array,sum);
//	}
//
//	private static void getSum(int[] array, int sum) {
//		// TODO Auto-generated method stub
//		for(int i=0; i<array.length; i++){
//			for(int j=i+1; i<array.length; j++){
//				if(array[i] + array[j] == sum){
//					System.out.println("["+array[i]+":"+array[j]+"]");
//				}
//			}
//		}
//	}
//}