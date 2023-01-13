# Java version
openjdk version "11.0.17" 2022-10-18 LTS

OpenJDK Runtime Environment Corretto-11.0.17.8.1 (build 11.0.17+8-LTS)

OpenJDK 64-Bit Server VM Corretto-11.0.17.8.1 (build 11.0.17+8-LTS, mixed mode)

# build and run
./gradlew clean; ./gradlew build; ./gradlew run

# sample output

> Task :run

size: 4

Map sorted by values: {100.1.1.1=12, 1.1.1.2=6, 1.1.1.1=3, 1.1.1.3=1}

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.4/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 436ms

2 actionable tasks: 1 executed, 1 up-to-date
