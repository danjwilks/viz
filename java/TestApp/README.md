# Simple Java Program

Complete workflow:
1. Build Dockerfile
   * `TestApp % docker build . -t vakoi/test-app`
2. Push Dockerfile
   * Go to docker desktop and push the image that was built.
3. Create Deployment in minikube
   * `TestApp % start minikube`
   * `TestApp % kubectl create -f ./deployment.yaml`
4. View Logs
   * `TestApp % minikube kubectl get pods`
   * `TestApp % minikube kubectl logs <podname>` 

