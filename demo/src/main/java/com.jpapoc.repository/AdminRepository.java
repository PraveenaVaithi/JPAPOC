package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AdminRepository extends CrudRepository<Employee,Integer> {


}
