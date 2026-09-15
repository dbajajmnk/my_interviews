# Java 25 Security Checklist

## Crypto

- [ ] use KDF API correctly
- [ ] use standard algorithms/providers
- [ ] do not invent crypto
- [ ] distinguish KDF / KEM / encryption
- [ ] protect key material

## PEM

- [ ] preview API policy reviewed
- [ ] private-key storage protected
- [ ] certificate validation remains separate

## TLS / Runtime

- [ ] current patch version
- [ ] disabled algorithms reviewed
- [ ] secrets externalized
- [ ] secure random source used where required

## General

- [ ] dependency scanning
- [ ] least privilege
- [ ] serialization boundaries
- [ ] audit sensitive operations
