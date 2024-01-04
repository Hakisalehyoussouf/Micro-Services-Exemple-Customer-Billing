package ma.ensate.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDTO {

    @Id
    private  String id;
    private  String name;
    private String email;
}
