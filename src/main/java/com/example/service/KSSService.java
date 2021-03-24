package com.example.service;

import com.example.domain.KSS;
import com.example.repository.KSSRepository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class KSSService {

    @Inject
    KSSRepository kssRepository;

    public KSS saveKSS(KSS kss) {
        return kssRepository.save(kss);
    }

    public List<KSS> fetchAll() {
        List<KSS> kssList = new ArrayList<>();
        Iterable<KSS> kssIterable = kssRepository.findAll();
        kssIterable.forEach(kssList::add);
        return kssList;
    }

    public KSS updateKSS(KSS kss) {
        return kssRepository.update(kss);
    }

    public KSS fetchById(Long id) {
        return kssRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        kssRepository.deleteById(id);
    }
}
