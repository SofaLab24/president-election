package com.vincentasg.napplication.repository;
import com.vincentasg.napplication.data.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
