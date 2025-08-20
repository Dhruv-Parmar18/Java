
public class CodingEvent extends Event implements Registrable {

    protected String programmingLanguage;
    protected String difficultyLevel;
    public int total_CodingEvent_Participants = 0;
    protected String participantName;

    public CodingEvent(int eventId, String eventName, String date, String venue, String programmingLanguage, String difficultyLevel) {
        super(eventId, eventName, date, venue);
        this.programmingLanguage = programmingLanguage;
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Difficulty Level: " + difficultyLevel);
    }

    @Override
    public void registerParticipant(String participantName) {
        this.participantName = participantName;
        total_CodingEvent_Participants++;
    }   

    @Override
    public void showParticipants() {
        System.out.println("Participant Name: " + participantName);
    }
}
