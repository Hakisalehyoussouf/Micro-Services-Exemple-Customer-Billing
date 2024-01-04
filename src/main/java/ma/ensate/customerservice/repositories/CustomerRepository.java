package ma.ensate.customerservice.repositories;

import ma.ensate.customerservice.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String > {
}
