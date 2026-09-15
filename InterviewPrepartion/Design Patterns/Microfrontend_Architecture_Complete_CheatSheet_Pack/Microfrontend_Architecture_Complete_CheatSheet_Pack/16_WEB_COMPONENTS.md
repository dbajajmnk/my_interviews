# Web Components

## Technologies

```text
Custom Elements
Shadow DOM
Templates / Slots
```

## Example

```javascript
class UserCard extends HTMLElement {
  connectedCallback() {
    this.innerHTML = `<strong>User</strong>`;
  }
}

customElements.define("user-card", UserCard);
```

## Why

Browser-native component interoperability.

## Shadow DOM

Can isolate:

```text
DOM
styles
implementation details
```

## Good Fit

Cross-framework reusable widgets.

## Trap

Web Components do not automatically provide application orchestration, routing, data fetching, or deployment independence.
