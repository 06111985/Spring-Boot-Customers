package com.ultragaz.customer.domain;

import java.math.BigInteger;

public class Customer {
    private Long id;
    private int customer_id;
    private String code;
    private String nome;

    public Customer(Long id, int customer_id, String code, String nome) {
        this.id = id;
        this.customer_id = customer_id;
        this.code = code;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
