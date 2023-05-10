package com.example.Online.banking.application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Data
@Table(name = "Account_Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String transactionType;
    Integer receivingAccount;
    @ManyToOne
    @JoinColumn(name = "sender_ID", referencedColumnName ="id")
    Account account;

}
