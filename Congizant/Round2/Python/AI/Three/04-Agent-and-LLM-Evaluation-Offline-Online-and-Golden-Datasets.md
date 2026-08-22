# AI-03 / File 04 — Agent & LLM Evaluation: Offline, Online & Golden Datasets

**Priority:** P0  
**Suggested Time:** 80 minutes

---

# 1. Objective

Master:

- task-level evaluation;
- agent trajectory evaluation;
- tool-call correctness;
- golden datasets;
- deterministic validators;
- human rubric;
- model-as-judge;
- online metrics;
- regression testing;
- model/prompt/tool version evaluation.

---

# 2. 5W+H

## What?

Agent evaluation measures whether the system completes the right task using acceptable actions, cost, latency, and safety—not merely whether the final answer sounds good.

## Why?

Agents can reach a correct final answer through unsafe or inefficient actions.

## Where?

Offline suites, CI, staging, canary, production.

## When?

Before and after changes to:

- model;
- prompt;
- tools;
- routing;
- memory;
- policy.

## How?

Evaluate outcome + trajectory + safety + operational cost.

---

# 3. Real-Life Analogy

A delivery driver is not evaluated only on whether the package arrived.

Also:

- correct address;
- safe driving;
- no unauthorized stops;
- acceptable time/cost.

---

# 4. Visualization

```text
Input Task
   ↓
Agent Run
├── decisions
├── tool calls
├── observations
├── final output
└── cost/latency
   ↓
Evaluators
├── deterministic
├── reference/golden
├── model judge
└── human
```

---

# 5. Mind Map

```text
Agent Evaluation
│
├── Task Success
├── Tool Accuracy
├── Trajectory
├── Safety
├── Latency
├── Cost
├── Golden Set
├── Online Signals
└── Regression
```

---

# 6. Core Concepts

## 6.1 Task Success

Did system accomplish business objective?

Examples:

- correct ticket created;
- correct order status returned;
- correct deployment plan drafted.

---

## 6.2 Tool-Call Accuracy

Measure:

- correct tool;
- correct arguments;
- unauthorized tool attempts;
- unnecessary calls;
- duplicate calls.

---

## 6.3 Trajectory Evaluation

A trajectory is sequence:

```text
state
→ decision
→ tool
→ result
→ decision
...
```

Evaluate whether path was:

- valid;
- safe;
- efficient.

---

## 6.4 Deterministic Evaluators

Prefer deterministic checks when possible.

Example:

```text
Expected:
tool = get_order_status
order_id = O-101
No refund tool

Actual:
...
```

These are more reliable than subjective judging.

---

## 6.5 Human Rubric

For subjective tasks define explicit rubric:

```text
correctness 1–5
completeness 1–5
grounding 1–5
safety pass/fail
```

---

## 6.6 Model-as-Judge

Useful for scalable qualitative evaluation.

Risks:

- bias;
- position effects;
- model preference;
- inconsistency.

Calibrate against human labels.

---

## 6.7 Golden Dataset

Include:

- normal tasks;
- edge cases;
- adversarial prompts;
- tool failures;
- security-sensitive cases;
- expensive/long-loop cases.

---

## 6.8 Online Evaluation

Signals:

- completion rate;
- escalation;
- user correction;
- retry;
- tool failure;
- loop length;
- cost/run;
- human override.

---

# 7. Engineering Depth

## 7.1 Final Answer Is Not Enough

Example:

Agent correctly answers order status but accessed all customer records first.

Final answer correct, trajectory unacceptable.

---

## 7.2 Regression Gates

A model/prompt upgrade should not ship only because average quality improves.

Define critical test cases that must never regress:

- tenant isolation;
- no unauthorized refund;
- no arbitrary tool execution.

---

## 7.3 Evaluation Slices

Analyze by:

- tenant;
- language;
- task type;
- tool;
- document type;
- difficulty.

Averages can hide failures.

---

# 8. Implementation / Code

Pseudo deterministic evaluator:

```python
def evaluate_tool_policy(trace):
    forbidden = {"delete_account", "refund_payment"}

    violations = [
        call for call in trace.tool_calls
        if call.name in forbidden
    ]

    return len(violations) == 0
```

Real policy depends on scenario/user authorization.

---

# 9. Hands-On Practice

For support agent, define metrics:

- ticket resolution accuracy;
- correct tool selection;
- average tool calls;
- unauthorized action attempts;
- latency;
- cost;
- escalation rate.

---

# 10. Google Interview Drill

## Problem — New Model Gives Better Answers but Uses 3× More Tools

### Clarify

- quality improvement magnitude?
- tool cost?
- latency?
- unnecessary calls?
- safety change?
- production budget?

### First Approach

Ship because answer score improved.

Incomplete.

### Improve

Compare:

```text
task success
tool precision
tool count
latency
cost
policy violations
user outcomes
```

### Decision

Only ship if business value justifies operational/safety trade-off.

Potential fixes:

- better tool descriptions;
- routing;
- max steps;
- smaller model for simple cases.

---

# 11. Common Mistakes

1. Evaluate final prose only.
2. No trajectory evaluation.
3. No deterministic checks.
4. One average metric.
5. LLM judge treated as truth.
6. No adversarial/security cases.
7. Cost/latency omitted.
8. Model upgrade without regression suite.

---

# 12. Best Practices

- evaluate task + trajectory;
- deterministic checks first;
- calibrated human/model rubric;
- include adversarial cases;
- version evaluation sets;
- slice results;
- gate critical safety cases.

---

# 13. Interview Questions

1. How evaluate an agent?
2. Task vs trajectory evaluation?
3. Tool-call accuracy?
4. Golden dataset?
5. LLM-as-judge?
6. How calibrate judge?
7. What online metrics?
8. How gate model upgrade?
9. Why slice metrics?
10. How evaluate multi-step cost?

---

# 14. Google-Level Follow-Ups

1. no human labels?
2. judge disagrees with humans?
3. long-tail cases?
4. evolving tools?
5. production drift?
6. adversarial users?
7. different languages?
8. canary evaluation?

---

# 15. Quick Revision

```text
Agent quality =
task success
+ safe trajectory
+ correct tools
+ acceptable cost/latency

Deterministic checks first
Golden set includes failures/adversarial cases
Judge models need calibration
Averages hide slices
Critical safety cases are release gates
```

---

# 16. Readiness Gate

- [ ] Task success.
- [ ] Tool accuracy.
- [ ] Trajectory.
- [ ] Golden set.
- [ ] Model judge.
- [ ] Online metrics.
- [ ] Regression gates.
- [ ] 3× tool-call drill.

**Gate:** READY / REPAIR

---

# 17. References

- AI evaluation and software-testing references
