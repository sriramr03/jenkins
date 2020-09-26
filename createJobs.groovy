pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('immigrationServiceJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sriramr03/immigration-services.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}