# Spring Batch Troubleshooting — Golden Flow

```text
1. Job Identity
   ├─ correct job name?
   ├─ identifying parameters?
   └─ existing completed/running instance?

2. JobRepository
   ├─ execution status?
   ├─ step status?
   └─ ExecutionContext checkpoint?

3. Step
   ├─ chunk or tasklet?
   ├─ start limit?
   └─ flow transition?

4. Item Pipeline
   ├─ reader?
   ├─ processor?
   └─ writer?

5. Transaction
   ├─ commit?
   ├─ rollback?
   ├─ retry?
   └─ skip?

6. External Resources
   ├─ DB locks/pool?
   ├─ file?
   ├─ API?
   └─ broker?

7. Restart
   ├─ saved position?
   ├─ duplicate-safe?
   └─ input unchanged?
```
