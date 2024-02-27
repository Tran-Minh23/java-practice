# java-practice

Folder structure:
- .vscode: configure classpaths
- LearnPatterns: learn design patterns, each sub folder represents a pattern
- LearnRabbitMQ: learn message queuing service
    + docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10-management
    + durable (restart server without losing message)
    + Producer sends message to an exchange (receive messages and push them to queues). The rules are defined by the exchange type
        + Exchange type: direct, topic, headers, fanout
            + Direct: message goes to the queue whose binding key matches routing key
            + Topic: message can be as many words, separated by dot (* for 1 word, # for zero or more)
            + Headers: routing based on headers (Map)
        + Binding can take an extra binding key param
    + Publisher confirms are an extension to implement reliable publishing

https://www.rabbitmq.com/tutorials/tutorial-five-java

tomorrow task: view project source code. try to run in docker compose