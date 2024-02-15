package com.example.ex2_java.ArrayList;

public class Employee {
    int id;
    String nom;
    double Sm;

    public Employee(int id, String nom, double Sm) {
        this.id = id;
        this.nom = nom;
        this.Sm = Sm;
    }
    public double augmenter(){

        Sm*=0.1;
        return Sm;
    }
    public void afficher(){
        System.out.println("nom "+nom);
        System.out.println("id "+id);
        System.out.println("Sm "+Sm);
    }

}
class Main{
    public static void main(String [] args){
        Employee employee=new Employee(1,"youssef",3453.88);
        employee.augmenter();
        employee.afficher();
    }
}
