/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.algemeenbrp.util.jmx.authenticator;

/**
 * An authenticator based on an external JAAS configuration.
 */
public final class ExternalAuthenticator extends AbstractAuthenticator {

    /**
     * Create a new external authenticator.
     * @param name name of the JAAS login configuration
     */
    public ExternalAuthenticator(final String name) {
        super(name, null);
    }

}
