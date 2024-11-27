build-image:
	docker build . -t ghcr.io/devops-ws/learn-springboot:master
test-e2e:
	cd e2e && ./start.sh
run-demo:
	cd e2e && docker compose up server
run:
	mvn package && java -jar target/demo-0.0.1-SNAPSHOT.jar
run-8081:
	mvn package && java -Dserver.port=8081 -jar target/demo-0.0.1-SNAPSHOT.jar
local-test:
	atest run -p e2e/test-suite.yaml

init-env:
	curl https://linuxsuren.github.io/tools/install.sh|bash
	hd i cli/cli
	hd i atest
	gh repo fork --remote
	gh repo set-default devops-ws/learn-springboot
