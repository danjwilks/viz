# Simple Java Program

Complete workflow:
1. Package project into a jar file
   * Run Maven Package
2. Build Dockerfile
   * `docker build . -t vakoi/test-app`
3. Push Dockerfile
   * Go to docker desktop and push the image that was built.
4. Create Deployment & Service in minikube
   * `minikube start`
   * `bash set-up.sh` OR
   * `kubectl delete -f ./deployment.yaml`
   * `kubectl create -f ./deployment.yaml`
   * `kubectl delete -f ./svc.yaml`
   * `kubectl create -f ./svc.yaml`

Debugging
   * `kubectl get pods`
   * `kubectl logs <podname>` OR `kubectl logs deployment/test-app`
   * `kubectl exec -it <podname> -- bash`