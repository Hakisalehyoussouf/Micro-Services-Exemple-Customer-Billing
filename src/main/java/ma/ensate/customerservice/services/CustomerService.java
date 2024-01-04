package ma.ensate.customerservice.services;

import ma.ensate.customerservice.dto.CustomerRequestDTO;
import ma.ensate.customerservice.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {

    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);

    CustomerResponseDTO getCustomer(String id);
    List<CustomerResponseDTO> listCustomers();
}
