package com.theironyard;

import javax.persistence.*;

/**
 * Created by Taylor on 5/27/16.
 */

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;
    @Column
    private String email;

    public Customer(){}

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
