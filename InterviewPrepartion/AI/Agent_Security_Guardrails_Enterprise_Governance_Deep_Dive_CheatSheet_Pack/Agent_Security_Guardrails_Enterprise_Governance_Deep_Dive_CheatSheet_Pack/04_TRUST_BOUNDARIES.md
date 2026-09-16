# Trust Boundaries

## Untrusted

- user text;
- retrieved documents;
- model output;
- tool output;
- external webpages.

## Trusted

- authenticated identity;
- tenant context;
- policy decisions;
- server-side secrets;
- authorization state.

## Rule

Never allow untrusted model-visible content to redefine trusted security context.
