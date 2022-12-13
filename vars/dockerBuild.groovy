#!/usr/bin/env groovy

def call() {
    echo "Building docker image..."
    sh "docker build -t trymi0/tryout:jam-100.1 ."
    echo "Image is build, but no pushed."
//     withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable:'USER', passwordVariable:'PSD')]) {
//         sh "echo $PSD | docker login -u $USER --password-stdin "
//         sh "docker push trymi0/tryout:jam-100.1"
//  }
}