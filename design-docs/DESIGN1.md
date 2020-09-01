You are asked to perform detailed design and modelling of the 2 requirements of your individual Task 1. The design and modelling output must include a detailed class diagram for the two requirements used for analysis and 2 sequence diagrams for the chosen requirements. You are expected to use a suitable modelling tool (e.g., LucidChart, MS Visio, or OmniGraffle). The detailed design and modelling task of the project must be formalized into a document suitable for a development team to implement.
Rubrics: 
1. The sequence diagram must include actors and at least 3-4 objects and timeline of the objects. A short description must be included to describe each of the sequence diagrams.
2. The class diagram is detailed and captures all aspects of the two requirements modelled. A short description must be included to describe key aspects of the class diagram.
3. The class diagram includes correct relationships (e.g., aggregation, composition, etc.) and classes include 2-3 relevant attributes and 2-3 suitable operations.


First Requirement:
R02: Anonymity The voter must remain anonymous and not be tied to a particular vote.
               Secret ballots are fundamental to democracy.

After the user votes, a text document (something that is easy to parse) is cryptographically signed using a Electoral signing key (need to keep this secure) to ensure that any modification would be detected.

The text ballot shows the ranking of the candidates that the voter has chosen. The voter verifies this list, and if it matches their preferences, this text document is placed into the encrypted ballot box. If they don’t, the ballot is destroyed and they are able to vote again. Once it is placed into the ballot box, they are marked on the electoral roll to say that they have voted. The timestamp on the ballot is manually set to a time so the time can not be used to tie the voter to a ballot. When counting, the ballots are enumerated and the private signing key used to validate them.

The user should be prevented from downloading the text document, or only able to download an encrypted form of it, to ensure that votes can’t be bought. There should be no way for anyone else to verify who they voted for. The user could keep a copy of the signature and the public key and a mechanism could be provided to check that the signature was included in the vote, without revealing who the vote was for. 

This design has the problem that the security of the system depends of the secrecy of the private key, and the system must be designed such that this key is highly protected. If it were to be taken, the election results could be changed without detection. 

The verification process will be difficult, as the vote needs to be shown to the user, without the user having the opportunity to download the vote as this could then be used to prove who the voter voted for and remove the secrecy. At the same time, the signature and the vote can’t be shown separately as then it is not possible to prove that the signature matches the vote.