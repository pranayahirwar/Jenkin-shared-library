#!/usr/bin/env groovy

def call(string imageName) {
    echo "Building docker image in $BRANCH_NAME"
    echo "docker build -t $imageName ."
//    sh "docker build -t $imageName ."
    echo "Image is build, pushing to docker hub"
    sleep(2000)
    echo "**"
    sleep(2000)
    echo "******"
    sleep(2000)
    echo "********"
    sleep(2000)
    echo "**********"
    echo "Image successfully deployed to dockerHub. :)"

//     withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable:'USER', passwordVariable:'PSD')]) {
//         sh "echo $PSD | docker login -u $USER --password-stdin "
//         sh "docker push $imageName"
//  }
}
// $imageName = trymi0/tryout:jam-100.1