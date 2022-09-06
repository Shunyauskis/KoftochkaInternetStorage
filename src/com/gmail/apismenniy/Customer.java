package com.gmail.apismenniy;

public class Customer extends User implements Buying{
    public Customer() {

    }

    public Customer(int id, String name, String email, long phone) {
        super(id, name, email, phone);
    }
}
