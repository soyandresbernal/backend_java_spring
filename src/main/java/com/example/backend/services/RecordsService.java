package com.example.backend.services;

import com.example.backend.dtos.GymRecordDto;
import com.example.backend.repositories.GymRecordsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecordsService {
    private final GymRecordsRepository gymRecordsRepository;
    public List<GymRecordDto>allRecords() {
        return Arrays.asList(
                new GymRecordDto(1L,"Bench press",130),
                new GymRecordDto(1L,"Squat",140)
        );
    }
}
