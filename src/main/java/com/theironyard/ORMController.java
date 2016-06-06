package com.theironyard;

import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Taylor on 5/27/16.
 */


@Controller
public class ORMController {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    PurchaseRepository purchaseRepository;

    @PostConstruct
    public void init() {

        try {
            Scanner scanCustomer = new Scanner(new File("customers.csv")).useDelimiter(",");

            String firstCustLine = scanCustomer.nextLine();

            while (scanCustomer.hasNext()) {
                String textLine = scanCustomer.nextLine();
                String[] splitLine = textLine.split(",");

                Customer customer = new Customer();
                customer.setName(splitLine[0]);
                customer.setEmail(splitLine[1]);

                System.out.println(customer);
                customerRepository.save(customer);

            }
            scanCustomer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        try {
            Scanner scanPurchase = new Scanner(new File("purchases.csv")).useDelimiter(",");

            String firstPurcLine = new String(scanPurchase.nextLine());

            while (scanPurchase.hasNext()) {
                String textLine = scanPurchase.nextLine();
                String[] splitLine = textLine.split(",");

                Purchase purchase = new Purchase();
                purchase.setId(Integer.valueOf(splitLine[0]));
                purchase.setDate(splitLine[1]);
                purchase.setCredit_card(splitLine[2]);
                purchase.setCvv(Integer.valueOf(splitLine[3]));
                purchase.setCategory(splitLine[4]);

                System.out.println(purchase);
                purchaseRepository.save(purchase);
            }
            scanPurchase.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homeRoute(Model model, String name, String email) {


        /*
        List<Customer> customers = c;

        if(customers != null){
            for(Customer customer : customers){
                customerArrayList.add(customer);
            }
        }

                model.addAttribute("name", customerArrayList);
                model.addAttribute("email", customers);
            return "home";
        */

        }
        /*
        Iterable<Purchase> purchases = purchaseRepository.findAll();

        model.addAttribute("name", session.getAttribute("name"));

        model.addAttribute("email", session.getAttribute("email"));

        model.addAttribute("email", session.getAttribute("email"));

*/


}
