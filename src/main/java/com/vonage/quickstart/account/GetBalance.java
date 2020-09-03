/*
 * Copyright  2020 Vonage
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.vonage.quickstart.account;

import com.nexmo.client.VonageClient;
import com.nexmo.client.account.AccountClient;
import com.nexmo.client.account.BalanceResponse;
import com.vonage.quickstart.Util;

public class GetBalance {
    private static final String VONAGE_API_KEY = Util.envVar("VONAGE_API_KEY");
    private static final String VONAGE_API_SECRET = Util.envVar("VONAGE_API_SECRET");

    public static void main(String[] args) throws Exception {
        VonageClient client = VonageClient.builder()
                .apiKey(VONAGE_API_KEY)
                .apiSecret(VONAGE_API_SECRET)
                .build();

        AccountClient accountClient = client.getAccountClient();

        BalanceResponse response = accountClient.getBalance();
        System.out.printf("Balance: %s EUR\n", response.getValue());
        System.out.printf("Auto-reload Enabled: %s\n", response.isAutoReload());
    }
}
