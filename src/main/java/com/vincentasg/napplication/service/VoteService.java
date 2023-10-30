package com.vincentasg.napplication.service;
import com.vincentasg.napplication.data.Vote;
import com.vincentasg.napplication.repository.VoteRepository;
import com.vincentasg.napplication.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;
    public List<Vote> findAll()
    {
        return voteRepository.findAll();
    }
    public Vote findById(String id)
    {
        return voteRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Vote save(Vote vote)
    {
        return voteRepository.save(vote);
    }
    public void deleteById(String id)
    {
        voteRepository.deleteById(id);
    }
}
