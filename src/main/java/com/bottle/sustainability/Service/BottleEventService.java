package com.bottle.sustainability.Service;

import com.bottle.sustainability.Entity.BottleEvent;
import com.bottle.sustainability.Repository.BottleEventRepository;
import org.springframework.stereotype.Service;

@Service
public class BottleEventService {
    private final BottleEventRepository bottleEventRepository;

    public BottleEventService(BottleEventRepository bottleEventRepository) {
        this.bottleEventRepository = bottleEventRepository;
    }

    public BottleEvent saveBottleEvent(BottleEvent bottleEvent) {
        return bottleEventRepository.save(bottleEvent);
    }
}
