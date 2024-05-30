pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello Pipeline'
                script {
                    echo 'script..'
                    def libLoop = load 'utils/loop.groovy'
                    libLoop.getInfoGit('https://github.com/AlgosStile/Jenkins-groovy.git')
                    libLoop.loopMethod()

                    libLoop.getInfoGitBranch('https://github.com/AlgosStile/Jenkins-groovy.git')
                }
            }
        }
    }
}
