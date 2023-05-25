def docker (name) {
    sh 'docker tag ${name} arunbabu01/${name}'
    sh 'docker login -u $dockerhub_USR -p $dockerhub_PSW'
    sh 'docker push arunbabu01/${name}'
}

