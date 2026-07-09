package il.cshaifasweng.hsts.server.network;

import il.cshaifasweng.hsts.server.ocsf.AbstractServer;
import il.cshaifasweng.hsts.server.ocsf.ConnectionToClient;

public class SimpleServer extends AbstractServer {
    public SimpleServer(int port) {
        super(port);
    }

    @Override
    protected void handleMessageFromClient(Object message, ConnectionToClient client) {
    }
}
