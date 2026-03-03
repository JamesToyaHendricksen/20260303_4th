package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @GetMapping
    public String list(Model model) {
        List<TodoItem> todoList = List.of(
                new TodoItem(1L, "Set up Spring Boot", "Done"),
                new TodoItem(2L, "Create controller", "In Progress"),
                new TodoItem(3L, "Build list screen", "Not Started"));

        model.addAttribute("todoList", todoList);
        return "todo/list";
    }

    public record TodoItem(Long id, String title, String status) {
    }
}