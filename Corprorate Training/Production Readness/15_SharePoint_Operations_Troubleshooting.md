# iRun Corporate Training Interview Preparation
## Module 15 — SharePoint Operations & Troubleshooting

**Interview Target:** iRun Application / Production Operations Training  
**Module Type:** Corporate Training Interview Preparation  
**Priority:** P2 — Interview-Level Operational Awareness  
**Primary Goal:** Build credible operational readiness for SharePoint support and troubleshooting: sites, libraries, lists, permissions, access, sharing, sync, storage, search, integrations, service health, evidence collection, escalation, and trainer scenarios—without overclaiming specialist administration experience.

---

# 1. Module Objective

By the end of this module, you should be able to:

- Explain SharePoint's business and technical role.
- Explain sites, document libraries, lists, permissions, and sharing.
- Troubleshoot common access and permission problems.
- Distinguish SharePoint, OneDrive, and Teams responsibilities at a high level.
- Diagnose document, sync, search, storage, and integration symptoms.
- Use an evidence-first troubleshooting approach.
- Separate user-specific, site-specific, tenant/service-wide, and integration issues.
- Explain safe operational changes and escalation.
- Design practical SharePoint support labs.
- Handle SharePoint questions honestly where specialist depth is limited.

The panel should think:

> **“He can support and teach common SharePoint operational scenarios systematically, while being transparent about specialist administration boundaries.”**

---

# 2. SharePoint Mental Model

```text
MICROSOFT 365 / TENANT
          |
       SHAREPOINT
          |
        SITE
       /    \
 DOCUMENT   LIST
 LIBRARY
    |
 FOLDERS / FILES
    |
PERMISSIONS / SHARING
    |
USERS / GROUPS
```

Operationally, always ask:

**Who is affected? → Which site/resource? → What action fails? → What changed? → Is it permissions, content, client, integration, or service health?**

---

# 3. What Is SharePoint?

SharePoint is a collaboration and content-management platform commonly used for:

- Team sites
- Intranet content
- Document management
- Lists
- Permissions
- Sharing
- Workflow/integration scenarios

Keep the interview explanation practical.

---

# 4. Site

A site is a collaboration/content boundary containing resources such as:

- Pages
- Libraries
- Lists
- Permissions
- Navigation

Operational question:

> Is the problem isolated to one site or visible across multiple sites?

---

# 5. Document Library

A document library stores and manages files.

Capabilities may include:

- Versioning
- Metadata
- permissions
- sharing
- check-in/check-out depending on configuration

Common incidents:

- Cannot upload
- Cannot edit
- Cannot delete
- Cannot share
- File locked
- Version issue
- Sync issue

---

# 6. SharePoint List

A list stores structured items/records.

Common operational problems:

- Permission
- validation
- column/data type
- view/filter
- workflow/integration
- item-level access

Do not confuse a list with a document library.

---

# 7. Permissions Mental Model

Think:

```text
USER
  |
GROUP
  |
PERMISSION LEVEL
  |
SITE / LIBRARY / ITEM
```

Common permission levels conceptually include:

- Read
- Edit
- Full Control

Exact tenant configuration can vary.

---

# 8. Permission Inheritance

Resources commonly inherit permissions from a parent until inheritance is broken.

Example:

```text
Site
 |
Library
 |
Folder
 |
Document
```

Broken inheritance can create unexpected access behavior.

---

# 9. Strong Answer — “User Cannot Access a Document”

> “I first scope whether the user can access the site and library or only fails on that specific document. Then I check the effective permission path: user/group membership, inherited versus unique permissions, sharing state, and whether the issue affects other users. I would also verify that the resource still exists and that no policy or service issue is involved before changing permissions.”

---

# 10. Authentication vs Authorization

**Authentication:** Who are you?

**Authorization:** What are you allowed to do?

If the user can sign in but receives Access Denied for a site, think authorization first.

---

# 11. Sharing

SharePoint can support internal and, depending on organizational policy, external sharing.

Operational checks:

- Is external sharing allowed?
- Is the recipient correct?
- Has the link expired?
- Is sign-in required?
- Does policy restrict sharing?
- Is the resource still available?

Never bypass organizational security policy to “fix” sharing.

---

# 12. External User Cannot Open Link

Check:

1. Exact link
2. Recipient identity
3. Link type
4. Expiration
5. tenant/site sharing policy
6. authentication method
7. resource permission
8. whether other external users are affected

---

# 13. File Locked

Possible causes:

- Another user editing
- application/client state
- incomplete session
- workflow/process
- sync conflict

Do not immediately delete or replace the file.

Protect user data first.

---

# 14. Version History

Versioning helps recover from:

- Incorrect edits
- overwritten content
- accidental changes

Operationally:

- Confirm correct document
- inspect version history
- restore only with authorization/understanding

---

# 15. Deleted Content

Recovery may depend on:

- Recycle Bin
- retention policy
- organizational configuration

Do not promise recoverability without checking actual retention state.

---

# 16. Storage Problems

Symptoms:

- Upload failure
- new content cannot be created
- storage warning

Check:

- Site/tenant storage state
- file size
- quota/policy
- recycle/retention implications
- service health

Do not delete content casually to free space.

---

# 17. Upload Failure

Possible causes:

- Permission
- file restriction
- filename/path issue
- storage
- network
- browser/client
- service issue
- policy

Use exact error evidence.

---

# 18. Large File / Path / Naming Problems

Platform limits and supported behavior evolve.

Interview-safe approach:

> “I would verify the current Microsoft-supported limit or restriction rather than relying on a memorized number, then compare the failing file/path against it.”

This is stronger than guessing an outdated limit.

---

# 19. OneDrive Sync and SharePoint

OneDrive sync client can synchronize SharePoint libraries to a user's device.

Important distinction:

- SharePoint hosts collaborative content.
- OneDrive sync client can synchronize that content locally.

A sync problem does not automatically mean SharePoint service failure.

---

# 20. Sync Problem Troubleshooting

Check:

- One user or many?
- Browser access works?
- Correct account?
- Sync client running?
- Network?
- File/path issue?
- permissions?
- storage?
- client version/state?

Critical diagnostic:

> If browser access works but local sync fails, focus on client/sync path.

---

# 21. Teams and SharePoint

Microsoft Teams commonly uses SharePoint for files associated with teams/channels.

Interview-level understanding:

> A Teams file problem may ultimately involve a SharePoint-backed document library.

Do not claim all Teams data is simply stored in SharePoint.

---

# 22. Search Problem

Symptoms:

- Document exists but cannot be found through search.

Check:

- Is content accessible directly?
- permission/security trimming?
- indexing delay?
- metadata?
- search scope?
- recent creation/change?
- service health?

Search availability and direct content availability are different signals.

---

# 23. Metadata

Metadata helps classify and find content.

Operational problems:

- Required field missing
- wrong type
- inconsistent value
- workflow dependent on metadata

A document upload may fail or workflow may behave differently because of metadata rules.

---

# 24. Views and Filters

A user may think data is missing when a view/filter hides it.

Check:

- Current view
- Filter
- permissions
- item existence

Simple but common support scenario.

---

# 25. Workflow / Power Automate Integration

SharePoint may trigger or participate in workflows.

Common failure categories:

- Connection expired
- permissions
- trigger condition
- schema/column change
- connector issue
- downstream API
- flow disabled

Separate SharePoint content health from workflow execution health.

---

# 26. API / Integration Failure

Possible integration paths:

- Microsoft Graph
- SharePoint APIs
- Power Automate
- third-party applications

Check:

- Authentication
- authorization/scopes
- endpoint
- throttling
- request/response
- schema
- service health

---

# 27. Throttling

Cloud services may throttle excessive requests.

Symptoms:

- intermittent failures
- HTTP 429-style behavior
- automation slowdown

Good client behavior:

- Backoff
- Retry responsibly
- Reduce unnecessary calls
- Respect platform guidance

---

# 28. Service Health

If many users/sites fail simultaneously:

- Check Microsoft 365 service health/status through authorized admin channels.
- Correlate incident timing.
- Avoid changing many local configurations during a service-wide incident.

This is a key operational judgment.

---

# 29. Scope Matrix

Use this before troubleshooting:

| Scope | Likely Direction |
|---|---|
| One file | File/permission/lock/metadata |
| One user | Identity/group/client |
| One library | Library config/permission |
| One site | Site configuration/access |
| Many sites/users | Tenant/service/network |
| Browser works, sync fails | Client/sync |
| SharePoint works, flow fails | Integration/workflow |

---

# 30. Evidence to Collect

Capture:

- Timestamp
- User/action
- Site/resource
- Exact error
- Screenshot/error code where appropriate
- Browser vs client behavior
- Affected-user count
- Recent change
- Permission context
- Service-health signal
- Correlation/request ID if available

Avoid collecting unnecessary sensitive content.

---

# 31. Strong Answer — “SharePoint Is Down”

> “I would not accept ‘SharePoint is down’ as the diagnosis. I would scope whether the problem affects one user, one site, one function, or multiple users/sites. I would test direct access, review the exact error and recent changes, and check authorized Microsoft 365 service-health information if the impact is broad. That tells me whether to troubleshoot locally or treat it as a platform incident.”

---

# 32. Scenario 1 — One User Gets Access Denied

Check:

- User identity
- group membership
- effective permissions
- inheritance
- resource-specific permissions

Do not grant Full Control as a shortcut.

---

# 33. Scenario 2 — Everyone Can Open File Except External User

Check:

- External sharing policy
- link type
- recipient
- expiration
- external identity/sign-in

---

# 34. Scenario 3 — Browser Works, Sync Does Not

Likely direction:

- OneDrive sync client
- local account/session
- client state
- network
- unsupported path/file condition

---

# 35. Scenario 4 — Document Missing from Search

Check:

- Direct URL/access
- permissions
- metadata
- indexing timing
- search scope

---

# 36. Scenario 5 — Power Automate Flow Stopped

Check:

- Flow run history
- connection
- permissions
- changed SharePoint column/schema
- trigger
- downstream dependency

---

# 37. Scenario 6 — Many Sites Suddenly Fail

Check:

- Service health
- identity platform
- network
- tenant-wide change

Avoid mass local changes until scope is understood.

---

# 38. Scenario 7 — User Says File Was Overwritten

Check:

- Version history
- audit evidence where authorized
- correct file
- restore path

Do not overwrite the current version before preserving evidence.

---

# 39. Scenario 8 — Upload Suddenly Fails

Check:

- Exact file
- another file?
- browser?
- permissions?
- storage?
- metadata?
- policy?
- service?

Use comparison testing.

---

# 40. Change Safety

Before changing:

- Know current state.
- Know expected state.
- Confirm scope.
- Use least privilege.
- Preserve evidence.
- Have rollback/recovery path.

Especially important for permissions and content recovery.

---

# 41. Least Privilege

Do not solve access incidents by granting excessive rights.

Strong interview statement:

> “I restore the minimum access required by the business role and fix the permission path rather than granting broad control.”

---

# 42. Auditability

For sensitive operational changes, record:

- What changed
- Who approved
- Why
- Before/after state
- Validation

This connects SharePoint support with enterprise governance.

---

# 43. Security Awareness

Be careful with:

- External sharing
- confidential documents
- permission inheritance
- anonymous links where policy permits them
- sensitive logs/screenshots
- access escalation

Do not weaken controls for convenience.

---

# 44. SharePoint Online vs SharePoint Server

Interview-level distinction:

- **SharePoint Online:** Microsoft-hosted cloud service.
- **SharePoint Server:** Organization-managed/on-premises deployment.

Operational ownership differs substantially.

Do not mix administration procedures between them.

---

# 45. Escalation Boundary

Escalate when:

- Tenant-level admin action required
- service incident suspected
- security/compliance issue
- data recovery beyond support scope
- platform bug suspected
- specialist farm/server administration required

Good operations includes knowing when not to improvise.

---

# 46. Corporate Training Angle

Teach SharePoint support as:

**Scope → Reproduce → Permission/Content/Client/Service → Evidence → Safe Fix → Validate**

Do not make training a tour of menus.

---

# 47. Lab 1 — Broken Permission Inheritance

Inject:

- Document/library has unique permissions.

Learners:

- compare user access
- inspect permission path
- identify inheritance break
- restore correct least-privilege access
- validate

---

# 48. Lab 2 — External Sharing Failure

Inject:

- Expired/restricted sharing link.

Learners:

- inspect sharing scope
- validate policy
- issue correct authorized access
- test as recipient

---

# 49. Lab 3 — Sync Failure

Inject:

- Browser works; local sync client fails.

Learners:

- scope client vs service
- inspect sync state
- correct account/client issue
- validate

---

# 50. Lab 4 — Missing Search Result

Inject:

- Newly changed document not appearing in search.

Learners:

- prove direct availability
- check permissions/metadata
- understand indexing/search delay
- validate later

---

# 51. Lab 5 — Broken Workflow

Inject:

- SharePoint column changed and flow fails.

Learners:

- inspect flow history
- correlate schema change
- fix mapping
- replay safely
- validate business result

---

# 52. Whiteboard — SharePoint Troubleshooting

```text
                 USER
                   |
             CAN SIGN IN?
              /        \
            NO          YES
            |            |
        Identity      SITE ACCESS?
                       /      \
                     NO        YES
                     |          |
                Permission    RESOURCE
                               |
                     FILE / LIST / SEARCH
                               |
                    CLIENT / WORKFLOW?
                               |
                     SERVICE-WIDE?
                               |
                         SAFE FIX
                               |
                         VALIDATE
```

---

# 53. 30-Second Explain-on-Demand

> “For SharePoint incidents I first scope the problem by user, site, resource and function. Then I separate identity and permissions from content, sync/client behavior, workflow integration and service-wide health. I use the exact error and effective access path before changing anything, and I follow least privilege when restoring access.”

---

# 54. 5-Minute Trainer Demo

### Topic: User Cannot Access a Document

1. Confirm user identity.
2. Test site access.
3. Test library access.
4. Inspect document-specific permission.
5. Explain inheritance.
6. Compare affected/unaffected user.
7. Apply minimum authorized correction.
8. Validate.
9. Document change.
10. Key takeaway.

---

# 55. High-Probability Interview Questions

1. What is SharePoint used for?
2. Site vs library vs list?
3. How do SharePoint permissions work?
4. What is permission inheritance?
5. User gets Access Denied—what do you check?
6. Authentication vs authorization?
7. How do you troubleshoot external sharing?
8. What causes file-lock issues?
9. What is version history?
10. How would you recover deleted/overwritten content?
11. SharePoint vs OneDrive?
12. How does Teams relate to SharePoint files?
13. How do you troubleshoot sync?
14. How do you troubleshoot search?
15. What is metadata?
16. How do Power Automate integrations fail?
17. What is throttling?
18. When do you check service health?
19. SharePoint Online vs Server?
20. How do you apply least privilege?
21. How would you teach SharePoint support?
22. What areas would you escalate?

---

# 56. Cross-Question Drill

## Q1. User needs access urgently. Give Full Control?

No. Restore the minimum permission required.

## Q2. Browser works but sync fails. Is SharePoint down?

Unlikely as a first conclusion. Focus on the sync/client path.

## Q3. Document not in search. Is it deleted?

Not necessarily. Verify direct access, permissions, metadata, and indexing.

## Q4. Can we promise a deleted file is recoverable?

No. Verify recycle/retention state and organizational policy.

## Q5. Everyone has a problem. Check individual permissions first?

Broad impact should shift attention toward service, identity, network, or tenant-wide changes.

## Q6. Is Teams the same as SharePoint?

No. They integrate, and Teams channel files commonly use SharePoint-backed storage.

## Q7. Should we bypass external-sharing policy to fix a client issue?

No.

## Q8. Workflow fails. Does that prove SharePoint failed?

No. Inspect workflow connection, trigger, schema, and downstream dependencies.

## Q9. Why avoid memorizing cloud-service limits?

Limits evolve. Verify current supported documentation when exact numbers matter.

## Q10. What if deep SharePoint Server farm administration is asked?

State the boundary and explain the diagnostic/escalation path rather than bluffing.

---

# 57. Honest Gap-Handling Position

Recommended phrasing:

> “My strongest background is application engineering, cloud, APIs, security, integrations and production troubleshooting. For SharePoint, I am comfortable with the operational model—sites, libraries, permissions, sharing, sync, service health and integration troubleshooting. I would not claim deep SharePoint Server farm administration if that is outside my direct experience; I would validate product-specific procedures and escalate specialist platform work appropriately.”

This answer protects credibility.

---

# 58. Red Flags

Do not:

- Invent deep SharePoint administration experience.
- Grant broad permissions as a quick fix.
- Confuse authentication with authorization.
- Confuse SharePoint and OneDrive.
- Claim all Teams data lives in SharePoint.
- Delete content to fix storage without governance.
- Promise recovery without checking retention.
- Assume search failure means content loss.
- Ignore tenant/service health during broad incidents.
- Guess current Microsoft limits.
- Teach only UI clicks.

---

# 59. Quick Revision

**Structure:** Tenant → Site → Library/List → Resource

**Access:** Identity → Group → Permission → Inheritance

**Scope:** One user → One resource → One site → Many users/sites

**Sync:** Browser works + client fails → investigate client path

**Integration:** SharePoint healthy + flow fails → inspect workflow

**Golden Rule:** Restore correct access, not maximum access.

---

# 60. Module 15 Scoring Matrix

| Dimension | Target | Self Score |
|---|---:|---:|
| SharePoint purpose | 3+ | |
| Site/library/list | 4 | |
| Permission model | 4 | |
| Inheritance | 4 | |
| Access troubleshooting | 4 | |
| External sharing | 3+ | |
| Version/recovery awareness | 3+ | |
| Sync troubleshooting | 3+ | |
| Search troubleshooting | 3+ | |
| Teams/OneDrive distinction | 3+ | |
| Workflow/integration | 3+ | |
| Service-health reasoning | 4 | |
| Least privilege | 5 | |
| Evidence collection | 4 | |
| Scenario handling | 4 | |
| Trainer lab design | 4 | |
| Honest gap handling | 5 | |
| Cross-question survival | 3+ | |

---

# 61. Module 15 Readiness Gate

## PASS only when you can:

- Explain sites, libraries, and lists.
- Explain permission inheritance.
- Troubleshoot Access Denied systematically.
- Explain internal/external sharing considerations.
- Distinguish SharePoint, OneDrive sync, and Teams file integration.
- Troubleshoot sync and search at an operational level.
- Explain workflow/integration failure boundaries.
- Recognize broad service-health incidents.
- Apply least privilege and safe-change principles.
- Handle at least five SharePoint scenarios.
- Design at least three trainer labs.
- State specialist boundaries confidently.
- Survive at least 10 follow-up questions.

### Minimum Score

**P2 target average ≥ 3/5, with least privilege and honest-gap handling at 5/5.**

If answers rely on menu memorization, excessive permission grants, or invented administration experience, Module 15 remains **BLOCKED**.

---

# 62. Final Module Outcome

After this module, the panel should think:

> **“He can teach common SharePoint operational support scenarios safely and systematically, understands enterprise access and integration concerns, and knows exactly where specialist escalation is appropriate.”**

That is the selection goal for Module 15.
