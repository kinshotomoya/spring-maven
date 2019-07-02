#!/bin/sh

mvn -Dflyway.url=jdbc:mysql://localhost:3306/facebook -Dflyway.user=user -Dflyway.password=password flyway:clean

mvn -Dflyway.url=jdbc:mysql://localhost:3306/facebook -Dflyway.user=user -Dflyway.password=password flyway:baseline

mvn -Dflyway.url=jdbc:mysql://localhost:3306/facebook -Dflyway.user=user -Dflyway.password=password flyway:migrate
