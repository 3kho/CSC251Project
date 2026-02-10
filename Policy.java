/**
 * represents an insurance policy with policyholder information.
 */
public class Policy{

  private int policy_Number;
  private String provider_Name;
  private String policyholder_First_Name;
  private String policyholder_Last_Name;
  private int policyholder_Age;
  private String policyholder_Smoking_Status;
  private double policyholder_Height;
  private double policyholder_Weight;

  private final int POLICY_BASE_FEE = 600;
  private final int AGE_50_BASE_FEE = 75;
  private final int SMOKER_BASE_FEE = 100;

  /**
   * no-arg constructor that initializes a Policy with default values.
   */
  public Policy(){
    this.policy_Number = 0;
    this.provider_Name = "";
    this.policyholder_First_Name = "";
    this.policyholder_Last_Name = "";
    this.policyholder_Age = 0;
    this.policyholder_Smoking_Status = "non-smoker";
    this.policyholder_Height = 0.0;
    this.policyholder_Weight = 0.0;
  }

  /**
   * Constructor that accepts arguments for each field.
   * @param policy the policy number
   * @param provider the provider name
   * @param first_Name the policyholder's first name
   * @param last_Name the policyholder's last name
   * @param age the policyholder's age
   * @param is_Smoker the policyholder's smoking status ("smoker" or "non-smoker")
   * @param height the policyholder's height in inches
   * @param weight the policyholder's weight in pounds
   */
  public Policy(int policy, String provider, String first_Name, String last_Name, int age, String is_Smoker, double height, double weight){
    this.policy_Number = policy;
    this.provider_Name = provider;
    this.policyholder_First_Name = first_Name;
    this.policyholder_Last_Name = last_Name;
    this.policyholder_Age = age;
    this.policyholder_Smoking_Status = is_Smoker;
    this.policyholder_Height = height;
    this.policyholder_Weight = weight;
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
   * Gets the policyholder's first name.
   * @return the policyholder's first name
   */
  public String get_Policyholder_First_Name(){
    return this.policyholder_First_Name;
  }

  /**
   * Gets the policyholder's last name.
   * @return the policyholder's last name
   */
  public String get_Policyholder_Last_Name(){
    return this.policyholder_Last_Name;
  }

  /**
   * Gets the policyholder's age.
   * @return the policyholder's age
   */
  public int get_Policyholder_Age(){
    return this.policyholder_Age;
  }

  /**
   * Gets the policyholder's smoking status.
   * @return the policyholder's smoking status
   */
  public String get_Policyholder_Smoking_Status(){
    return this.policyholder_Smoking_Status;
  }

  /**
   * Gets the policyholder's height in inches.
   * @return the policyholder's height
   */
  public double get_Policyholder_Height(){
    return this.policyholder_Height;
  }

  /**
   * Gets the policyholder's weight in pounds.
   * @return the policyholder's weight
   */
  public double get_Policyholder_Weight(){
    return this.policyholder_Weight;
  }

  /**
   * Sets the policy number.
   * @param policy the policy number to set
   */
  public void set_Policy_Number(int policy){
    this.policy_Number = policy;
  }

  /**
   * Sets the provider name.
   * @param provider the provider name to set
   */
  public void set_Provider_Name(String provider){
    this.provider_Name = provider;
  }

  /**
   * Sets the policyholder's first name.
   * @param first the first name to set
   */
  public void set_Policyholder_First_Name(String first){
    this.policyholder_First_Name = first;
  }

  /**
   * Sets the policyholder's last name.
   * @param last the last name to set
   */
  public void set_Policyholder_Last_Name(String last){
    this.policyholder_Last_Name = last;
  }

  /**
   * Sets the policyholder's age.
   * @param age the age to set
   */
  public void set_Policyholder_Age(int age){
    this.policyholder_Age = age;
  }

  /**
   * Sets the policyholder's smoking status.
   * @param is_Smoker the smoking status to set ("smoker" or "non-smoker")
   */
  public void set_Policyholder_Smoking_Status(String is_Smoker){
    this.policyholder_Smoking_Status = is_Smoker;
  }

  /**
   * Sets the policyholder's height.
   * @param height the height in inches to set
   */
  public void set_Policyholder_Height(double height){
    this.policyholder_Height = height;
  }

  /**
   * Sets the policyholder's weight.
   * @param weight the weight in pounds to set
   */
  public void set_Policyholder_Weight(double weight){
    this.policyholder_Weight = weight;
  }

  /**
   * Calculates and returns the policyholder's BMI.
   * @return the policyholder's BMI
   */
  public double get_Policyholder_BMI(){
    double bMI = (this.policyholder_Weight * 703) / (this.policyholder_Height * this.policyholder_Height);
    return bMI;
  }

  /**
   * Calculates and returns the price of the policy.
   * @return the price of the policy
   */
  public double get_Policy_Price(){
    double price = POLICY_BASE_FEE;
    double bMI = this.get_Policyholder_BMI();

    if(this.policyholder_Age > 50){
      price += AGE_50_BASE_FEE;
    }
    if(this.policyholder_Smoking_Status.equalsIgnoreCase("smoker")){
      price += SMOKER_BASE_FEE;
    }
    if(bMI > 35){
      price += (bMI - 35) * 20;
    }

    return price;
  }

}
