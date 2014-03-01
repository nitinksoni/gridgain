/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.spi.discovery.tcp.internal;

import org.gridgain.grid.spi.discovery.tcp.*;

/**
 * State of local node {@link GridTcpDiscoverySpi}.
 *
 * @author @java.author
 * @version @java.version
 */
public enum GridTcpDiscoverySpiState {
    /** */
    DISCONNECTED,

    /** */
    CONNECTING,

    /** */
    CONNECTED,

    /** */
    DISCONNECTING,

    /** */
    STOPPING,

    /** */
    LEFT,

    /** */
    DUPLICATE_ID,

    /** */
    AUTH_FAILED,

    /** */
    CHECK_FAILED,

    /** */
    LOOPBACK_PROBLEM
}
