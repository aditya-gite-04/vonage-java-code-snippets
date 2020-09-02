package com.vonage.quickstart.initialize;

import com.nexmo.client.VonageClient;
import com.vonage.quickstart.Util;

/**
 * Example of configuring a NexmoClient with authentication for
 * both API secret and Application (JWT) authentication credentials.
 */
public class FullAuth {
    public static void main(String[] argv) throws Exception {
        String VONAGE_API_KEY = Util.envVar("VONAGE_API_KEY");
        String VONAGE_API_SECRET = Util.envVar("VONAGE_API_SECRET");
        String VONAGE_APPLICATION_ID = Util.envVar("VONAGE_APPLICATION_ID");
        String VONAGE_APPLICATION_PRIVATE_KEY_PATH = Util.envVar("VONAGE_PRIVATE_KEY_PATH");

        VonageClient client = VonageClient.builder()
                .apiKey(VONAGE_API_KEY)
                .apiSecret(VONAGE_API_SECRET)
                .applicationId(VONAGE_APPLICATION_ID)
                .privateKeyPath(VONAGE_APPLICATION_PRIVATE_KEY_PATH)
                .build();
    }
}