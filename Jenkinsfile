pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -s /etc/secret/jenkins/settings.xml'
      }
    }
    stage('Deploy') {
      steps {
        sh 'mvn fabric8:deploy'
      }
    }
    stage('Promote') {
      steps {
        sh 'oc tag myproject/order:latest myproject/order:qa'
      }
    }
  }
}