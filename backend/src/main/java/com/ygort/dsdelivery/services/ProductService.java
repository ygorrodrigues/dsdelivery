package com.ygort.dsdelivery.services;

import com.ygort.dsdelivery.dto.ProductDTO;
import com.ygort.dsdelivery.entities.Product;
import com.ygort.dsdelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());
    }

}
