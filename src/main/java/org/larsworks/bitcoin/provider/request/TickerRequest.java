package org.larsworks.bitcoin.provider.request;

import org.larsworks.bitcoin.provider.exceptions.BtceProviderException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Lars Kleen
 * @since ?version
 *        Date: 07.03.14
 *        Time: 23:31
 */
public class TickerRequest extends PublicRequest {

    private URI uri;
    private RestTemplate restTemplate;

    public TickerRequest() {
        try {
            uri = new URI(baseUrl + "/ticker/btc_usd");
            restTemplate = new RestTemplate();
        } catch (URISyntaxException e) {
            throw new BtceProviderException(e);
        }
    }

    public String getResponse() {
        return restTemplate.getForEntity(uri, String.class).toString();
    }

}
