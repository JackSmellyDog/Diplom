package com.meetup.diplome.demo.service;


import com.meetup.diplome.demo.model.Meetup;
import com.meetup.diplome.demo.repository.MeetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("meetupService")
public class MeetupSeviceImpl implements MeetupService {

    @Autowired
    private MeetupRepository meetupRepository;

    @Override
    public List<Meetup> getAllMeetups() {
        return meetupRepository.findAll();
    }

    @Override
    public void saveMeetup(Meetup meetup) {
        meetupRepository.save(meetup);
    }
}
