package sn.isi.controller;

import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sn.isi.entity.HistoriqueEntity;
import sn.isi.entity.MyNewResponse;
import sn.isi.entity.SearchItem;
import sn.isi.service.DayFinderService;
import sn.isi.service.HistoriqueService;

@RestController
@RequestMapping("/services/calendar")
public class CalendarController {

    @Autowired
    private DayFinderService dayFinderService;

    public CalendarController(DayFinderService dayFinderService) {
        this.dayFinderService = dayFinderService;
    }

    @Autowired
    private HistoriqueService historiqueService;

    @GetMapping("/dayfinder")
    public ResponseEntity<MyNewResponse> getDayOfWeek(@RequestParam String date) {
        String dayOfWeek = dayFinderService.getDayOfWeek(date);

        // Enregistrer la recherche dans la base de données
        HistoriqueEntity entry = new HistoriqueEntity();
        entry.setSearchDate(LocalDateTime.now());
        SearchItem searchItem = new SearchItem();
        searchItem.setRequest(date);
        searchItem.setResponse(date + " " + dayOfWeek);
        entry.setSearchItems(searchItem);
        historiqueService.saveSearch(entry);

        return ResponseEntity.ok(new MyNewResponse(date, dayOfWeek));
    }
}
