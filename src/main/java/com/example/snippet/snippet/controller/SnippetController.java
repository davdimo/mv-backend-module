package com.example.snippet.snippet.controller;

import com.example.snippet.snippet.model.Snippet;
import com.example.snippet.snippet.service.SnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/snippets")
public class SnippetController {

    @Autowired
    private SnippetService snippetService;

    @PostMapping
    public Snippet addSnippet(@RequestBody Snippet snippet) {
        return snippetService.saveSnippet(snippet);
    }

    @GetMapping
    public List<Snippet> getAllSnippets() {
        return snippetService.getAllSnippets();
    }

    @GetMapping("/{id}")
    public Snippet getSnippetById(@PathVariable Long id) {
        return snippetService.getSnippetById(id);
    }

    @GetMapping(params = "lang")
    public List<Snippet> getSnippetsByLanguage(@RequestParam("lang") String language) {
        return snippetService.getSnippetsByLanguage(language);
    }
}
