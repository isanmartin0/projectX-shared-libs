#!/usr/bin/env groovy

/**
 * Sets the display name of the build (for Java projects)
 */

def call() {

  def pom = readMavenPom()
  def v = pom.version

  currentBuild.displayName = "${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
      
}