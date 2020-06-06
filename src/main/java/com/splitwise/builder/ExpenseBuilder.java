package com.splitwise.builder;

import com.splitwise.bo.Expense;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExpenseBuilder {
    private String expenseId;
    private String createdBy;
    private String participantUsers;
    private String message;
    private String currency;
    private double amount;
    private Date createDate;
    private Date expenseDate;
    private String splitRatio;

    public Expense build(){
        return new Expense(this);
    }

    public ExpenseBuilder setExpenseId(String expenseId) {
        this.expenseId = expenseId;
        return this;
    }

    public ExpenseBuilder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ExpenseBuilder setParticipantUsers(String participantUsers) {
        this.participantUsers = participantUsers;
        return this;
    }

    public ExpenseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public ExpenseBuilder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public ExpenseBuilder setAmount(String amount) {
        this.amount = Double.parseDouble(amount);
        return this;
    }

    public ExpenseBuilder setSplitRatio(String splitRatio) {
        this.splitRatio = splitRatio;
        return this;
    }

    public ExpenseBuilder setCreateDate(String createDate) {
        try {
            this.createDate = new SimpleDateFormat("dd/MM/yyyy").parse(createDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ExpenseBuilder setExpenseDate(String expenseDate) {
        try {
            this.expenseDate = new SimpleDateFormat("dd/MM/yyyy").parse(expenseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getParticipantUsers() {
        return participantUsers;
    }

    public String getMessage() {
        return message;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public String getSplitRatio() {
        return splitRatio;
    }

    @Override
    public String toString() {
        return "ExpenseBuilder{" +
                "expenseId='" + expenseId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", participantUsers='" + participantUsers + '\'' +
                ", message='" + message + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", createDate=" + createDate +
                ", expenseDate=" + expenseDate +
                ", splitRatio='" + splitRatio + '\'' +
                '}';
    }
}
