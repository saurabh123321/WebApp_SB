package com.example.SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.SplittableRandom;

@Component
@Entity
public class Product {
    @Id
    private int prdId;
    private String prdName;
    private int prize;

    public Product(){

    }
    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getPrdName() {
        return prdName;
    }

    public Product(int prdId, String prdName, int prize) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prdId=" + prdId +
                ", prdName='" + prdName + '\'' +
                ", prize=" + prize +
                '}';
    }
}
