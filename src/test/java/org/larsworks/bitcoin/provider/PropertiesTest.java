package org.larsworks.bitcoin.provider;

import org.larsworks.bitcoin.provider.properties.BtceProperties;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Lars Kleen
 * @since 0.0.1
 *        Date: 07.03.14
 *        Time: 21:53
 */
public class PropertiesTest {

    @Test
    public void test() throws Exception {
        BtceProperties bp = new BtceProperties();
        assertEquals("test",bp.get("test.property"));
    }

}
