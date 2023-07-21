package com.rodrigo.productapi.resources;

import com.rodrigo.productapi.dto.StatusDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {


    @GetMapping
    public ResponseEntity status() {
        return ResponseEntity.ok().body(new StatusDTO("Working!", HttpStatus.OK));
    }

}
