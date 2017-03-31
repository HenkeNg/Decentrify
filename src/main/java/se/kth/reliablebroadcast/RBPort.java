package se.kth.reliablebroadcast;

import se.sics.kompics.PortType;

/**
 * Created by mikael on 2017-03-31.
 */
public class RBPort extends PortType {
    {
        indication(RDeliver.class);
        request(RBroadcast.class);
    }
}
