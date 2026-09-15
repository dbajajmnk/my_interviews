# KDF vs KEM

| KDF | KEM |
|---|---|
| derive keys from secret material | establish/encapsulate shared secret |
| e.g. HKDF workflows | public-key-oriented key establishment |
| Java 25 KDF API final | KEM API already available from earlier Java |

## Typical Flow Together

```text
KEM
 ↓
Shared Secret
 ↓
KDF
 ↓
Application Keys
 ↓
Encryption / Authentication
```

## Interview Insight

KEM and KDF solve different layers of the key-management problem.
