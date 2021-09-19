## Docker Guide

Создать контейнеры для работы проекта можно выполнив последовательность команд в терминале.\
```cd ./IdeaProjects/choice_of_action/docker```\
```docker-compose up -d```

- База данных разработки доступна под портом 5432.
- Порт для тестовой базы данных - 5433.


## Database Diagram
Пока не создана
https://dbdiagram.io/d/60a62c9db29a09603d15bc72

## Swagger Guide
Ознакомиться с эндпоинтами\
http://localhost:8080/api/swagger-ui.html

Посмотреть примеры инспользования аннотаций.\
[Source code](https://github.com/springdoc/springdoc-openapi-demos/blob/master/springdoc-openapi-spring-boot-2-webmvc/src/main/java/org/springdoc/demo/app2/api/UserApi.java) — check what annotations are used
