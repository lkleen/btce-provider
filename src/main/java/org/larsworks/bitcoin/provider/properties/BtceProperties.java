package org.larsworks.bitcoin.provider.properties;

import org.larsworks.bitcoin.provider.exceptions.BtceProviderException;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Lars Kleen
 * @since 0.0.1
 *        Date: 07.03.14
 *        Time: 21:50
 */
public class BtceProperties {

    Properties properties;

    public BtceProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("btce.properties"));
        } catch (IOException e) {
            throw new BtceProviderException(e);
        }
    }

    public String get(String key) {
        Object property = properties.get(key);
        if (property == null)
            throw new BtceProviderException("no property for key " + key);

        return properties.get(key).toString();
    }

}
