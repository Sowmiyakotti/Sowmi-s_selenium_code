package homeassignment.week1;

public class FindIntersection {
	
	
public static void main(String[] args) {
		
	int a[]={3,2,11,4,6,7};
	int b[]={1,2,8,4,9,7};
		
		//outer loop
		for (int i = 0; i < a.length; i++) {
			
			//inner loop
			for (int j = 0; j < b.length; j++) {
				
				if(a[i]==b[j]) {
					System.out.println("Intersection value :"+b[j]);
					
				}
			}
		}
}
}
