package se.kth.reliablebroadcast;

import se.sics.kompics.KompicsEvent;
import se.sics.ktoolbox.util.network.KAddress;

/**
 * Created by mikael on 2017-03-31.
 */
public class RDeliver implements KompicsEvent {
    private KAddress source;
    private Object payload;

    public RDeliver(KAddress source, Object payload) {
        this.source = source;
        this.payload = payload;
    }

    public Object getPayload() {
        return payload;
    }

    public KAddress getSource() {
        return source;
    }
}
