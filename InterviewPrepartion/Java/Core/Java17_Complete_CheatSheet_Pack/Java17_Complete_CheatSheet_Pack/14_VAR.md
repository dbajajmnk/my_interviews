# `var` — Local Variable Type Inference

## Example

```java
var name = "Deepak";
var users = new ArrayList<User>();
```

Compiler still knows exact static type.

## Not Dynamic Typing

```text
var ≠ JavaScript-style dynamic variable
```

## Cannot Use Everywhere

Not for:

```text
fields
method return type
ordinary method parameter types
```

## Good Use

When the RHS makes the type obvious.

## Poor Use

```java
var x = complicatedFactoryCall();
```

when it hides important meaning.

## Rule

Use `var` to reduce noise, not information.
