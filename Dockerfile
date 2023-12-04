FROM maven:3.9.5-sapmachine-17

WORKDIR /workspace
COPY . .

RUN mvn package

CMD [ "java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar" ]
