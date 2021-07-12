package com.test.coursecatalog.service.dto;

import com.test.coursecatalog.domain.Course;
import java.time.Instant;

public class CoursesDTO {

    private long id;
    private Instant date;
    private String duration;
    private String name;
    private String description;
    private String teacher;
    private int price;
    private boolean inscribed;

    public CoursesDTO(Course course) {
        this.id = course.getId();
        this.date = course.getDate();
        this.duration = course.getDuration();
        this.name = course.getName();
        this.description = course.getDescription();
        this.teacher = course.getTeacher();
        this.price = course.getPrice();
        this.inscribed = course.isInscribed();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInscribed() {
        return inscribed;
    }

    public void setInscribed(boolean inscribed) {
        this.inscribed = inscribed;
    }
}
