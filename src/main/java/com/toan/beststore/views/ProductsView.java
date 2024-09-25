package com.toan.beststore.views;

import com.toan.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsView extends JpaRepository<Product, Integer> {
}
