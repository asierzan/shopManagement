package models;

public class Cloth extends Product {
    private String size;
    private String material;

    public Cloth(Long id, String productName, double price, float weight, String color, int productCount,String size, String material){
        super(id, productName,price,weight,color,productCount);
        this.size=size;
        this.material=material;
    }

    public String getSize(){
        return size;
    }
    public String getMaterial(){
        return material;
    }

    public String toString(){
        return super.toString()+" Produkt ten to ubranie o rozmiarze "+size+ " wykonane z materiału "+ material;
    }


}
