package com.bookingmeetingroom.repository;

import com.bookingmeetingroom.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
    List<ReservationEntity> findByUserId(Long userId);
    List<ReservationEntity> findAll();
    void deleteByUserId(Long userId);
    boolean existsByUserId(Long userId);
}
