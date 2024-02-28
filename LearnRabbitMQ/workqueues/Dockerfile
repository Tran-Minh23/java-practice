FROM harbor.logixtek.com/logix.technology/amazoncorretto:17.0.9

WORKDIR '/app'

COPY . .

ENV CP .:amqp-client-5.16.0.jar:slf4j-api-1.7.36.jar:slf4j-simple-1.7.36.jar
RUN javac -cp "$CP" Worker.java

RUN ls -l /app

CMD ["java", "-cp", ".:amqp-client-5.16.0.jar:slf4j-api-1.7.36.jar:slf4j-simple-1.7.36.jar", "Worker"]