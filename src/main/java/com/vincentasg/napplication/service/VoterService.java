package com.vincentasg.napplication.service;
import com.vincentasg.napplication.data.Voter;
import com.vincentasg.napplication.repository.CandidateRepository;
import com.vincentasg.napplication.exception.EntityNotFoundException;
import com.vincentasg.napplication.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterService {
    @Autowired
    private VoterRepository voterRepository;
    public List<Voter> findAll()
    {
        return voterRepository.findAll();
    }
    public Voter findById(String id)
    {
        return voterRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Voter save(Voter voter)
    {
        return voterRepository.save(voter);
    }
    public void deleteById(String id)
    {
        voterRepository.deleteById(id);
    }
}
