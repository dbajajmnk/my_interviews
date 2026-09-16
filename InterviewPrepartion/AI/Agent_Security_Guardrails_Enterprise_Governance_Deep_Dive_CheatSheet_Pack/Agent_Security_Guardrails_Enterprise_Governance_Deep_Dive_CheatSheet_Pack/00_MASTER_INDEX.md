# Agent Security, Guardrails & Enterprise Governance — Master Index

## Purpose

This pack covers how to secure enterprise AI agents, govern their actions, control sensitive data, and create enforceable policy around model behavior, tools, memory, retrieval, identity, approvals, and audit.

Interview focus:
- prompt injection;
- tool abuse;
- authorization;
- least privilege;
- secret handling;
- PII/privacy;
- data exfiltration;
- tenant isolation;
- memory poisoning;
- RAG poisoning;
- guardrail layers;
- HITL;
- policy engines;
- content safety;
- sandboxing;
- auditability;
- governance boards;
- risk classification;
- incident response.

## Master Mental Model

```text
User / Event
    ↓
Identity + Tenant Context
    ↓
Input Guardrails
    ↓
Agent / Model
    ↓
Policy Decision Point
    ↓
Tool / Retrieval / Memory Access
    ↓
Authorization + Validation + HITL
    ↓
Execution
    ↓
Output Guardrails
    ↓
Audit / Trace / Governance
```

## Core Principle

> The model may propose actions, but trusted application code must authorize, validate, constrain, execute, and audit them.

## File Sequence

1. `01_30_SECOND_RECALL.md`
2. `02_WHAT_IS_AGENT_SECURITY.md`
3. `03_THREAT_MODEL_FOR_AI_AGENTS.md`
4. `04_TRUST_BOUNDARIES.md`
5. `05_PROMPT_INJECTION.md`
6. `06_INDIRECT_PROMPT_INJECTION.md`
7. `07_TOOL_ABUSE_AND_PRIVILEGE_ESCALATION.md`
8. `08_DATA_EXFILTRATION.md`
9. `09_SECRET_EXPOSURE.md`
10. `10_PII_AND_PRIVACY.md`
11. `11_TENANT_ISOLATION.md`
12. `12_RAG_POISONING.md`
13. `13_MEMORY_POISONING.md`
14. `14_AGENT_HALLUCINATION_AS_SECURITY_RISK.md`
15. `15_AUTHENTICATION.md`
16. `16_AUTHORIZATION.md`
17. `17_LEAST_PRIVILEGE.md`
18. `18_TRUSTED_CONTEXT_VS_MODEL_CONTEXT.md`
19. `19_TOOL_RISK_CLASSIFICATION.md`
20. `20_HUMAN_IN_THE_LOOP_APPROVALS.md`
21. `21_POLICY_ENGINE_AND_DECISION_POINTS.md`
22. `22_INPUT_GUARDRAILS.md`
23. `23_OUTPUT_GUARDRAILS.md`
24. `24_TOOL_GUARDRAILS.md`
25. `25_RETRIEVAL_GUARDRAILS.md`
26. `26_MEMORY_GUARDRAILS.md`
27. `27_STRUCTURED_OUTPUT_VALIDATION.md`
28. `28_SCHEMA_AND_BUSINESS_VALIDATION.md`
29. `29_SANDBOXING_AND_CODE_EXECUTION.md`
30. `30_NETWORK_AND_EGRESS_CONTROLS.md`
31. `31_RATE_LIMITS_QUOTAS_AND_ABUSE_CONTROLS.md`
32. `32_SECRETS_AND_CREDENTIAL_MANAGEMENT.md`
33. `33_DATA_CLASSIFICATION_AND_MINIMIZATION.md`
34. `34_ENCRYPTION_AND_KEY_MANAGEMENT.md`
35. `35_AUDIT_LOGGING.md`
36. `36_SECURITY_OBSERVABILITY.md`
37. `37_INCIDENT_RESPONSE.md`
38. `38_AGENT_RISK_TIERS.md`
39. `39_ENTERPRISE_GOVERNANCE_MODEL.md`
40. `40_MODEL_AND_PROVIDER_GOVERNANCE.md`
41. `41_TOOL_AND_CONNECTOR_GOVERNANCE.md`
42. `42_MEMORY_AND_DATA_RETENTION_GOVERNANCE.md`
43. `43_COMPLIANCE_AND_AUDIT_READINESS.md`
44. `44_SECURITY_TESTING_AND_RED_TEAMING.md`
45. `45_PROMPT_INJECTION_TEST_CASES.md`
46. `46_MULTI_AGENT_SECURITY.md`
47. `47_REFERENCE_SECURE_AGENT_ARCHITECTURE.md`
48. `48_INTERVIEW_QUESTIONS.md`
49. `49_SYSTEM_DESIGN_QUESTIONS.md`
50. `50_ENTERPRISE_SECURITY_CHECKLIST.md`
51. `51_ONE_PAGE_FINAL_CHEAT_SHEET.md`

## Study Order

**Threats:** 01 → 14  
**Identity and controls:** 15 → 31  
**Data and operations:** 32 → 37  
**Governance:** 38 → 47  
**Interview/revision:** 48 → 51
