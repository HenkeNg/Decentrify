package se.kth.reliablebroadcast;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Init;
import se.sics.kompics.Positive;
import se.sics.kompics.network.Network;
import se.sics.ktoolbox.util.network.KAddress;

/**
 * Created by mikael on 2017-03-31.
 */
public class RB extends ComponentDefinition {

    private KAddress self;

    private Positive<GBEB> gbeb = requires(GBEB.class);
    private Positive<Network> net = requires(Network.class);

    public RB(Init init) {
        this.self = init.self;
        //subscriptions

    }

    private Handler<RBroadcast> broadcastHandler = new Handler<RBroadcast>() {
        @Override
        public void handle(RBroadcast broadcast) {
            trigger(broadcast, gbeb);
        }
    };

    public static class Init extends se.sics.kompics.Init<RB> {
        public KAddress self;

        public Init(KAddress self) {
            this.self = self;
        }
    }
}
