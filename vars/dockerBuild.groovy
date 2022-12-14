#!/usr/bin/env groovy
import functionPackage
import com.example.Docker

def call(String imageName) {
    return new Docker(this).dockerbuildImage(imageName)
//     withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable:'USER', passwordVariable:'PSD')]) {
//         sh "echo $PSD | docker login -u $USER --password-stdin "
//         sh "docker push $imageName"
//  }
}
// $imageName = trymi0/tryout:jam-100.1