#!/bin/bash
set -e

mkdir -p /var/data

atest run -p test-suite-graphql.yaml
atest run -p test-suite.yaml --report md --swagger-url "${SERVER}/v3/api-docs" --level debug

# cannot get the token in a pr
# if [[ "$PULL_REQUEST" == "" || "$GITHUB_TOKEN" == "" ]];
# then
#     atest run -p test-suite.yaml --report md
# else
#     atest run -p test-suite.yaml --report github \
#         --report-github-identity e2e-testing \
#         --report-file /var/data/report.json \
#         --report-github-repo ${OWNER:-devops-ws}/learn-springboot \
#         --report-github-pr ${PULL_REQUEST:-0}
# fi
