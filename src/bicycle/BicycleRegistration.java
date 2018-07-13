
package bicycle;

public class BicycleRegistration {
    public static void main(String []args){
    Bicycle bike1,bike2;
    String owner1, owner2;
    
    
    bike1 = new Bicycle();// Creates bike1
    bike1.setOwnerName("Adam Smith");//Assigns value to bike1
    bike1.setTagNo("2004-134R");//Assigns value to the tag
    bike1.setPriceTag(100);//Assigns 100 as price tag of the bicycle
   
    
    bike2 = new Bicycle();
    bike2.setOwnerName("Ben Jones");
    bike2.setTagNo("2004-134S");
    bike2.setPriceTag(110);//Assigns 110 as price tag of the bicycle
    
    
    // Output the information
    owner1=bike1.getOwnerName();
    
    owner2= bike2.getOwnerName();
    
    System.out.println(owner1+" "+"owns a bicycle"+" "+"and his bicycle's tag is"+" "+bike1.getTagNo()+".\nThe bicycle price was $"+ bike1.getPriceTag()+"\n");
    System.out.println(owner2+" "+"also owns a bicycle"+" "+"and his bicycle's tag is"+" "+bike2.getTagNo()+".\nThe bicycle price was $"+ bike2.getPriceTag());
    
   }
}
