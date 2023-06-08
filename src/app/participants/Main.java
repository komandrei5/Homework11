package app.participants;

public class Main {
    public static void main(String[] args) {
         Participant[] participants = {
                new Human("John", 1000, 2),
                new Cat("Tom", 500, 3),
                new Robot("Robot", 2000, 1)
        };

        Obstacle[] obstacles = {
                new Track(800),
                new Wall(2),
                new Track(1500),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }
}