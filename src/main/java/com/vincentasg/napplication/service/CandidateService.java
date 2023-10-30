package com.vincentasg.napplication.service;
import com.vincentasg.napplication.data.Candidate;
import com.vincentasg.napplication.repository.CandidateRepository;
import com.vincentasg.napplication.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    public List<Candidate> findAll()
    {
        return candidateRepository.findAll();
    }
    public Candidate findById(String id)
    {
        return candidateRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Candidate save(Candidate candidate)
    {
        return candidateRepository.save(candidate);
    }
    public void deleteById(String id)
    {
        candidateRepository.deleteById(id);
    }
}
