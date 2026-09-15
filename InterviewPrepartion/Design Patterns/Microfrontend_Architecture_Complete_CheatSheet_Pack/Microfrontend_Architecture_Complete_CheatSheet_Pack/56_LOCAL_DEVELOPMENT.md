# Local Development

## Goal

Developer runs only the MFE they are changing.

```text
Catalog MFE → localhost
Other MFEs  → deployed environment
```

## Techniques

```text
import-map override
remote URL override
proxy
standalone mode
```

## Benefit

Fast local startup and realistic integration.

## Trap

Requiring all MFEs to run locally makes the architecture painful.
