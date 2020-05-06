package it.uniroma1.asimov.control;

public class Query {
    private Time start;
    private Time end;

    public Query(Time start, Time end) {
        this.start = start;
        this.end = end;
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }
}
