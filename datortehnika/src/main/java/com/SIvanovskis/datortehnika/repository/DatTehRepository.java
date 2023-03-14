package com.SIvanovskis.datortehnika.repository;

import com.SIvanovskis.datortehnika.entity.DatTehEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatTehRepository extends JpaRepository<DatTehEntity, Long> {
}
