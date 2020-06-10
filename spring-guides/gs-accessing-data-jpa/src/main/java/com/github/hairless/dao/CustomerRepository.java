package com.github.hairless.dao;

import com.github.hairless.po.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author wangyangting
 * @date 2020-06-10
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    /**
     * fetch data by lastName
     *
     * @param lastName lastName
     * @return List<Customer>
     */
    List<Customer> findByLastName(String lastName);

    /**
     * fetch data by id
     *
     * @param id id
     * @return Customer
     */
    Customer findById(long id);
}
