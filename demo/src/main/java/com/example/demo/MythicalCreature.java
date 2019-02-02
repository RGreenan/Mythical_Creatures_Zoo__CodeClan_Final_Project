package com.example.demo;

import com.example.demo.IEat.IEat;

public abstract class MythicalCreature {
    private Long id;
    private String name;
    private Enum gender;
    private IEat eatBehaviour;
    private Enum originLocation;

    public MythicalCreature(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    public IEat getEatBehaviour() {
        return eatBehaviour;
    }

    public void setEatBehaviour(IEat eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }

    public Enum getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(Enum originLocation) {
        this.originLocation = originLocation;
    }

    public MythicalCreature(Long id, String name, Enum gender, IEat eatBehaviour, Enum originLocation) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.eatBehaviour = eatBehaviour;
        this.originLocation = originLocation;
    }

}
