package com.example.ex2_java.reg2023;

import android.annotation.SuppressLint;

import java.time.LocalDate;
import java.time.Period;

public class Employe {
    String matricule,nom,prenom;
    LocalDate dn,de;
    double salaire;

    public Employe(String matricule,String prenom,String nom,LocalDate dn ,LocalDate de,double salaire){
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.dn=dn;
        this.de=de;
        this.salaire=salaire;
    }

    @SuppressLint("NewApi")
    public int Age(){
        return (Period.between(dn,LocalDate.now()).getYears());
    }
    @SuppressLint("NewApi")
    public int Anciennete(){
        return (Period.between(de,LocalDate.now()).getYears());
    }
    public double AugmentationDuSalaire(){
        //double sal=0.0;
        if (Anciennete()<5){
            salaire*=1.02;
        } else if (Anciennete()<10) {
            salaire*=1.05;
        }else salaire*=1.1;
        return salaire;
    }
    public void Afficher(){
        System.out.println("le matricule : " + matricule);
        System.out.println(" le nom : "+nom.toUpperCase() + "Prenom : " + prenom.toUpperCase().charAt(0)+prenom.substring(1));
        System.out.println(" Age : "+ Age());
        System.out.println(" Anciennete : "+ Anciennete());
        System.out.println(" Salaire :" +AugmentationDuSalaire());
    }
    public static void main(String[] args) {

        LocalDate dn1 =LocalDate.of(2003,9,25);

        LocalDate dn2 =LocalDate.of(2011,3,25);
        Employe employe=new Employe("QB123 ","felate ","soufyane ",dn1,dn2,84677.99);
        employe.Afficher();

    }
}
