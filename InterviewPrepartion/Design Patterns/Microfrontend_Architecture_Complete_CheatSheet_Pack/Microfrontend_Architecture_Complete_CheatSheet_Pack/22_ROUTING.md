# Routing

## Ownership Options

### Shell-Owned Top-Level Routing

```text
Shell
 ├── /catalog → Catalog MFE
 ├── /cart → Cart MFE
 └── /account → Account MFE
```

### MFE-Owned Nested Routing

```text
/account/*
  ├── profile
  ├── security
  └── billing
```

## Rule

Shell owns global routes.

MFE owns internal routes beneath its prefix.

## Trap

Multiple routers fighting over browser history creates unpredictable navigation.
