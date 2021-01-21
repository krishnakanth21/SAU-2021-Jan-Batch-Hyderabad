import java.io.Serializable;

public class marksList implements Serializable, Comparable<marksList> {

    private static final long serialVersionUID = 1L;
    private Integer roll;
    private Integer totalMarks;
    private Integer rank;

    public marksList(Integer roll, Integer totalMarks) {
        super();
        this.roll = roll;
        this.totalMarks = totalMarks;
    }
    public Integer getRoll() {
        return roll;
    }
    public void setRoll(Integer roll) {
        this.roll = roll;
    }
    public Integer getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(Integer marks) {
        this.totalMarks = marks;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return new StringBuffer(" Roll Number: ").append(this.roll).append(" Total Marks : ").append(this.totalMarks).toString();
    }

    @Override
    public int compareTo(marksList o) {
        return totalMarks.compareTo(o.totalMarks);
    }
}