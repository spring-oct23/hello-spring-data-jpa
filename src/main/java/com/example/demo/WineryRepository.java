package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WineryRepository extends JpaRepository<Winery,Integer> {
    
}
