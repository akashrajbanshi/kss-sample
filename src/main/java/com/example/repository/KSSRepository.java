package com.example.repository;

import com.example.domain.KSS;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface KSSRepository extends CrudRepository<KSS, Long> {
}
