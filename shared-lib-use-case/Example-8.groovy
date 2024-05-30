@Library('test-library') _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Pipeline example-8'
                script {
                    def script_content = libraryResource 'org/scripts/scriptTest.ps1'
                    writeFile file: './script.ps1', text: script_content
                    powershell './script.ps1'
                }
            }
        }
    }
}
