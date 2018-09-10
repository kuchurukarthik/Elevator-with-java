import java.util.Scanner;
public class ElevatorClass {
public static int choice,number,floor;
static Scanner s =new Scanner(System.in);
	public static void main(String[] args) {
		//this mechanism works only if people entering elevator go to same floor
		System.out.println("Enter the floor number that you are currently in:");//integers in between 0 to 5 only
		number=s.nextInt();
		if(number==0) {
		System.out.println("Enter the floor number that you want to go:");
		choice=s.nextInt();
    	switch(choice) {
    	
				 case 1: 
					Waitfunction();System.out.print("You've reached 1st floor"+"\n");break;
				 case 2:
					 for(int k=0;k<1;k++) {
						 Waitfunction();
						 System.out.print("You are now in floor-"+(k+1)+"\n");
					 }Waitfunction();System.out.print("You've reached 2nd floor"+"\n");break;
				 case 3:
					 for(int k=0;k<2;k++) {
						 Waitfunction();
						 System.out.print("You are now in floor-"+(k+1)+"\n");
					 }Waitfunction();System.out.print("You've reached 3rd floor"+"\n");break;
				case 4:
					 for(int k=0;k<3;k++) {
						 Waitfunction();
						 System.out.print("You are now in floor-"+(k+1)+"\n");
					 }Waitfunction();System.out.print("You've reached 4th floor"+"\n");break;
				 case 5: for(int k=0;k<4;k++) {
					 Waitfunction();					 System.out.print("You are now in floor-"+(k+1)+"\n");
				 }Waitfunction();System.out.print("You've reached 5th floor"+"\n");break;
					 }
		}
				 

	 if(number==1) {
			System.out.println("Enter the floor number that you want to go:");
			choice=s.nextInt();
	    	switch(choice) {
					 case 2: Waitfunction();
						 System.out.print("You've reached 2nd floor"+"\n");break;
					 case 3:
						 for(int k=1;k<2;k++) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k+1)+"\n");
						 }Waitfunction();System.out.print("You've reached 3rd floor"+"\n");break;
					 case 4:
						 for(int k=1;k<3;k++) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k+1)+"\n");
						 }Waitfunction();System.out.print("You've reached 4th floor"+"\n");break;
					case 5:
						 for(int k=1;k<4;k++) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k+1)+"\n");
						 }Waitfunction();System.out.print("You've reached 5th floor"+"\n");break;
					 case 0: for(int k=1;k>0;k--) {
						 Waitfunction();
						 System.out.print("You have reached ground floor");
					 }
						 }//switch
					 }//first floor
	 if(number==2) {
			System.out.println("Enter the floor number that you want to go:");
			choice=s.nextInt();
	    	switch(choice) {
					 case 3: 
						 Waitfunction();
						 System.out.print("You've reached 3rd floor"+"\n");break;
					 case 4:
						 for(int k=2;k<3;k++) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k+1)+"\n");
						 }Waitfunction();break;
					 case 5: for(int k=2;k<4;k++) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k+1)+"\n");
						 }Waitfunction();System.out.print("You've reached 5th floor"+"\n");break;
					case 1:Waitfunction();
					 System.out.print("You have reached floor 0"); break;
					 case 0: for(int k=2;k>0;k--) {
						 Waitfunction();   
						 System.out.print("You have reached floor "+(k-1));
					 }Waitfunction();System.out.print("You have reached ground floor ");break;
						 }//switch
					 }//second floor
	
	 if(number==3) {
			System.out.println("Enter the floor number that you want to go:");
			choice=s.nextInt();
	    	switch(choice) {
					 case 4: 
						 Waitfunction();
						 System.out.print("You've reached 4th floor"+"\n");break;
					 case 5:
						 for(int k=3;k<4;k++) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k+1)+"\n");
						 }Waitfunction();System.out.print("You've reached 5th floor"+"\n");break;
					 case 1:
						 for(int k=3;k>2;k--) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k-1)+"\n");
						 }Waitfunction();System.out.print("You've reached 1st floor"+"\n");break;
					case 2:Waitfunction();
					 System.out.print("You have reached floor 2");break; 
					 case 0: for(int k=3;k>1;k--) {
						 Waitfunction();System.out.print("You are now in floor- "+(k-1)+"\n");
					 }System.out.print("You have reached ground floor"+"\n");break;
						 }//switch
					 }//third floor
	 if(number==4) {
			System.out.println("Enter the floor number that you want to go:");
			choice=s.nextInt();
	    	switch(choice) {
					 case 5: 
						 Waitfunction();
						 System.out.print("You've reached 5th floor"+"\n");break;
					 case 2:
						 for(int k=4;k>3;k--) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k-1)+"\n");
						 }Waitfunction();System.out.print("You've reached 2nd floor"+"\n");break;
					 case 1:
						 for(int k=4;k>2;k--) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k-1)+"\n");
						 }Waitfunction();System.out.print("You've reached 1st floor"+"\n");break;
					case 3:Waitfunction();
					 System.out.print("You have reached floor 3");break; 
					 case 0: for(int k=4;k>1;k--) {
						 Waitfunction();System.out.print("You are now in floor- "+(k-1)+"\n");
					 }System.out.print("You have reached ground floor "+"\n");break;
						 }//switch
					 }//4th floor	
	 if(number==5) {
			System.out.println("Enter the floor number that you want to go:");
			choice=s.nextInt();
	    	switch(choice) {
					 case 4: 
						 Waitfunction();
						 System.out.print("You've reached 4th floor"+"\n");break;
					 case 3:
						 for(int k=5;k<4;k--) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k-1)+"\n");
						 }Waitfunction();System.out.print("You've reached 3rd floor"+"\n");break;
					 case 2:
						 for(int k=5;k>3;k--) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k-1)+"\n");
						 }Waitfunction();System.out.print("You've reached 2nd floor"+"\n");break;
					case 1:
						 for(int k=5;k>1;k--) {
							 Waitfunction();
							 System.out.print("You are now in floor-"+(k-1)+"\n");
						 }Waitfunction();System.out.print("You've reached 1st floor"+"\n");break;
					 case 0: for(int k=5;k>1;k--) {
						 Waitfunction();
						 System.out.print("You are now in floor-"+(k-1)+"\n");
					 }Waitfunction();System.out.print("You've reached ground floor"+"\n");break;
						 }
			}
		}
		
	

	private static void Waitfunction() {
		
		 try
		 {
		     Thread.sleep(1000); // Sleep for one second
		 }
		 catch (InterruptedException e)
		 {
		     Thread.currentThread().interrupt();
		 	 }	
	}//main	 
}//class


