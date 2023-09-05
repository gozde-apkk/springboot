package com.library.springboot.LibraryApplications.entity;

public class Library {

    private Collective collective;



    public Library(Collective collective) {

        this.collective = collective;
    }

    public Collective getCollective() {
        return collective;
    }

    public void setCollective(Collective collective) {
        this.collective = collective;
    }



}
