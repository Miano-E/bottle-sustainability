package com.bottle.sustainability.Controller;

import com.bottle.sustainability.Entity.BottleEvent;
import com.bottle.sustainability.Service.BottleEventService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bottle-event")
public class BottleEventController {
    private final BottleEventService bottleEventService;

    public BottleEventController(BottleEventService bottleEventService) {
        this.bottleEventService=bottleEventService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BottleEvent createBottleEvent(@RequestBody BottleEvent bottleEvent) {
        return bottleEventService.saveBottleEvent(bottleEvent);
    }
}
