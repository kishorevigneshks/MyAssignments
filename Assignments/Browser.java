package Assignments;

public class Browser {

	public void launchbrowser() {
		System.out.println("Browser launched successfully");
	}

	public void loadurl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// syntax:classname objectname =new classname();
		Browser chrome = new Browser();
		// syntax:objectname.methodname();
		chrome.launchbrowser();
		chrome.loadurl();
	}
}
