package ex_29_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {
        Mobile iPhone = new Mobile (1,"iPhone 16", 120000.0);
        Mobile samsung = new Mobile (2,"ultra24", 1350000.0);

        iPhone.setPrice(20000.29);
        iPhone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();
    }
}

class Mobile extends OldPhone{

    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Mobile(Integer phone, String name, Double price){
        this.phone = phone;
        this.name = name;
        this.price = price;

    }

    void display(){
        System.out.println(this.name+this.phone+this.price);
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane Mode");
    }

    void priceChange(Integer price){
        System.out.println("Change price in integers");
    }

    void priceChange(Double price){
        System.out.println("change price in decimals");
    }

    @Override
    void calling() {
        System.out.println("dialpad -> touch dialpad now!!");
    }
}

class OldPhone implements SIMCard{

    void calling(){
        System.out.println("dialpad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card entered");

    }
}

enum Covers{
    red("red_pokeman"),
    blue("red_pokeman");
    private String color;
    Covers(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;

    }
}

interface SIMCard{
    void enterCard();
}
