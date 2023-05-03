package com.alash.hms.employee.model;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Table(name = "employee")
@Entity
@RequiredArgsConstructor
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "employee_sequence"
    )
    private Long employeeId;
    @NonNull
    private String employeeName;
    private Long employeeSalary;

}
