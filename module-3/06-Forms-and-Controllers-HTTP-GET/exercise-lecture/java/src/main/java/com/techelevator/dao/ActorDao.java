package com.techelevator.dao;

import com.techelevator.model.Actor;
import java.util.List;

public interface ActorDao {
    public List<Actor> getMatchingActors(String search);
}