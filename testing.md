# Techlambda Resume Studio — Website Flow Diagrams

**Document Type:** Website Flow / UX Navigation Map  
**Product:** Techlambda Resume Studio  
**Release:** V1  
**Primary URL:** `techlambda.com/resume-services`  
**Career Intelligence Integration:** Not included in V1

---

# 1. Complete Website Flow

```mermaid
flowchart TD

    A[Visitor Lands on Techlambda Resume Services] --> B[Screen 01: Header + Hero]

    B --> B1[Get My Resume Reviewed]
    B --> B2[Explore Plans & Packages]
    B --> C[Scroll Website]

    C --> D[Screen 02: Problem Recognition]
    D --> E[Screen 03: Why Techlambda / Value Proposition]
    E --> F[Screen 04: Career Stage Selector]

    F --> F1[Starting<br/>0–2 Years]
    F --> F2[Growing<br/>2–5 Years]
    F --> F3[Experienced<br/>5–10 Years]
    F --> F4[Leadership<br/>10–15 Years]
    F --> F5[Executive<br/>15+ Years]

    F1 --> G[Dynamic Plans & Pricing]
    F2 --> G
    F3 --> G
    F4 --> G
    F5 --> G

    G --> H{How does the user want to buy?}

    H --> I[Individual Services]
    H --> J[Smart Bundles]
    H --> K[Career Campaign 30]
    H --> L[Build Your Own Package]

    I --> I1[Professional Resume]
    I --> I2[LinkedIn Optimization]
    I --> I3[Professional Cover Letter]
    I --> I4[ATS Keyword Alignment]
    I --> I5[Job Portal Optimization]
    I --> I6[Executive Bio]

    J --> J1[Resume Ready<br/>BUILD]
    J --> J2[Visibility Pro<br/>POSITION]
    J --> J3[Market Advantage<br/>OPTIMIZE]
    J --> J4[Executive Signature]

    K --> K1[Career Campaign 30<br/>MARKET<br/>₹9,999]

    L --> L1[Select Required Services]
    L1 --> L2[Calculate Individual Value]
    L2 --> L3[Apply Bundle Saving]
    L3 --> L4[Show Final Custom Package]

    I1 --> M[Select Service / Package]
    I2 --> M
    I3 --> M
    I4 --> M
    I5 --> M
    I6 --> M

    J1 --> M
    J2 --> M
    J3 --> M
    J4 --> M
    L4 --> M

    K1 --> N[View Career Campaign Scope]

    M --> O[Checkout / Lead Details]
    N --> O

    O --> P[Payment]
    P --> P1{Payment Successful?}

    P1 -->|Yes| Q[Order Created]
    P1 -->|No| P2[Payment Failed / Retry]

    P2 --> P

    Q --> R[Upload Resume + Required Information]
    R --> S[Service Onboarding]

    S --> T{Selected Service Type}

    T -->|Resume / Profile Service| U[Standard Service Delivery]
    T -->|Career Campaign 30| V[Campaign Onboarding]

    U --> U1[Review]
    U1 --> U2[Reposition]
    U2 --> U3[Rebuild]
    U3 --> U4[Refine]
    U4 --> U5[Client Review]
    U5 --> U6[Revision if Required]
    U6 --> U7[Quality Review]
    U7 --> U8[Final Delivery]

    V --> V1[Collect Job Search Preferences]
    V1 --> V2[Application Consent]
    V2 --> V3[Target Job Strategy]
    V3 --> V4[Profile Optimization]
    V4 --> V5[Campaign Start]
    V5 --> V6[Job Discovery]
    V6 --> V7[Job Shortlisting]
    V7 --> V8[Candidate Approval if Required]
    V8 --> V9[Targeted Applications]
    V9 --> V10[Application Tracker]
    V10 --> V11[Weekly Campaign Report]
    V11 --> V12[Day-15 Campaign Review]
    V12 --> V13[Optimize Strategy]
    V13 --> V14[Continue Applications]
    V14 --> V15[30-Day Campaign Completion]

    U8 --> Z[Service Completed]
    V15 --> Z
```

---

# 2. Public Website Screen Flow

```mermaid
flowchart TD

    S01[Screen 01<br/>Header + Hero] --> S02[Screen 02<br/>Problem Recognition]
    S02 --> S03[Screen 03<br/>Techlambda Difference]
    S03 --> S04[Screen 04<br/>Career Stage Selector]
    S04 --> S05[Screen 05<br/>Individual Services + Smart Bundles]
    S05 --> S06[Screen 06<br/>Career Campaign 30]
    S06 --> S07[Screen 07<br/>Build Your Own Package]
    S07 --> S08[Screen 08<br/>Resume Reality Check]
    S08 --> S09[Screen 09<br/>Techlambda 4R Method]
    S09 --> S10[Screen 10<br/>Before vs After]
    S10 --> S11[Screen 11<br/>What Is Included]
    S11 --> S12[Screen 12<br/>Resume Samples]
    S12 --> S13[Screen 13<br/>Testimonials]
    S13 --> S14[Screen 14<br/>Why Techlambda]
    S14 --> S15[Screen 15<br/>How It Works]
    S15 --> S16[Screen 16<br/>FAQ]
    S16 --> S17[Screen 17<br/>Final CTA]
    S17 --> S18[Footer]
```

---

# 3. Header Navigation Flow

```mermaid
flowchart LR

    H[Techlambda Header]

    H --> H1[Resume Services]
    H --> H2[Plans & Packages]
    H --> H3[How It Works]
    H --> H4[Samples]
    H --> H5[FAQ]
    H --> H6[Get Resume Reviewed]

    H1 --> S1[Hero / Resume Services]
    H2 --> S2[Career Stage + Pricing]
    H3 --> S3[How It Works]
    H4 --> S4[Resume Samples]
    H5 --> S5[FAQ]
    H6 --> S6[Resume Reality Check]
```

---

# 4. Resume Reality Check Flow

```mermaid
flowchart TD

    A[Get My Resume Reviewed CTA] --> B[Resume Reality Check]

    B --> C[Enter Full Name]
    C --> D[Enter Email]
    D --> E[Enter Mobile]
    E --> F[Select Career Stage]
    F --> G[Current Role]
    G --> H[Target Role]
    H --> I[Upload Resume<br/>PDF / DOC / DOCX]
    I --> J[Optional LinkedIn URL]

    J --> K{Form Valid?}

    K -->|No| L[Highlight Validation Errors]
    L --> B

    K -->|Yes| M[Submit Review Request]
    M --> N[Lead Created]
    N --> O[Admin Notification]
    O --> P[Resume Review]
    P --> Q[Recommend Suitable Service / Package]

    Q --> R{Candidate Interested?}

    R -->|Yes| S[Proceed to Package / Checkout]
    R -->|Not Yet| T[Follow-Up / Nurture]
```

---

# 5. Career Stage & Dynamic Pricing Flow

```mermaid
flowchart TD

    A[Career Stage Selector] --> B{Select Career Stage}

    B --> C[Starting<br/>0–2 Years]
    B --> D[Growing<br/>2–5 Years]
    B --> E[Experienced<br/>5–10 Years]
    B --> F[Leadership<br/>10–15 Years]
    B --> G[Executive<br/>15+ Years]

    C --> H[Resume Price ₹1,599]
    D --> I[Resume Price ₹2,599]
    E --> J[Resume Price ₹3,999]
    F --> K[Resume Price ₹4,899]
    G --> L[Resume Price ₹6,099]

    H --> M[Update Services + Bundles]
    I --> M
    J --> M
    K --> M
    L --> M

    M --> N[Highlight Recommended Package]
```

---

# 6. Package Progression

```mermaid
flowchart LR

    A[BUILD] --> B[POSITION]
    B --> C[OPTIMIZE]
    C --> D[MARKET]

    A --> A1[Resume Ready]
    B --> B1[Visibility Pro]
    C --> C1[Market Advantage]
    D --> D1[Career Campaign 30<br/>₹9,999]
```

---

# 7. Individual Services Flow

```mermaid
flowchart TD

    A[Individual Services] --> B[Professional Resume]
    A --> C[LinkedIn Optimization]
    A --> D[Professional Cover Letter]
    A --> E[ATS Keyword Alignment]
    A --> F[Job Portal Optimization]
    A --> G[Executive Bio]

    B --> H[View Service Details]
    C --> H
    D --> H
    E --> H
    F --> H
    G --> H

    H --> I[Choose Service]
    I --> J[Order Summary]
    J --> K[Customer Details]
    K --> L[Payment]
    L --> M[Onboarding]
```

---

# 8. Smart Bundles Flow

```mermaid
flowchart TD

    A[Smart Bundles] --> B[Resume Ready]
    A --> C[Visibility Pro]
    A --> D[Market Advantage]
    A --> E[Executive Signature]

    B --> B1[Resume + Cover Letter + Keyword Alignment]
    C --> C1[Resume Ready + LinkedIn]
    D --> D1[Visibility Pro + Job Portal + Cross-Channel Optimization]
    E --> E1[Executive Resume + LinkedIn + Cover Letter + Bio + Leadership Positioning]

    B1 --> F[Compare Individual Value]
    C1 --> F
    D1 --> F
    E1 --> F

    F --> G[Show Bundle Price]
    G --> H[Show Savings]
    H --> I[Choose Package]
    I --> J[Checkout]
```

---

# 9. Build Your Own Package Flow

```mermaid
flowchart TD

    A[Build Your Own Package] --> B[Start with Required Service]

    B --> C{Add Resume?}
    B --> D{Add LinkedIn?}
    B --> E{Add Cover Letter?}
    B --> F{Add Job Portal Optimization?}
    B --> G{Add ATS Keyword Alignment?}
    B --> H{Add Executive Bio?}

    C --> I[Calculate Selected Services]
    D --> I
    E --> I
    F --> I
    G --> I
    H --> I

    I --> J[Individual Total]
    J --> K[Apply Configured Bundle Discount]
    K --> L[Final Package Price]
    L --> M[Show Customer Saving]
    M --> N[Continue With This Package]
    N --> O[Checkout]
```

---

# 10. Career Campaign 30 — Complete Flow

```mermaid
flowchart TD

    A[Career Campaign 30<br/>₹9,999] --> B[View Included Services]

    B --> C[Professional Resume]
    B --> D[LinkedIn Optimization]
    B --> E[Cover Letter]
    B --> F[ATS Keyword Alignment]
    B --> G[Job Portal Optimization]
    B --> H[Job Marketing Strategy]

    C --> I[Purchase / Start Campaign]
    D --> I
    E --> I
    F --> I
    G --> I
    H --> I

    I --> J[Payment]
    J --> K[Campaign Onboarding]

    K --> L[Collect Career Preferences]
    L --> M[Choose Application Approval Mode]

    M --> M1[Pre-Approved Strategy]
    M --> M2[Approval Before Each Application]

    M1 --> N[Application Authorization]
    M2 --> N

    N --> O[Optimize Resume + LinkedIn + Job Portals]
    O --> P[Approve Target Job Strategy]
    P --> Q[Campaign Start Date]

    Q --> R[Job Discovery]
    R --> S[Job Shortlisting]
    S --> T{Suitable Opportunity?}

    T -->|No| R
    T -->|Yes| U{Approval Required?}

    U -->|No| V[Prepare Application]
    U -->|Yes| W[Request Candidate Approval]

    W --> X{Approved?}
    X -->|No| R
    X -->|Yes| V

    V --> Y{OTP / CAPTCHA / Declaration Required?}

    Y -->|No| Z[Techlambda Submits Application]
    Y -->|Yes| ZA[Candidate Completes Required Step]

    ZA --> Z

    Z --> ZB[Update Application Tracker]
    ZB --> ZC[Continue Targeted Job Search]

    ZC --> ZD[Weekly Campaign Report]
    ZD --> ZE[Day-15 Review]
    ZE --> ZF[Adjust Resume / Keywords / Roles if Required]
    ZF --> ZG[Continue Campaign]

    ZG --> ZH{30 Days Complete?}
    ZH -->|No| R
    ZH -->|Yes| ZI[Campaign Completion Report]
```

---

# 11. Career Campaign Application Status Flow

```mermaid
stateDiagram-v2

    [*] --> Discovered

    Discovered --> UnderReview

    UnderReview --> CandidateApproval
    UnderReview --> Approved

    CandidateApproval --> Approved
    CandidateApproval --> Closed

    Approved --> Applied

    Applied --> RecruiterResponse
    Applied --> Rejected
    Applied --> Closed

    RecruiterResponse --> Interview
    RecruiterResponse --> Rejected

    Interview --> Offer
    Interview --> Rejected
    Interview --> Withdrawn

    Offer --> Closed
    Rejected --> Closed
    Withdrawn --> Closed

    UnderReview --> ExpiredBeforeSubmission

    ExpiredBeforeSubmission --> Closed
    Closed --> [*]
```

---

# 12. Standard Resume Service Delivery Flow — Techlambda 4R

```mermaid
flowchart LR

    A[REVIEW] --> B[REPOSITION]
    B --> C[REBUILD]
    C --> D[REFINE]

    A --> A1[Understand Candidate + Resume + Target Role]
    B --> B1[Identify Strengths + Gaps + Positioning]
    C --> C1[Create Resume / Career Assets]
    D --> D1[Client Review + Revisions + Quality Check]

    D1 --> E[Final Word + PDF Delivery]
```

---

# 13. Checkout & Payment Flow

```mermaid
flowchart TD

    A[Selected Service / Package] --> B[Order Summary]

    B --> C[Customer Details]
    C --> D[Confirm Package Scope]
    D --> E[Accept Terms / Privacy]
    E --> F[Proceed to Payment]

    F --> G{Payment Result}

    G -->|Successful| H[Create Paid Order]
    H --> I[Send Payment Confirmation]
    I --> J[Start Onboarding]

    G -->|Failed| K[Show Payment Failure]
    K --> L[Allow Retry]
    L --> F

    G -->|Cancelled| M[Order Remains Payment Pending]
```

---

# 14. Admin / Operations Flow

```mermaid
flowchart TD

    A[Admin Login] --> B[Operations Dashboard]

    B --> C[Resume Review Leads]
    B --> D[Customers]
    B --> E[Orders & Payments]
    B --> F[Service Engagements]
    B --> G[Career Campaigns]
    B --> H[Pricing & Packages]

    C --> C1[Review Lead]
    C1 --> C2[Assign Consultant]
    C2 --> C3[Recommend Package]

    D --> D1[View Customer History]
    D1 --> D2[Documents / Notes / Services]

    E --> E1[Verify Payment Status]
    E1 --> E2[Invoice / Refund Status]

    F --> F1[Assign Resume Consultant]
    F1 --> F2[Update Service Workflow]
    F2 --> F3[Upload Draft / Final Files]

    G --> G1[Create Campaign]
    G1 --> G2[Assign Job Marketing Specialist]
    G2 --> G3[Manage Job Opportunities]
    G3 --> G4[Track Applications]
    G4 --> G5[Weekly Reporting]
    G5 --> G6[Campaign Completion]

    H --> H1[Manage Service Prices]
    H --> H2[Manage Career Stage Prices]
    H --> H3[Manage Bundle Discounts]
    H --> H4[Enable / Disable Services]
```

---

# 15. High-Level Business Funnel

```mermaid
flowchart LR

    A[Traffic] --> B[Resume Services Page]
    B --> C[Engaged Visitor]
    C --> D{Visitor Intent}

    D --> E[Resume Reality Check]
    D --> F[Explore Packages]
    D --> G[Career Campaign 30]

    E --> H[Lead]
    F --> H
    G --> H

    H --> I[Consultation / Selection]
    I --> J[Checkout]
    J --> K[Paid Customer]
    K --> L[Service Delivery]
    L --> M[Completed Customer]

    M --> N[Future Upsell / Retention]
```

---

# 16. Screen-Wise Wireframe Roadmap

| Screen | Name | Primary Goal |
|---|---|---|
| 01 | Header + Hero | Explain offer and drive first CTA |
| 02 | Problem Recognition | Help visitor recognize resume/job-search pain |
| 03 | Techlambda Difference | Establish positioning and trust |
| 04 | Career Stage Selector | Personalize services and pricing |
| 05 | Individual Services & Smart Bundles | Main commercial selection |
| 06 | Career Campaign 30 | Sell ₹9,999 signature managed service |
| 07 | Build Your Own Package | Allow custom service combination |
| 08 | Resume Reality Check | Capture qualified leads |
| 09 | Techlambda 4R Method | Explain delivery methodology |
| 10 | Before vs After | Demonstrate professional transformation |
| 11 | What Is Included | Remove purchase uncertainty |
| 12 | Resume Samples | Demonstrate quality |
| 13 | Testimonials | Build social proof |
| 14 | Why Techlambda | Reinforce differentiation |
| 15 | How It Works | Explain customer journey |
| 16 | FAQ | Remove objections |
| 17 | Final CTA | Capture remaining visitors |
| 18 | Footer | Policies, navigation and company information |

---

# 17. Core Website Principle

The entire website should communicate this progression:

```mermaid
flowchart LR

    A[BUILD<br/>Resume Ready] --> B[POSITION<br/>Visibility Pro]
    B --> C[OPTIMIZE<br/>Market Advantage]
    C --> D[MARKET<br/>Career Campaign 30]

    D --> E[Targeted Job-Market Execution]
```

## Core Message

> **We don't stop at creating a stronger resume. For customers who choose Career Campaign 30, Techlambda helps take that professional profile into the job market through a structured, transparent and targeted 30-day campaign.**

---

# 18. V1 Boundary

```mermaid
flowchart LR

    A[Techlambda Website] --> B[Resume Studio V1]

    B --> C[Resume Services]
    B --> D[Profile Optimization]
    B --> E[Smart Bundles]
    B --> F[Career Campaign 30]

    G[Career Intelligence Platform] -. Future Integration .-> B
```

**Career Intelligence functionality is not exposed or required in V1.**

---

**Status:** Ready for screen-wise wireframing  
**Next:** Screen 02 — Problem Recognition + Value Proposition
