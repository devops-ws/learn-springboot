build-image:
	docker build . -t ghcr.io/devops-ws/learn-springboot:master
test-e2e:
	cd e2e && ./start.sh
run-demo:
	cd e2e && docker compose up server
