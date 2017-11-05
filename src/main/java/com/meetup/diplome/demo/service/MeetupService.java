package com.meetup.diplome.demo.service;


import com.meetup.diplome.demo.model.Meetup;

import java.util.List;

public interface MeetupService {
    List<Meetup> getAllMeetups();
    void saveMeetup(Meetup meetup);
}
