// def docker(name){
//     sh 'docker tag ${name} arunbabu01/${name}'
//     // sh 'docker login -u arunbabu01 -p Arunappu@123#'
//     // sh 'docker push arunbabu01/${name}'
// }



def call(name){
    echo "the image name willbe  arunbabu01/${name}"

    sh "docker tag ${name} arunbabu01/${name}"
    sh "docker login -u $user -p $password"
    sh "docker push arunbabu01/${name}"
}
