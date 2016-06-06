package com.theironyard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TiyOrmApplication.class)
@WebAppConfiguration
public class TiyOrmApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPurchaseParser() {

		try {
			Scanner scanCustomer = new Scanner(new File("customers.csv")).useDelimiter(",");

			String firstCustLine = new String(scanCustomer.nextLine());

			while (scanCustomer.hasNext()) {
				String textLine = scanCustomer.nextLine();
				System.out.println(textLine);
				String[] splitLine = textLine.split(",");

				Customer customer = new Customer();
				customer.setName(splitLine[0]);
				customer.setEmail(splitLine[1]);

			}
		} catch (FileNotFoundException e) {
			System.out.println("WHOOPS");
		}
	}
}

