package app.services;



import org.springframework.data.jpa.repository.JpaRepository;

import app.data.Customer;

public class CustomerRepository extends JpaRepository<Customer, String> {
    
}
