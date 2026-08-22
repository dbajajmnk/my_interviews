# FS-02 / File 01 — Relational Modeling, Keys, Constraints & Normalization

**Priority:** P0  
**Suggested Time:** 55 minutes  
**GOJ Mapping:** M18 Database & Data Access

---

# 1. Objective

Master:

- relational model;
- table/row/column;
- primary, foreign, candidate, composite, unique keys;
- constraints;
- one-to-one, one-to-many, many-to-many;
- normalization;
- denormalization;
- data integrity;
- schema design trade-offs.

---

# 2. 5W+H

## What?

A relational model represents structured data using relations/tables and explicit constraints.

## Why?

Good modeling protects data integrity and makes important access patterns predictable.

## Where?

Orders, users, payments, inventory, enterprise master data, transactional systems.

## When?

When relationships, consistency, transactions, and structured querying matter.

## How?

Define entities → keys → relationships → constraints → access patterns → indexes.

---

# 3. Real-Life Analogy

A database schema is like a city's legal property registry.

It does not only store addresses; it defines:

- ownership;
- uniqueness;
- valid relationships;
- rules preventing contradictory records.

---

# 4. Visualization

```text
Customer
 PK customer_id
      │ 1
      │
      │ N
Order
 PK order_id
 FK customer_id
      │ 1
      │
      │ N
OrderItem
 FK order_id
 FK product_id
      │
      ▼
Product
 PK product_id
```

---

# 5. Mind Map

```text
Relational Modeling
│
├── Entity
├── Primary Key
├── Foreign Key
├── Unique Constraint
├── Composite Key
├── Relationships
├── Normalization
├── Denormalization
└── Integrity
```

---

# 6. Core Concepts

## 6.1 Primary Key

Uniquely identifies a row.

Example:

```sql
CREATE TABLE customer (
    customer_id BIGINT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE
);
```

Primary key is an integrity concept, not merely an index trick.

---

## 6.2 Foreign Key

Protects referential integrity.

```sql
CREATE TABLE orders (
    order_id BIGINT PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    CONSTRAINT fk_order_customer
        FOREIGN KEY (customer_id)
        REFERENCES customer(customer_id)
);
```

---

## 6.3 Unique Constraint

Useful for business uniqueness:

```text
email
external_payment_id
tenant_id + username
```

Do not enforce critical uniqueness only in application code if DB integrity is required.

---

## 6.4 Composite Key / Composite Uniqueness

Example:

```sql
UNIQUE (tenant_id, external_id)
```

This is common in multi-tenant systems.

---

## 6.5 One-to-Many

Customer → Orders.

Foreign key usually sits on many side.

---

## 6.6 Many-to-Many

Student ↔ Course.

Use junction table:

```text
student
course
student_course
```

Junction table may carry relationship attributes such as enrollment date.

---

## 6.7 Normalization

Practical goal:

> reduce unnecessary duplication and update anomalies while representing dependencies cleanly.

### 1NF
Atomic/consistent column values and row structure.

### 2NF
Avoid partial dependency on part of a composite key.

### 3NF
Avoid transitive dependencies among non-key attributes.

For interviews, explain purpose rather than reciting textbook wording only.

---

## 6.8 Denormalization

Intentional duplication to improve read performance or simplify access.

Trade-offs:

- faster reads;
- more complex writes;
- consistency burden;
- storage.

Never denormalize without a measurable access pattern.

---

## 6.9 Constraints

Use database constraints for invariants such as:

- NOT NULL;
- UNIQUE;
- FOREIGN KEY;
- CHECK where supported/appropriate.

Application validation improves UX; DB constraints protect final integrity.

---

# 7. Engineering Depth

## 7.1 Natural vs Surrogate Key

Natural:

```text
email
government identifier
```

Surrogate:

```text
generated numeric/UUID ID
```

Surrogate IDs reduce coupling to mutable business values.

Business uniqueness can still be protected separately.

---

## 7.2 Multi-Tenancy

If data is tenant-scoped:

```text
tenant_id
```

often needs to participate in:

- uniqueness;
- indexes;
- authorization filtering;
- cache keys.

A schema can accidentally permit cross-tenant collisions/leaks if tenant boundary is ignored.

---

## 7.3 Soft Delete

Example:

```text
deleted_at
```

Advantages:

- recovery;
- audit.

Costs:

- all reads must handle deleted rows;
- uniqueness becomes trickier;
- storage grows.

Do not choose soft delete automatically.

---

# 8. Implementation / Code

```sql
CREATE TABLE orders (
    order_id BIGINT PRIMARY KEY,
    customer_id BIGINT NOT NULL,
    status VARCHAR(30) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    CONSTRAINT fk_orders_customer
        FOREIGN KEY (customer_id)
        REFERENCES customer(customer_id)
);
```

---

# 9. Hands-On Practice

Design schema for:

- Customer
- Product
- Order
- OrderItem

Requirements:

- one customer has many orders;
- order has many items;
- one product can appear in many orders;
- product price can change over time.

Architect question:

> Should order item store price-at-purchase?

Yes, often because historical order price is transactional history, not necessarily current product price.

---

# 10. Google Interview Drill

## Problem — Design Multi-Tenant User Schema

Requirements:

- users belong to tenant;
- same email may exist in different tenants;
- email unique within tenant;
- deactivate users but retain audit.

### Clarify

- user can belong to multiple tenants?
- global login identity or tenant-local?
- deletion requirements?
- audit retention?

### First Design

```text
users(
  id,
  tenant_id,
  email,
  active
)
```

### Improve

Add:

```sql
UNIQUE (tenant_id, email)
```

and FK tenant.

### Edge Cases

- case-insensitive email;
- tenant deletion;
- reusing email after soft delete;
- cross-tenant query leakage.

### Follow-Up

How does tenant boundary affect:

- indexes?
- authorization?
- cache keys?
- partitioning?

---

# 11. Common Mistakes

1. No DB uniqueness for critical invariant.
2. Many-to-many stored as comma-separated IDs.
3. Denormalizing without access-pattern evidence.
4. Treating normalization as absolute.
5. Using mutable business value as primary key without considering change.
6. Soft delete everywhere.
7. Ignoring tenant in unique/index design.

---

# 12. Best Practices

- model domain relationships explicitly;
- enforce critical integrity in DB;
- use surrogate ID when appropriate;
- preserve transactional history intentionally;
- denormalize only for justified reads;
- include tenant boundary consistently.

---

# 13. Interview Questions

1. Primary vs unique key?
2. Foreign key?
3. Composite key?
4. One-to-many?
5. Many-to-many?
6. Why normalize?
7. When denormalize?
8. Natural vs surrogate key?
9. Soft delete trade-offs?
10. How model multi-tenancy?

---

# 14. Google-Level Follow-Ups

1. same user in many tenants?
2. global user identity?
3. billions of orders?
4. archive old data?
5. audit requirements?
6. GDPR deletion vs retention?
7. partition by tenant?

---

# 15. Quick Revision

```text
PK = row identity
FK = referential integrity
UNIQUE = business uniqueness
M:N = junction table
Normalize for integrity/change safety
Denormalize intentionally for reads
App validation + DB constraints
Tenant belongs in integrity/access design
```

---

# 16. Readiness Gate

- [ ] Keys/constraints.
- [ ] Relationships.
- [ ] Normalization.
- [ ] Denormalization.
- [ ] Natural vs surrogate.
- [ ] Soft delete.
- [ ] Multi-tenant schema drill.

**Gate:** READY / REPAIR

---

# 17. References

- PostgreSQL / MySQL relational modeling documentation
- SQL standard concepts
