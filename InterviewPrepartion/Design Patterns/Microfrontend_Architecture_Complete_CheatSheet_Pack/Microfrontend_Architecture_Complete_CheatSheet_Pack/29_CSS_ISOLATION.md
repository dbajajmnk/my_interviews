# CSS Isolation

## Options

```text
CSS Modules
BEM/naming conventions
CSS-in-JS
Shadow DOM
scoped styles
design tokens
```

## Risk

```css
button { ... }
```

in one MFE accidentally breaks another.

## Rule

Global CSS should be minimal and platform-owned.

## Trap

Shadow DOM gives strong style isolation but complicates theming and some framework integration.
