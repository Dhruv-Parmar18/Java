
public class Registration {
    public static void main(String[] args) {

        HackathonEvent CodeVita = new HackathonEvent(101, "Code-Vita S13", "30/09/2025", "Online", "AI and Machine Learning", 4);

        CodeVita.registerParticipant("Dhruv");
        CodeVita.registerParticipant("Ronit");
        CodeVita.registerParticipant("Harshil");
        CodeVita.registerParticipant("Siddharth");
        CodeVita.registerParticipant("Aryan");
        CodeVita.registerParticipant("Rohan");
        CodeVita.registerParticipant("Ankit");
        CodeVita.registerParticipant("Aarav");

        CodeVita.displayEventDetails();
        CodeVita.showParticipants();
    }
}
