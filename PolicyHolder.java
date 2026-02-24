/**
 * Represents a person associated with an insurance policy.
 */
public class PolicyHolder{

   private String first_Name;
   private String last_Name;
   private int age;
   private String smoking_Status;
   private double height;
   private double weight;

   /**
    * No-arg constructor that initializes a PolicyHolder with default values.
    */
   public PolicyHolder(){
      this.first_Name = "";
      this.last_Name = "";
      this.age = 0;
      this.smoking_Status = "non-smoker";
      this.height = 0.0;
      this.weight = 0.0;
   }

   /**
    * Constructor that accepts arguments for each field.
    * @param first_Name the policyholder's first name
    * @param last_Name the policyholder's last name
    * @param age the policyholder's age
    * @param smoking_Status the policyholder's smoking status ("smoker" or "non-smoker")
    * @param height the policyholder's height in inches
    * @param weight the policyholder's weight in pounds
    */
   public PolicyHolder(String first_Name, String last_Name, int age, String smoking_Status, double height, double weight){
      this.first_Name = first_Name;
      this.last_Name = last_Name;
      this.age = age;
      this.smoking_Status = smoking_Status;
      this.height = height;
      this.weight = weight;
   }

   /**
    * Copy constructor for creating a deep copy of a PolicyHolder.
    * @param other the PolicyHolder to copy
    */
   public PolicyHolder(PolicyHolder other){
      this.first_Name = other.first_Name;
      this.last_Name = other.last_Name;
      this.age = other.age;
      this.smoking_Status = other.smoking_Status;
      this.height = other.height;
      this.weight = other.weight;
   }

   /**
    * Gets the policyholder's first name.
    * @return the first name
    */
   public String get_First_Name(){
      return this.first_Name;
   }

   /**
    * Gets the policyholder's last name.
    * @return the last name
    */
   public String get_Last_Name(){
      return this.last_Name;
   }

   /**
    * Gets the policyholder's age.
    * @return the age
    */
   public int get_Age(){
      return this.age;
   }

   /**
    * Gets the policyholder's smoking status.
    * @return the smoking status
    */
   public String get_Smoking_Status(){
      return this.smoking_Status;
   }

   /**
    * Gets the policyholder's height in inches.
    * @return the height
    */
   public double get_Height(){
      return this.height;
   }

   /**
    * Gets the policyholder's weight in pounds.
    * @return the weight
    */
   public double get_Weight(){
      return this.weight;
   }

   /**
    * Sets the policyholder's first name.
    * @param first_Name the first name to set
    */
   public void set_First_Name(String first_Name){
      this.first_Name = first_Name;
   }

   /**
    * Sets the policyholder's last name.
    * @param last_Name the last name to set
    */
   public void set_Last_Name(String last_Name){
      this.last_Name = last_Name;
   }

   /**
    * Sets the policyholder's age.
    * @param age the age to set
    */
   public void set_Age(int age){
      this.age = age;
   }

   /**
    * Sets the policyholder's smoking status.
    * @param smoking_Status the smoking status to set ("smoker" or "non-smoker")
    */
   public void set_Smoking_Status(String smoking_Status){
      this.smoking_Status = smoking_Status;
   }

   /**
    * Sets the policyholder's height.
    * @param height the height in inches to set
    */
   public void set_Height(double height){
      this.height = height;
   }

   /**
    * Sets the policyholder's weight.
    * @param weight the weight in pounds to set
    */
   public void set_Weight(double weight){
      this.weight = weight;
   }

   /**
    * Calculates and returns the policyholder's BMI.
    * @return the policyholder's BMI
    */
   public double get_BMI(){
      return (this.weight * 703) / (this.height * this.height);
   }

   /**
    * Returns a String representation of the PolicyHolder.
    * @return a String containing the policyholder's information
    */
   public String toString(){
      return String.format("Policyholder's First Name: %s\n" +
                           "Policyholder's Last Name: %s\n" +
                           "Policyholder's Age: %d\n" +
                           "Policyholder's Smoking Status (Y/N): %s\n" +
                           "Policyholder's Height: %.1f inches\n" +
                           "Policyholder's Weight: %.1f pounds\n" +
                           "Policyholder's BMI: %.2f",
                           first_Name, last_Name, age, smoking_Status,
                           height, weight, get_BMI());
   }
}
