
public class HackathonEvent extends Event implements Registrable {

    protected String hackathonTheme;
    protected int teamSize;
    protected int total_Hackathon_Participants = 0;
    private int index = 0;
    protected String[] participantName;

    public HackathonEvent(int eventId, String eventName, String date, String venue, String hackathonTheme, int teamSize) {
        super(eventId, eventName, date, venue);
        this.hackathonTheme = hackathonTheme;
        this.teamSize = teamSize;
        this.participantName = new String[teamSize];
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Hackathon Theme: " + hackathonTheme);
        System.out.println("Team Size: " + teamSize);
    }

    @Override
    public void registerParticipant(String participantName) {
        if (index == teamSize) {
            System.out.println("Team size limit reached.");
        }

        this.participantName[index++] = participantName;
        total_Hackathon_Participants++;
    }

    @Override
    public void showParticipants() {
        System.out.println("Total Participants: " + total_Hackathon_Participants);
        System.out.print("Participants Name: ");
        for(int i = 0; i<index+1; i++) {
            if (i == index) { System.out.print(participantName[i] + "."); }
            System.out.print(participantName[i] + ", ");
        }
    }
}
