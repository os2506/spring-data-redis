pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
             withMaven(maven : 'apache-maven-3.9.4') {
                // Checkout your source code from version control (e.g., Git)
                checkout scm
                }
            }
        }
        
        stage('Build') {
            steps {
              withMaven(maven : 'apache-maven-3.9.4') {
                bat'mvn clean compile package'
            	}
            }
        }
        
        stage('Unit Test') {
            steps {
              withMaven(maven : 'apache-maven-3.9.4') {
                // Run tests
                bat 'mvn test'
                }
            }
        }
        
        stage('Integration Test') {
            steps {
              withMaven(maven : 'apache-maven-3.9.4') {
                // Run integration tests
                bat 'mvn integration-test'
                }
            }
        }
        
        
        stage('Security verification') {
            steps {
              withMaven(maven : 'apache-maven-3.9.4') {
                // Run check security
                bat 'mvn dependency-check:check'
                }
            }
        }
        
        
    }
    
   
}
