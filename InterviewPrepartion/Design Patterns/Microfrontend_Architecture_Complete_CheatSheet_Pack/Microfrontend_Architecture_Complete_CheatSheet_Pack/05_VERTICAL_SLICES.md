# Business Capability / Vertical Slice Boundaries

## Good Boundaries

```text
Search
Checkout
Account
Billing
Admin
Orders
```

## Poor Boundaries

```text
Button MFE
Form MFE
Table MFE
HeaderCell MFE
```

## Test

Ask:

```text
Can one team own this end-to-end?
Can it release independently?
Does it have a coherent user/business purpose?
Can it minimize cross-MFE state?
```

## Preferred Split

```text
Route / Domain
     ↓
Page / Workflow
     ↓
Local components
```

## Trap

Over-fragmentation creates network, dependency, testing, and cognitive overhead.
