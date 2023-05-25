// def docker(name){
//     sh 'docker tag ${name} arunbabu01/${name}'
//     // sh 'docker login -u arunbabu01 -p Arunappu@123#'
//     // sh 'docker push arunbabu01/${name}'
// }



def call(name){
    echo "hey ${name}"

    sh "docker tag ${name} arunbabu01/${name}"
    sh "docker login -u arunbabu01 -p Arunappu@123#"
    sh "docker push arunbabu01/${name}"
}
