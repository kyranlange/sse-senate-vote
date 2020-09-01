package edu.adelaide.sse.voterecorder.model;

import lombok.Data;

import java.util.List;

@Data
public class CompletedBallot {

    private List<Vote> votes;

}
