package com.sambit.Controller;

import com.sambit.Dto.DataAccessObject;
import com.sambit.Dto.GetResponse;
import com.sambit.Dto.GetResponseList;
import com.sambit.Entity.Customer;
import com.sambit.Repository.CustomerRepository;
import com.sambit.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/SaveProduct")
    public Customer saveProduct(@RequestBody DataAccessObject dataAccessObject){
        return customerRepository.save(dataAccessObject.getCustomer());
    }
    @GetMapping("/ShowAllCustomers")
    public List<Customer> showAllCustomers(){
        return customerRepository.findAll();
    }
    @GetMapping("/ShowNames")
    public List<GetResponse> showNames(){
        return customerRepository.showNames();
    }
    @GetMapping("ShowAllProductsByCustomer")
    public List<GetResponseList> showAllProducts(){
        return customerRepository.showAllProduct();
    }
}
