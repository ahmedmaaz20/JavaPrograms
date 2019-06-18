import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    String name, gender, city, FathersName;
    int age;

    void getInfo(){
         name = sc.nextLine();
         gender = sc.nextLine();
         city = sc.nextLine();
         FathersName = sc.nextLine();
         age = sc.nextInt();
    }

    void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);
        System.out.println("Father's Name: "+FathersName);


    }
    public static void main(String args[]){

        Employee e = new Employee();
        e.getInfo();
        e.printInfo();
    }
}
