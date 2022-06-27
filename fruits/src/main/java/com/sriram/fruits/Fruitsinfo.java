package com.sriram.fruits;

import org.springframework.data.annotation.Id;

public class Fruitsinfo {
    private String fruitName;
    @Id
    private String fruitId;

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitId() {
        return fruitId;
    }

    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    public Fruitsinfo(String fruitName, String fruitId) {
        this.fruitName = fruitName;
        this.fruitId = fruitId;
    }

    @Override
    public String toString() {
        return "Fruitsinfo{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitId='" + fruitId + '\'' +
                '}';
    }
}
