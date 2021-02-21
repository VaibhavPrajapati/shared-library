#!/usr/bin/env groovy
def call(String path, String phase) {
    sh '${path} ${phase}'
}