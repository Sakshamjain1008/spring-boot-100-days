package com.example.day03.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")

public class EmployeeEntity
{
         @Id
         @GeneratedValue(strategy=GenerationType.AUTO)

         private Long id;
         private String name;
         private String email;
         private Integer age;
         @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
         private LocalDate dateOfJoining;
         private Boolean isActive;

}
