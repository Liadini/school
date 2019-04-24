package welcomemessage;

/*
*
*	This simple class prints out a message to the screen welcoming the user.
*
*	Example:
*	Welcome to my program, intelligent and attractive user!
*
*
*/

public class WelcomeTester {


	// Tests welcome messages
	public static void main (String[] args) {

		WelcomeMessage m1 = new WelcomeEnglish();
		WelcomeMessage m2 = new WelcomeSpanish();
		WelcomeMessage m3 = new WelcomeFrench();
		WelcomeMessage m4 = new WelcomeItalian();

		printWelcomeMessage(m1);
		printWelcomeMessage(m2);
		printWelcomeMessage(m3);
		printWelcomeMessage(m4);

	}

	// Prints welcome message
	public static void printWelcomeMessage(WelcomeMessage msg) {
		System.out.println(msg.getWelcomeMessage());
	}


}






