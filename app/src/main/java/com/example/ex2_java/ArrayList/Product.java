package com.example.ex2_java.ArrayList;

import java.util.ArrayList;

public class Product {
    int code;
    String name;
    double price;

    public Product(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }
}
class ProductManager{
    ArrayList<Product>PL=new ArrayList<>();

    public  void addProduct(Product product){
        PL.add(product);
    }
    public void removeProduct(int code){
        Product PR =null;
        for (Product product :PL){
            if (product.getCode()==code){
                PR=product;
                break;
            }
        }
        if (PR!=null){
            PL.remove(PR);
            System.out.println("code"+code+"deleted");
        }
        else System.out.println("nop");
    }
    public void displayAllProducts(){
        if (PL.isEmpty()){
            System.out.println("is empty");
        }else {
            for (Product product:PL){
                System.out.println("code : "+product.code+" , name :"+product.name +" , PRICE :"+ product.price);
            }
        }
    }
    public void findProductByCode(int code){
        boolean found = false;
        for (Product product :PL){
            if (product.getCode()==code){
                System.out.println("code"+code+" found");
                found=true;
                break;
            }
        }if (!found){
            System.out.println("not found");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        ProductManager pr =new ProductManager();
        pr.addProduct(new Product(1,"hp",2527));
        pr.addProduct(new Product(2,"samsung",4352));
        pr.addProduct(new Product(3,"lenovo",2500));

        System.out.println("list product :");
        pr.displayAllProducts();
        System.out.println("---------------------------");

        System.out.println("find product");
        pr.findProductByCode(3);

        System.out.println("---------------------------");
        System.out.println("remove product");
        pr.removeProduct(1);

        System.out.println("---------------------------");
        System.out.println("list product");
        pr.displayAllProducts();


    }

}
