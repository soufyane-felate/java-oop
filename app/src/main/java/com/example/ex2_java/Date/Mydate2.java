package com.example.ex2_java.Date;

public class Mydate2 {
    int day,month,year;
    public Mydate2(int day , int month ,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return day+" / "+month+" / "+year+" / ";
    }
    public void Afficher(){
        System.out.println("day : "+day+" month : "+month+ " year : "+ year);
    }
    public boolean isBissextile(){
        return year % 4 ==0 && year%100!=0;
    }



}
class Main1{
    public static void main(String[] args) {
        Mydate2 mydate1=new Mydate2(25,9,2000);
        Mydate2 mydate2=new Mydate2(25,9,2020);
        Mydate2 mydate3=new Mydate2(25,9,1977);
        mydate1.Afficher();
        mydate2.Afficher();
        mydate3.Afficher();
        boolean a1=mydate3.isBissextile();
        boolean a=mydate1.isBissextile();
        boolean a2=mydate2.isBissextile();
        System.out.println(" isBissextile ? "+ a1);
        System.out.println(" isBissextile ? "+ a2);
        System.out.println(" isBissextile ? "+ a);

    }
}