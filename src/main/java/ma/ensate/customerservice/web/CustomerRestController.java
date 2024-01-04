package ma.ensate.customerservice.web;


import ma.ensate.customerservice.dto.CustomerRequestDTO;
import ma.ensate.customerservice.dto.CustomerResponseDTO;
import ma.ensate.customerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
//@RequestMapping(path = "/api")
public class CustomerRestController {
    private  final CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping(path = "/customers")
    public List<CustomerResponseDTO> allCustommers(){

        return  customerService.listCustomers();
    }

    @PostMapping(path = "/customers")
    public CustomerResponseDTO save(@RequestBody  CustomerRequestDTO customerRequestDTO){
        customerRequestDTO.setId(UUID.randomUUID().toString());
        return customerService.save(customerRequestDTO);
    }

    @GetMapping(path = "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }


}


