package com.bottle.sustainability.Repository;

import com.bottle.sustainability.Entity.BottleEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BottleEventRepository extends JpaRepository<BottleEvent, Long> {
}
