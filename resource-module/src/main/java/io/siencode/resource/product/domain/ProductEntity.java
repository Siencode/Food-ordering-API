package io.siencode.resource.product.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String productName;
    String price;
    @ManyToOne
    @JoinColumn(name = "PRODUCTGROUP_ID", referencedColumnName = "id")
    private ProductGroupEntity group;
}
