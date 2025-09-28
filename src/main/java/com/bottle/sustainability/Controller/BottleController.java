package com.bottle.sustainability.Controller;

import com.bottle.sustainability.Entity.Bottle;
import com.bottle.sustainability.Service.BottleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bottle")
public class BottleController {
    private final BottleService bottleService;

    public BottleController(BottleService bottleService) {
        this.bottleService = bottleService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bottle createBottle(@RequestBody Bottle bottle) {
        return bottleService.saveBottle(bottle);
    }

}
