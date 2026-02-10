import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Project_John_Doe{
  // 26SP-CSC251-N803 - Code to verify b908d03d-25d1-40cc-978a-d28121ab9549

  public static void main(String[] args) throws IOException{

    ArrayList<Policy> policies = new ArrayList<Policy>();
    int smokerCount = 0;
    int nonSmokerCount = 0;

    File file = new File("PolicyInformation.txt");
    Scanner inputFile = new Scanner(file);

    while(inputFile.hasNext()){
      int policy_Number = Integer.parseInt(inputFile.nextLine().trim());
      String provider_Name = inputFile.nextLine().trim();
      String first_Name = inputFile.nextLine().trim();
      String last_Name = inputFile.nextLine().trim();
      int age = Integer.parseInt(inputFile.nextLine().trim());
      String smoking_Status = inputFile.nextLine().trim();
      double height = Double.parseDouble(inputFile.nextLine().trim());
      double weight = Double.parseDouble(inputFile.nextLine().trim());

      Policy policy = new Policy(policy_Number, provider_Name, first_Name, last_Name, age, smoking_Status, height, weight);
      policies.add(policy);

      if(smoking_Status.equalsIgnoreCase("smoker")){
        smokerCount++;
      }
      else{
        nonSmokerCount++;
      }

      if(inputFile.hasNext()){
        inputFile.nextLine();
      }
    }

    inputFile.close();

    for(Policy p : policies){
      System.out.println("Policy Number: " + p.get_Policy_Number());
      System.out.println("Provider Name: " + p.get_Provider_Name());
      System.out.println("Policyholder's First Name: " + p.get_Policyholder_First_Name());
      System.out.println("Policyholder's Last Name: " + p.get_Policyholder_Last_Name());
      System.out.println("Policyholder's Age: " + p.get_Policyholder_Age());
      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.get_Policyholder_Smoking_Status());
      System.out.println("Policyholder's Height: " + p.get_Policyholder_Height() + " inches");
      System.out.println("Policyholder's Weight: " + p.get_Policyholder_Weight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f%n", p.get_Policyholder_BMI());
      System.out.printf("Policy Price: $%.2f%n", p.get_Policy_Price());
      System.out.println();
    }

    System.out.println("The number of policies with a smoker is: " + smokerCount);
    System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

  }
}
