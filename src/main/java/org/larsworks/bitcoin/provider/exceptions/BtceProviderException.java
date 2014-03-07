package org.larsworks.bitcoin.provider.exceptions;

/**
 * @author Lars Kleen
 * @since 0.0.1
 *        Date: 07.03.14
 *        Time: 21:55
 */
public class BtceProviderException extends RuntimeException {
    public BtceProviderException(String message) {
        super(message);
    }

    public BtceProviderException(String message, Throwable cause) {
        super(message, cause);
    }

    public BtceProviderException(Throwable cause) {
        super(cause);
    }
}
