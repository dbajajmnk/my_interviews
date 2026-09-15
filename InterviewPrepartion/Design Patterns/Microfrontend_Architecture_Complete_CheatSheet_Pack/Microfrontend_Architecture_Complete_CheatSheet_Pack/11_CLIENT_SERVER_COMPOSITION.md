# Client-Side vs Server-Side Composition

## Client-Side

```text
Browser
 ↓
Shell
 ↓
loads MFEs
```

Good:
- SPA
- runtime federation
- client routing

## Server-Side

```text
Request
 ↓
Server / Edge Composer
 ↓
HTML fragments
 ↓
Browser
```

Good:
- SEO
- fast first paint
- content-heavy apps

## Hybrid

```text
SSR shell
+
hydrated independent islands
```

## Trap

Server composition does not remove client-side compatibility concerns.
