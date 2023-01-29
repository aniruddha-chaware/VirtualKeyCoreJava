package virtualkey;

import virtualkey.screens.WelcomeScreen;

public class VirtualKeyApplication {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}