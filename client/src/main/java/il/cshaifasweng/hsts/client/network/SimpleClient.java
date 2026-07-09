package il.cshaifasweng.hsts.client.network;

import il.cshaifasweng.hsts.client.ocsf.AbstractClient;

public class SimpleClient extends AbstractClient {
    public SimpleClient(String host, int port) {
        super(host, port);
    }

    @Override
    protected void handleMessageFromServer(Object message) {
    }
}
