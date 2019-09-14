package DeliverableOne;
import java.util.Scanner;
public class Eat {
	public static void main (String [] args) {
	     Scanner scnr = new Scanner(System.in);

	     String eventType;
	     int partySize;
	     String food;
	     String result;
	     
	     System.out.println("What event type do you plan on hosting: ");
	     eventType = scnr.next();
	     System.out.println("How many people are you expecting: ");
	     partySize = scnr.nextInt();
	    		 
	     if(eventType.equals("casual") && partySize == 1) {
	    	 System.out.println("Since you’re hosting a casual event for 1 participants, you should serve sandwhiches\r\n" + 
	    	 		"prepared in your microwave.");
	     }
	     
	     else if(eventType.equals("casual") && partySize >= 2 && partySize <= 12) {
	    	 System.out.println("Since you’re hosting a casual event for " + partySize + " participants, you should serve sandwhiches\r\n" + 
		    	 		"prepared in your kitchen.");
	     }
	     
	     else if(eventType.equals("casual") && partySize >= 13) {
	    	 System.out.println("Since you’re hosting a casual event for " + partySize + " participants, you should serve sandwhiches\r\n" + 
		    	 		"prepared by a caterer.");
	     }
	     
	     else if(eventType.equals("semi-formal") && partySize == 1) {
	    	 System.out.println("Since you’re hosting a semi-formal event for 1 participants, you should serve fried chicken\r\n" + 
	    	 		"prepared in your microwave.");
	     }
	     
	     else if(eventType.equals("semi-formal") && partySize >= 2 && partySize <= 12) {
	    	 System.out.println("Since you’re hosting a semi-formal event for " + partySize + " participants, you should serve fried chicken\r\n" + 
		    	 		"prepared in your kitchen.");
	     }
	     
	     else if(eventType.equals("semi-formal") && partySize >= 13) {
	    	 System.out.println("Since you’re hosting a semi-formal event for " + partySize + " participants, you should serve fried chicken\r\n" + 
		    	 		"prepared by a caterer.");
	     }
	     
	     else if(eventType.equals("formal") && partySize == 1) {
	    	 System.out.println("Since you’re hosting a formal event for 1 participants, you should serve chicken parmesan\r\n" + 
	    	 		"prepared in your microwave.");
	     }
	     
	     else if(eventType.equals("formal") && partySize >= 2 && partySize <= 12) {
	    	 System.out.println("Since you’re hosting a formal event for " + partySize + " participants, you should serve chicken parmesan\r\n" + 
		    	 		"prepared in your kitchen.");
	     }
	     
	     else if(eventType.equals("formal") && partySize >= 13) {
	    	 System.out.println("Since you’re hosting a formal event for " + partySize + " participants, you should serve chicken parmesan\r\n" + 
		    	 		"prepared by a caterer.");
	     }
	     
	     else {
	    	 System.out.println(" Error, please enter casual, semi-formal or formal for your event type.");
	     }
	          
	}

	private static String scnrInt() {
		// TODO Auto-generated method stub
		return null;
	}
}
