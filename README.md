# java-practice

Folder structure:
- .vscode: configure classpaths
- LearnPatterns: learn design patterns, each sub folder represents a pattern
- LearnRabbitMQ: learn message queuing service
    + docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10-management
    + Producer sends message to an exchange (receive messages and push them to queues). The rules are defined by the exchange type
        + Exchange type: direct, topic, headers, fanout
            + Direct: message goes to the queue whose binding key matches routing key
        + Binding can take an extra binding key param

https://www.rabbitmq.com/tutorials/tutorial-five-java