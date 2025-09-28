package com.bottle.sustainability.Repository;

import com.bottle.sustainability.Entity.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BottleRepository extends JpaRepository<Bottle, Long> {
}
