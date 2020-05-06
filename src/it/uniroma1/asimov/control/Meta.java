package it.uniroma1.asimov.control;

public class Meta {
    private Time rI;
    private Time tauM;

    public Meta(Time rI, Time tauM) {
        this.rI = rI;
        this.tauM = tauM;
    }

    public Time getrI() {
        return rI;
    }

    public Time getTauM() {
        return tauM;
    }
}
