public class Policy{

  private int policy_Number;
  private String provider_Name;
  private String policyholder_First_Name;
  private String policyholder_Last_Name;
  private int policyholder_Age;
  private boolean policyholder_Smoking_Status;
  private double policyholder_Height;
  private double policyholder_Weight;

  private final int POLICY_BASE_FEE = 600;
  private final int AGE_50_BASE_FEE = 75;
  private final int SMOKER_BASE_FEE = 100;

  public void Policy(){
    this.policy_Number = 0;
    this.provider_Name = "";
    this.policyholder_First_Name = "";
    this.policyholder_Last_Name = "";
    this.policyholder_Age = 0;
    this.policyholder_Smoking_Status = false;
    this.policyholder_Height = 0.0;
    this.policyholder_Weight = 0.0;
  }

  public void Policy(int policy, String provider, String first_Name, String last_Name, int age, boolean is_Smoker, double height, double weight){
    this.policy_Number = policy;
    this.provider_Name = provider;
    this.policyholder_First_Name = first_Name;
    this.policyholder_Last_Name = last_Name;
    this.policyholder_Age = age;
    this.policyholder_Smoking_Status = is_Smoker;
    this.policyholder_Height = height;
    this.policyholder_Weight = weight;
  }

  public int get_Policy_Number(){
    return this.policy_Number;
  }

  public String get_Provider_Name(){
    return this.provider_Name;
  }

  public String get_Policyholder_First_Name(){
    return this.policyholder_First_Name;
  }

  public String get_Policyholder_Last_Name(){
    return this.policyholder_Last_Name;
  }

  public int get_Policyholder_Age(){
    return this.policyholder_Age;
  }

  public boolean get_Policyholder_Smoking_Status(){
    return this.policyholder_Smoking_Status;
  }

  public double get_Policyholder_Height(){
    return this.policyholder_Height;
  }

  public double get_Policyholder_Weight(){
    return this.policyholder_Weight;
  }

  public void set_Policy_Number(int policy){
    this.policy_Number = policy;
  }

  public void set_Provider_Name(String provider){
    this.provider_Name = provider;
  }

  public void set_Policyholder_First_Name(String first){
    this.policyholder_First_Name = first;
  }

  public void set_Policyholder_Last_Name(String last){
    this.policyholder_Last_Name = last;
  }

  public void set_Policyholder_Age(int age){
    this.policyholder_Age = age;
  }

  public void set_Policyholder_Smoking_Status(boolean is_Smoker){
    this.policyholder_Smoking_Status = is_Smoker;
  }

  public void set_Policyholder_Height(double height){
    this.policyholder_Height = height;
  }

  public void set_Policyholder_Weight(double weight){
    this.policyholder_Weight = weight;
  }

  public double get_Policyholder_BMI(){
    double bMI = (this.policyholder_Weight * 703) / (this.policyholder_Height * this.policyholder_Height);
    return bMI;
  }

  public double get_Policy_Price(){
    double price = POLICY_BASE_FEE;
    double bMI = this.get_Policyholder_BMI();

    if(this.policyholder_Age > 50){
      price += AGE_50_BASE_FEE;
    }
    if(this.policyholder_Smoking_Status == true){
      price += SMOKER_BASE_FEE;
    }
    if(bMI > 35){
      price += (bMI - 35) * 20;
    }

    return price;
  }

}
