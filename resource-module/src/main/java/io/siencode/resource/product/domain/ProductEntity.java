package io.siencode.resource.product.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String productName;
    String price;
    String description;
    @ManyToOne
    @JoinColumn(name = "PRODUCTGROUP_ID", referencedColumnName = "id")
    ProductGroupEntity group;
}
