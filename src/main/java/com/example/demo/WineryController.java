package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/winery")
public class WineryController {
    @Autowired
    WineryRepository wineryRepository;

    @GetMapping("/")
    List<Winery> getAll() {
        return wineryRepository.findAll();
    }

    @GetMapping("/{id}")
    Winery getSingle(@PathVariable Integer id) throws Exception {
        return wineryRepository.findById(id).orElseThrow(()->new Exception("Not found"));
    }
}
