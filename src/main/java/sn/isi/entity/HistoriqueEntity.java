package sn.isi.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historique")
public class HistoriqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "search_date", nullable = false)
    private LocalDateTime searchDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "search_item_id", referencedColumnName = "id")
    private SearchItem searchItems;

    public LocalDateTime getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(LocalDateTime searchDate) {
        this.searchDate = searchDate;
    }

    public SearchItem getSearchItems() {
        return searchItems;
    }

    public void setSearchItems(SearchItem searchItems) {
        this.searchItems = searchItems;
    }
}
