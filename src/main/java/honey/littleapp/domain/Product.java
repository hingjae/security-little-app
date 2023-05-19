package honey.littleapp.domain;

import honey.littleapp.domain.enums.Currency;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String price;
    @Enumerated(EnumType.STRING) private Currency currency;
}
