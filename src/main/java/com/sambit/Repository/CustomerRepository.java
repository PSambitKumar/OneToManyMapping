package com.sambit.Repository;

import com.sambit.Dto.GetResponse;
import com.sambit.Dto.GetResponseList;
import com.sambit.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.sambit.Dto.GetResponse(customer.cname, product.pname) FROM Customer customer JOIN customer.productList product")
    public List<GetResponse> showNames();

    @Query("SELECT new com.sambit.Dto.GetResponseList(customer.cname, product.pname, product.qty, product.price) FROM Customer as customer JOIN customer.productList as product")
    public List<GetResponseList> showAllProduct();

}
