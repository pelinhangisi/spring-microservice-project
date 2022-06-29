package com.pelinhangisi.productservice.service;

import com.pelinhangisi.productservice.dao.ProductRepository;
import com.pelinhangisi.productservice.dto.ProductRequest;
import com.pelinhangisi.productservice.dto.ProductResponse;
import com.pelinhangisi.productservice.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor // ihtiyacımız olan bütün contructor methodlarını arka planda oluşturan anatasyon
@Slf4j // log oluşturmamızı ve info vermemizi sağlayan anatasyon
public class ProductService {

    private final ProductRepository productRepository;

    // product ürününü oluşturup isim, detay ve fiyatını istediğimiz alan.
    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        // aldığımız bilgileri db ye yazdıracağımız alan.
        productRepository.save(product);
        log.info("Product {} is saved", product.getId()); //hangi ürünü kaydettiğimizin bilgisini verir.


    }

    // db den bütün productları okuyabilmek için oluşturulan alan
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        //Lambda methodu ile yazıldı.
        return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
