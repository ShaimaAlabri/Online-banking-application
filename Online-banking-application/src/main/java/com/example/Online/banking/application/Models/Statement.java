package com.example.Online.banking.application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String statementType;
    @ManyToOne
    @JoinColumn(name = "Customer_id",referencedColumnName = "id")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "Account_id",referencedColumnName = "id")
    Account account;

}
