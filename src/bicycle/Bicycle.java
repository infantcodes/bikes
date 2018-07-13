
package bicycle;


public class Bicycle {
// Data member
    private String ownerName;
    private String tagNo;
    private int priceTag;
    //Consructor:Initializes the data member
    public Bicycle(){
        ownerName="unknown";
        tagNo ="tagg";
        priceTag= 000;
    }
    //Returns name of bicycle owner
    public String getOwnerName(){
        return ownerName;
    }
    //Returns the tag number
    public String getTagNo(){
        return tagNo;
       
    }
    //Return the value of the bicycle price
    public int getPriceTag(){
        return priceTag;
    }
    //Assigns the name of the bicycle owner
    public void setOwnerName(String name){
        ownerName=name;
    }
    //Assigns a tag to the tagNo
    public void setTagNo(String tag){
        tagNo= tag;         
    }
    //Assign the priceTag of the bicycle
    public void setPriceTag(int price){
        priceTag=price;
    }
}
