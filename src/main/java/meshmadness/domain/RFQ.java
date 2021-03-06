package meshmadness.domain;

import meshmadness.actors.User;
import meshmadness.messaging.Payload;

public class RFQ implements Cloneable, Payload {
    private final User user;
    private final int id;
    private final SBP source;

    public RFQ(final User user, final int id, final SBP source) {
        this.user = user;
        this.id = id;
        this.source = source;
    }

    public int getRFQId() {
        return id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof RFQ)
        {
            sameSame = this.id == ((RFQ) object).id;
        }

        return sameSame;
    }

    public Object getUsername() {
        return user.getName();
    }

    public User getOriginatingUser() {
        return user;
    }

    public SBP getOriginatingSBP() {
        return source;
    }
}
