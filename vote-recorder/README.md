# Vote Recorder Service

This service is used to take completed ballots, and upon verification by the voter, to
store a cryptographically signed representaiton of the completed ballot which can
later be used by the vote counter to determine the result of the election

## Building

To build this service run:

```shell script
./gradlew build
```

## Running the service

The best way to run this service is in a container using the provided Dockerfile

```shell script
docker build --tag vote-recorder .
docker run vote-recorder
```

## Design

Design of individual requirements can be found in [DESIGN1.md]. 