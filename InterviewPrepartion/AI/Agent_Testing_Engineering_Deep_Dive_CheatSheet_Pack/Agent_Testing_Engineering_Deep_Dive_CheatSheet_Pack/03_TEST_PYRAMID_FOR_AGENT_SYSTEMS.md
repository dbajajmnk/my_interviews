# Test Pyramid for Agent Systems

## Pyramid

```text
                Production / Canary
                      ▲
                    E2E
                  Integration
            Eval / Golden Regression
          Contract / Workflow Tests
               Unit Tests
```

## Principle

Most tests should be cheap and deterministic. Real-model and end-to-end tests should be fewer but high value.
