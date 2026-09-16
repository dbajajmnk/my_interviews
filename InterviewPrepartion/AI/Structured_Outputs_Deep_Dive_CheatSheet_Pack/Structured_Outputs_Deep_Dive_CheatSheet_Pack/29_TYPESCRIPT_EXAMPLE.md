# TypeScript Example — Typed Structured Output

## Example

import { z } from "zod";

const TicketClassification = z.object({
  category: z.enum(["billing", "technical", "account"]),
  priority: z.enum(["low", "medium", "high"]),
  confidence: z.number().min(0).max(1),
});

type TicketClassification =
  z.infer<typeof TicketClassification>;

## Benefit

One schema can serve runtime validation and compile-time typing.
