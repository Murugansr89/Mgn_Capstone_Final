package com.simplilearn.FoodBox.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.FoodBox.model.Customer;

@Repository()
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
