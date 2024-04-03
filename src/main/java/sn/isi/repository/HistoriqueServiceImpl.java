package sn.isi.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import sn.isi.entity.HistoriqueEntity;
import sn.isi.service.HistoriqueService;

@Service
public class HistoriqueServiceImpl implements HistoriqueService {

    public void saveSearch(HistoriqueEntity entry) {}

    public List<HistoriqueEntity> findAllSearches() {
        return null;
    }

    public void flush() {}

    public <S extends HistoriqueEntity> S saveAndFlush(S entity) {
        return null;
    }

    public <S extends HistoriqueEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    public void deleteAllInBatch(Iterable<HistoriqueEntity> entities) {}

    public void deleteAllByIdInBatch(Iterable<Long> longs) {}

    public void deleteAllInBatch() {}

    public HistoriqueEntity getOne(Long aLong) {
        return null;
    }

    public HistoriqueEntity getById(Long aLong) {
        return null;
    }

    public HistoriqueEntity getReferenceById(Long aLong) {
        return null;
    }

    public <S extends HistoriqueEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    public <S extends HistoriqueEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    public <S extends HistoriqueEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    public <S extends HistoriqueEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    public <S extends HistoriqueEntity> long count(Example<S> example) {
        return 0;
    }

    public <S extends HistoriqueEntity> boolean exists(Example<S> example) {
        return false;
    }

    public <S extends HistoriqueEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    public <S extends HistoriqueEntity> S save(S entity) {
        return null;
    }

    public <S extends HistoriqueEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    public Optional<HistoriqueEntity> findById(Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(Long aLong) {
        return false;
    }

    public List<HistoriqueEntity> findAll() {
        return null;
    }

    public List<HistoriqueEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Long aLong) {}

    public void delete(HistoriqueEntity entity) {}

    public void deleteAllById(Iterable<? extends Long> longs) {}

    public void deleteAll(Iterable<? extends HistoriqueEntity> entities) {}

    public void deleteAll() {}

    public List<HistoriqueEntity> findAll(Sort sort) {
        return null;
    }

    public Page<HistoriqueEntity> findAll(Pageable pageable) {
        return null;
    }
}
