package app.participants;

public class Track implements Obstacle {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public void overcome(Participant participant) {
        if (participant.getMaxRunDistance() >= distance) {
            System.out.println(participant.getName() + " ran the distance " + distance);
        } else {
            System.out.println(participant.getName() + " could not run the distance " + distance);
        }
    }
}
