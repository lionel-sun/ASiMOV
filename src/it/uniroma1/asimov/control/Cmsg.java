package it.uniroma1.asimov.control;

public class Cmsg {
    private Pload pload;
    private Time tstamp;
    private String type;

    public Cmsg(Pload pload, Time tstamp, String type) {
        this.pload = pload;
        this.tstamp = tstamp;
        this.type = type;
    }

    public Pload getPload() {
        return pload;
    }

    public Time getTstamp() {
        return tstamp;
    }

    public String getType() {
        return type;
    }
}
