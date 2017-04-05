library identifier: 'jenkins-library@master', retriever: modernSCM([ 
    $class: 'GitSCMSource', remote: 'https://github.com/lloydjm77/jenkins-library.git'
])

pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                mavenVersion()
            }
        }
    }
}
