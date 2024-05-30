pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                echo 'testing...'
            }
        }
        stage('Build') {
            steps {
                echo 'build building'
                bat 'dir'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploy to container'
            }
        }
    }
}
