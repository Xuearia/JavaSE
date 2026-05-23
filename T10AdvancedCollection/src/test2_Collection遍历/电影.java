package test2_Collection遍历;

public class 电影 {
    private String name;
    private double score;
    private String leadActor;

    public 电影() {
    }

    public 电影(String name, double score, String leadActor) {
        this.name = name;
        this.score = score;
        this.leadActor = leadActor;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getLeadActor() {
        return leadActor;
    }
    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    @Override
    public String toString() {
        return "电影{" +
                "" + name +
                "," + score +
                ", " + leadActor +
                '}';
    }
}
