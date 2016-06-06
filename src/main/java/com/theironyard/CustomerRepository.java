package com.theironyard;

import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Taylor on 5/27/16.
 */                                                      //generic
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
