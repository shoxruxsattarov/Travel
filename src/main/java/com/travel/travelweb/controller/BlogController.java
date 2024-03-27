package com.travel.travelweb.controller;

import com.travel.travelweb.model.Destination;
import com.travel.travelweb.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogRepository blogRepository;

    @GetMapping
    public String destination(Model model) {
        List<Destination> destination = blogRepository.findAll();
        model.addAttribute("destination", destination);
        return "";
    }
}
