package ex_18_OOPS_Constructor;

public class Lab178_PC_Real
{
    public static void main(String[] args) {
        Person p1 = new Person ("AMIT",975552,"abc");

        Person p2 = new Person ("Sudhir",975412,"xyz");

        System.out.println(p1.name);
    }
}

class Person {

    String name;
    long phone;
    String address;

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;

    }

}
