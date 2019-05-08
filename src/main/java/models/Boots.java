package models;

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, double price, float weight, String color, int productCount, int size, boolean isNaturalSkin){
        super(id, productName,price,weight,color,productCount);
        this.size=size;
        this.isNaturalSkin=isNaturalSkin;
    }

    public int  getSize(){
        return size;
    }
    public  boolean isNaturalSkin(){return isNaturalSkin;}

    public String toString(){
        return super.toString()+ "Produkt ten to buty o rozmiarze "+size+ ". Czy są one z naturalnej skóry: "+isNaturalSkin;
    }

}
