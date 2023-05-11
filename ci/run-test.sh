#!/usr/bin/env bash
set -e

./gradlew clean test jacocoTestCoverageVerification -Dspring.profiles.active=test
