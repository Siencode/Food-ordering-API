package io.siencode.resource.employee.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Shift")
public class ShiftEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String range;
}
