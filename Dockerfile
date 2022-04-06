FROM maven:3.8.5-ibmjava-8
EXPOSE 6190
RUN useradd -ms /bin/bash agent
WORKDIR /agent
RUN chown -R agent:agent /agent
USER agent
COPY src/ src/
COPY pom.xml .
RUN mvn clean package
CMD java -cp target/bidding-agent-1.0-SNAPSHOT-jar-with-dependencies.jar:src/main/resources/epom-dsp-dss-1.0-SNAPSHOT.jar com.bidding.agent.BiddingAgentServerRunner


