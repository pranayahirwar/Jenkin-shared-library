#!/usr/bin/env groovy

def call() {
    echo 'Building Maven Package ...'
    sh "mvn package"
}
