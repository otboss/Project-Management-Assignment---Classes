#!/bin/bash
export CLASSPATH="$PWD:$PWD/dependencies/bson-3.0.4.jar:$PWD/dependencies/mongodb-driver-3.0.4.jar:$PWD/dependencies/mongodb-driver-core-3.0.4.jar";
javac Main.java && java Main;