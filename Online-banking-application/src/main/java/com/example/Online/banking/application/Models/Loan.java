package com.example.Online.banking.application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String loanType;
    Integer loanAmount;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    Customer customer;
}
