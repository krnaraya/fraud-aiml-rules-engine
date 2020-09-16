# Fraud Rules Engine

This project uses Quarkus, the Supersonic Subatomic Java Framework and Kogito, a cloud native business automation and decision (rule) engine.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .
If you want to learn more about Quarkus, please visit its website: https://kogito.kie.org/.

## Prerequistes

Install a Openshift 4.x Cluster - Refer https://docs.openshift.com/container-platform/4.5/welcome/index.html

Create a Openshift project (namesapce) with any name.

Install AMQ Streams Operator in Openshift Cluster on to this namesapce  - Refer https://access.redhat.com/documentation/en-us/red_hat_amq/7.7/html/deploying_and_upgrading_amq_streams_on_openshift/deploy-intro_str

Install a Kafka Cluster (name it my-cluster, if not feel free the update the application properties to the correct kafka configuration) from the AMQ streams operator - Refer https://access.redhat.com/documentation/en-us/red_hat_amq/7.7/html/deploying_and_upgrading_amq_streams_on_openshift/deploy-tasks_str#kafka-cluster-str

Create a Kafka  Topic named transactions from the AMQ streams Operator

Create a Kafka  Topic named displaymode from the AMQ streams Operator

Create a Kafka  Topic named manualmode from the AMQ streams Operator

Create a Kafka  Topic named automode from the AMQ streams Operator

## Packaging and running the application

Login to your openshift cluster - oc login <login_url>

Switch to you project (namesapace) - oc project <project_name>

```


```



## Testing the application


