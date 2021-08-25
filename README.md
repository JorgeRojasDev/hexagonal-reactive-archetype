# Hexagonal Reactive Archetype

[![Contributors][contributors-shield]][contributors-url]
[![MIT License][license-shield]][license-url]
[![linkedin-shield]][linkedin-url]

## About The Archetype

A quick-starter to build the skeleton of a hexagonal architecture application, based on api first and reactive controllers.

### Built With

* [Maven Archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)

## Getting Started

- **1** - **Installing**

  Open the root archetype folder on cmd or bash and use this command:
  ~~~
  mvn -U -B clean install
  ~~~
  <br>

- **2** - **Importing on the IDE**
 
  - **Intellij**:
    Go New Project -> Project -> Select JDK 8 (Can change after) -> Check Create from archetype -> Add Archetype
    And set the following values:
      - groupId: io.github.jorgerojasdev
      - artifactId: hexagonal-reactive-archetype
      - version: 0.0.1
   <br>
  - **Eclipse**:
    Go New -> Project -> Maven Project -> Next -> Add Archetype
    And set the following values:
      - groupId: io.github.jorgerojasdev
      - artifactId: hexagonal-reactive-archetype
      - version: 0.0.1
   <br>
  - **Command Line**:
    Go to the destination folder of the new project on terminal and use next command:
    ~~~
    mvn archetype:generate                                    \
      -DarchetypeGroupId=io.github.jorgerojasdev              \
      -DarchetypeArtifactId=hexagonal-reactive-archetype      \
      -DarchetypeVersion=0.0.1                                \
      -DgroupId=<your groupId>                                \
      -DartifactId=<your artifactId>
    ~~~
   <br>

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/jorge-rojas-zafra-fullstack-developer
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/JorgeRojasDev/hexagonal-reactive-archetype/graphs/contributors
[license-url]:https://github.com/JorgeRojasDev/hexagonal-reactive-archetype/blob/main/LICENSE
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
