package com.meetup.diplome.demo.repository;


import com.meetup.diplome.demo.model.Meetup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("meetupRepository")
public interface MeetupRepository extends JpaRepository<Meetup, Long> {
}
