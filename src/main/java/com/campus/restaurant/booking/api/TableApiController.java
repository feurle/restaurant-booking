package com.campus.restaurant.booking.api;

import com.campus.restaurant.booking.model.Table;
import com.campus.restaurant.booking.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TableApiController {

    @Autowired
    private TableRepository tableRepository;

    /**
     *  url: http://localhost:8080/api/table/1
     */
    @GetMapping("/api/table/{id}")
    public Table getOneTable(@PathVariable("id") Integer id) {
        Optional<Table> ot = tableRepository.findById(id);
        if (ot.isPresent()) {
            return ot.get();
        } else {
            return new Table();
        }
    }


}
