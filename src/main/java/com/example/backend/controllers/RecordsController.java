package com.example.backend.controllers;

import com.example.backend.dtos.GymRecordDto;
import com.example.backend.services.RecordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecordsController {
    private final RecordsService recordsService;

    @GetMapping("/gym/records")
    public ResponseEntity<List<GymRecordDto>>allRecords(){
        return ResponseEntity.ok(recordsService.allRecords());
    }
}