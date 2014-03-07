package org.larsworks.bitcoin.provider.request;

/**
 * @author Lars Kleen
 * @since 0.0.1
 *        Date: 07.03.14
 *        Time: 22:06
 */
public abstract class PublicRequest extends Request {

    protected String baseUrl = properties.get("btce.api.public.url");

}
