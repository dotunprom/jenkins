multibranchPipelineJob('CI-Pipelines/cart') {
    branchSources {
        branchSources {
            github {
                id('23232323') // IMPORTANT: use a constant and unique identifier
                scanCredentialsId('GitHub')
                repository('https://github.com/dotunprom/cart')
            }
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}

