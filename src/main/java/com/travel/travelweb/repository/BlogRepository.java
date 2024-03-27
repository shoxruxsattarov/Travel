package com.travel.travelweb.repository;

import com.travel.travelweb.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Destination, Integer> {
}
