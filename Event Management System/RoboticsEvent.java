
public class RoboticsEvent extends Event implements Registrable {

    protected String robotType;
    protected double runDuration;
    public int total_RoboticsEvent_Participants = 0;
    protected String participantName;

    public RoboticsEvent(int eventId, String eventName, String date, String venue, String robotType, double runDuration) {
        super(eventId, eventName, date, venue);
        this.robotType = robotType;
        this.runDuration = runDuration;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Robot Type: " + robotType);
        System.out.println("Robot's Run Duration(in mins): " + runDuration);
    }

    @Override
    public void registerParticipant(String participantName) {
        this.participantName = participantName;
        total_RoboticsEvent_Participants++;
    }   

    @Override
    public void showParticipants() {
        System.out.println("Participant Name: " + participantName);
    }
}