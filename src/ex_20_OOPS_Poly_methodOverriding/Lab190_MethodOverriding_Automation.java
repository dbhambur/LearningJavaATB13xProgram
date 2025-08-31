package ex_20_OOPS_Poly_methodOverriding;

import Single_Inheritance.CommonToALL;

public class Lab190_MethodOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();
    }

}

 class CommonToAll{
    void openBrowser(){
        System.out.println("starting IE Browser!!");
    }
 }

 class ChromeTC extends CommonToALL{

     void openBrowser(){
        System.out.println("starting Chrome Browser");
    }
 }
class FireFox extends CommonToALL {

    void openBrowser() {
        System.out.println("FireFox will start");
    }
}
