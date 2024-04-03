package sn.isi.repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;
import sn.isi.service.DayFinderService;

@Service
public class DayFinderServiceImpl implements DayFinderService {

    @Override
    public String getDayOfWeek(String date) {
        // Convertir la date en format String en un objet Date
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        // Déterminer le jour de la semaine
        String dayOfWeek = localDate.getDayOfWeek().toString();

        return dayOfWeek;
    }
}
