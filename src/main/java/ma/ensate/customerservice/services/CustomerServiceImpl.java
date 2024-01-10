package ma.ensate.customerservice.services;

import ma.ensate.customerservice.dto.CustomerRequestDTO;
import ma.ensate.customerservice.dto.CustomerResponseDTO;
import ma.ensate.customerservice.entites.Customer;
import ma.ensate.customerservice.mappers.CustomerMapper;
import ma.ensate.customerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private  final CustomerRepository customerRepository;
    private  final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {

        Customer customer = customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer saveCustomer = customerRepository.save(customer);

        CustomerResponseDTO customerResponseDTO = customerMapper.customerToCustomerResponseDTO(saveCustomer);

        return  customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {


        return null;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {

        Customer customer = customerRepository.findById(id).get();
        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {

        List<Customer> customers = customerRepository.findAll();

        List<CustomerResponseDTO> customerResponseDTOS = customers
                .stream()
                .map(customer -> customerMapper.customerToCustomerResponseDTO(customer))
                .collect(Collectors.toList());
        return customerResponseDTOS;
    }
}
