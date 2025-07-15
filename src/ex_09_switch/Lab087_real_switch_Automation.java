package ex_09_switch;

import java.util.Scanner;

public class Lab087_real_switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("starting the firefox browser");
                break;

            case "edge" :
                System.out.println("starting the edge browser");
                break;

            default:
                System.out.println("I have no idea which browser is this");
        }

    }
}
