package com.example.SportsEvent;

import com.example.SportsEvent.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends MongoRepository<Event,Integer> {


    Event findByEventId(Integer eventId);

    Event deleteByEventId(Integer eventId);
}
