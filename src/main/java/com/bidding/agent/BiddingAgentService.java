package com.bidding.agent;

import com.epom.dss.agent.CreativeMatch;
import com.epom.dss.agent.CreativeMatches;
import com.epom.dss.agent.DssRequest;
import com.epom.dss.agent.DssResponse;
import com.epom.dss.agent.server.service.DssServiceGrpcImplBase;
import io.netty.util.internal.ThreadLocalRandom;

/**
 * Bidder agent service implementation.
 */
public final class BiddingAgentService extends DssServiceGrpcImplBase {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public DssResponse onBid(final DssRequest request) {
		System.out.println("DssRequest: " + request);
		return super.onBid(request);
	}

	/**
	 * Select creative and set winning price.
	 * <p/>
	 *
	 * @param creativeMatches
	 * 			{@link CreativeMatches} incoming matched creatives.
	 * @return {@link DssResponse} instance.
	 */
	public DssResponse processBid(final CreativeMatches creativeMatches) {
		final double delta = ThreadLocalRandom.current().nextBoolean() ? .05 : -0.05;
		final CreativeMatch firstCreative = creativeMatches.getMatches().iterator().next();
		return DssResponse.of(firstCreative.getTargetCpm() + delta, firstCreative.getId());
	}
}
