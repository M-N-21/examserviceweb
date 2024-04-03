package sn.isi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.isi.entity.HistoriqueEntity;
import sn.isi.service.HistoriqueService;

@RestController
@RequestMapping("/services/historique")
public class HistoriqueController {

    @Autowired
    private HistoriqueService historiqueService;

    @GetMapping("/all")
    public ResponseEntity<List<HistoriqueEntity>> getAllSearches() {
        List<HistoriqueEntity> searches = historiqueService.findAllSearches();
        return ResponseEntity.ok(searches);
    }
}
