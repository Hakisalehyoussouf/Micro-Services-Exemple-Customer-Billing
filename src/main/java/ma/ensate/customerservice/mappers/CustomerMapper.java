package ma.ensate.customerservice.mappers;


import ma.ensate.customerservice.dto.CustomerRequestDTO;
import ma.ensate.customerservice.dto.CustomerResponseDTO;
import ma.ensate.customerservice.entites.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);


}
