# TypeScript Example — Tool Calling Pattern

## Example

```ts
type ToolContext = {
  userId: string;
  tenantId: string;
};

async function getOrderStatus(
  input: { orderId: string },
  ctx: ToolContext
) {
  await authorize(ctx.userId, "order:read");
  return orderService.getStatus(ctx.tenantId, input.orderId);
}
```

## Rule

Keep trusted runtime context separate from model-generated arguments.
