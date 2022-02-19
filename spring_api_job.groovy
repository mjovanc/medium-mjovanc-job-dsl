//---------------------------------------------------------------------------------
// spring_api_job.groovy
//---------------------------------------------------------------------------------
// A pipeline job for the Spring Boot API application
//---------------------------------------------------------------------------------

pipelineJob('Spring-API') {
    description('Build Spring Boot API')

    triggers {
        githubPush()
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('git@github.com:mjovanc/qryptic-api.git')
                        credentials('mjovanc-jenkins-key')
                    }

                    branches('master')
                    scriptPath('jenkins/main.jenkinsfile')
                    extensions {
                        cleanBeforeCheckout()
                    }
                }
            }
        }
    }
}
