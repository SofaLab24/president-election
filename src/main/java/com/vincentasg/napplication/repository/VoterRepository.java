package com.vincentasg.napplication.repository;

import com.vincentasg.napplication.data.Voter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoterRepository extends MongoRepository<Voter, String> {
}
