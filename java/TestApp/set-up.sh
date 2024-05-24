kubectl delete -f ./deployment.yaml
kubectl create -f ./deployment.yaml
kubectl delete -f ./svc.yaml
kubectl create -f ./svc.yaml