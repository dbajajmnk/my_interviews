# P01 — Software Architecture Fundamentals + Requirements & Quality Attributes

**Interview Track:** Software Design & Architecture  
**Pack:** P01 of 12  
**Source Curriculum:** Module 1 — Introduction to Software Architecture  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, explain, apply, compare, and defend the fundamentals of software architecture.

---

## 1. Objective

By the end of this pack, you should be able to confidently explain:

- What software architecture is.
- How architecture differs from software design.
- What a software architect is responsible for.
- The difference between functional and non-functional requirements.
- Why quality attributes matter.
- How scalability, performance, security, and maintainability affect architecture.
- The basic software architecture lifecycle.
- How to analyze the architecture of a sample enterprise application.

This pack is based strictly on the topics listed in Module 1 of the supplied curriculum.

---

# 2. Simple Analogy

Think about constructing a large commercial building.

## Architecture
Architecture decides:

- How many floors are needed.
- Where entrances and exits go.
- Where lifts and emergency stairs go.
- How electrical, water, fire-safety, and structural systems fit together.
- How the building supports future expansion.
- What safety and performance standards must be satisfied.

## Design
Design goes deeper into individual parts:

- Exact room layout.
- Door dimensions.
- Material selection.
- Interior structure.
- Detailed implementation decisions.

### Interview takeaway

**Architecture = major structural decisions and system-wide constraints.**  
**Design = detailed decisions inside that architecture.**

---

# 3. Visualization

```text
Business Need
    |
    v
Requirements
    |
    +----------------------+
    |                      |
    v                      v
Functional            Non-Functional
Requirements          Requirements
    |                      |
    +----------+-----------+
               |
               v
        Architecture Decisions
               |
        +------+------+------+------+
        |             |             |
        v             v             v
   Components       Data        Integration
        |             |             |
        +------+------+-------------+
               |
               v
        Quality Attributes
               |
   +-----------+-----------+-----------+
   |           |           |           |
Scalability Performance Security Maintainability
```

---

# 4. Mind Map

```text
Software Architecture
|
+-- Definition
|
+-- Architecture vs Design
|
+-- Architect Role
|   +-- Understand business needs
|   +-- Identify constraints
|   +-- Make major technical decisions
|   +-- Balance quality attributes
|   +-- Communicate architecture
|
+-- Requirements
|   +-- Functional
|   +-- Non-functional
|
+-- Quality Attributes
|   +-- Scalability
|   +-- Performance
|   +-- Security
|   +-- Maintainability
|
+-- Architecture Lifecycle
|
+-- Enterprise Architecture Analysis
```

---

# 5. Core Concepts

## 5.1 What is Software Architecture?

Software architecture describes the high-level structure of a software system and the important decisions that define how major parts of the system work together.

It normally deals with questions such as:

- What are the major components?
- What responsibility belongs to each component?
- How do components communicate?
- Where is data stored?
- How are external systems integrated?
- How will the system meet quality requirements?
- Which architectural constraints must development teams follow?

### Interview-ready answer

> Software architecture is the high-level structure and set of significant technical decisions that determine how a system is organized, how its major components interact, and how the system satisfies functional and non-functional requirements.

### Important point

Architecture is not simply a diagram.

A diagram can **represent** architecture, but architecture includes the actual decisions, constraints, responsibilities, interactions, and trade-offs behind that diagram.

---

## 5.2 Architecture vs. Design

| Architecture | Design |
|---|---|
| High-level system structure | Detailed implementation structure |
| Focuses on major components | Focuses on classes, methods, modules, interfaces |
| Driven heavily by NFRs and constraints | Driven heavily by implementation needs |
| Difficult/costly decisions to change later | Usually easier to refactor locally |
| System-wide impact | More localized impact |
| Example: monolith vs microservices | Example: Strategy vs Factory pattern |

### Example

Suppose we build an e-commerce system.

**Architecture decisions:**

- Monolith or microservices?
- SQL or NoSQL for a specific need?
- Synchronous or event-driven communication?
- How will the system scale?
- How will authentication work across services?

**Design decisions:**

- Which classes implement order processing?
- Which design pattern creates payment processors?
- How should interfaces be structured?
- How should validation logic be organized?

### Cross-question

**Q: Is the boundary between architecture and design always fixed?**

No. The boundary can depend on system scale and context. A decision may be a local design decision in one system but become architecturally significant in another if it affects scalability, security, deployment, integration, or long-term maintainability.

---

# 6. Roles of a Software Architect

The supplied curriculum explicitly includes the role of a software architect. At interview level, explain the role around decision-making rather than job-title authority.

A software architect typically contributes to:

- Understanding business and technical requirements.
- Identifying functional and non-functional requirements.
- Defining the high-level system structure.
- Evaluating technical alternatives.
- Making or facilitating significant architecture decisions.
- Balancing quality attributes and trade-offs.
- Defining technical constraints and standards.
- Communicating architecture to technical and non-technical stakeholders.
- Supporting development teams during implementation.
- Reviewing whether the implementation remains aligned with intended architecture.
- Evolving architecture as requirements change.

### Strong interview phrase

> An architect should not simply choose technologies. The architect should connect business goals, constraints, quality attributes, system structure, engineering trade-offs, and implementation guidance.

### Red flag

Avoid saying:

> “The architect decides everything and developers implement it.”

That presents architecture as command-and-control rather than collaborative technical leadership.

---

# 7. Functional vs. Non-Functional Requirements

## 7.1 Functional Requirements

Functional requirements describe **what the system must do**.

Examples:

- User can register.
- Customer can place an order.
- User can make a payment.
- Administrator can generate reports.
- System can send notifications.

### Simple question

**What functionality does the business expect from the system?**

---

## 7.2 Non-Functional Requirements

Non-functional requirements describe **how well the system must operate** or the constraints under which it must operate.

Examples:

- The system should support a large number of concurrent users.
- API response time should remain within an agreed target.
- Sensitive information must be protected.
- The system should remain available during failures.
- Changes should be easy to implement and deploy.

### Simple question

**What qualities must the system demonstrate while providing its functionality?**

---

## 7.3 Why NFRs Matter to Architecture

Two systems may have almost identical features but require completely different architectures because their NFRs differ.

Example:

### Application A
- 200 internal employees
- Used only during office hours
- Low traffic
- Moderate security requirements

### Application B
- Millions of users
- 24×7 availability
- High transaction volume
- Strong security requirements
- International usage

Both systems might contain login, search, and transaction functionality, but their architecture requirements are completely different.

### Interview takeaway

> Functional requirements tell us what to build. Non-functional requirements heavily influence how we architect it.

---

# 8. Quality Attributes

The supplied curriculum explicitly names:

- Scalability
- Performance
- Security
- Maintainability

These four are therefore the mandatory focus of this pack.

---

## 8.1 Scalability

Scalability is the system's ability to handle increasing workload without unacceptable degradation.

Typical workload growth may include:

- More users.
- More requests.
- More transactions.
- More data.
- More services.
- More geographic regions.

### Example

An e-commerce application works for 1,000 users.

What happens when traffic becomes 100,000 users?

Architecture decisions may need to consider:

- Horizontal scaling.
- Load balancing.
- Caching.
- Database scalability.
- Asynchronous processing.
- Service decomposition.

Do not treat these mechanisms as automatic requirements; they depend on the actual scale and constraints.

---

## 8.2 Performance

Performance concerns how efficiently and quickly the system performs its work.

Typical measures can include:

- Response time.
- Latency.
- Throughput.
- Resource utilization.

### Example

A customer searches for a product.

If the search consistently takes several seconds when the business expects near-immediate interaction, the system may technically function but still fail its performance requirement.

### Performance vs Scalability

**Performance:** How well does the system work under a given load?

**Scalability:** How effectively can the system handle increasing load?

A system can perform well at low traffic but scale poorly.

---

## 8.3 Security

Security protects the system and its information from unauthorized access, misuse, modification, or disruption.

At architecture level, security influences decisions such as:

- Authentication.
- Authorization.
- Data protection.
- Secure communication.
- Service boundaries.
- External integration.
- Access control.
- Security monitoring.

More detailed security topics appear later in the curriculum, so this pack keeps security at the architecture-fundamentals level.

### Interview takeaway

Security should not be considered only after development is complete.

It is an architectural concern because early structural decisions can either strengthen or weaken the system's security posture.

---

## 8.4 Maintainability

Maintainability describes how easily the system can be:

- Understood.
- Modified.
- Fixed.
- Extended.
- Tested.
- Operated over time.

Architecture decisions affecting maintainability include:

- Clear responsibilities.
- Low unnecessary coupling.
- Modular boundaries.
- Consistent patterns.
- Documentation.
- Separation of concerns.

### Example

If one small business-rule change forces changes across ten unrelated modules, the architecture may have a maintainability problem.

---

# 9. Quality Attribute Trade-Offs

Architects rarely maximize every quality attribute simultaneously.

Examples:

### Security vs Convenience

More security controls may introduce additional authentication steps or operational complexity.

### Performance vs Maintainability

Highly specialized performance optimizations may make code and infrastructure harder to maintain.

### Scalability vs Simplicity

A simple monolith may be easier to build and maintain initially, while a more distributed system can introduce additional operational complexity.

### Interview principle

> Architecture is often the art of making an acceptable trade-off under real constraints.

Do not answer architecture questions as if one solution is universally best.

---

# 10. Software Architecture Lifecycle

The source curriculum includes the **Software Architecture Lifecycle**, but it does not prescribe a detailed named lifecycle model.

For interview preparation, use a simple lifecycle interpretation:

```text
Understand Business Need
        |
        v
Gather Requirements
        |
        v
Identify NFRs & Constraints
        |
        v
Evaluate Architecture Options
        |
        v
Make Architecture Decisions
        |
        v
Document & Communicate
        |
        v
Support Implementation
        |
        v
Review / Validate
        |
        v
Evolve Architecture
```

### Key idea

Architecture is not a one-time drawing exercise.

It evolves as:

- Requirements change.
- Constraints change.
- Scale changes.
- Security expectations change.
- Technology and operational realities change.

---

# 11. Engineering Depth

## 11.1 Significant Architecture Decisions

A useful interview test:

> If changing a decision later creates major system-wide cost, risk, or impact, it is likely architecturally significant.

Examples may include:

- System decomposition.
- Integration style.
- Primary data architecture.
- Deployment model.
- Security boundary.
- Communication approach.

---

## 11.2 Constraints

Architecture exists within constraints.

Examples:

- Budget.
- Time.
- Existing systems.
- Existing technical skills.
- Regulatory requirements.
- Infrastructure.
- Integration dependencies.
- Deployment restrictions.

A strong architect does not design an imaginary ideal system while ignoring constraints.

---

## 11.3 Architecture Is Context-Dependent

Avoid universal statements such as:

- Microservices are always better.
- NoSQL is always more scalable.
- Cloud-native is always required.
- More services always improve maintainability.

A better answer is:

> The correct architecture depends on requirements, NFRs, constraints, team capability, operational model, expected scale, and trade-offs.

---

# 12. Common Mistakes / Red Flags

## Mistake 1 — Architecture = Diagram

Wrong mindset:

> “Architecture is the diagram of the application.”

Better:

> A diagram communicates architecture. Architecture itself includes structural decisions, constraints, responsibilities, interactions, and trade-offs.

---

## Mistake 2 — Jumping Straight to Technology

Interviewer:

> Design an application.

Weak answer:

> React, Spring Boot, Kafka, Redis, Kubernetes...

Strong approach:

1. Clarify requirements.
2. Identify NFRs.
3. Understand constraints.
4. Determine architecture.
5. Then select technologies.

---

## Mistake 3 — Ignoring NFRs

Functional requirements alone are insufficient for architecture.

Always ask:

- Expected scale?
- Availability?
- Performance?
- Security?
- Maintainability?
- Integration constraints?

---

## Mistake 4 — Overengineering

Do not introduce complex architecture without a reason.

Architecture should solve requirements, not demonstrate the maximum number of technologies.

---

## Mistake 5 — Claiming One Best Architecture

Most architecture decisions involve context and trade-offs.

Use:

> “Given these requirements and constraints, I would choose...”

instead of:

> “This is always the best architecture.”

---

# 13. Practical Enterprise Architecture Analysis

The source curriculum asks to analyze the architecture of a sample enterprise application.

Use this simple case:

## Scenario

A company wants an employee expense-management application.

Employees should:

- Login.
- Submit expenses.
- Upload receipts.
- View expense status.

Managers should:

- Review expenses.
- Approve or reject claims.

Finance should:

- View approved expenses.
- Generate reports.

---

## Step 1 — Functional Requirements

- Authentication.
- Submit expense.
- Upload receipt.
- Approval workflow.
- Status tracking.
- Reporting.

---

## Step 2 — Non-Functional Requirements

Ask before assuming:

- How many users?
- Expected peak usage?
- Security requirements?
- Availability requirement?
- Performance expectation?
- Data retention requirements?
- Integration with payroll or finance systems?
- Expected change frequency?

---

## Step 3 — Identify Major Components

Conceptually:

```text
Users
 |
 v
Application / UI
 |
 v
Application Services
 |
 +--------+---------+---------+
 |        |         |         |
Auth   Expense   Approval   Reporting
 |        |         |         |
 +--------+---------+---------+
             |
             v
           Data
             |
             v
External Enterprise Systems
```

This is intentionally technology-neutral.

---

## Step 4 — Discuss Quality Attributes

### Security
Expense and employee data should be protected.

### Performance
Common actions should respond within acceptable business expectations.

### Scalability
Architecture should support expected organizational growth.

### Maintainability
Approval rules and reporting requirements are likely to evolve.

---

## Step 5 — Discuss Trade-Offs

For a moderate internal application, unnecessary distributed complexity may not be justified.

If scale, organizational boundaries, integration requirements, or independent deployment requirements become substantial, the architecture may need to evolve.

This demonstrates architectural reasoning without blindly choosing a technology stack.

---

# 14. Interview Questions

## Q1 — What is software architecture?

### Strong answer structure

1. High-level structure.
2. Significant technical decisions.
3. Components and interactions.
4. Constraints.
5. Functional and non-functional requirements.
6. Trade-offs.

---

## Q2 — Architecture vs design?

### Strong answer

Architecture focuses on significant system-wide structural decisions and quality attributes, while design focuses more on detailed implementation decisions within those architectural boundaries.

Add an example.

---

## Q3 — What does a software architect do?

Cover:

- Understand requirements.
- Identify NFRs and constraints.
- Evaluate alternatives.
- Make/guide architecture decisions.
- Communicate decisions.
- Support implementation.
- Review architecture.
- Manage trade-offs.

---

## Q4 — Functional vs non-functional requirements?

Use:

**Functional = what.**  
**Non-functional = how well / under what constraints.**

Give examples of each.

---

## Q5 — Why are NFRs important?

Because they strongly influence architecture.

A system for hundreds of internal users and a public system for millions of users may offer similar features but require very different architectures.

---

## Q6 — Explain scalability.

Ability of the system to handle increased workload without unacceptable degradation.

---

## Q7 — Performance vs scalability?

Performance describes system behavior at a given workload.

Scalability describes how well the system accommodates workload growth.

---

## Q8 — What is maintainability?

How easily the system can be understood, changed, fixed, extended, tested, and operated over time.

---

## Q9 — Can one architecture optimize all quality attributes?

Normally no.

Quality attributes can compete, so architecture requires prioritization and trade-offs.

---

## Q10 — What makes an architecture decision significant?

A decision is often architecturally significant when changing it later has broad system-wide cost, risk, or impact.

---

# 15. Scenario Questions

## Scenario 1

A business wants a new application but says:

> “It must be very fast and scalable.”

### Your response

Do not immediately design.

Clarify:

- Expected users.
- Request volume.
- Peak traffic.
- Critical operations.
- Required response times.
- Growth expectations.
- Availability.
- Budget.
- Operational constraints.

Then translate vague statements into measurable requirements where possible.

---

## Scenario 2

A system works well today, but every new feature requires changes across many modules.

### Likely quality concern

Maintainability.

Then explore:

- Coupling.
- Separation of concerns.
- Module boundaries.
- Responsibility distribution.

P02 will go deeper into these design principles.

---

## Scenario 3

An interviewer asks:

> “Should we use microservices?”

### Strong response

Do not answer yes/no immediately.

Ask about:

- Scale.
- Domain complexity.
- Team organization.
- Independent deployment requirements.
- Operational maturity.
- Availability needs.
- Integration boundaries.

Then explain the trade-offs.

---

# 16. Follow-Up / Cross-Question Survival

## Cross-Q1
**If architecture is high-level, why should an architect care about implementation?**

Because architecture decisions must remain implementable. An architect needs sufficient implementation awareness to validate feasibility, identify risks, and ensure architecture decisions are correctly realized.

---

## Cross-Q2
**Can a good architecture guarantee a successful product?**

No. Architecture supports product quality, but success also depends on correct requirements, implementation, testing, operations, user needs, business execution, and other factors.

---

## Cross-Q3
**Can architecture change after development starts?**

Yes. Architecture should evolve when requirements, constraints, scale, risks, or operational realities change. Significant changes should be deliberate and evaluated for impact.

---

## Cross-Q4
**Which is more important: scalability or security?**

There is no universal answer.

Priority depends on business context and risk. Some systems may prioritize security more heavily; others may have extreme scalability requirements. Both still need acceptable levels.

---

## Cross-Q5
**How do you know whether architecture is good?**

Evaluate whether it:

- Satisfies required functionality.
- Meets prioritized quality attributes.
- Fits constraints.
- Has acceptable trade-offs.
- Can be implemented and operated.
- Supports expected evolution.

---

# 17. Explain-on-Demand Drill

You should be able to explain each in approximately 30–60 seconds:

- Software architecture.
- Architecture vs design.
- Functional requirement.
- Non-functional requirement.
- Scalability.
- Performance.
- Security.
- Maintainability.
- Architect role.
- Architecture lifecycle.
- Architecture trade-off.

---

# 18. Whiteboard / Visualization Drill

Without notes, draw:

```text
Requirements
    |
    +--> Functional
    |
    +--> Non-Functional
             |
             +--> Scalability
             +--> Performance
             +--> Security
             +--> Maintainability
                     |
                     v
              Architecture Decisions
```

Then explain the diagram conversationally.

---

# 19. Rapid Revision Sheet

## Remember this sequence

**Business Need → Requirements → NFRs → Constraints → Architecture Decisions → Quality Attributes → Trade-offs → Implementation → Review → Evolution**

## Architecture vs Design

**Architecture:** system-wide significant decisions.  
**Design:** detailed implementation decisions.

## Functional vs NFR

**Functional:** what the system does.  
**NFR:** how well / under what constraints.

## Core Quality Attributes in P01

**Scalability • Performance • Security • Maintainability**

## Architect

**Understand → Evaluate → Decide → Communicate → Guide → Review → Evolve**

## Golden Rule

> Never choose an architecture before understanding the requirements, NFRs, constraints, and trade-offs.

---

# 20. Self-Practice

Answer aloud without reading:

1. What is software architecture?
2. Architecture vs design?
3. What are the responsibilities of a software architect?
4. Functional vs non-functional requirements?
5. Why do NFRs drive architecture?
6. Scalability vs performance?
7. Why can security be an architectural concern?
8. What affects maintainability?
9. Explain architecture lifecycle.
10. Analyze a simple enterprise application.
11. Give an example of an architecture trade-off.
12. How do constraints affect architecture?
13. Why should an architect avoid overengineering?
14. What makes an architecture decision significant?
15. How would you begin an architecture interview question?

---

# 21. P01 Readiness Gate

Do **not** mark P01 complete unless you can do all of the following:

- [ ] Define software architecture in your own words.
- [ ] Explain architecture vs design with an example.
- [ ] Explain the architect's role without describing it only as technology selection.
- [ ] Distinguish functional and non-functional requirements.
- [ ] Explain scalability, performance, security, and maintainability.
- [ ] Explain at least two quality-attribute trade-offs.
- [ ] Explain the architecture lifecycle.
- [ ] Analyze the supplied sample enterprise scenario.
- [ ] Handle at least five follow-up questions.
- [ ] Draw the P01 visualization without notes.
- [ ] Avoid jumping directly to technologies in a design scenario.
- [ ] Structure an architecture answer beginning with requirements and constraints.

**Pass Condition:** You can explain and defend the above conversationally without depending on memorized wording.

---

# 22. Source Boundary

This pack is grounded in **Module 1 of the supplied Software Design & Architecture curriculum**, which contains:

- What is Software Architecture?
- Architecture vs. Design
- Roles of a Software Architect
- Functional vs. Non-functional Requirements
- Quality Attributes: Scalability, Performance, Security, Maintainability
- Software Architecture Lifecycle
- Hands-on architecture analysis of a sample enterprise application

Additional examples, interview questions, analogies, drills, and answer frameworks in this pack are preparation aids built around those source topics; they are not presented as additional curriculum requirements.

---

## Status

**P01 — READY FOR STUDY & READINESS VALIDATION**

**Next after P01 gate:** P02 — Object-Oriented Design Principles