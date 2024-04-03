package sn.isi.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.entity.HistoriqueEntity;

@Repository
public interface HistoriqueService extends JpaRepository<HistoriqueEntity, Long> {
    void saveSearch(HistoriqueEntity entry);

    List<HistoriqueEntity> findAllSearches();
}
