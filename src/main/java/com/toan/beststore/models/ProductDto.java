package com.toan.beststore.models;

import jakarta.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;


public class ProductDto {
    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Brand is required")
    private String brand;

    @NotEmpty(message = "Category is required")
    private String category;

    @Min(0)
    private double price;

    @Size(min=10, message = "Description must be at least 10 characters")
    @Size(max=2000, message = "Description must be less than 1000 characters")
    private String description;

    private MultipartFile imageFile;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for imageFile
    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}