public class Reversal_Array{
	public static int A[] = {10,20,30,40,50};
	
	public static void main(String args[]){
		int max = A.length-1;
		System.out.print("Original: ");
		for(int i = 0; i <= max; i++) System.out.print(A[i]+"  ");
		reverse(0,max);
		System.out.print("\nReversed: ");
		for(int i = 0; i <= max; i++) System.out.print(A[i]+"  ");
	}
	
	public static void reverse(int p,int r){
		if (p == r) return;
		else if(p+1 == r ){
			swap(p,r);
			return;
		}
		else{
			swap(p,r);
			reverse(p+1,r-1);
		}
	}
	
	public static void swap(int p,int r){
		int temp = A[p];
		A[p] = A[r];
		A[r] = temp;
	}
}