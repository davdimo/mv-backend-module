package com.example.snippet.snippet.service;

import com.example.snippet.snippet.model.Snippet;
import com.example.snippet.snippet.repository.SnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnippetService {

    @Autowired
    private SnippetRepository snippetRepository;

    public Snippet saveSnippet(Snippet snippet) {
        return snippetRepository.save(snippet);
    }

    public List<Snippet> getAllSnippets() {
        return snippetRepository.findAll();
    }

    public Snippet getSnippetById(Long id) {
        return snippetRepository.findById(id).orElse(null);
    }

    public List<Snippet> getSnippetsByLanguage(String language) {
        return snippetRepository.findByLanguage(language);
    }
}
