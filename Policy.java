/**
 * represents an insurance policy with policyholder information.
 */
public class Policy{

   private int policy_Number;
   private String provider_Name;
   private PolicyHolder policyHolder;

   private static int numberOfPolicies = 0;

   private final int POLICY_BASE_FEE = 600;
   private final int AGE_50_BASE_FEE = 75;
   private final int SMOKER_BASE_FEE = 100;

   /**
    * no-arg constructor that initializes a Policy with default values.
    */
   public Policy(){
      this.policy_Number = 0;
      this.provider_Name = "";
      this.policyHolder = new PolicyHolder();
      numberOfPolicies++;
   }

   /**
    * Constructor that accepts arguments for each field.
    * @param policy_Number the policy number
    * @param provider_Name the provider name
    * @param policyHolder the PolicyHolder associated with this policy
    */
   public Policy(int policy_Number, String provider_Name, PolicyHolder policyHolder){
      this.policy_Number = policy_Number;
      this.provider_Name = provider_Name;
      this.policyHolder = new PolicyHolder(policyHolder);
      numberOfPolicies++;
   }

   /**
    * Gets the policy number.
    * @return the policy number
    */
   public int get_Policy_Number(){
      return this.policy_Number;
   }

   /**
    * Gets the provider name.
    * @return the provider name
    */
   public String get_Provider_Name(){
      return this.provider_Name;
   }

   /**
    * Gets a copy of the PolicyHolder associated with this policy.
    * @return a copy of the PolicyHolder
    */
   public PolicyHolder get_PolicyHolder(){
      return new PolicyHolder(this.policyHolder);
   }

   /**
    * Sets the policy number.
    * @param policy_Number the policy number to set
    */
   public void set_Policy_Number(int policy_Number){
      this.policy_Number = policy_Number;
   }

   /**
    * Sets the provider name.
    * @param provider_Name the provider name to set
    */
   public void set_Provider_Name(String provider_Name){
      this.provider_Name = provider_Name;
   }

   /**
    * Sets the PolicyHolder associated with this policy.
    * @param policyHolder the PolicyHolder to set
    */
   public void set_PolicyHolder(PolicyHolder policyHolder){
      this.policyHolder = new PolicyHolder(policyHolder);
   }

   /**
    * Gets the number of Policy objects that have been created.
    * @return the number of Policy objects created
    */
   public static int getNumberOfPolicies(){
      return numberOfPolicies;
   }

   /**
    * Calculates and returns the price of the policy.
    * @return the price of the policy
    */
   public double get_Policy_Price(){
      double price = POLICY_BASE_FEE;
      double bMI = policyHolder.get_BMI();

      if(policyHolder.get_Age() > 50){
         price += AGE_50_BASE_FEE;
      }
      if(policyHolder.get_Smoking_Status().equalsIgnoreCase("smoker")){
         price += SMOKER_BASE_FEE;
      }
      if(bMI > 35){
         price += (bMI - 35) * 20;
      }

      return price;
   }

   /**
    * Returns a String representation of the Policy.
    * @return a String containing the policy information
    */
   public String toString(){
      return String.format("Policy Number: %d\n" +
                           "Provider Name: %s\n" +
                           "%s\n" +
                           "Policy Price: $%.2f",
                           policy_Number, provider_Name,
                           policyHolder.toString(), get_Policy_Price());
   }
}
