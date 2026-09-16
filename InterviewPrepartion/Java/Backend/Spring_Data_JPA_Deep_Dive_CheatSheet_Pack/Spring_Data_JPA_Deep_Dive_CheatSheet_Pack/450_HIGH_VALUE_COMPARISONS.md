# Spring Data / JPA — High-Value Comparisons

## JPA vs Hibernate vs Spring Data JPA
| JPA | Hibernate | Spring Data JPA |
|---|---|---|
| specification | JPA provider | repository abstraction |
| EntityManager | Session/SQL engine | JpaRepository |
| portable semantics | extensions/optimizations | query derivation/specifications |

## persist vs merge
| persist | merge |
|---|---|
| new entity | detached/transient state copy |
| same instance becomes managed | returned instance is managed |
| no return | returns managed copy |

## LAZY vs EAGER
| LAZY | EAGER |
|---|---|
| defer loading | must be available eagerly |
| may proxy/select | does not guarantee join |
| needs context when accessed | can still cause N+1 |

## Page vs Slice vs Window
| Page | Slice | Window |
|---|---|---|
| total count | no total count | scrolling |
| count query | cheaper | offset/keyset |
| standard UI paging | next/previous | large data traversal |

## Optimistic vs Pessimistic
| Optimistic | Pessimistic |
|---|---|
| @Version | DB lock |
| detect conflict | prevent competing write/read |
| high concurrency | hot critical rows |

## Entity vs Projection
| Entity | Projection |
|---|---|
| managed | read model |
| dirty checking | no aggregate lifecycle |
| full domain behavior | smaller query shape |
