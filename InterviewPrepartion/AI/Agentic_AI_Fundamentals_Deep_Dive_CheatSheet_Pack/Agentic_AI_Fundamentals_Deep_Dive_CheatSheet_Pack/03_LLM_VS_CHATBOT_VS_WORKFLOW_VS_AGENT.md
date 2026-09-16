# LLM vs Chatbot vs Workflow vs Agent

## Comparison

| Type | Main Capability | Chooses Actions? | Uses Tools? | Iterative State? |
|---|---|---:|---:|---:|
| LLM call | Generate response | No/limited | No | No |
| Chatbot | Conversational UX | Usually no | Sometimes | Session context |
| Workflow | Execute defined steps | Rules decide | Yes | Yes |
| Agent | Dynamically decide next action | Yes | Yes | Yes |

## Mental Model

```text
LLM:
Input → Generate

Chatbot:
User ↔ Conversation Layer ↔ LLM

Workflow:
Step A → Step B → Step C

Agent:
Goal
 ↓
Decide next step
 ↓
Act
 ↓
Observe
 ↓
Repeat
```

## Important Nuance

A production system can combine all four.

Example:
- chatbot = user interface;
- workflow = fixed KYC steps;
- agent = dynamic document analysis;
- LLM = generation/reasoning primitive.

Do not force the whole system into one category.

## Interview Trap

**Trap:** “Every application using function calling is an agent.”

Better answer: function calling is a building block. A true agent generally has a loop where observations influence subsequent decisions.

## 20-Second Recall

> Workflow means the path is primarily pre-defined. Agent means the model can participate in selecting the next step at runtime.
