# AWS — Complete Cheat Sheet

> Fast technical revision companion for AWS architecture, interviews, cloud engineering, and production systems.



---

<!-- 00_MASTER_INDEX.md -->

# AWS — Complete Cheat Sheet Pack

**Purpose:** Fast revision for AWS architecture, cloud engineering, DevOps, security, system design, interviews, production operations, migration, and training.

## Revision Modes

### 30 Seconds
Open `01_30_SECOND_RECALL.md`.

### 2 Minutes
Open a topic and scan:
**What → Why → Architecture → Decision → Trap**

### 10 Minutes
Read:
**What → Why → How → Visual → Trade-offs → Security → Cost → Production Use → Interview Recall**

---

## Part A — Cloud & Architecture Foundations

1. AWS Snapshot
2. Regions / AZs / Edge
3. Shared Responsibility Model
4. Well-Architected Framework
5. Multi-Account Strategy
6. Organizations / OUs / SCPs
7. Control Tower / Landing Zone
8. IAM / Federation / Roles
9. IAM Policy Evaluation
10. KMS / Secrets / Certificates

## Part B — Networking

11. VPC Mental Model
12. Public vs Private Subnets
13. Route Tables / IGW / NAT
14. Security Groups vs NACLs
15. VPC Endpoints / PrivateLink
16. VPC Peering vs Transit Gateway
17. Route 53
18. CloudFront
19. Global Accelerator
20. Direct Connect / VPN
21. Network Firewall / WAF / Shield
22. ALB vs NLB vs GWLB

## Part C — Compute & Containers

23. EC2
24. Auto Scaling
25. Lambda
26. ECS
27. EKS
28. Fargate
29. EC2 vs Lambda vs Containers
30. ECS vs EKS
31. App Runner / Managed App Hosting

## Part D — Storage

32. S3
33. S3 Storage Classes
34. S3 Versioning / Lifecycle / Replication
35. EBS
36. EFS
37. FSx
38. Storage Gateway / Hybrid Storage
39. S3 vs EBS vs EFS

## Part E — Databases & Data

40. RDS
41. Aurora
42. DynamoDB
43. RDS/Aurora vs DynamoDB
44. ElastiCache / MemoryDB
45. Redshift
46. OpenSearch
47. Neptune
48. Database Selection Guide

## Part F — Serverless / Integration / Microservices

49. API Gateway
50. SQS
51. SNS
52. EventBridge
53. SQS vs SNS vs EventBridge
54. Step Functions
55. Lambda + API Gateway Architecture
56. Event-Driven Architecture
57. Saga / Orchestration on AWS
58. Outbox / CDC / DMS
59. Kinesis
60. Amazon MSK

## Part G — Observability / Security / Governance

61. CloudWatch
62. CloudTrail
63. AWS Config
64. X-Ray / OpenTelemetry
65. GuardDuty
66. Security Hub
67. Inspector
68. Macie
69. Security Architecture
70. Backup / Resilience / DR

## Part H — DevOps / IaC / Delivery

71. CloudFormation
72. AWS CDK
73. CI/CD
74. Blue-Green / Canary
75. Systems Manager
76. Parameter Store vs Secrets Manager

## Part I — Cost / Performance / Reliability

77. Cost Optimization
78. Savings Plans / RI / Spot
79. Performance Decision Guide
80. HA / Multi-AZ / Multi-Region
81. DR Strategies
82. RTO / RPO
83. Troubleshooting Matrix
84. Production Readiness Checklist

## Part J — Data / AI / Modern AWS

85. Data Lake Architecture
86. Glue / Athena / Lake Formation
87. SageMaker
88. Amazon Bedrock
89. Bedrock RAG / Knowledge Bases
90. Bedrock Guardrails / Evaluation

## Part K — Interview / Architecture Recall

91. Common AWS Architectures
92. Web App Reference Architecture
93. Serverless Reference Architecture
94. Microservices Reference Architecture
95. Multi-Region Reference Architecture
96. High-Value Comparison Matrix
97. Architecture Decision Tree
98. Interview Traps
99. One-Page Architecture Recall
100. CLI / Commands Recall
101. Practice Questions
102. Sources & Accuracy Notes


---

<!-- 01_30_SECOND_RECALL.md -->

# AWS — 30-Second Recall

## Formula

**AWS Architecture = Identity + Network + Compute + Data + Resilience + Observability + Automation + Cost Governance**

## Core Flow

```text
Users
  ↓
Route 53
  ↓
CloudFront + WAF
  ↓
ALB / API Gateway
  ↓
EC2 / ECS / EKS / Lambda
  ↓
RDS / Aurora / DynamoDB / S3
```

## Must Remember

```text
IAM Role > long-term access key
Multi-AZ ≠ Multi-Region
Security Group = stateful
NACL = stateless
Public subnet = route to IGW
NAT Gateway = outbound internet for private IPv4 workloads
S3 = object
EBS = block
EFS = shared file
ALB = Layer 7
NLB = Layer 4
SQS = queue
SNS = pub/sub
EventBridge = event routing
CloudWatch = observability
CloudTrail = API audit
```

## Well-Architected Pillars

```text
Operational Excellence
Security
Reliability
Performance Efficiency
Cost Optimization
Sustainability
```

## Interview Traps

- Public subnet alone does not give an EC2 instance internet access.
- NAT Gateway does not make a private instance inbound-public.
- IAM role uses temporary credentials.
- Read Replica is not the same as Multi-AZ standby.
- S3 is not a file system.
- Lambda is not always cheaper than EC2/containers.


---

<!-- 02_AWS_SNAPSHOT.md -->

# AWS Snapshot

## Mental Model

```text
Global Infrastructure
      ↓
Accounts / Organization
      ↓
Identity & Governance
      ↓
VPC / Network
      ↓
Compute
      ↓
Storage / Database
      ↓
Integration
      ↓
Observability / Security
      ↓
Automation / Cost
```

## Architecture Principle

Do not select services independently.

Design around:

```text
business requirement
availability target
latency
security
data model
scale pattern
team capability
cost
```

## Core Rule

Managed services reduce undifferentiated operational work, but every abstraction introduces constraints and pricing trade-offs.


---

<!-- 03_REGIONS_AZ_EDGE.md -->

# Regions, Availability Zones & Edge

## Region

A geographic AWS area containing multiple isolated Availability Zones.

## Availability Zone

One or more discrete data centers with independent infrastructure.

## Edge

Used by services such as:

```text
CloudFront
Route 53
Global Accelerator
```

## Availability Pattern

```text
Region
 ├── AZ-A
 ├── AZ-B
 └── AZ-C
```

## Rule

For production regional workloads, distribute across multiple AZs unless requirements clearly justify otherwise.

## Trap

Multi-AZ protects against AZ failure; it does not provide full Region-failure protection.


---

<!-- 04_SHARED_RESPONSIBILITY.md -->

# Shared Responsibility Model

## AWS — Security **of** the Cloud

Examples:

```text
physical facilities
hardware
core infrastructure
managed-service underlying platform
```

## Customer — Security **in** the Cloud

Examples:

```text
IAM
data
network configuration
application security
OS patching on EC2
encryption choices
```

## Responsibility Changes by Service

```text
EC2 → customer manages more
RDS → AWS manages OS/database infrastructure
Lambda → AWS manages more runtime infrastructure
```

## Trap

Managed service does not mean AWS owns your data-access policy or application security.


---

<!-- 05_WELL_ARCHITECTED.md -->

# AWS Well-Architected Framework

## Six Pillars

```text
1. Operational Excellence
2. Security
3. Reliability
4. Performance Efficiency
5. Cost Optimization
6. Sustainability
```

## Review Questions

```text
How do we operate?
How do we protect?
How do we recover?
How do we scale efficiently?
How do we control spend?
How do we reduce resource waste?
```

## Rule

Architecture quality is multi-dimensional.

A design that is fast but insecure or unaffordable is not well-architected.


---

<!-- 06_MULTI_ACCOUNT.md -->

# Multi-Account Strategy

## Why Multiple Accounts

AWS accounts are strong isolation and governance boundaries.

Use them for:

```text
production
non-production
security
logging
shared services
networking
sandbox
business units
```

## Benefits

```text
blast-radius reduction
billing separation
quota isolation
policy boundaries
security isolation
```

## Typical Shape

```text
Organization
 ├── Security OU
 ├── Infrastructure OU
 ├── Workloads-Prod OU
 ├── Workloads-Test OU
 └── Sandbox OU
```

## Trap

One giant AWS account for an enterprise creates avoidable security, quota, billing, and operational coupling.


---

<!-- 07_ORGANIZATIONS_SCP.md -->

# AWS Organizations / OUs / SCPs

## Organizations

Centrally manages AWS accounts.

## Organizational Unit

Groups accounts for governance.

## SCP

Service Control Policy defines maximum available permissions for accounts/OUs.

## Important

```text
SCP does not grant permission.
```

Effective access still requires IAM permissions.

## Mental Model

```text
SCP boundary
   ∩
IAM permissions
   ∩
resource policies
   ∩
other policy controls
=
effective permission
```

## Trap

An Allow in an SCP does not itself give a user access.


---

<!-- 08_CONTROL_TOWER.md -->

# AWS Control Tower / Landing Zone

## What

Control Tower helps set up and govern a multi-account AWS environment.

## Landing Zone

```text
Organization
+ account structure
+ identity
+ logging
+ controls
+ governance baseline
```

## Integrates With

```text
AWS Organizations
IAM Identity Center
Service Catalog
other governance services
```

## Good Fit

Enterprise account provisioning and standardized governance.

## Trap

Control Tower does not replace workload architecture; it establishes the governed environment in which workloads run.


---

<!-- 09_IAM.md -->

# IAM / Federation / Roles

## Preferred Human Access

```text
Identity Provider
  ↓
IAM Identity Center / federation
  ↓
temporary credentials
```

## Preferred Workload Access

```text
EC2 / Lambda / ECS / EKS workload
  ↓
IAM Role
  ↓
temporary credentials
```

## Avoid

Long-lived access keys when roles/federation can be used.

## Core Concepts

```text
User
Group
Role
Policy
Resource Policy
Permission Boundary
Session Policy
```

## Best Practices

```text
MFA
least privilege
temporary credentials
Access Analyzer
remove unused access
protect root
```


---

<!-- 100_ONE_PAGE_RECALL.md -->

# AWS — One-Page Architecture Recall

```text
                        Users
                          │
                       Route 53
                          │
                 CloudFront + WAF
                          │
              ┌───────────┴───────────┐
              ▼                       ▼
         API Gateway                 ALB
              │                       │
           Lambda              ECS / EKS / EC2
              │                       │
              ├──────────┬────────────┤
              ▼          ▼            ▼
          DynamoDB    Aurora/RDS      S3
              │
         EventBridge
              │
             SQS
              │
          Consumers
```

## Security

```text
Organizations / Control Tower
IAM / Identity Center
SCP
KMS
Secrets Manager
WAF / Shield
GuardDuty / Security Hub
CloudTrail / Config
```

## Reliability

```text
Multi-AZ
Auto Scaling
Backup
Retry/queue
Route 53
DR / Multi-Region when justified
```

## Operations

```text
CloudWatch
Tracing
IaC
CI/CD
Budgets
```


---

<!-- 101_COMMANDS.md -->

# AWS CLI / Commands Recall

## Identity

```bash
aws sts get-caller-identity
```

## Regions

```bash
aws ec2 describe-regions
```

## S3

```bash
aws s3 ls
aws s3 cp file.txt s3://bucket/
aws s3 sync ./dist s3://bucket/
```

## EC2

```bash
aws ec2 describe-instances
```

## CloudFormation

```bash
aws cloudformation describe-stacks
```

## Lambda

```bash
aws lambda list-functions
```

## ECS

```bash
aws ecs list-clusters
```

## EKS

```bash
aws eks list-clusters
```

## Logs

```bash
aws logs describe-log-groups
```

## Rule

Use named profiles/SSO/federation rather than embedding static credentials in scripts.


---

<!-- 102_PRACTICE_QUESTIONS.md -->

# AWS Practice Questions

1. Region vs AZ?
2. What are the six Well-Architected pillars?
3. What is AWS shared responsibility?
4. Why use multiple AWS accounts?
5. Organizations vs Control Tower?
6. What is an SCP?
7. IAM user vs role?
8. Why temporary credentials?
9. How does explicit deny work?
10. Public vs private subnet?
11. IGW vs NAT Gateway?
12. SG vs NACL?
13. VPC endpoint vs NAT?
14. Peering vs Transit Gateway?
15. Route 53 routing policies?
16. CloudFront vs Global Accelerator?
17. ALB vs NLB?
18. EC2 vs Lambda?
19. ECS vs EKS?
20. What is Fargate?
21. S3 vs EBS vs EFS?
22. S3 storage classes?
23. Versioning vs replication vs backup?
24. RDS Multi-AZ vs Read Replica?
25. Aurora vs RDS?
26. DynamoDB data modeling?
27. RDS vs DynamoDB?
28. SQS vs SNS vs EventBridge?
29. When Step Functions?
30. Kinesis vs MSK?
31. CloudWatch vs CloudTrail vs Config?
32. GuardDuty vs Security Hub?
33. KMS vs Secrets Manager?
34. CloudFormation vs CDK?
35. What is canary deployment?
36. Savings Plans vs Spot?
37. Multi-AZ vs Multi-Region?
38. DR strategies?
39. RTO vs RPO?
40. What is a landing zone?
41. How would you design a highly available web app?
42. How would you design a serverless API?
43. How would you design event-driven microservices?
44. How would you troubleshoot an EC2 instance with no internet?
45. How would you troubleshoot S3 AccessDenied?
46. Bedrock vs SageMaker?
47. How does Bedrock RAG work?
48. What are Bedrock Guardrails?
49. How do you secure a multi-account enterprise?
50. How do you control AWS cost?


---

<!-- 103_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

This pack is based on current AWS architecture practices and official AWS documentation.

Primary reference areas:

- AWS Well-Architected Framework
- AWS IAM best practices
- AWS Organizations / Control Tower
- Amazon VPC documentation
- Amazon EC2 / Lambda / ECS / EKS / Fargate
- Amazon S3 / EBS / EFS / FSx
- Amazon RDS / Aurora / DynamoDB
- Amazon SQS / SNS / EventBridge / Step Functions
- Amazon CloudWatch / CloudTrail / Config
- AWS security services
- Amazon Bedrock / Knowledge Bases / Guardrails / evaluation

## Verified Current Guidance

### Well-Architected
AWS Well-Architected has six pillars:

```text
Operational Excellence
Security
Reliability
Performance Efficiency
Cost Optimization
Sustainability
```

### IAM
Current AWS guidance emphasizes:

```text
federation for human access
temporary credentials
IAM roles for workloads
MFA
least privilege
root-user protection
```

### Multi-Account
AWS recommends multiple accounts as isolation/resource boundaries and Control Tower as a landing-zone governance option.

### Networking
A public subnet is a subnet whose route table routes internet-bound traffic to an Internet Gateway.

### Messaging
AWS's decision guidance distinguishes:

```text
SQS → queue
SNS → pub/sub
EventBridge → event routing
```

### DynamoDB
Global tables support multi-Region replication. Modern global-table capabilities continue to evolve, so confirm exact consistency/Region features for the target deployment.

### Bedrock
Bedrock includes capabilities for foundation-model applications, Knowledge Bases/RAG, Guardrails, and evaluation.

## Accuracy Rule

AWS evolves continuously.

Before production design, verify:
- target Region availability
- service quotas
- pricing
- feature release date
- exact SLA
- current API/version documentation


---

<!-- 10_IAM_POLICY_EVALUATION.md -->

# IAM Policy Evaluation

## Policy Components

```json
{
  "Effect": "Allow",
  "Action": "s3:GetObject",
  "Resource": "arn:aws:s3:::bucket/*"
}
```

## Key Rule

```text
Explicit Deny
beats
Allow
```

## Decision Concept

```text
Identity Policy
Resource Policy
SCP
Permission Boundary
Session Policy
Conditions
        ↓
Effective Access
```

## Conditions

Use for:

```text
source IP
VPC endpoint
MFA
tags
principal
region
```

## Trap

IAM debugging requires evaluating all applicable policy types, not only the user/role policy.


---

<!-- 11_KMS_SECRETS_CERTS.md -->

# KMS / Secrets / Certificates

## AWS KMS

Manages encryption keys and cryptographic operations.

## Secrets Manager

Stores and can rotate secrets.

## ACM

Manages TLS certificates for integrated AWS services.

## Pattern

```text
Application
  ↓ IAM
Secrets Manager
  ↓
encrypted with KMS
```

## Rule

Do not hardcode:

```text
passwords
API keys
private keys
DB credentials
```

## Trap

KMS encrypts/protects key usage; it is not a general secret-store replacement.


---

<!-- 12_VPC.md -->

# VPC Mental Model

## VPC

Logically isolated virtual network.

```text
VPC 10.0.0.0/16
 ├── Public Subnet AZ-A
 ├── Private App AZ-A
 ├── Private DB AZ-A
 ├── Public Subnet AZ-B
 ├── Private App AZ-B
 └── Private DB AZ-B
```

## Building Blocks

```text
CIDR
subnet
route table
IGW
NAT
Security Group
NACL
VPC Endpoint
DNS
```

## Rule

Plan CIDR space with future connectivity in mind.

## Trap

Overlapping CIDRs make VPC-to-VPC/hybrid networking painful.


---

<!-- 13_PUBLIC_PRIVATE_SUBNET.md -->

# Public vs Private Subnets

## Public Subnet

A subnet whose route table has a route to an Internet Gateway.

```text
0.0.0.0/0 → IGW
```

## Private Subnet

No direct route to IGW.

May use:

```text
NAT Gateway
VPC endpoints
Transit Gateway
VPN
Direct Connect
```

## Important

An EC2 instance in a public subnet typically still needs a public IPv4/Elastic IP for IPv4 internet communication.

## Trap

“Public subnet” describes routing—not whether every resource is automatically publicly reachable.


---

<!-- 14_ROUTES_IGW_NAT.md -->

# Route Tables / IGW / NAT

## Internet Gateway

Provides VPC internet routing target.

## NAT Gateway

Allows private IPv4 resources to initiate outbound connections through a public NAT Gateway.

## Pattern

```text
Private EC2
   ↓
Private Route Table
0.0.0.0/0 → NAT Gateway
   ↓
Public Subnet
   ↓
IGW
   ↓
Internet
```

## High Availability

Use NAT architecture aligned to AZ/resilience requirements.

## Trap

NAT Gateway does not accept unsolicited inbound internet connections to private workloads.


---

<!-- 15_SG_NACL.md -->

# Security Group vs NACL

| Security Group | NACL |
|---|---|
| resource/ENI level | subnet level |
| stateful | stateless |
| allow rules | allow + deny |
| return traffic automatic | return rules required |
| primary workload firewall | coarse subnet guardrail |

## Rule

Use Security Groups as the primary workload-level network control.

## Trap

NACL rule order matters; Security Groups do not use ordered deny rules.


---

<!-- 16_VPC_ENDPOINTS.md -->

# VPC Endpoints / PrivateLink

## Goal

Access supported services without traversing the public internet.

## Gateway Endpoints

Commonly:

```text
S3
DynamoDB
```

## Interface Endpoints

Powered by AWS PrivateLink.

```text
VPC
 ↓
Private ENI endpoint
 ↓
AWS/partner/private service
```

## Benefits

```text
private connectivity
security
reduced NAT dependence for supported traffic
```

## Trap

Endpoint policies and service/resource policies still matter.


---

<!-- 17_PEERING_TGW.md -->

# VPC Peering vs Transit Gateway

| VPC Peering | Transit Gateway |
|---|---|
| point-to-point | hub-and-spoke |
| simple few VPCs | scalable many networks |
| non-transitive | transitive routing hub |
| lower architecture overhead | centralized routing |

## Transit Gateway

```text
VPC A ─┐
VPC B ─┼→ TGW → VPN/DX
VPC C ─┘
```

## Trap

VPC peering is not transitive.


---

<!-- 18_ROUTE53.md -->

# Amazon Route 53

## Capabilities

```text
DNS
domain registration
health checks
routing policies
```

## Routing Policies

```text
Simple
Weighted
Latency
Failover
Geolocation
Geoproximity
Multi-value
```

## Architecture

```text
example.com
  ↓ Route 53
CloudFront / ALB / API endpoint
```

## Trap

DNS failover is influenced by DNS caching/TTL; it is not instant request-by-request failover.


---

<!-- 19_CLOUDFRONT.md -->

# Amazon CloudFront

## What

Content delivery network (CDN).

## Flow

```text
User
 ↓
Edge Location
 ↓ cache miss
Origin
(S3 / ALB / API / custom)
```

## Benefits

```text
lower latency
caching
TLS
WAF integration
origin protection patterns
```

## Good Fits

```text
static web
downloads
APIs
media
global content
```

## Trap

Cache behavior, cache keys, headers, cookies, and query strings must be designed deliberately.


---

<!-- 20_GLOBAL_ACCELERATOR.md -->

# AWS Global Accelerator

## What

Uses AWS global network and anycast static IPs to route users to healthy regional endpoints.

## Good Fits

```text
TCP/UDP applications
static global IP requirement
multi-Region failover
global performance
```

## Compare

```text
CloudFront → CDN / HTTP content caching
Global Accelerator → network traffic acceleration / static anycast IP
```

## Trap

Global Accelerator does not cache application content like CloudFront.


---

<!-- 21_DX_VPN.md -->

# Direct Connect / Site-to-Site VPN

## VPN

Encrypted connectivity over the internet.

## Direct Connect

Dedicated network connection into AWS.

## Hybrid Pattern

```text
On-Prem
 ├── Direct Connect → AWS
 └── VPN backup      → AWS
```

## Decision

Use based on:

```text
bandwidth
latency consistency
cost
setup time
resilience
security requirements
```

## Trap

Direct Connect by itself is not encryption.


---

<!-- 22_NETWORK_SECURITY.md -->

# Network Firewall / WAF / Shield

## AWS WAF

Layer 7 web request filtering.

## AWS Shield

DDoS protection capabilities.

## AWS Network Firewall

Managed network firewall for VPC traffic.

## Placement

```text
Internet
 ↓
CloudFront / ALB / API Gateway
 ↓ WAF
Application
```

and/or

```text
VPC traffic path
 ↓
Network Firewall
```

## Trap

WAF is not a replacement for secure application code or IAM.


---

<!-- 23_LOAD_BALANCERS.md -->

# ALB vs NLB vs GWLB

| ALB | NLB | GWLB |
|---|---|---|
| Layer 7 | Layer 4 | network virtual appliances |
| HTTP/HTTPS | TCP/UDP/TLS | service insertion |
| host/path routing | very high network performance | firewall/appliance fleets |
| web/apps | low-level network workloads | security appliances |

## Rule

Choose the lowest layer that meets the routing/application requirement.

## Trap

ALB path routing is an HTTP feature; NLB does not provide the same L7 routing behavior.


---

<!-- 24_EC2.md -->

# Amazon EC2

## What

Virtual machines in AWS.

## Decisions

```text
instance family
CPU/memory
AMI
storage
network
purchase model
AZ
autoscaling
```

## Families Concept

```text
General purpose
Compute optimized
Memory optimized
Storage optimized
Accelerated/GPU
```

## Security

Prefer:

```text
IAM role
SSM
private subnet
patched AMI
least-open Security Group
```

## Trap

EC2 gives maximum control but also maximum infrastructure responsibility among common AWS compute choices.


---

<!-- 25_AUTOSCALING.md -->

# EC2 Auto Scaling

## Components

```text
Launch Template
Auto Scaling Group
Scaling Policy
Health Checks
```

## Strategies

```text
Target Tracking
Step Scaling
Scheduled Scaling
Predictive approaches
```

## Common Metric

```text
CPU
ALB requests/target
custom CloudWatch metric
```

## Rule

Scale on the metric that represents workload pressure.

## Trap

Autoscaling cannot solve a bottleneck in a fixed-capacity downstream database.


---

<!-- 26_LAMBDA.md -->

# AWS Lambda

## What

Event-driven serverless compute.

## Flow

```text
Event
 ↓
Lambda
 ↓
business logic
 ↓
service/database
```

## Sources

```text
API Gateway
S3
SQS
EventBridge
DynamoDB Streams
Kinesis
```

## Good Fits

```text
bursty workloads
event processing
API backends
automation
short-lived jobs
```

## Design Concerns

```text
timeouts
concurrency
cold starts
idempotency
retries
DLQ/destinations
VPC networking
```

## Trap

Lambda concurrency can overwhelm databases/downstream APIs if unbounded.


---

<!-- 27_ECS.md -->

# Amazon ECS

## What

AWS-native container orchestration.

## Core Concepts

```text
Cluster
Task Definition
Task
Service
Capacity Provider
```

## Runtime

```text
ECS on EC2
or
ECS on Fargate
```

## Good Fit

Teams that want managed container orchestration without Kubernetes complexity.

## Trap

Task definition is a deployment/runtime specification, not a Docker image itself.


---

<!-- 28_EKS.md -->

# Amazon EKS

## What

Managed Kubernetes control plane on AWS.

## Runtime Options

```text
EC2 nodes
managed node groups
Fargate
```

## Good Fit

```text
Kubernetes standardization
portable ecosystem
platform teams
complex orchestration
```

## Costs

```text
cluster/platform complexity
Kubernetes skills
addons
networking
security
upgrades
```

## Trap

EKS is not automatically the best container platform just because Kubernetes is popular.


---

<!-- 29_FARGATE.md -->

# AWS Fargate

## What

Serverless compute capacity for containers.

Used with:

```text
ECS
EKS
```

## Benefit

No worker EC2 fleet management.

## Good Fits

```text
variable container workloads
teams avoiding node management
isolated tasks/services
```

## Trade-offs

```text
less node-level control
pricing differences
platform constraints
```

## Trap

Fargate is compute for containers, not a standalone orchestration system.


---

<!-- 30_COMPUTE_DECISION.md -->

# EC2 vs Lambda vs Containers

| EC2 | Lambda | ECS/EKS |
|---|---|---|
| full VM control | function/event | container |
| long-running | event-driven | long-running/services/jobs |
| manage OS | no server mgmt | orchestration |
| flexible | strong constraints | portable packaging |
| steady workloads | bursty/serverless | service platforms |

## Decision

```text
Need OS/control? → EC2
Event/function model? → Lambda
Containerized service? → ECS/EKS
```

## Rule

Operational model is often more important than raw technology preference.


---

<!-- 31_ECS_VS_EKS.md -->

# ECS vs EKS

| ECS | EKS |
|---|---|
| AWS-native | Kubernetes |
| simpler AWS integration | broad K8s ecosystem |
| less platform overhead | greater portability/ecosystem |
| task/service model | pod/deployment model |

## Choose ECS When

```text
AWS-first
small platform team
simplicity
```

## Choose EKS When

```text
Kubernetes skills
K8s ecosystem
cross-environment standard
complex platform requirements
```


---

<!-- 32_APP_RUNNER.md -->

# AWS App Runner / Managed App Hosting

## Idea

Higher-level managed application/container hosting.

## Good Fit

```text
web apps
APIs
teams wanting minimal infrastructure orchestration
```

## Compared With ECS/EKS

```text
App Runner → more abstraction
ECS       → more orchestration control
EKS       → Kubernetes control/ecosystem
```

## Rule

Choose the highest-level managed service that still meets architecture requirements.


---

<!-- 33_S3.md -->

# Amazon S3

## What

Durable object storage.

## Model

```text
Bucket
 └── Object
      ├── key
      ├── data
      └── metadata
```

## Uses

```text
data lake
static assets
backup
logs
documents
media
artifacts
```

## Important Features

```text
versioning
lifecycle
replication
encryption
Object Lock
event notifications
```

## Trap

S3 is object storage, not a traditional mounted block/file system.


---

<!-- 34_S3_CLASSES.md -->

# S3 Storage Classes

## Selection Dimensions

```text
access frequency
retrieval speed
resilience
storage duration
cost
```

## Families

```text
S3 Standard
Intelligent-Tiering
Standard-IA
One Zone-IA
Glacier Instant Retrieval
Glacier Flexible Retrieval
Glacier Deep Archive
```

## Rule

Lifecycle data automatically when access patterns are predictable.

## Trap

Cheap storage class may have retrieval/minimum-duration charges that dominate for the wrong workload.


---

<!-- 35_S3_LIFECYCLE_REPLICATION.md -->

# S3 Versioning / Lifecycle / Replication

## Versioning

Protects against accidental overwrite/delete scenarios.

## Lifecycle

```text
Standard
 ↓
IA
 ↓
Archive
 ↓
Expire
```

## Replication

```text
Same-Region Replication
Cross-Region Replication
```

## Use Cases

```text
compliance
DR
data locality
log copies
```

## Trap

Replication is not a substitute for every backup/recovery requirement.


---

<!-- 36_EBS.md -->

# Amazon EBS

## What

Persistent block storage for EC2.

## Use

```text
OS disks
databases
low-latency block workloads
```

## Concepts

```text
volume type
IOPS
throughput
snapshot
encryption
AZ scope
```

## Snapshot

Backed by AWS-managed storage service and useful for backup/restore workflows.

## Trap

An EBS volume is Availability-Zone scoped; architecture must account for AZ placement.


---

<!-- 37_EFS.md -->

# Amazon EFS

## What

Managed shared file storage using NFS semantics.

## Use

```text
multiple EC2 instances
shared web content
Linux shared filesystem
container persistent shared file access
```

## Compare

```text
EBS → block / typically one-AZ volume
EFS → shared regional file system
S3  → object
```

## Trap

Use object storage instead of EFS when filesystem semantics are not required.


---

<!-- 38_FSX.md -->

# Amazon FSx

## Purpose

Managed file systems for specialized workloads.

Examples include families for:

```text
Windows
Lustre
NetApp ONTAP
OpenZFS
```

## Choose Based On

```text
protocol
workload
performance
enterprise storage feature needs
```

## Trap

FSx is a family of distinct managed file-system offerings, not one universal file system.


---

<!-- 39_STORAGE_GATEWAY.md -->

# Storage Gateway / Hybrid Storage

## Goal

Connect on-premises environments with AWS storage.

## Use Cases

```text
hybrid backup
file workflows
cloud-backed storage
migration
```

## Architecture

```text
On-Prem
 ↓ Gateway
AWS Storage
```

## Rule

Use hybrid services when workloads cannot migrate fully but need AWS storage integration.


---

<!-- 40_STORAGE_DECISION.md -->

# S3 vs EBS vs EFS

| S3 | EBS | EFS |
|---|---|---|
| object | block | file |
| API access | disk semantics | NFS |
| massive scale | EC2 storage | shared Linux file |
| regional service | AZ volume | regional file service |

## Quick Decision

```text
Objects? → S3
Disk? → EBS
Shared filesystem? → EFS
```


---

<!-- 41_RDS.md -->

# Amazon RDS

## Managed Relational Databases

Supports managed relational engines.

## Managed Areas

```text
backups
patching
monitoring
failover options
infrastructure
```

## High Availability

Multi-AZ deployment.

## Read Scaling

Read replicas where supported.

## Trap

Multi-AZ is primarily HA/failover; read replicas are primarily read-scaling/replication patterns.


---

<!-- 42_AURORA.md -->

# Amazon Aurora

## What

AWS-managed relational database compatible with MySQL/PostgreSQL families.

## Architecture

```text
Writer
  │
  ├── Shared Distributed Storage across AZs
  │
Readers
```

## Benefits

```text
managed HA
read scaling
fast failover patterns
Aurora-specific scaling/replication features
```

## Read Replicas

Aurora supports multiple reader instances on shared cluster storage.

## Trap

Aurora is not simply “normal RDS with a faster instance”; its storage/cluster architecture differs.


---

<!-- 43_DYNAMODB.md -->

# Amazon DynamoDB

## What

Managed NoSQL key-value/document database.

## Model

```text
Table
 ├── Partition Key
 └── optional Sort Key
```

## Strengths

```text
predictable low latency
automatic scaling options
serverless operations
global tables
streams
TTL
transactions
```

## Data Modeling

Design access patterns first.

## Global Tables

Multi-Region replicas enable global applications.

## Trap

DynamoDB should not be modeled like an RDBMS with arbitrary joins.


---

<!-- 44_SQL_VS_DDB.md -->

# RDS/Aurora vs DynamoDB

| RDS/Aurora | DynamoDB |
|---|---|
| relational | key-value/document |
| SQL | API/query patterns |
| joins | denormalized access patterns |
| schema constraints | flexible items |
| relational transactions | DynamoDB transactions |
| vertical/read scaling patterns | horizontal managed scale |

## Choose Relational When

```text
joins
complex queries
relational integrity
```

## Choose DynamoDB When

```text
known access patterns
massive scale
predictable low latency
serverless model
```


---

<!-- 45_CACHE.md -->

# ElastiCache / MemoryDB

## ElastiCache

Managed in-memory caching for supported engines.

## MemoryDB

Durable in-memory database model based on Redis-compatible APIs.

## Use Cache For

```text
session
hot reads
query results
rate limit
temporary data
```

## Trap

Cache invalidation and consistency must be designed; cache is not automatically a source of truth.


---

<!-- 46_REDSHIFT.md -->

# Amazon Redshift

## What

Managed cloud data warehouse.

## Good Fits

```text
analytics
BI
large scans
warehouse queries
structured/semi-structured analytics
```

## Architecture

```text
Data Sources
 ↓
ETL/ELT
 ↓
Redshift
 ↓
BI / Analytics
```

## Trap

Do not use a warehouse as an OLTP application database.


---

<!-- 47_OPENSEARCH.md -->

# Amazon OpenSearch Service

## Good Fits

```text
search
log analytics
text retrieval
observability analytics
```

## Architecture

```text
Application / Logs
 ↓
Index
 ↓
OpenSearch
 ↓
Search / Dashboards
```

## Trap

Search index should not automatically replace the authoritative transactional database.


---

<!-- 48_NEPTUNE.md -->

# Amazon Neptune

## What

Managed graph database.

## Good Fits

```text
knowledge graphs
fraud relationships
recommendations
network topology
identity relationships
```

## Model

```text
vertices/nodes
edges/relationships
properties
```

## Trap

Use graph databases when relationship traversal is central—not simply because the data is connected.


---

<!-- 49_DATABASE_DECISION.md -->

# Database Selection Guide

## Relational Transactions / Joins

```text
RDS / Aurora
```

## Key-Value / Massive Scale

```text
DynamoDB
```

## Cache / In-Memory

```text
ElastiCache / MemoryDB
```

## Analytics Warehouse

```text
Redshift
```

## Search

```text
OpenSearch
```

## Graph

```text
Neptune
```

## Rule

Select database by access pattern and consistency model, not familiarity alone.


---

<!-- 50_API_GATEWAY.md -->

# Amazon API Gateway

## What

Managed API front door.

## Integrations

```text
Lambda
HTTP backend
AWS services
private integrations
```

## Capabilities

```text
routing
auth integration
throttling
stages
monitoring
API keys/usage patterns
```

## Good Fit

Serverless APIs and managed API management.

## Compare

```text
ALB → load balancing/application routing
API Gateway → API management/front door
```


---

<!-- 51_SQS.md -->

# Amazon SQS

## What

Managed message queue.

## Pattern

```text
Producer
 ↓
Queue
 ↓
Consumer
```

## Benefits

```text
decoupling
buffering
retry
backpressure
```

## Queue Types

```text
Standard
FIFO
```

## Design

Use:

```text
visibility timeout
DLQ
idempotency
long polling
```

## Trap

At-least-once delivery means consumers must be duplicate-safe.


---

<!-- 52_SNS.md -->

# Amazon SNS

## What

Managed publish/subscribe notifications.

## Pattern

```text
Publisher
 ↓
SNS Topic
 ├── SQS
 ├── Lambda
 ├── HTTP/S
 └── other subscribers
```

## Good Fit

Fan-out.

## Common Pattern

```text
SNS → multiple SQS queues
```

for independent durable consumers.

## Trap

SNS is not primarily a work queue.


---

<!-- 53_EVENTBRIDGE.md -->

# Amazon EventBridge

## What

Serverless event bus and event routing service.

## Pattern

```text
Event Producer
 ↓
Event Bus
 ↓ rules/patterns
Targets
```

## Sources

```text
AWS services
custom apps
SaaS integrations
```

## Good Fits

```text
event-driven architecture
routing by event pattern
cross-service integration
```

## Trap

EventBridge event routing is different from SQS queue semantics.


---

<!-- 54_MESSAGING_DECISION.md -->

# SQS vs SNS vs EventBridge

| SQS | SNS | EventBridge |
|---|---|---|
| queue | pub/sub topic | event bus |
| consumer pulls | push fan-out | rules route events |
| buffering | broadcasting | event routing/integration |
| durable queue | subscriber delivery | event-driven integration |

## Quick Decision

```text
Work queue? → SQS
Fan-out notification? → SNS
Event routing/integration? → EventBridge
```

## Common Combination

```text
EventBridge / SNS
       ↓
      SQS
       ↓
consumer
```


---

<!-- 55_STEP_FUNCTIONS.md -->

# AWS Step Functions

## What

Managed workflow orchestration.

## Use

```text
multi-step business process
serverless orchestration
retry/catch
parallel steps
human/system workflows
```

## Flow

```text
Start
 ↓
Validate
 ↓
Parallel Tasks
 ↓
Decision
 ↓
Complete / Compensate
```

## Good Fit

Visible orchestration over distributed tasks.

## Trap

Do not put all business code into giant state machines; orchestration and domain logic should remain separated.


---

<!-- 56_SERVERLESS_API.md -->

# Lambda + API Gateway Reference

```text
Client
 ↓
Route 53
 ↓
CloudFront/WAF (optional)
 ↓
API Gateway
 ↓
Lambda
 ↓
DynamoDB / Aurora / S3
```

## Add

```text
Cognito/authorizer
CloudWatch
X-Ray/OTel
SQS for async work
DLQ
```

## Good Fit

```text
bursty API
low operations
event-driven backend
```

## Trap

Protect downstream capacity from sudden Lambda concurrency.


---

<!-- 57_EVENT_DRIVEN.md -->

# Event-Driven Architecture on AWS

## Reference

```text
Service
 ↓ event
EventBridge
 ├── Lambda
 ├── SQS
 ├── Step Functions
 └── other targets
```

## Principles

```text
immutable events
clear ownership
idempotent consumers
schema governance
DLQ/replay plan
observability
```

## Trap

Event-driven architecture reduces temporal coupling but can increase debugging and consistency complexity.


---

<!-- 58_SAGA_AWS.md -->

# Saga / Orchestration on AWS

## Orchestration

Commonly modeled with:

```text
Step Functions
```

## Choreography

Commonly uses:

```text
EventBridge
SNS
SQS
Kafka/MSK
```

## Example

```text
Create Order
 ↓
Reserve Inventory
 ↓
Charge Payment
 ↓
Arrange Shipping
```

Failure:

```text
Compensate Payment
Release Inventory
Cancel Order
```

## Trap

Compensation is domain logic, not an automatic database rollback.


---

<!-- 59_OUTBOX_CDC.md -->

# Outbox / CDC / DMS

## Dual-Write Problem

```text
DB commit ✓
event publish ✗
```

## Outbox Pattern

```text
Business Row
+
Outbox Row
same transaction
```

then publish asynchronously.

## AWS Tools

Depending architecture:

```text
DMS
DynamoDB Streams
Lambda
MSK/Kinesis
custom outbox publisher
```

## Trap

CDC publishes data changes; good domain-event design is still your responsibility.


---

<!-- 60_KINESIS.md -->

# Amazon Kinesis

## Use

High-throughput streaming data.

## Concepts

```text
stream
shard/capacity model
producer
consumer
partition key
```

## Good Fits

```text
clickstream
telemetry
real-time ingestion
logs
stream processing
```

## Trap

Choose Kinesis vs queue/event-bus services based on ordered streaming and throughput requirements.


---

<!-- 61_MSK.md -->

# Amazon MSK

## What

Managed Apache Kafka service.

## Good Fits

```text
Kafka ecosystem
event streaming
high-throughput durable logs
consumer groups
existing Kafka applications
```

## Compare

```text
MSK → Kafka semantics/ecosystem
Kinesis → AWS-managed native stream
SQS → queue
EventBridge → event routing
```

## Trap

Kafka introduces partitioning, consumer lag, schema, and operational design concerns even when infrastructure is managed.


---

<!-- 62_CLOUDWATCH.md -->

# Amazon CloudWatch

## Core Areas

```text
Metrics
Logs
Alarms
Dashboards
Application observability
```

## Golden Signals

```text
latency
traffic
errors
saturation
```

## Pattern

```text
AWS Resource / Application
 ↓
CloudWatch
 ↓
Alarm
 ↓
SNS / Incident Workflow
```

## Trap

Collecting metrics without actionable alarms/SLOs is not operational excellence.


---

<!-- 63_CLOUDTRAIL.md -->

# AWS CloudTrail

## What

Records AWS API/activity events for governance, auditing, and security investigation.

## Think

```text
Who did what
to which AWS resource
when
from where
```

## Use

```text
audit
incident investigation
change tracking
compliance
```

## Trap

CloudTrail is not primarily application performance monitoring.


---

<!-- 64_CONFIG.md -->

# AWS Config

## What

Records resource configuration state and evaluates configuration compliance.

## Use

```text
resource inventory
configuration history
compliance rules
governance
```

## Compare

```text
CloudTrail → API activity
AWS Config → resource configuration/compliance
CloudWatch → operations/metrics/logs
```


---

<!-- 65_TRACING.md -->

# X-Ray / OpenTelemetry

## Goal

Distributed tracing across service calls.

## Trace

```text
API Gateway
 ↓
Lambda
 ↓
Service
 ↓
Database
```

## Capture

```text
trace ID
span/segment
latency
errors
dependencies
```

## Modern Strategy

Use standards-based OpenTelemetry where appropriate and integrate with AWS observability backends/services.

## Trap

Logs alone cannot show request-level latency across distributed systems as clearly as tracing.


---

<!-- 66_GUARDDUTY.md -->

# Amazon GuardDuty

## What

Managed threat-detection service.

## Detects Suspicious Patterns Across Relevant AWS Data Sources

Use findings for:

```text
triage
automation
incident response
```

## Architecture

```text
AWS telemetry
 ↓
GuardDuty
 ↓
Finding
 ↓
Security Hub / EventBridge / Response
```

## Trap

Threat detection does not replace preventive IAM/network controls.


---

<!-- 67_SECURITY_HUB.md -->

# AWS Security Hub

## What

Central security posture/findings management.

## Use

```text
aggregate findings
security standards
prioritization
cross-account visibility
```

## Architecture

```text
GuardDuty / Inspector / Config / partners
             ↓
        Security Hub
             ↓
        SOC workflow
```


---

<!-- 68_INSPECTOR.md -->

# Amazon Inspector

## Purpose

Automated vulnerability-management capabilities for supported AWS workloads/artifacts.

## Use

```text
software vulnerabilities
exposure findings
container/package scanning contexts
```

## Rule

Prioritize based on exploitability, exposure, and business criticality—not CVSS alone.


---

<!-- 69_MACIE.md -->

# Amazon Macie

## Purpose

Discover and help protect sensitive data in Amazon S3.

## Use

```text
PII discovery
sensitive-data visibility
S3 security posture
```

## Trap

Data discovery does not replace access-control remediation.


---

<!-- 70_SECURITY_ARCHITECTURE.md -->

# AWS Security Architecture

## Identity

```text
federation
MFA
roles
least privilege
SCPs
```

## Network

```text
private subnets
SGs
endpoints
WAF
firewall
```

## Data

```text
KMS
TLS
Secrets Manager
backup
```

## Detection

```text
CloudTrail
GuardDuty
Security Hub
Config
Inspector
Macie
```

## Rule

Security is layered:

```text
prevent
detect
respond
recover
```


---

<!-- 71_BACKUP_DR.md -->

# Backup / Resilience / DR

## Tools / Patterns

```text
AWS Backup
service-native backups
S3 versioning
RDS snapshots/PITR
DynamoDB PITR
cross-Region copies
replication
```

## Rule

Backup is useful only if restore is tested.

## Trap

Replication can replicate corruption/deletion; backup and replication solve different problems.


---

<!-- 72_CLOUDFORMATION.md -->

# AWS CloudFormation

## What

AWS-native infrastructure as code.

## Model

```text
Template
 ↓
Stack
 ↓
AWS Resources
```

## Benefits

```text
repeatability
change tracking
dependency orchestration
stack operations
```

## Rule

Treat infrastructure changes like application code.

## Trap

Manual console changes create drift and weak repeatability.


---

<!-- 73_CDK.md -->

# AWS CDK

## What

Define cloud infrastructure using programming languages and synthesize CloudFormation.

## Flow

```text
CDK Code
 ↓
Constructs
 ↓
Synthesis
 ↓
CloudFormation
 ↓
AWS
```

## Good Fit

Teams preferring code abstractions/reuse.

## Trap

High-level constructs can hide generated infrastructure—review synthesized output/security.


---

<!-- 74_CICD.md -->

# CI/CD on AWS

## Generic Pipeline

```text
Source
 ↓
Build
 ↓
Test
 ↓
Security Scan
 ↓
Package
 ↓
Deploy
 ↓
Canary
 ↓
Observe
```

## AWS Services

Commonly:

```text
CodePipeline
CodeBuild
CodeDeploy
ECR
CloudFormation/CDK
```

plus external CI systems.

## Rule

Deployment automation should include rollback and observability.


---

<!-- 75_PROGRESSIVE_DEPLOY.md -->

# Blue-Green / Canary

## Blue-Green

```text
Blue = current
Green = new
switch traffic
```

## Canary

```text
1% → 5% → 25% → 50% → 100%
```

## AWS Building Blocks

Depending workload:

```text
ALB
Route 53
CloudFront
Lambda aliases
ECS/EKS
CodeDeploy
```

## Gate On

```text
error rate
latency
business KPI
resource saturation
```


---

<!-- 76_SYSTEMS_MANAGER.md -->

# AWS Systems Manager

## Use Cases

```text
fleet management
Session Manager
patching
automation
inventory
run commands
parameters
```

## Security Benefit

Session Manager can reduce dependency on direct SSH/RDP exposure.

## Trap

Operational access should still be least-privilege and audited.


---

<!-- 77_PARAMETER_VS_SECRETS.md -->

# Parameter Store vs Secrets Manager

| Parameter Store | Secrets Manager |
|---|---|
| configuration/parameters | secret lifecycle |
| secure strings supported | secret rotation capabilities |
| Systems Manager feature | dedicated secret service |

## Use

```text
non-secret config → Parameter Store/app config approach
rotating DB/API secret → Secrets Manager
```

## Trap

Do not choose only by price; lifecycle/rotation/access requirements matter.


---

<!-- 78_COST_OPTIMIZATION.md -->

# Cost Optimization

## Main Levers

```text
right-size
autoscale
turn off idle
storage lifecycle
managed/serverless where suitable
Savings Plans / reservations
Spot
data-transfer architecture
tagging
budgets
```

## Tools

```text
Cost Explorer
Budgets
Cost and Usage Report
Compute Optimizer
Trusted Advisor capabilities
```

## Rule

Optimize unit economics:

```text
cost / request
cost / customer
cost / transaction
```

not only monthly total.


---

<!-- 79_PURCHASE_MODELS.md -->

# Savings Plans / Reserved / Spot

## On-Demand

Flexibility, no long commitment.

## Savings Plans

Commitment model for eligible compute usage.

## Reserved Instance Concepts

Reservation/discount structures for certain services/scenarios.

## Spot

Unused capacity at major discount with interruption risk.

## Good Spot Workloads

```text
batch
stateless workers
fault-tolerant processing
CI
```

## Trap

Never place irreplaceable stateful workload on interruptible capacity without resilience.


---

<!-- 80_PERFORMANCE_GUIDE.md -->

# Performance Decision Guide

## Compute

```text
CPU-bound → compute-optimized / scale
memory-bound → memory-optimized
burst → serverless/autoscale
GPU → accelerated
```

## Data

```text
cache hot data
use right DB
use read replicas
design DynamoDB keys
CDN global content
```

## Network

```text
reduce cross-AZ/Region hops
CloudFront
Global Accelerator
private connectivity
```

## Rule

Measure before optimizing.


---

<!-- 81_HA_MULTI_REGION.md -->

# HA / Multi-AZ / Multi-Region

## Multi-AZ

Protects from AZ-level failure.

## Multi-Region

Protects against broader regional disaster and can improve global latency.

## Pattern

```text
Region A
 ├── AZ1
 └── AZ2

Region B
 ├── AZ1
 └── AZ2
```

## Cost

Multi-Region adds:

```text
data replication
consistency complexity
deployment complexity
testing
traffic management
cost
```

## Rule

Do not build active-active multi-Region without a business RTO/RPO/availability requirement.


---

<!-- 82_DR_STRATEGIES.md -->

# Disaster Recovery Strategies

## Increasing Cost / Faster Recovery

```text
Backup & Restore
       ↓
Pilot Light
       ↓
Warm Standby
       ↓
Multi-Site Active/Active
```

## Choose By

```text
RTO
RPO
cost
operational complexity
business impact
```

## Trap

A DR diagram that is never tested is not a DR capability.


---

<!-- 83_RTO_RPO.md -->

# RTO / RPO

## RTO

Recovery Time Objective.

```text
How long can service be unavailable?
```

## RPO

Recovery Point Objective.

```text
How much data loss is acceptable?
```

## Example

```text
RTO = 30 minutes
RPO = 5 minutes
```

Architecture must satisfy both.

## Trap

RTO/RPO are business requirements, not values the cloud architect should invent.


---

<!-- 84_TROUBLESHOOTING.md -->

# AWS Troubleshooting Matrix

| Symptom | First Checks | Likely Area |
|---|---|---|
| EC2 no internet | route/public IP/SG/NACL | VPC |
| Private EC2 no outbound | NAT route/NAT health | networking |
| ALB 502 | target health/app port | compute |
| Lambda timeout | logs/downstream/VPC | app/network |
| S3 AccessDenied | IAM/bucket policy/KMS | security |
| RDS connection fail | SG/subnet/DNS/secret | database |
| DynamoDB throttle | capacity/hot partition | data model |
| SQS duplicates | idempotency | consumer |
| High API latency | trace/dependencies | performance |
| CloudFront stale | cache policy/invalidation | CDN |
| EKS pod pending | resources/scheduler/IAM | Kubernetes |
| Cost spike | Cost Explorer/tags/usage | FinOps |

## Debug Rule

```text
Identity
→ Network
→ Resource health
→ Application
→ Dependency
→ Quota
→ Cost
```


---

<!-- 85_PRODUCTION_READINESS.md -->

# AWS Production Readiness Checklist

## Identity

- [ ] federation / IAM Identity Center
- [ ] MFA
- [ ] workload roles
- [ ] least privilege
- [ ] root protected

## Network

- [ ] multi-AZ
- [ ] minimal public exposure
- [ ] VPC endpoints where useful
- [ ] SG reviewed
- [ ] DNS/failover tested

## Data

- [ ] encryption
- [ ] backup
- [ ] restore tested
- [ ] retention/lifecycle
- [ ] RTO/RPO

## Operations

- [ ] metrics/logs/traces
- [ ] alarms
- [ ] CloudTrail
- [ ] patching
- [ ] runbooks

## Delivery

- [ ] IaC
- [ ] CI/CD
- [ ] rollback
- [ ] canary/blue-green

## Cost

- [ ] tags
- [ ] budgets
- [ ] right-sizing
- [ ] data-transfer review


---

<!-- 86_DATA_LAKE.md -->

# AWS Data Lake Architecture

## Common Pattern

```text
Sources
 ↓
Ingestion
 ↓
S3 Data Lake
 ↓
Catalog / Governance
 ↓
Processing
 ↓
Athena / Redshift / ML / BI
```

## Design Zones

```text
raw
curated
consumption
```

## Concerns

```text
schema
partitioning
governance
security
catalog
lineage
cost
```

## Trap

An S3 bucket full of files is not automatically a governed data lake.


---

<!-- 87_GLUE_ATHENA_LAKEFORMATION.md -->

# Glue / Athena / Lake Formation

## AWS Glue

Data integration / catalog / ETL capabilities.

## Athena

Serverless SQL query over supported data sources, commonly S3-backed analytics.

## Lake Formation

Data-lake governance/access management capabilities.

## Pattern

```text
S3
 ↓
Glue Catalog
 ↓
Lake Formation Governance
 ↓
Athena / Analytics
```

## Trap

Partitioning and file format strongly affect query cost/performance.


---

<!-- 88_SAGEMAKER.md -->

# Amazon SageMaker

## Purpose

Managed machine-learning platform capabilities across model development and deployment workflows.

## Typical Lifecycle

```text
data
 ↓
prepare
 ↓
train
 ↓
evaluate
 ↓
deploy
 ↓
monitor
```

## Good Fit

Custom ML workflows/models requiring broader ML lifecycle tooling.

## Compare

```text
SageMaker → ML platform
Bedrock → foundation-model / generative-AI platform
```


---

<!-- 89_BEDROCK.md -->

# Amazon Bedrock

## What

Managed platform for building generative-AI applications using foundation models and related capabilities.

## Architecture

```text
Application
 ↓
Bedrock Runtime / APIs
 ↓
Foundation Model
```

## Ecosystem Areas

```text
models
agents
knowledge bases
guardrails
evaluation
```

## Good Fit

Generative AI without managing model-serving infrastructure directly.

## Trap

Managed model access does not remove application-level security, evaluation, prompt-injection, data-governance, and cost concerns.


---

<!-- 90_BEDROCK_RAG.md -->

# Bedrock Knowledge Bases / RAG

## RAG Flow

```text
User Question
 ↓
Retrieve relevant enterprise data
 ↓
Context
 +
Prompt
 ↓
Foundation Model
 ↓
Grounded Response
```

## Knowledge Bases

Can manage retrieval-oriented workflows over configured data sources.

## Key Design Areas

```text
chunking
embeddings
metadata filters
reranking
access control
citations
evaluation
```

## Trap

RAG quality depends heavily on data quality and retrieval quality—not only the model.


---

<!-- 91_BEDROCK_GUARDRAILS.md -->

# Bedrock Guardrails / Evaluation

## Guardrails

Evaluate/filter model inputs and outputs according to configured safeguards/policies.

## Evaluation

Assess:

```text
model performance
RAG/knowledge-base behavior
accuracy/relevance
robustness
safety
```

## Production Pattern

```text
Prompt
 ↓
Input Controls
 ↓
Model / RAG
 ↓
Output Controls
 ↓
Evaluation / Monitoring
```

## Trap

Guardrails reduce risk but do not replace end-to-end application security and human governance.


---

<!-- 92_COMMON_ARCHITECTURES.md -->

# Common AWS Architectures

## Three-Tier Web

```text
Route 53
 ↓
CloudFront/WAF
 ↓
ALB
 ↓
EC2/ECS
 ↓
RDS/Aurora
```

## Serverless

```text
CloudFront
 ↓
API Gateway
 ↓
Lambda
 ↓
DynamoDB
```

## Event-Driven

```text
Service
 ↓
EventBridge
 ↓
SQS
 ↓
Lambda/ECS Consumer
```

## Container Platform

```text
ALB
 ↓
ECS/EKS
 ↓
RDS/DynamoDB
```


---

<!-- 93_WEB_REFERENCE.md -->

# Highly Available Web App Reference

```text
Users
 ↓
Route 53
 ↓
CloudFront + WAF
 ↓
ALB
 ├───────────────┐
 ↓               ↓
App AZ-A       App AZ-B
 ↓               ↓
       Aurora/RDS Multi-AZ
              ↓
             S3
```

## Cross-Cutting

```text
IAM
KMS
CloudWatch
CloudTrail
Secrets Manager
Auto Scaling
Backup
```


---

<!-- 94_SERVERLESS_REFERENCE.md -->

# Serverless Reference Architecture

```text
Web/Mobile
 ↓
CloudFront
 ↓
API Gateway
 ↓
Lambda
 ├── DynamoDB
 ├── S3
 └── EventBridge
        ↓
       SQS
        ↓
      Lambda
```

## Security

```text
Cognito / federation
IAM roles
KMS
WAF
Secrets
```

## Reliability

```text
DLQ
idempotency
retry control
reserved concurrency
alarms
```


---

<!-- 95_MICROSERVICES_REFERENCE.md -->

# AWS Microservices Reference

```text
Client
 ↓
CloudFront/WAF
 ↓
API Gateway / ALB
 ↓
ECS/EKS Services
 ├── Order
 ├── Payment
 └── Inventory
       │
       └── Events → EventBridge/MSK
                       ↓
                     SQS
                       ↓
                  Consumers
```

## Data

```text
service-owned RDS/Aurora/DynamoDB
```

## Cross-Cutting

```text
CloudWatch
tracing
IAM roles
Secrets Manager
Service discovery
autoscaling
```


---

<!-- 96_MULTI_REGION_REFERENCE.md -->

# Multi-Region Reference Architecture

```text
                 Route 53 / Global Accelerator
                    ┌─────────┴─────────┐
                    ▼                   ▼
                 Region A            Region B
               ┌──────────┐         ┌──────────┐
               │ App Tier │         │ App Tier │
               └────┬─────┘         └────┬─────┘
                    │                    │
                 Global / replicated data
```

## Data Options Depend On Workload

Examples:

```text
DynamoDB Global Tables
Aurora Global Database patterns
S3 replication
application-level replication
```

## Rule

Define conflict/consistency/failover behavior before calling an architecture active-active.


---

<!-- 97_COMPARISON_MATRIX.md -->

# High-Value AWS Comparison Matrix

## CloudWatch vs CloudTrail vs Config

| CloudWatch | CloudTrail | Config |
|---|---|---|
| operations | API audit | configuration |
| metrics/logs | who did what | state/compliance |
| alarms | investigations | rules/history |

## ALB vs API Gateway

| ALB | API Gateway |
|---|---|
| L7 load balancer | API management |
| containers/EC2 | serverless/API front door |
| target groups | API stages/routes |

## SQS vs SNS vs EventBridge

| SQS | SNS | EventBridge |
|---|---|---|
| queue | pub/sub | event bus |

## S3 vs EBS vs EFS

| Object | Block | File |
|---|---|---|
| S3 | EBS | EFS |

## RDS vs DynamoDB

| Relational | NoSQL |
|---|---|
| joins/SQL | access-pattern design |
| relational schema | key-value/document |

## CloudFront vs Global Accelerator

| CloudFront | Global Accelerator |
|---|---|
| CDN/cache | network acceleration |
| HTTP content | TCP/UDP/global endpoints |


---

<!-- 98_DECISION_TREE.md -->

# AWS Architecture Decision Tree

## Compute

```text
Function/event? → Lambda
Container? → ECS/EKS
Need VM/OS control? → EC2
```

## Container Platform

```text
Need Kubernetes? → EKS
AWS-native simplicity? → ECS
No nodes? → Fargate
```

## Data

```text
Relational? → RDS/Aurora
Key-value/document scale? → DynamoDB
Search? → OpenSearch
Warehouse? → Redshift
Graph? → Neptune
```

## Storage

```text
Object? → S3
Block? → EBS
Shared file? → EFS/FSx
```

## Messaging

```text
Queue? → SQS
Fan-out? → SNS
Event routing? → EventBridge
Streaming? → Kinesis/MSK
```

## Global Delivery

```text
Cache HTTP content? → CloudFront
Static anycast/global network? → Global Accelerator
DNS routing? → Route 53
```


---

<!-- 99_INTERVIEW_TRAPS.md -->

# AWS Interview Traps

1. Region != Availability Zone.
2. Multi-AZ != Multi-Region.
3. Public subnet is defined by routing to an IGW.
4. Public subnet does not automatically make every resource public.
5. Security Group is stateful.
6. NACL is stateless.
7. NAT Gateway is for outbound private IPv4 connectivity, not inbound publishing.
8. VPC Peering is non-transitive.
9. SCP does not grant IAM permissions.
10. IAM role uses temporary credentials.
11. Root user should not be used for normal work.
12. KMS != Secrets Manager.
13. S3 is object storage.
14. EBS is block storage.
15. EFS is shared file storage.
16. Multi-AZ RDS != read replica.
17. Aurora has a distinct shared-storage cluster architecture.
18. DynamoDB access patterns should be designed up front.
19. Lambda scalability can overwhelm downstream systems.
20. Fargate != ECS/EKS; it is compute used by them.
21. ECS != EKS.
22. API Gateway != ALB.
23. SQS != SNS.
24. EventBridge != a work queue.
25. CloudWatch != CloudTrail.
26. CloudTrail != AWS Config.
27. CloudFront caches; Global Accelerator does not.
28. Replication != backup.
29. Read replica != automatic cross-Region DR plan.
30. RTO/RPO come from business requirements.
31. Managed service != zero responsibility.
32. Serverless != automatically cheaper.
33. Multi-Region != automatically better architecture.
34. Bedrock != SageMaker.
35. Guardrails != complete AI security.
