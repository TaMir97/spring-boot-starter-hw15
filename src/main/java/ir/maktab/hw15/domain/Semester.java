package ir.maktab.hw15.domain;

import ir.maktab.hw15.base.BaseEntity;
import ir.maktab.hw15.domain.enums.Season;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import java.time.Year;

@Entity
public class Semester extends BaseEntity<Long> {

    private Season season;

    private Integer year;

    public Semester(Season season, Integer year) {
        this.season = season;
        this.year = year;
    }

    public Semester() {

    }

    @PrePersist
    private void prePersist() {
        year = Year.now().getValue();
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public Integer getYear() {
        return year;
    }
}
