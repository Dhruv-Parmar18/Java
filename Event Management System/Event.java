// eventId, eventName, date, and venue
// displayEventDetails()

public class Event {

    protected int eventId;
    protected String eventName;
    protected String date;
    protected String venue;

    public Event(int eventId, String eventName, String date, String venue) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
    }

    public void displayEventDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
    }
}
