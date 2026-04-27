package com.ibsu.quiz1.dto;

import java.util.Objects;

public class ProductStats {
    private String category;
    private Double averagePrice;

    public ProductStats(String category, Double averagePrice) {
        this.category = category;
        this.averagePrice = averagePrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductStats that = (ProductStats) o;
        return Objects.equals(category, that.category) && Objects.equals(averagePrice, that.averagePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, averagePrice);
    }
}
