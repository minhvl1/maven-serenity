pipeline {

    agent {
        any {
            image 'maven:3-openjdk-8'
            args '-v /root/.m2:/root/.m2'
            maven 'MAVEN_HOME'
    }
    }
    stages {

        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean verify  -D"webdriver.driver=firefox"'

            }
        stage('MS team'){
        steps {

            office365ConnectorSend webhookUrl: 'https://cmcglobalcompany.webhook.office.com/webhookb2/d71b4385-2978-475a-849d-1f7fb4786638@f89c1178-4c5d-43b5-9f3b-d21c3bec61b5/IncomingWebhook/df5cace06cbe44b8a2db7619802ffe8b/0ef5503d-db25-40ca-bf9d-3c80b57ebfac',
                message: 'Application has been [deployed](https://uat.green.biz)',
                status: 'Success',
                color: '#0000FF'
        }
        }

        }
    }
    }
