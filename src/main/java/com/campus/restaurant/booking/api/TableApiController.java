package com.campus.restaurant.booking.api;

import com.campus.restaurant.booking.model.Table;
import com.campus.restaurant.booking.repository.TableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Table.
 */
@RestController
@RequestMapping("/api")
public class TableApiController {

    private final Logger log = LoggerFactory.getLogger(TableApiController.class);

    @Autowired
    private TableRepository tableRepository;


    /**
     * This resource creates a new table.
     * POST resource: http://localhost:8080/api/tables
     *
     * @param table the table to create.
     * @return the created table as JSON.
     */
    @PostMapping("/tables")
    public Table createTable(@RequestBody Table table) {
        log.debug("REST request to save table : {}", table);
        return tableRepository.save(table);
    }

    /**
     * This resource updates the table.
     * PUT resource: http://localhost:8080/api/tables
     *
     * @param table the table to update.
     * @return the updated table as JSON.
     */
    @PutMapping("/tables/{id}")
    public Table updateTable(@PathVariable("id") Integer id, @RequestBody Table table) {
        log.debug("REST request to update table : {}", table);
        return tableRepository.save(table);
    }

    /**
     * This resource gets a table by id.
     * GET resource: http://localhost:8080/api/tables/1
     *
     * @param id the id of the table to retrieve.
     * @return the table as JSON.
     */
    @GetMapping("/tables/{id}")
    public Table getOneTable(@PathVariable("id") Integer id) {
        log.debug("REST request to get table : {}", id);
        return tableRepository.getOne(id);
    }

    /**
     * This resource deletes a table by id.
     * DELETE resource: http://localhost:8080/api/tables/1
     *
     * @param id the id to delete.
     */
    @DeleteMapping("/tables/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTable(@PathVariable("id") Integer id) {
        log.debug("REST request to delete table : {}", id);
        tableRepository.deleteById(id);
    }

    /**
     * This resource gets all tables.
     * GET resource: http://localhost:8080/api/tables
     *
     * @return a list of tables.
     */
    @GetMapping("/tables")
    public List<Table> getAllTables() {
        log.debug("REST request to get all tables");
        return tableRepository.findAll();
    }

}
