multibranchPipelineJob('CI-Pipelines/cart') {
    branchSources {
        branchSources {
            github {
                id('23232323') // IMPORTANT: use a constant and unique identifier
                scanCredentialsId('GitHub')
                repository('dotunprom/cart')
            }
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}

