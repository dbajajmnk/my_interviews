# AI Architecture — High-Value Comparisons

## RAG vs Fine-Tuning
| RAG | Fine-Tuning |
|---|---|
| external/current knowledge | learned behavior |
| index update | training |
| citations possible | no evidence by default |
| permission filters possible | knowledge embedded in weights |

## Agent vs Workflow
| Agent | Workflow |
|---|---|
| model chooses next step | code chooses next step |
| flexible | predictable |
| harder to test | easier to govern |
| dynamic tasks | repeatable business process |

## Model Gateway vs Direct Provider
| Gateway | Direct |
|---|---|
| centralized policy/routing | simpler |
| multi-provider | vendor coupling |
| observability/quotas | app-specific controls |

## Memory vs RAG
| Memory | RAG |
|---|---|
| user/task continuity | authoritative knowledge |
| personal/episodic | enterprise corpus |
| selective persistence | document retrieval |

## Long Context vs RAG
| Long Context | RAG |
|---|---|
| simple bounded corpus | large/fresh corpus |
| no retrieval stack | permission/filter/ranking |
| potentially expensive | selective context |
