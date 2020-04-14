pipeline {
    agent any
/*
      environment {
      JDK_11 = tool name: 'JDK11' //, type: 'com.cloudbees.jenkins.plugins.customtools.CustomTool'
      JAVA_HOME = "${env.JDK_11}"
      }
*/
            stages {

                stage('jdk11') {
                    agent {
                        docker {
                            image 'adoptopenjdk:11-jdk-hotspot'
                        }
                     }
                    steps {
                        echo "JDK11.."
                        sh 'java -version'
                    }
                }

                stage("Compile"){
                tools {
                	gradle "gradle_5_6_4"
                }
                    steps{
                        sh "./gradlew compileJava"
                    }
                }

                stage("Package"){
                    steps{
                        sh "./gradlew build"
                    }
                }

                stage("Docker build") {
                    steps {
                        sh "docker build -t ais-stream/openjdk:11 ."
                    }
                }

                stage("Deploy to staging") {
                     steps {

                          sh "docker run --rm --publish=9001:9001 --name ais-stream ais-stream/openjdk:11"
                     }
                }
            }
            post {
                 always {
                      sh "docker stop ais-stream"
                 }
            }
 }