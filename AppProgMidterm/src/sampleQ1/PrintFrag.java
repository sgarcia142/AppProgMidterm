package sampleQ1;

public class PrintFrag {
	public static void printFrag() {
		int[] array = {1,2,3,2,1};
		int v = 1;
		
		for(int val:array) {
			if(v>val)
				v+=val;
			else 
				v-=val;
			System.out.printf("%s",val);
		}
		System.out.println("");
		System.out.printf("%d", v);

	}		
}
