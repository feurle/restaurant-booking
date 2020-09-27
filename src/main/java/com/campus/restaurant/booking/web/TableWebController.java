package com.campus.restaurant.booking.web;


import com.campus.restaurant.booking.model.Table;
import com.campus.restaurant.booking.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TableWebController {

    @Autowired
    private TableRepository tableRepository;

    /**
     * Initialize an new table to display in an empty html form.
     *
     * @param model the UI model to bind the empty table for the form.
     * @return the html form template for a table submission.
     */
    @GetMapping("/table")
    public String initTableForm(Model model) {
        Table table = new Table();
        model.addAttribute("table",table);
        return "tableForm";
    }

    /**
     * Process the newly table from the html form and store it in the repository.
     *
     * @param table the from the html form to save in the repository.
     * @return an redirect to the list view of all tables.
     */
    @PostMapping("/table")
    public String processTableForm(@ModelAttribute Table table, Model model) {
        tableRepository.save(table);
        return "redirect:/table/all";
    }

    /**
     * Get all tables as a list to view.
     *
     * @param model the UI model to bind the table list.
     * @return the html template to view the table list.
     */
    @GetMapping("/table/all")
    public String viewAllTables(Model model) {
        List<Table> tableList = tableRepository.findAll();
        model.addAttribute("tableList",tableList);
        return "tableList";
    }

    /**
     * Get one table to view it within an html template.
     * url: http://localhost:8080/table/view?id=1
     *
     * @param id the id of the table to retrieve.
     * @param model the UI model to bind the table.
     * @return the html template to view one table.
     */
    @GetMapping("/table/view")
    public String viewOneTable(@RequestParam("id") Integer id, Model model) {
        Table table = tableRepository.getOne(id);
        model.addAttribute("table", table);
        return "tableView";
    }

    /**
     * Delete one table.
     *
     * @param id the id of the table to delete.
     * @return an redirect to the list view of all tables.
     */
    @GetMapping("/table/delete")
    public String deleteOneTable(@RequestParam("id") Integer id) {
        tableRepository.deleteById(id);
        return "redirect:/table/all";
    }
}
