# learn-springboot
This project aims to verify [linuxsuren/api-testing](https://github.com/LinuxSuRen/api-testing).

Run E2E testing:

```shell
make build-image test-e2e
```

Run with Maven command:

```shell
mvn spring-boot:run
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
