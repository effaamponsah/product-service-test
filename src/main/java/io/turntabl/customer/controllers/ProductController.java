package io.turntabl.customer.controllers;


import io.swagger.annotations.Api;
import io.turntabl.customer.logging.Log;
import io.turntabl.customer.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class ProductController {

    @PostMapping("/add")
    public String addProduct(@RequestBody Product p ){
        p.setProduct_id(1);
        p.setProductName(p.getProductName());
        String name = p.getProductName();
        Log.sendMessage(p.getProductName());
        return  name;
    }
}
