package ex_28_ENUM;

public enum Locators {
    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private String locators;

    Locators(String Locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;


    }
}
