package com.assignment;

public class Parrot extends Bird {
	private String says;

    public Parrot() {
        this.says = super.says();
    }

    public Parrot(Says sound) {
        this.says = sound.says();
    }
    
    @Override
    public String says() {
        return says;
    }
}
