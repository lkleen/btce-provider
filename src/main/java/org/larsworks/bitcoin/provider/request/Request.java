package org.larsworks.bitcoin.provider.request;

import org.larsworks.bitcoin.provider.properties.BtceProperties;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lars Kleen
 * @since 0.0.1
 *        Date: 07.03.14
 *        Time: 22:05
 */
public abstract class Request extends RestTemplate {

    protected static BtceProperties properties = new BtceProperties();

}
