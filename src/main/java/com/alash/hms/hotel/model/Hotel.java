package com.alash.hms.hotel.model;

import com.alash.hms.employee.model.Employee;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@Table(name = "hotel")
@RequiredArgsConstructor
public class Hotel {


    @Id
    @SequenceGenerator(
            name = "hotel_sequence",
            sequenceName = "hotel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "hotel_sequence"
    )
    private Long id;
    @Column(name = "hotel_name", nullable = false)
    private String hotelName;
    @OneToMany
    private Employee[] noOfEmployees = new Employee[20];
}
