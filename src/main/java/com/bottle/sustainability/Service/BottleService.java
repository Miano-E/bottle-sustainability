package com.bottle.sustainability.Service;

import com.bottle.sustainability.Entity.Bottle;
import com.bottle.sustainability.Repository.BottleRepository;
import org.springframework.stereotype.Service;

@Service
public class BottleService {
    private final BottleRepository bottleRepository;

    public BottleService(BottleRepository bottleRepository) {
        this.bottleRepository = bottleRepository;
    }

    public Bottle saveBottle(Bottle bottle) {
        return bottleRepository.save(bottle);
    }

}
