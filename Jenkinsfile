pipeline {
    agent any
/*
    stages {
        stage('Build') {
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
		}
    }
*/
            stages{

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
                    steps{
                        sh "./gradlew compileJava"
                    }
                }

                stage("Package"){
                    steps{
                        sh "./gradlew build"
                    }
                }

            }

/*
			stage('gradle') {
				tools {
					 gradle "gradle_5_6_4"
				}
				steps {
						echo "Gradle.."
						sh 'gradle --version'
						sh 'gradle build'
					}
				}

stage('Gradle Build') {
    if (isUnix()) {
        sh './gradlew clean build'
    } else {
        bat 'gradlew.bat clean build'
    }
}
*/
/*
        stage('Test') {
            steps {
                echo "Testing.."
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying.."
            }
        }
    }
    */
 }