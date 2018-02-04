# Prometheus Plugin Template
[![Java 8](https://img.shields.io/badge/Java-8-brightgreen.svg)](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
[![GitHub release](https://img.shields.io/github/release/frklan/PrometheusTemplatePlugin.svg)](https://github.com/frklan/PrometheusTemplatePlugin/releases)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/frklan/PrometheusTemplatePlugin/issues)
[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](https://github.com/frklan/PrometheusTemplatePlugin/blob/master/LICENSE)

A plugin template for project [Prometheus](https://github.com/frklan/Apollo).

## Compiling and running
Prerequisites

- Java 8 SDK
- Apached Maven

### Compiling

To compile issue the following commands

````
$ git clone git@github.com:frklan/PrometheusTemplatePlugin.git
$ cd PrometheusTemplatePlugin
$ mvn package
````

### Running

1. download and compile the [Apollo launcher](https://github.com/frklan/Apollo/releases)

2. clone and compile this repository, see above

3. copy PluginTemplate-x.y.z-SNAPSHOT.jar file from the template folder into the Apollo launcer plugin directory

4. start the Apollo launcher

## Contributing
Contributions are always welcome!

When contributing to this repository, please first discuss the change you wish to make via the issue tracker, email, or any other method with the owner of this repository before making a change.

Please note that we have a code of conduct, you are required to follow it in all your interactions with the project.

## Versioning
We use SemVer for versioning. For the versions available, see the tags on this repository.

## Authors
- Fredrik Andersson - Initial work - frklan

## License
This project is licensed under the MIT License - see the LICENSE file for details

## Acknowledgments
- README based on PurpleBooth's template
