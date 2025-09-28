package com.bottle.sustainability.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Bottle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "material")
    private String material;

    @Column(name="capacity_ml")
    private int capacityMl;

    @Column(name = "color")
    private String color;

    @Column(name = "created_date")
    private String createdDate;

    @OneToMany(mappedBy = "bottle")
    private List<BottleEvent> bottleEvent;

    protected Bottle() {}

    public Bottle(String material, String createdDate) {
        this.material = material;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacityMl() {
        return capacityMl;
    }

    public void setCapacityMl(int capacityMl) {
        this.capacityMl = capacityMl;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "id=" + id +
                ", material='" + material + '\'' +
                ", capacityMl=" + capacityMl +
                ", color='" + color + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", bottleEvent=" + bottleEvent +
                '}';
    }
}
