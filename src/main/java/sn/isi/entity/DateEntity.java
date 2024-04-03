package sn.isi.entity;

import jakarta.persistence.*;

@Entity
public class DateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String dayOfWeek;

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DateEntity() {}

    public DateEntity(String date, String dayOfWeek) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }
}
