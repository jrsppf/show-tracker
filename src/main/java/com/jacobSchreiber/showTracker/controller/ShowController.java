package com.jacobSchreiber.showTracker.controller;

import com.jacobSchreiber.showTracker.dto.ShowDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/shows")
public class ShowController {
    @GetMapping()
    public ResponseEntity<List<ShowDto>> getShows() {
        ShowDto show = ShowDto.builder()
                .title("My First show title")
                .build();

        List<ShowDto> shows = new ArrayList<>();
        shows.add(show);
        return ResponseEntity.ok(shows);


    }
}
