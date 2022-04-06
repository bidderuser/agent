package com.bidding.agent;

import com.epom.dss.agent.server.DssServerGrpcImpl;

/**
 * Bidding agent server implementation.
 */
public final class BiddingAgentServer extends DssServerGrpcImpl {

	/**
	 * Constructor.
	 * <p/>
	 *
	 * @param port
	 * 		{@link Integer} application port.
	 */
	public BiddingAgentServer(final int port) {
		super(new BiddingAgentService(), port);
	}
}
