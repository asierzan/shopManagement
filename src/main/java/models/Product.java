package models;

public class Product {

    private Long id;
    private String productName;
    private double price;
    private float weight;
    private String color;
    private int produtCount;


    public Product(Long id, String productName, double price, float weight, String color, int productCount) {
        this.id=id;
        this.productName=productName;
        this.price=price;
        this.weight= weight;
        this.color= color;
        this.produtCount=productCount;
    }

    public Long getId(){
        return id;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public float getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
    public int getProdutCount(){
        return produtCount;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public void setProdutCount(int produtCount){
        this.produtCount=produtCount;
    }

    public String toString(){
        return "Produkt o id "+id+" to "+productName+ " kosztuje "+price+ "ma wagę "+weight+" kg i kolor "+color+", a jego ilość to "+produtCount+ " szttuk.";
    }
}
