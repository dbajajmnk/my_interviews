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
