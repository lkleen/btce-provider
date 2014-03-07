package org.larsworks.bitcoin.provider;

import lombok.extern.slf4j.Slf4j;
import org.larsworks.bitcoin.provider.request.TickerRequest;
import org.testng.annotations.Test;

/**
 * @author Lars Kleen
 * @since 0.0.1
 *        Date: 07.03.14
 *        Time: 23:36
 */
@Slf4j
public class TickerRequestTest {

    @Test
    public void test() {
        String response = new TickerRequest().getResponse();
        log.info(response);
    }

}
