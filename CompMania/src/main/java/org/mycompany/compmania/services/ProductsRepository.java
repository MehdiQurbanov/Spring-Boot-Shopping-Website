package org.mycompany.compmania.services;

import org.mycompany.compmania.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
