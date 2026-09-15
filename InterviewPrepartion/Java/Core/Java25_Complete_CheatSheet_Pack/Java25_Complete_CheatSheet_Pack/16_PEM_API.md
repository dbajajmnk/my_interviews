# PEM Encodings of Cryptographic Objects — Preview

## What

Java 25 introduces preview APIs for encoding and decoding cryptographic objects using PEM format.

## Typical Objects

```text
keys
certificates
certificate revocation lists
```

## Visual

```text
Java Security Object
       ↓
    PEM Encoder
       ↓
-----BEGIN ...-----
Base64 / DER content
-----END ...-----
```

Reverse:

```text
PEM
 ↓
Decoder
 ↓
Java Security Object
```

## Why

PEM handling previously often required manual parsing or external libraries.

## Status

Preview API.

## Trap

PEM is an encoding/container format, not encryption by itself.
