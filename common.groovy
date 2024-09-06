def updateGithubStatus(state){
    withCredential([usernamePassword( credentialId: 'github_dryrun_experiment',usernameVariable:'USER',passwordVariable: 'PASSWORD')]){
        sh """
            curl -- location 
            'https://api.GitHub.com/repos/${USER}/Robot-Playground/statuses/${GIT_COMMIT}?null' \
                --header 'Content-Type: application/json \
                --header 'Authorization: Bearer ${PASSWORD}' \
                --data '{"state": "${state}", "context": "Dryrun", "description": "Jenkins", "targe_url": "${BUILD_URL}"}'
        """
    }
}

return this