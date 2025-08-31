package ex_20_OOPs_Polymorphisim_methodOverloading;

public class Web_Automation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
    }
}

class Browser{

    void startBrowser(){
        System.out.println("Starting a default browser");
    }

    String startBrowser (String browser){
        System.out.println("Starting browser " + browser);
        return browser;
    }
}
