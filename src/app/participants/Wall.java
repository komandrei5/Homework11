package app.participants;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Participant participant) {
        if (participant.getJumpHeight() >= height) {
            System.out.println(participant.getName() + " jumped over the wall in height " + height);
        } else {
            System.out.println(participant.getName() + " could not jump over the high wall " + height);
        }
    }
}
