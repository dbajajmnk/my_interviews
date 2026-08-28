# P03 — UML + C4 Architecture Modeling

**Interview Track:** Software Design & Architecture  
**Pack:** P03 of 12  
**Source Curriculum:** Module 3 — UML & Software Modeling  
**Preparation Standard:** Locked Interview Preparation Framework  
**Principles:** KIS • DRY • SOLID • Evidence First • Follow-Up Survival  
**Goal:** Understand, explain, choose, draw, and defend UML and C4 models during architecture interviews.

---

## 1. Objective

By the end of this pack, you should be able to:

- Explain what UML is and why it is used.
- Choose the right diagram for the right purpose.
- Explain and draw:
  - Use Case Diagram
  - Class Diagram
  - Sequence Diagram
  - Activity Diagram
  - Component Diagram
  - Deployment Diagram
- Explain the C4 Architecture Model.
- Compare UML and C4 without treating them as competitors.
- Create a basic model for a business application.
- Explain a diagram in interview language rather than only naming symbols.
- Handle follow-up questions about modeling choices.

The source curriculum includes exactly these modeling topics, plus a lab to create UML diagrams for a business application.

---

# 2. Simple Analogy

Imagine explaining a city.

You can show:

- A tourist map — important places.
- A road map — how places connect.
- A building blueprint — internal structure.
- A transport map — how movement happens.
- A satellite view — larger context.

All are representations of the same city, but each serves a different purpose.

Software modeling works the same way.

Different diagrams answer different questions.

---

# 3. Visualization

```text
System Understanding
      |
      v
Choose the Question
      |
      +----------------------+----------------------+------------------+
      |                      |                      |
      v                      v                      v
Who uses it?          How is it structured?    How does it behave?
      |                      |                      |
      v                      v                      v
Use Case             Class / Component       Sequence / Activity
      |
      +----------------------------------------------+
                                                     |
                                                     v
                                            Where does it run?
                                                     |
                                                     v
                                              Deployment
                                                     |
                                                     v
                                          Architecture Overview
                                                     |
                                                     v
                                                   C4
```

---

# 4. Mind Map

```text
Software Modeling
|
+-- UML Fundamentals
|
+-- Behavioral Views
|   +-- Use Case
|   +-- Sequence
|   +-- Activity
|
+-- Structural Views
|   +-- Class
|   +-- Component
|   +-- Deployment
|
+-- Architecture View
    +-- C4 Model
```

---

# 5. UML Fundamentals

UML stands for **Unified Modeling Language**.

It is a standardized visual modeling language used to describe aspects of software systems.

### Interview-ready answer

> UML provides visual models to communicate structure and behavior. The key is not drawing every possible diagram; it is selecting the diagram that best answers the design question.

### Important interview point

Do not say:

> “UML is documentation.”

Better:

> UML is a modeling language. It can support communication, analysis, design, and documentation.

---

# 6. Use Case Diagram

## Purpose

A Use Case Diagram shows:

- Actors
- System interactions
- High-level user goals

It answers:

> **Who interacts with the system, and what do they want to do?**

---

## Example — Expense Management System

Actors:

- Employee
- Manager
- Finance User

Use cases:

- Submit Expense
- View Expense Status
- Approve Expense
- Reject Expense
- Generate Report

```text
Employee ------> Submit Expense
Employee ------> View Expense Status

Manager -------> Approve Expense
Manager -------> Reject Expense

Finance -------> Generate Report
```

### Interview use

Use it when discussing:

- Scope
- User interaction
- Functional requirements
- System boundary

### Red flag

Do not use a Use Case Diagram to explain:

- Class relationships
- Service deployment
- Runtime message sequence

---

# 7. Class Diagram

## Purpose

A Class Diagram shows static structure.

It can represent:

- Classes
- Attributes
- Methods
- Relationships
- Inheritance
- Composition
- Associations

It answers:

> **What are the main object-oriented structures and how are they related?**

---

## Example

```text
Customer
- id
- name
+ placeOrder()

Order
- orderId
- date
+ calculateTotal()

OrderItem
- quantity
- price
```

Relationship:

```text
Customer 1 ------ * Order
Order    1 ------ * OrderItem
```

### Interview point

A class diagram is useful for object-oriented design, but it is not the same as an architecture diagram.

Architecture works at a broader structural level.

---

# 8. Sequence Diagram

## Purpose

A Sequence Diagram shows interactions over time.

It answers:

> **Which participant calls whom, and in what order?**

---

## Example — Place Order

```text
Customer
   |
   v
OrderController
   |
   v
OrderService
   |
   +--> PaymentService
   |
   +--> OrderRepository
   |
   +--> NotificationService
```

More explicitly:

```text
Customer -> OrderController : placeOrder()
OrderController -> OrderService : createOrder()
OrderService -> PaymentService : processPayment()
PaymentService -> OrderService : success
OrderService -> OrderRepository : save()
OrderService -> NotificationService : sendConfirmation()
OrderService -> OrderController : orderCreated
```

### Interview use

Excellent for:

- API flow
- Service interaction
- Authentication flow
- Payment flow
- Distributed-service communication

---

# 9. Activity Diagram

## Purpose

An Activity Diagram shows workflow or process flow.

It answers:

> **What steps, branches, and decisions occur in a process?**

---

## Example — Expense Approval

```text
Start
  |
Submit Expense
  |
Validate
  |
  +---- Invalid ----> Reject
  |
 Valid
  |
Manager Review
  |
  +---- Reject -----> Rejected
  |
 Approve
  |
Finance Processing
  |
End
```

### Interview use

Useful for:

- Business workflows
- Approval processes
- Decision-heavy processes
- End-to-end business logic

---

# 10. Component Diagram

## Purpose

A Component Diagram shows larger software components and dependencies.

It answers:

> **What are the major software components and how do they depend on each other?**

---

## Example

```text
Web Application
      |
      v
API Layer
      |
      +------------------+
      |                  |
      v                  v
Order Component     User Component
      |                  |
      +---------+--------+
                |
                v
           Data Access
                |
                v
            Database
```

### Interview importance

This is closer to architecture thinking than a class diagram because it focuses on larger structural units.

---

# 11. Deployment Diagram

## Purpose

A Deployment Diagram shows where software runs.

It can represent:

- Nodes
- Servers
- Containers
- Runtime environments
- Databases
- Networks
- Deployed artifacts

It answers:

> **Where are system components deployed?**

---

## Example

```text
Client Browser
     |
     v
Web Server
     |
     v
Application Server
     |
     +------> Database Server
     |
     +------> Cache Server
```

### Interview use

Useful when discussing:

- Runtime topology
- Infrastructure
- Scaling
- Deployment boundaries
- Distributed systems

---

# 12. C4 Architecture Model

The source curriculum explicitly includes the **C4 Architecture Model**.

C4 is an architecture visualization approach based on hierarchical levels of abstraction.

The commonly used levels are:

1. System Context
2. Container
3. Component
4. Code

---

## 12.1 System Context

Shows:

- The system
- Users
- External systems

Question answered:

> **What is the system and what surrounds it?**

Example:

```text
Customer
   |
   v
E-Commerce System
   |
   +--> Payment Provider
   |
   +--> Shipping Provider
```

---

## 12.2 Container

Shows major runtime or deployable building blocks.

Example:

```text
Customer
   |
   v
Web App
   |
   v
Backend API
   |
   +--> Database
   |
   +--> Cache
```

### Important

In C4, "Container" does not necessarily mean Docker container.

It means a major executable/deployable data store or application boundary.

---

## 12.3 Component

Shows major components inside a container.

Example:

```text
Backend API
|
+-- Order Component
+-- Payment Component
+-- Customer Component
+-- Notification Component
```

---

## 12.4 Code

Shows lower-level implementation details.

This can include:

- Classes
- Interfaces
- Methods

It is often less necessary in high-level architecture conversations unless deeper implementation detail is required.

---

# 13. UML vs C4

Do not frame them as direct competitors.

### UML

Broader modeling language with many diagram types.

Good for:

- Behavior
- Structure
- Workflows
- Interactions
- Object design
- Deployment

### C4

Focused specifically on software architecture communication using hierarchical abstraction.

Good for:

- Explaining system context
- Containers
- Components
- Architecture drill-down

### Interview-ready answer

> UML gives me multiple specialized diagram types, while C4 gives me a simple architecture hierarchy. I choose based on the audience and the question I need the diagram to answer.

---

# 14. Engineering Depth — Choosing the Right Diagram

Use this mental map:

| Question | Diagram |
|---|---|
| Who interacts with the system? | Use Case |
| What classes exist? | Class |
| What happens in what order? | Sequence |
| What is the workflow? | Activity |
| What major software parts exist? | Component |
| Where does the system run? | Deployment |
| How do I explain architecture at multiple levels? | C4 |

---

# 15. Common Mistakes / Red Flags

## Mistake 1 — Drawing before understanding the question

First ask:

> What am I trying to communicate?

Then choose the diagram.

---

## Mistake 2 — Using one diagram for everything

A class diagram cannot clearly replace a deployment diagram.

A sequence diagram cannot replace a context diagram.

---

## Mistake 3 — Excessive notation

In interviews, clarity matters more than showing every UML symbol you remember.

---

## Mistake 4 — Confusing component and deployment views

Component = logical/software structure.

Deployment = runtime/infrastructure placement.

---

## Mistake 5 — Confusing C4 Container with Docker Container

They are not the same concept.

---

## Mistake 6 — Diagram without explanation

A strong interview response includes:

- What the diagram represents.
- Why this view was chosen.
- What the important relationships are.
- What is intentionally omitted.

---

# 16. Practical Business Application Lab

The source curriculum requires creating UML diagrams for a business application.

Use this scenario:

## Employee Leave Management System

Actors:

- Employee
- Manager
- HR

Functions:

- Apply for leave
- Approve/reject leave
- View leave balance
- Maintain leave policy
- Generate report

---

## 16.1 Use Case View

```text
Employee --> Apply Leave
Employee --> View Leave Balance

Manager --> Approve Leave
Manager --> Reject Leave

HR --> Maintain Leave Policy
HR --> Generate Report
```

---

## 16.2 Class View

```text
Employee
- employeeId
- name

LeaveRequest
- requestId
- startDate
- endDate
- status

LeaveBalance
- availableDays
```

Possible relations:

```text
Employee 1 ---- * LeaveRequest
Employee 1 ---- 1 LeaveBalance
```

---

## 16.3 Sequence View — Apply Leave

```text
Employee -> UI : submitLeave()
UI -> LeaveService : createRequest()
LeaveService -> LeavePolicyService : validate()
LeavePolicyService -> LeaveService : valid
LeaveService -> LeaveRepository : save()
LeaveService -> NotificationService : notifyManager()
LeaveService -> UI : success
```

---

## 16.4 Activity View

```text
Start
  |
Submit Leave
  |
Validate Policy
  |
  +--- Invalid ---> Reject
  |
 Valid
  |
Manager Review
  |
  +--- Reject ----> Rejected
  |
 Approve
  |
Update Balance
  |
End
```

---

## 16.5 Component View

```text
Web UI
  |
  v
Leave Management API
  |
  +--> Leave Component
  +--> Employee Component
  +--> Notification Component
  |
  v
Database
```

---

## 16.6 Deployment View

```text
Browser
  |
  v
Web/Application Server
  |
  +--> Database Server
  |
  +--> Notification Provider
```

---

# 17. C4 Walkthrough for the Same System

## Context

```text
Employee / Manager / HR
          |
          v
Leave Management System
          |
          +--> Email/Notification System
```

---

## Container

```text
Users
  |
  v
Web Application
  |
  v
Backend API
  |
  +--> Database
  |
  +--> Notification System
```

---

## Component

Inside Backend API:

```text
Leave API
|
+-- Leave Request Component
+-- Policy Component
+-- Approval Component
+-- Notification Component
```

---

# 18. Interview Questions

## Q1 — What is UML?

UML is a standardized visual modeling language used to represent different structural and behavioral aspects of software systems.

---

## Q2 — Why use UML?

To communicate, analyze, and document system structure or behavior using appropriate visual models.

---

## Q3 — Use Case vs Sequence Diagram?

Use Case:

> Who uses the system and for what goal?

Sequence:

> Which participants interact and in what order?

---

## Q4 — Class vs Component Diagram?

Class Diagram:

> Lower-level object-oriented structure.

Component Diagram:

> Larger software components and dependencies.

---

## Q5 — Component vs Deployment Diagram?

Component:

> Logical/software organization.

Deployment:

> Runtime/infrastructure placement.

---

## Q6 — Activity vs Sequence Diagram?

Activity:

> Workflow and decisions.

Sequence:

> Ordered interaction among participants.

---

## Q7 — What is C4?

A hierarchical architecture visualization approach that explains a system using context, container, component, and code levels.

---

## Q8 — UML vs C4?

UML is a broader modeling language.

C4 is a focused architecture visualization model.

Use whichever best communicates the required view.

---

# 19. Scenario Questions

## Scenario 1

**Interviewer:** Explain how payment flows through your system.

Best diagram:

**Sequence Diagram**

Why?

Because the main question is interaction order.

---

## Scenario 2

**Interviewer:** Show where the application, database, and cache run.

Best diagram:

**Deployment Diagram**

---

## Scenario 3

**Interviewer:** Explain the overall platform to a business stakeholder.

Strong choice:

**C4 System Context**

Possibly followed by Container level if needed.

---

## Scenario 4

**Interviewer:** Explain approval steps with conditional branches.

Best diagram:

**Activity Diagram**

---

## Scenario 5

**Interviewer:** Show major modules inside the backend.

Best choice:

**Component Diagram** or **C4 Component View**, depending on the modeling style being used.

---

# 20. Follow-Up / Cross-Question Survival

## Cross-Q1
**Do you need UML for every project?**

No.

Use modeling when it improves communication, design clarity, analysis, or documentation. Avoid ceremony that provides no value.

---

## Cross-Q2
**Can you mix C4 and UML?**

Yes.

For example:

- C4 for architecture overview.
- Sequence diagram for one important runtime interaction.

They can complement each other.

---

## Cross-Q3
**Why not put everything into one architecture diagram?**

Because different audiences and questions require different levels of detail.

One overloaded diagram usually becomes difficult to understand.

---

## Cross-Q4
**When would you use a class diagram in architecture discussion?**

When lower-level object structure is relevant to a particular design area.

For high-level architecture, component or C4 views are usually more appropriate.

---

## Cross-Q5
**What is the biggest benefit of C4?**

It gives a consistent way to explain architecture from high-level context down to implementation-oriented detail.

---

## Cross-Q6
**What if the interviewer asks you to draw without exact UML syntax?**

Prioritize clarity.

Explain what each box, line, actor, or interaction represents.

Correct architectural reasoning matters more than decorative notation.

---

# 21. Whiteboard Drill

Without notes, draw the following in sequence:

1. System Context
2. Container View
3. Component View
4. Sequence Diagram for one business flow
5. Deployment View

For each, explain:

- Why you chose this view.
- What it communicates.
- What it intentionally leaves out.

---

# 22. Explain-on-Demand Drill

Explain each in 30–60 seconds:

- UML
- Use Case Diagram
- Class Diagram
- Sequence Diagram
- Activity Diagram
- Component Diagram
- Deployment Diagram
- C4
- Context vs Container
- Container vs Component
- UML vs C4

---

# 23. Rapid Revision

## UML

**Use Case** — Who & what goal  
**Class** — Object structure  
**Sequence** — Interaction order  
**Activity** — Workflow  
**Component** — Major software parts  
**Deployment** — Where it runs

## C4

**Context → Container → Component → Code**

## Golden Rule

> Choose the diagram based on the question you need to answer.

---

# 24. Self-Practice

Answer aloud:

1. What is UML?
2. Why use UML?
3. Use Case vs Sequence?
4. Sequence vs Activity?
5. Class vs Component?
6. Component vs Deployment?
7. What are the C4 levels?
8. What does C4 Container mean?
9. UML vs C4?
10. Which diagram would you use for a payment flow?
11. Which diagram would you use for deployment topology?
12. Which view is best for executives?
13. Can C4 and UML be used together?
14. How would you model an expense-management application?
15. Draw one C4 flow without notes.

---

# 25. P03 Readiness Gate

Do **not** mark P03 complete unless you can:

- [ ] Explain UML in your own words.
- [ ] Explain the purpose of all six curriculum UML diagrams.
- [ ] Select the right diagram for a given interview scenario.
- [ ] Draw a basic Use Case Diagram.
- [ ] Draw a basic Class Diagram.
- [ ] Draw a basic Sequence Diagram.
- [ ] Draw a basic Activity Diagram.
- [ ] Draw a basic Component Diagram.
- [ ] Draw a basic Deployment Diagram.
- [ ] Explain all four C4 levels.
- [ ] Explain C4 Container correctly.
- [ ] Compare UML and C4.
- [ ] Model a simple business application.
- [ ] Handle at least five modeling cross-questions.
- [ ] Explain diagrams conversationally rather than only showing notation.

**Pass Condition:** You can choose, draw, and explain the right visual model for the problem without depending on memorized notation.

---

# 26. Source Boundary

This pack is grounded in **Module 3 of the supplied Software Design & Architecture curriculum**, which contains:

- UML Fundamentals
- Use Case Diagram
- Class Diagram
- Sequence Diagram
- Activity Diagram
- Component Diagram
- Deployment Diagram
- C4 Architecture Model
- Lab: Create UML diagrams for a business application

The analogies, sample business application, interview questions, comparison tables, whiteboard drills, and readiness gate are interview-preparation aids built around these supplied topics.

---

## Status

**P03 — READY FOR STUDY & READINESS VALIDATION**

**Next after P03 gate:** P04 — Design Patterns