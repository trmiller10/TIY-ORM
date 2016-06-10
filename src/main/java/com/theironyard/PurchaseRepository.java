package com.theironyard;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Taylor on 5/27/16.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    List<Purchase> findByCategory(String category);
}
