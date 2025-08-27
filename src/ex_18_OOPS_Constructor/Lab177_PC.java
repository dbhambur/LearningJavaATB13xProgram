package ex_18_OOPS_Constructor;



public class Lab177_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);


        BabyA b3 = new BabyA("lucky","23456245",2025,06,01);
        BabyA b4 = new BabyA("Amit","200046245",2025,06,01);
        System.out.println(b3.name);
        System.out.println(b4.name);
    }
}

class BabyA {

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    BabyA(){
        name = "Gugu";
        aadhar_number ="000";
        year = 1971;
        month = 12;
        day = 1;

    }

    BabyA(String user_name,String aadhar_number_user, int year_user, int month_user, int day_user) {
        this.name = user_name;
        this.aadhar_number = aadhar_number;
        this.year = year;
        this.month = month;
        this.day = day_user;
    }
}
