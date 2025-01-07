# Проект по автоматизации тестирования мобильного приложения [Wikipedia](https://www.wikipedia.org/)
<p align="center"><a href="https://www.wikipedia.org/"><img src="images/icons/wikipedia.jpg" align="center" alt="Файл:wikipedia.png"/></a></p>

## Содержание:

- [Технологии и инструменты](#tools)
- [Тестовое покрытие](#cases)
- [Локальный запуск тестов](#localrun)
- [Запуск тестов в Jenkins](#remoterun)
- [Allure отчёт](#report)
- [Уведомления в Telegram](#telegram)
- [Видео с примером запуска тестов в Browserstack](#video)


<a id="tools"></a>

## Технологии и инструменты:

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="images/icons/intellij-original.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="images/icons/github-original.svg" width="50"/></a>  
<a href="https://www.java.com/"><img alt="Java" height="50" src="images/icons/java-original.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="images/icons/gradle-original.svg" width="50"/></a>  
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="images/icons/junit-original.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="images/icons/selenide-logo-big.png" width="50"/></a>
<a href="https://rest-assured.io/"> <img src="images/icons/restAssured.png" title="REST-assured" alt="REST-assured" width="50" height="50"/> </a>
<a href="https://developer.android.com/studio"> <img src="images/icons/androidstudio-original.svg" alt="Android Studio" width="50" height="50"/> </a> 
<a href="https://www.browserstack.com/"> <img src="images/icons/browserstack-original.svg" alt="Browserstack" width="50" height="50"/> </a>
<a href="https://appium.io/"> <img src="images/icons/appium.svg" alt="Appium" width="50" height="50"/> </a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="images/icons/jenkins-original.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure Report" height="50" src="images/icons/allureReports.png" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="images/icons/telegram.webp" width="50"/></a>
</div>

<p></p>

Автотесты для данного проекта написаны на <code>Java</code> с использованием фреймворка <code>Selenide</code> для <code>Android</code> приложения.

В качестве фреймворка для запуска тестов используется <code>Junit5</code>, а в качестве сборщика проекта - <code>Gradle</code>.

Для локального тестирования приложения на мобильных устройствах используется <code>Android Studio</code> и <code>Appium</code>. Для удаленного тестирования на различных платформах <code>Browserstack</code>.

Произведена настройка CI в <code>Jenkins</code>.

По результатам каждого тестового прогона создаётся <code>Allure</code> отчёт для визуализации результатов прогона.

После прогона тестов <code>Telegram</code> бот присылает сообщение с информацией о прошедшем прогоне

<a id="cases"></a>

## Тестовое покрытие:
### Кастомизация новостной ленты
🔎 Выключенный тип контента не должен отображаться на экране "Explore"

### Онбординг
🔎 Язык можно добавить на экране онбординга

🔎 Онбординг можно пропустить по кнопке "Skip"

### Поиск
🔎 Успешный поиск по поисковому запросу

<a id="localrun"></a>

## <img title="Jenkins" src="https://e7.pngegg.com/pngimages/578/441/png-clipart-computer-icons-intranet-computer-network-technical-support-network-computer-network-text.png" height="40" width="40"/> Локальный запуск тестов
Для локального запуска тестов из IDE или из терминала необходимо выполнить следующую команду

```
gradle clean test -DdeviceHost=local
```

> Для запуска локальных тестов на компьютере должны быть установлены Android Studio, Appium Server и Appium ([инструкция](https://autotest.how/appium-setup-for-local-android-tutorial))

<a id="remoterun"></a>

## <a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="images/icons/jenkins-original.svg" width="50"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/aqa_Mobile_tests/)
Для запуска тестов в Jenkins нужно нажать на кнопку Build Now в соответствующей сборке

<p align="center">
<img src="images/screenshots/jenkins-screen.png">
</p>

<a id="report"></a>

## <a href="https://github.com/allure-framework/"><img alt="Allure Report" height="50" src="images/icons/allureReports.png" width="50"/></a> [Allure отчёт](https://jenkins.autotests.cloud/job/aqa_Mobile_tests/12/allure/)
### Графики

<p align="center">
<img src="images/screenshots/allureReports-graphs.png">
</p>

### Тесты

<p align="center">
<img src="images/screenshots/allureReports-tests.png">
</p>

<a id="telegram"></a>

## <a href="https://telegram.org/"><img alt="Telegram" height="50" src="images/icons/telegram.webp" width="50"/></a> Уведомление в Telegram

По результатам каждого прогона тестов в Jenkins отправляется сообщение в Telegram. Сообщение содержит информацию о прогоне, а также диаграмму со статистикой прохождения тестов.

<p align="center">
<img src="images/screenshots/telegram-screen.png" width="400">
</p>

<a id="video"></a>

## <a href="https://www.browserstack.com/"> <img src="images/icons/browserstack-original.svg" alt="Browserstack" width="50" height="50"/> </a> Видео с примером запуска тестов в Browserstack
В Allure отчёте к каждому тесту прикладываются скриншот с последнего шага, и видео прохождения теста. Примеры таких видео:

<p align="center">
<img src="images/screenshots/video.gif " width="350">
</p>
