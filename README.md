# learn-springboot
This project aims to verify [linuxsuren/api-testing](https://github.com/LinuxSuRen/api-testing).

Run E2E testing:

```shell
make build-image run-e2e
```

Run with Maven command:

```shell
mvn spring-boot:run
```

Run in container:

```shell
docker run -p 8080:8080 ghcr.io/devops-ws/learn-springboot:master
```

Change the listen port:
```shell
java -jar demo.jar --server.port=8081
```

The default username is `admin`, and password is: `123456`.

## Service Registry Center

This project can register itself to the service registry center.

### Nacos

Register to [Nacos](https://github.com/alibaba/nacos):

```shell
java -jar demo.jar --nacos.server.enabled=true \
  --nacos.server-addr=192.168.10.52:8448
```

## OpenAPI definition
You can visit it via: http://localhost:8080/v3/api-docs

or visit Swagger UI via: http://localhost:8080/swagger-ui/index.html

## GraphQL
You can visit it via: http://localhost:8080/graphiql?path=/graphql

## tRPC
The [tRPC](https://github.com/trpc-group/trpc-java) endpoint is: `http://localhost:9090`

## Metrics
You can visit the metrics endpoint: `/actuator/prometheus`
