package com.SIvanovskis.datortehnika.controller;

import com.SIvanovskis.datortehnika.model.DatTeh;
import com.SIvanovskis.datortehnika.services.DatTehService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class DatTehController {
    @Autowired
    private final DatTehService datTehService;

    public DatTehController(DatTehService datTehService) {
        this.datTehService = datTehService;
    }
    @PostMapping("/Datortehnika")
    public DatTeh createDatTeh(@RequestBody DatTeh datTeh){
        return datTehService.createDatTeh(datTeh);
    }
}
