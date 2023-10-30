package com.vincentasg.napplication.repository;
import com.vincentasg.napplication.data.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface VoteRepository extends MongoRepository<Vote, String> {}
