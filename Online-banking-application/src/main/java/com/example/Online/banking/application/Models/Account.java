package com.example.Online.banking.application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            Integer id;
    Integer accountNumber;
    Float availableBalance;
    @ManyToOne
    @JoinColumn(name = "Customer_ID", referencedColumnName = "id")
    Customer customer;

}
