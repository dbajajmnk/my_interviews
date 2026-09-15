# Webpack Module Federation

## What

Allows separately built applications to expose and consume modules at runtime.

## Mental Model

```text
Host Build
   ↓
loads
Remote Container
   ↓
exposes
Component / Module
```

## Host Example Concept

```javascript
remotes: {
  catalog: "catalog@https://cdn/catalog/remoteEntry.js"
}
```

## Remote Concept

```javascript
exposes: {
  "./ProductList": "./src/ProductList"
}
```

## Why

Useful for runtime integration and independent releases.

## Trap

Module Federation is an integration technology, not the microfrontend architecture itself.
