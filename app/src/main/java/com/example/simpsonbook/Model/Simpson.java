package com.example.simpsonbook.Model;

import java.io.Serializable;

public class Simpson implements Serializable {

    private String name;
    private String job;
    private int pictureInt;

    public Simpson(String name, String job, int pictureInt) {
        this.name = name;
        this.job = job;
        this.pictureInt = pictureInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPictureInt() {
        return pictureInt;
    }

    public void setPictureInt(int pictureInt) {
        this.pictureInt = pictureInt;
    }
}
