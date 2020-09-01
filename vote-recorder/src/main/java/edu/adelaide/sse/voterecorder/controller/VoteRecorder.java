package edu.adelaide.sse.voterecorder.controller;

import edu.adelaide.sse.voterecorder.dto.BallotSignature;
import edu.adelaide.sse.voterecorder.dto.ReturnedBallot;
import edu.adelaide.sse.voterecorder.model.CompletedBallot;
import edu.adelaide.sse.voterecorder.util.BallotSigner;
import edu.adelaide.sse.voterecorder.util.BallotWriter;

/**
 * A controller to access the functionality of the vote recorder
 */
public class VoteRecorder {

    private BallotWriter ballotWriter;
    private BallotSigner ballotSigner;

    public ReturnedBallot createCompletedBallot(CompletedBallot ballot) {

        return null;
    }

    public BallotSignature commitCompletedBallot(ReturnedBallot ballot) {

        return null;
    }

}
