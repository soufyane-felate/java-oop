package com.example.ex2_java;

import java.util.Objects;
import java.util.concurrent.CancellationException;

public class Article {

    String code, designation, categorie;
    double prix;

    public Article(String code, String designation, String categorie, double prix) throws CategorieInvalidExecption {
        if (!categorie.equals("Informatique") || !categorie.equals("Bureautique")) {
            throw new CancellationException("categorie invalid");
        }
        this.code = code;
        this.designation = designation;
        this.categorie = categorie;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Article {" +
                "code =" + code +
                ",desingnation=" + designation + '\'' +
                ",categorie=" + categorie + '\'' +
                ",prix=" + prix +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Article)) return false;
        Article article = (Article) obj;
        return Double.compare(article.prix, prix) == 0 && code.equals(article.code)
                && designation.equals(article.designation) &&
                categorie.equals(article.categorie);
    }

    class CategorieInvalidExecption extends Exception {
        public CategorieInvalidExecption(String message) {
            super(message);
        }
    }


}

class ArticleEnSold extends Article {
    double remise;

    public ArticleEnSold(String code, String designation, String categorie, Double prix, double remise) throws Article.CategorieInvalidExecption {
        super(code, designation, categorie, prix);
        this.remise = remise;

    }

    public double getPrix() {
        return super.getPrix();
    }

}
