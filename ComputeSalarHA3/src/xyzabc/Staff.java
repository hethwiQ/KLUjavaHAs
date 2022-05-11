package xyzabc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
abstract class Staff {
    String name; int ID;
    static class TeachingStaff extends Staff
    {
        double allowance;
        double basic;
        double salary;
        double hra;
        public void accept() throws IOException{
            System.out.println("Enter the Name,id,basic ,Hra and allowance charges: ");
            Scanner sc=new Scanner(System.in);
            name=sc.next();
            ID=sc.nextInt();
            basic=sc.nextDouble();
            hra=sc.nextDouble();
            allowance=sc.nextDouble();

            salary=basic + hra* 20 /basic *100 + allowance;

        }
        public void display()
        {
            System.out.println("Name: "+name);
            System.out.println("ID: "+ID);
            System.out.println("Salary: "+salary);
        }

    }
    static class NonTeachingStaff extends Staff{
        int hoursworked,hourlywage;
        int salary;
        public void accept() throws IOException{
            System.out.println("Enter name,Id, hours worked and hourly wage: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Scanner sc=new Scanner(System.in);
            name=sc.next();
            ID=sc.nextInt();
            hoursworked=sc.nextInt();
            hourlywage=sc.nextInt();
            salary=hoursworked*hourlywage;

        }
        public void display()
        {
            System.out.println("Name: "+name);
            System.out.println("ID: "+ID);
            System.out.println("Salary: "+salary);
        }
    }

}
