pipeline {
    agent any
    tools {
        maven 'maven_3'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn --version'
            }
        }
    }
}
