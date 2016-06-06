package com.theironyard;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;

/**
 * Created by Taylor on 5/27/16.
 */

@Entity
@Table(name = "purchases")
public class Purchase {
    //customer_id,date,credit_card,cvv,category
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String date;
    @Column
    private String credit_card;
    @Column
    private int cvv;
    @Column
    private String category;
    //@ManyToOne
    //Customer customer = new Customer();

    public Purchase() {}

    public Purchase(int id, String date, String credit_card, int cvv, String category/*, Customer customer*/) {
        this.date = date;
        this.credit_card = credit_card;
        this.cvv = cvv;
        this.category = category;
        //this.customer = customer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   /* public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }*/

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
