package com.javamypackage.orm.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars_parts")
public class CarsParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Part part;

    @ManyToOne
    private Car car;

    public CarsParts() {
    }

    public CarsParts(Part part, Car car) {
        this.part = part;
        this.car = car;
    }

    @Override
    public String toString() {
        return "CarsParts{" +
                "id=" + id +
                ", part=" + part +
                ", car=" + car +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
