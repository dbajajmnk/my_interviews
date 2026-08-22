# FS-02 / File 03 — Transactions, Isolation, Locking, MVCC & Deadlocks

**Priority:** P0  
**Suggested Time:** 70 minutes  
**GOJ Mapping:** M18 Database & Data Access

---

# 1. Objective

Master:

- ACID;
- transaction boundary;
- commit/rollback;
- isolation levels;
- dirty/non-repeatable/phantom phenomena;
- locking;
- optimistic concurrency;
- deadlocks;
- MVCC concept;
- long-transaction risks.

---

# 2. 5W+H

## What?

A transaction groups related database operations into one consistency unit.

## Why?

Business operations often require multiple writes to succeed/fail together.

## Where?

Payments, inventory, orders, balance transfer, workflow state.

## When?

Whenever partial completion would violate invariants.

## How?

Begin → read/write → commit or rollback under an isolation model.

---

# 3. Real-Life Analogy

Bank transfer:

```text
Debit A
Credit B
```

You do not want only half of that logical operation committed.

---

# 4. Visualization

```text
BEGIN
  ↓
Read / Write
  ↓
Business invariant
  ↓
COMMIT
   or
ROLLBACK
```

Concurrency:

```text
Tx A ─┐
      ├─► shared database state
Tx B ─┘
```

Isolation defines what each can observe.

---

# 5. Mind Map

```text
Transactions
│
├── ACID
├── Isolation
├── Locks
├── MVCC
├── Optimistic Concurrency
├── Deadlock
└── Retry
```

---

# 6. Core Concepts

## 6.1 ACID

### Atomicity
All or none.

### Consistency
Transaction preserves defined integrity/invariants.

### Isolation
Concurrent transactions do not interfere beyond configured guarantees.

### Durability
Committed state survives expected failure model.

---

## 6.2 Isolation Levels

Standard names:

- Read Uncommitted
- Read Committed
- Repeatable Read
- Serializable

Exact implementation differs by database.

Architect rule:

> Know anomalies and trade-offs; do not overstate vendor behavior.

---

## 6.3 Dirty Read

Transaction reads another transaction's uncommitted change.

---

## 6.4 Non-Repeatable Read

Same row read twice returns changed committed value.

---

## 6.5 Phantom

Re-running predicate query sees additional/removed matching rows due to another transaction.

---

## 6.6 Locking

Locks protect concurrent access but can reduce throughput.

Types vary by DB:

- row;
- table;
- shared/exclusive;
- intention locks.

Do not memorize vendor-specific lock matrices unless requested.

---

## 6.7 Optimistic Concurrency

Use version:

```sql
UPDATE account
SET balance = :new_balance,
    version = version + 1
WHERE account_id = :id
  AND version = :expected_version;
```

If affected rows = 0, someone changed data.

---

## 6.8 Deadlock

Example:

```text
Tx A locks Order 1
Tx B locks Order 2
Tx A waits Order 2
Tx B waits Order 1
```

DB detects deadlock and aborts one transaction.

Application often needs safe retry.

---

## 6.9 MVCC

Multi-Version Concurrency Control lets readers access suitable row versions while writes proceed, reducing read/write blocking in supported isolation designs.

Do not simplify to:

> MVCC means no locks.

Writes and other operations can still lock.

---

# 7. Engineering Depth

## 7.1 Transaction Scope

Bad:

```text
BEGIN
update DB
call external API for 15 seconds
update DB
COMMIT
```

Long transaction can hold resources/locks.

Prefer short DB transactions and explicit distributed workflow design.

---

## 7.2 Database Transaction Cannot Make Remote HTTP Atomic

A DB transaction cannot automatically roll back:

- email sent;
- payment gateway call;
- message delivered.

Need patterns such as:

- outbox;
- idempotency;
- saga/compensation;
- reconciliation.

---

## 7.3 Deadlock Mitigation

- consistent lock/update ordering;
- short transactions;
- correct indexes;
- minimize rows touched;
- retry aborted transaction safely.

---

# 8. Implementation / Code

Transfer pseudo-SQL:

```sql
BEGIN;

UPDATE account
SET balance = balance - 100
WHERE id = 1;

UPDATE account
SET balance = balance + 100
WHERE id = 2;

COMMIT;
```

Real design must validate sufficient balance atomically.

---

# 9. Hands-On Practice

Explain:

1. lost update;
2. optimistic version check;
3. deadlock;
4. why long transaction hurts;
5. why remote payment call cannot be rolled back by DB.

---

# 10. Google Interview Drill

## Problem — Reserve Inventory During Order Creation

Two users try to buy last item simultaneously.

### Clarify

- overselling allowed? no;
- inventory stored in DB?
- high contention?
- reservation expiration?

### Naive

```text
SELECT stock
if stock > 0:
    UPDATE stock = stock - 1
```

Race risk.

### Improve

Atomic conditional update:

```sql
UPDATE inventory
SET quantity = quantity - 1
WHERE product_id = :id
  AND quantity > 0;
```

Check affected rows.

Alternative: locking/versioning depending requirements.

### Test

- simultaneous callers;
- quantity zero;
- retry;
- rollback.

### Follow-Up

At extreme scale:

- partition inventory?
- reservation service?
- queue?
- eventual consistency acceptable?

---

# 11. Common Mistakes

1. ACID recited without business example.
2. Isolation claims treated same across all DBs.
3. “MVCC means no locks.”
4. External API inside long transaction.
5. No deadlock retry strategy.
6. Read-then-write race.
7. Transaction too large.
8. Assuming distributed atomicity from local DB transaction.

---

# 12. Best Practices

- keep transactions short;
- enforce invariant atomically;
- choose isolation by requirement;
- use optimistic concurrency where fit;
- handle deadlock retry;
- separate DB consistency from distributed workflow.

---

# 13. Interview Questions

1. ACID?
2. Isolation levels?
3. Dirty/non-repeatable/phantom?
4. MVCC?
5. Pessimistic vs optimistic locking?
6. Deadlock?
7. How prevent lost update?
8. Why short transaction?
9. How handle DB + external API consistency?

---

# 14. Google-Level Follow-Ups

1. flash-sale inventory?
2. deadlocks rising under load?
3. retry safety?
4. distributed inventory?
5. reservation expiration?
6. outbox?
7. payment succeeds, DB fails?

---

# 15. Quick Revision

```text
ACID
Isolation controls concurrent visibility
MVCC = versions, not “no locks”
Optimistic = version/check
Deadlock = cyclic wait
Keep transaction short
Remote API is outside DB transaction
Atomic conditional update beats unsafe read-then-write
```

---

# 16. Readiness Gate

- [ ] ACID.
- [ ] Anomalies.
- [ ] Isolation.
- [ ] MVCC.
- [ ] Locking.
- [ ] Deadlock.
- [ ] Optimistic concurrency.
- [ ] Inventory drill.

**Gate:** READY / REPAIR

---

# 17. References

- PostgreSQL / MySQL transaction documentation
- SQL isolation concepts
