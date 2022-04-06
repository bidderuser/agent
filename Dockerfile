FROM java:8-jdk
EXPOSE 6190
RUN useradd -ms /bin/bash agent
USER agent
WORKDIR /agent
COPY target/bidding-agent-1.0-SNAPSHOT-jar-with-dependencies.jar .
COPY src/main/resources/epom-dsp-dss-1.0-SNAPSHOT.jar .
CMD java -cp bidding-agent-1.0-SNAPSHOT-jar-with-dependencies.jar:epom-dsp-dss-1.0-SNAPSHOT.jar com.bidding.agent.BiddingAgentServerRunner


