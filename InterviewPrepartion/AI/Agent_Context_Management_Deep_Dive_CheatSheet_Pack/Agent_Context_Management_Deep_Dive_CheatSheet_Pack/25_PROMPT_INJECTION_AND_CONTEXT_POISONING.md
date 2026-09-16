# Prompt Injection and Context Poisoning

## Threat

External documents or tool outputs can contain malicious instructions.

## Context Poisoning

Bad memory or stale/untrusted content can persist and influence future decisions.

## Defense

- source trust classification;
- separate instructions from retrieved data;
- sanitize/label external content;
- approval for high-risk actions;
- validate memory before persistence;
- allow deletion/correction.

## Rule

Retrieved text is data, not authority.
