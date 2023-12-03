package com.programmerpoints.department.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(nullable = false)
    private String departmentName;
    @Column(nullable = false)
    private  String departmentAddress;
    @Column(nullable = false)
    private String departmentCode;
}
