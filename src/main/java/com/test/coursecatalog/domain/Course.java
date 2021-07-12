package com.test.coursecatalog.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "jhi_courses")
public class Course extends AbstractAuditingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "date")
    private Instant date;

    @NotNull
    @Column(name = "duration", length = 140)
    private String duration;

    @NotNull
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 400)
    private String description;

    @NotNull
    @Column(name = "teacher", length = 30)
    private String teacher;

    @Column(name = "price")
    private Integer price;

    @NotNull
    @Column(name = "inscribed")
    private boolean inscribed;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isInscribed() {
        return inscribed;
    }

    public void setInscribed(boolean inscribed) {
        this.inscribed = inscribed;
    }
}
