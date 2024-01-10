package ma.ensate.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {

    @Id
    private  String id;
    private  String name;
    private String email;
}
