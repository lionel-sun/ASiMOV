package it.uniroma1.asimov.control;

import java.util.Set;

public class SetCmsg {
    private Set<Cmsg> set;

    public SetCmsg(Set<Cmsg> set) {
        this.set = set;
    }

    public Set<Cmsg> getSet() {
        return set;
    }
}
