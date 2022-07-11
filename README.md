> Запуск веб-тестов происходит с помощью команд ниже:

// локальные настройки
 - ./gradlew clean test --tests WebTest -Dconfig-test=local

// удалённые настройки
 - ./gradlew clean test --tests WebTest -Dconfig-test=remote
