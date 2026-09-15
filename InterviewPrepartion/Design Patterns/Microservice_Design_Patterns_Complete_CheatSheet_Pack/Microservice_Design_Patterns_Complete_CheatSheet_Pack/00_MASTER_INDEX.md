# Microservice Design Patterns — Complete Cheat Sheet Pack

**Purpose:** Fast revision for system design, microservices architecture, interviews, distributed systems, production engineering, and training.

## Standard Pattern Format

Each pattern is organized as:

**Problem → Intent → Visual → How → When to Use → Avoid When → Trade-offs → Example → Interview Trap → Related Patterns**

---

## Part A — Decomposition & Service Boundary Patterns

1. Decompose by Business Capability
2. Decompose by Subdomain / Bounded Context
3. Self-Contained Service
4. Database per Service
5. Shared Database Anti-Pattern
6. Strangler Fig
7. Anti-Corruption Layer

## Part B — API / Composition Patterns

8. API Gateway
9. Backend for Frontend
10. Aggregator
11. API Composition
12. Gateway Aggregation
13. Gateway Routing
14. Gateway Offloading
15. Adapter
16. Ambassador
17. Sidecar

## Part C — Communication & Messaging Patterns

18. Request-Response
19. Asynchronous Messaging
20. Publish-Subscribe
21. Competing Consumers
22. Event Notification
23. Event-Carried State Transfer
24. Claim Check
25. Content-Based Router
26. Dead Letter Queue
27. Retry Queue
28. Message Deduplication
29. Idempotent Consumer
30. Inbox Pattern
31. Outbox Pattern
32. Transaction Log Tailing / CDC

## Part D — Data & Consistency Patterns

33. Saga
34. Saga Choreography
35. Saga Orchestration
36. CQRS
37. Event Sourcing
38. Materialized View
39. Read Model / Projection
40. Transactional Outbox
41. Eventual Consistency
42. Compensating Transaction
43. Semantic Lock
44. Versioned Event
45. Dual-Write Anti-Pattern

## Part E — Resilience Patterns

46. Timeout
47. Retry
48. Circuit Breaker
49. Bulkhead
50. Rate Limiting
51. Backpressure
52. Load Shedding
53. Fail Fast
54. Fallback
55. Cache-Aside
56. Request Collapsing
57. Hedged Requests
58. Graceful Degradation

## Part F — Discovery / Configuration / Runtime Patterns

59. Service Registry
60. Client-Side Discovery
61. Server-Side Discovery
62. Externalized Configuration
63. Configuration Server
64. Service Mesh
65. Health Check API
66. Leader Election
67. Distributed Lock
68. Lease / Fencing Token

## Part G — Observability Patterns

69. Log Aggregation
70. Distributed Tracing
71. Correlation ID
72. Audit Logging
73. Application Metrics
74. Health / Readiness / Liveness
75. Exception Tracking

## Part H — Deployment / Migration Patterns

76. Blue-Green Deployment
77. Canary Deployment
78. Rolling Deployment
79. Parallel Run
80. Dark Launch
81. Feature Toggle
82. Expand-and-Contract
83. Branch by Abstraction
84. Shadow Traffic

## Part I — Security Patterns

85. Access Token
86. Token Relay
87. Service-to-Service Identity
88. Zero Trust
89. Externalized Secrets
90. Policy Enforcement Point

## Part J — Pattern Selection / Interview

91. Saga vs 2PC
92. CQRS vs CRUD
93. Outbox vs CDC
94. Choreography vs Orchestration
95. Retry vs Circuit Breaker
96. API Gateway vs Service Mesh
97. BFF vs API Gateway
98. Cache-Aside vs Materialized View
99. Pattern Decision Tree
100. Pattern Interaction Map
101. Anti-Patterns
102. Interview Traps
103. One-Page Pattern Recall
104. Practice Questions
105. Sources & Accuracy Notes
