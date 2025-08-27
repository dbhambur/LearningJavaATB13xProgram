package ex_18_OOPS_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }


}

class Baby{
    // Attribute | Instance variable | Member variables, data members
    String name;

    // Default Constructor!

    Baby(){
        System.out.println("I am called, Default constructor!");
        System.out.println("Your Aadhar number is ready");

        // Fetch data from the MySQL Database.....
        // Read from CSV File, XLSX
        // Open a file and read a data. (json, testdata.xslx, txt file)
    }


}
