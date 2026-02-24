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

         PolicyHolder holder = new PolicyHolder(first_Name, last_Name, age, smoking_Status, height, weight);
         Policy policy = new Policy(policy_Number, provider_Name, holder);
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
         System.out.println(p);
         System.out.println();
      }

      System.out.println("There were " + Policy.getNumberOfPolicies() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

   }
}
