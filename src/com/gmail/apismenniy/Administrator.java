package com.gmail.apismenniy;

public class Administrator extends User implements Selling, Delivering {
    public Administrator() {
    }

    public Administrator(int id, String name, String email, long phone) {
        super(id, name, email, phone);
    }

}
