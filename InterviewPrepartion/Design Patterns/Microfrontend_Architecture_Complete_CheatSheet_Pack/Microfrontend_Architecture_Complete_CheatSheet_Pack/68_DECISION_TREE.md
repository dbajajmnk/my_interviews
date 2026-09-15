# Microfrontend Decision Tree

## 1. Do you need independent frontend deployment?

```text
No → Modular frontend likely enough
Yes ↓
```

## 2. Are there clear business/team boundaries?

```text
No → Fix domain/team boundaries first
Yes ↓
```

## 3. Can boundary be route-based?

```text
Yes → Prefer route-based MFE
No ↓
```

## 4. Does component need independent deployment?

```text
No → Normal shared component
Yes ↓
```

## 5. Same framework?

```text
Yes → Framework component / Module Federation
No → Web Component / orchestrator / iframe depending isolation
```

## 6. Need runtime independent release?

```text
No → Build-time package
Yes → Module Federation / import maps / orchestration
```

## 7. Strong security isolation required?

```text
Yes → iframe/origin boundary may be better
```
