package org.example.petukhovdavt211lab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_account")
public class CreditAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private String bankName;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private Integer numberOfMonths;

    @Column(nullable = false)
    private Integer loanAmount;

    @Column(nullable = false)
    private Integer monthlyPayment;

    @Column(nullable = false)
    private Float interestRate;

    @ManyToOne
    private Employee issuingEmployee;

    @ManyToOne
    private PaymentAccount paymentAccount;

}
