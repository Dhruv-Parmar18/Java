
public class CodingPresentations extends Event implements Registrable {

    protected String presentationTitle;
    protected String totalPresenters;
    public int total_CodingPresentation_Participants = 0;
    protected String participantName;

    public CodingPresentations(int eventId, String eventName, String date, String venue, String presentationTitle, String totalPresenters) {
        super(eventId, eventName, date, venue);
        this.presentationTitle = presentationTitle;
        this.totalPresenters = totalPresenters;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Presentation Title: " + presentationTitle);
        System.out.println("Total No. of presenters in group: " + totalPresenters);
    }

    @Override
    public void registerParticipant(String participantName) {
        this.participantName = participantName;
        total_CodingPresentation_Participants++;
    }   

    @Override
    public void showParticipants() {
        System.out.println("Participant Name: " + participantName);
    }
}
