package com.campus.restaurant.booking.repository;

import com.campus.restaurant.booking.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table,Integer> {
}
