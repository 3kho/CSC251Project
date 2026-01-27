import java.util.Scanner;

public class Project_John_Doe{

  public static void main(String[] args){

    int policy_Number = 0;
    String provider_Name = "";
    String policyholder_First_Name = "";
    String policyholder_Last_Name = "";
    int policyholder_Age = 0;
    String policyholder_Smoking_Status = "";
    double policyholder_Height = 0.0;
    double policyholder_Weight = 0.0;

    String smoker_Status;
    double john_bMI;
    double john_Policy_Price;

    Scanner console = new Scanner(System.in);

    System.out.println("Please enter the Policy Number: ");
    policy_Number = console.nextInt();
    console.nextLine();

    System.out.println("Please enter the Provider Name: ");
    provider_Name = console.nextLine();

    System.out.println("Please enter the Policyholder's First Name: ");
    policyholder_First_Name = console.nextLine();

    System.out.println("Please enter the Policyholder's Last Name: ");
    policyholder_Last_Name = console.nextLine();

    System.out.println("Please enter the Policyholder's Age: ");
    policyholder_Age = console.nextInt();
    console.nextLine();

    System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
    policyholder_Smoking_Status = console.nextLine();

    System.out.println("Please enter the Policyholder's Height (in inches): ");
    policyholder_Height = console.nextDouble();

    System.out.println("Please enter the Policyholder's Weight (in pounds): ");
    policyholder_Weight = console.nextDouble();

    Policy john = new Policy(policy_Number, provider_Name, policyholder_First_Name, policyholder_Last_Name, policyholder_Age, policyholder_Smoking_Status, policyholder_Height, policyholder_Weight);

    john_bMI = john.get_Policyholder_BMI();

    john_Policy_Price = john.get_Policy_Price();

    System.out.println("\nPolicy Number: " + john.get_Policy_Number());
    System.out.println("Provider Name: " + john.get_Provider_Name());
    System.out.println("Policyholder's First Name: " + john.get_Policyholder_First_Name());
    System.out.println("Policyholder's Last Name: " + john.get_Policyholder_Last_Name());
    System.out.println("Policyholder's Age: " + john.get_Policyholder_Age());
    System.out.println("Policyholder's Smoking Status: " + john.get_Policyholder_Smoking_Status());
    System.out.println("Policyholder's Height: " + john.get_Policyholder_Height() + " inches");
    System.out.println("Policyholder's Weight: " + john.get_Policyholder_Weight() + " pounds");
    System.out.printf("Policyholder's BMI: %.2f%n", john.get_Policyholder_BMI());
    System.out.printf("Policy Price: $%.2f%n", john.get_Policy_Price());

  }
}
