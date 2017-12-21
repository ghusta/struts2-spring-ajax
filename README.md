# Test Struts 2 + Spring + Ajax

[![Build Status](https://travis-ci.org/ghusta/struts2-spring-ajax.svg?branch=master)](https://travis-ci.org/ghusta/struts2-spring-ajax)

## Documentation

- https://struts.apache.org/getting-started/how-to-create-a-struts2-web-application.html
- https://struts.apache.org/getting-started/hello-world-using-struts2.html
- https://struts.apache.org/getting-started/spring.html

## Build

> mvn clean package

## Run

> mvn jetty:run

## Test

Go to http://localhost:8190/struts2-spring-ajax/

## Build Docker image

> docker build -t ghusta/struts2-spring-ajax .

## Test Docker image

> docker run -d -p 8190:8080 ghusta/struts2-spring-ajax 

Then test : http://[docker-host]:8190/struts2-spring-ajax/
