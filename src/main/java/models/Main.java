package models;

public class Main {

    public static void main(String[] args) {

        User user1=new User(1L,"user1","alibaba");
        User user2=new User(2L,"user2","humfalumpy");
        User user3=new User(3L,"user3","stumilowylas");

        Product product1 = new Product(1l,"odzież sportowa",99.99d,150f,"czarny",100);
        Product product2 = new Product(2l,"odzież robocza",39.99d,450f,"niebieski",500);

        Cloth stanikSportowy = new Cloth(1l, "stanik sportowy", 45.99d, 20f, "pink", 35,"S","lycra");

        Boots butyDOBiegania = new Boots(1l,"buty do biegania", 129.99d, 200f,"white",120,38,false);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(stanikSportowy.toString());
        System.out.println(butyDOBiegania.toString());



    }
}
