package com.bidding.agent;

import java.io.IOException;

/**
 * Bidding agent server runner implementation.
 */
public final class BiddingAgentServerRunner {
	/**
	 * Default server port.
	 */
	private static final int DEFAULT_PORT = 6190;

	/**
	 * Server entry point.
	 * <p/>
	 *
	 * @param args
	 * 			{@link String[]} server arguments.
	 * @throws IOException in case or error.
	 */
	public static void main(final String[] args) throws IOException {
		System.out.println("Starting service...");

		new BiddingAgentServer(DEFAULT_PORT).start();
	}
}
