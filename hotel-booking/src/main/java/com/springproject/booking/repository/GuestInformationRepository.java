package com.springproject.booking.repository;

import com.springproject.booking.entity.GuestInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestInformationRepository extends JpaRepository<GuestInformation,Integer> {
}
