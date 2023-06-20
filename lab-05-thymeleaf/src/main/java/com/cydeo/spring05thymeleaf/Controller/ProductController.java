package com.cydeo.spring05thymeleaf.Controller;

import com.cydeo.spring05thymeleaf.model.Product;
import com.cydeo.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String getList(Model model){

        model.addAttribute("productList", productService.listProduct());


        return "/product/list";
    }

    @GetMapping("/create-form")

    public String createForm(Model model){

  model.addAttribute("product", new Product());


        return "/product/create-product";
    }

    @PostMapping("/create-product")

    public String createProduct(@ModelAttribute ("product") Product product){

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getRemainingQuantity());

        productService.productCreate(product);

        return "redirect:/list";
    }



}
