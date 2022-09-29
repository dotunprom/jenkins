multibranchPipelineJob('CI-Pipelines/b_cart') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/dotunprom/b_cart.git')
            credentialsId('github-ci')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}