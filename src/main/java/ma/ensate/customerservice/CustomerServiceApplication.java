package ma.ensate.customerservice;

import ma.ensate.customerservice.dto.CustomerRequestDTO;
import ma.ensate.customerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {

            customerService.save(new CustomerRequestDTO("C1", "haki", "haki@gmail.com"));
            customerService.save(new CustomerRequestDTO("C2", "saleh", "saleh@gmail.com"));
        };
    }

}
