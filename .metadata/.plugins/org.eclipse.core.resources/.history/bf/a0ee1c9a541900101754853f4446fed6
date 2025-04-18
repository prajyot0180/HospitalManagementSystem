package com.prajyot.hms.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions", schema = "public")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionid")
    private Integer transactionId;

    @ManyToOne
    @JoinColumn(name = "billid", referencedColumnName = "billid", foreignKey = @ForeignKey(name = "transactions_billid_fkey"))
    private Billing billing;

    @Column(name = "amountpaid", nullable = false, precision = 10, scale = 2)
    private BigDecimal amountPaid;

    @Column(name = "paymentdate", nullable = false)
    private LocalDate paymentDate;

    @Column(name = "paymentmode", nullable = false)
    private String paymentMode;

    // Getters and Setters

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
