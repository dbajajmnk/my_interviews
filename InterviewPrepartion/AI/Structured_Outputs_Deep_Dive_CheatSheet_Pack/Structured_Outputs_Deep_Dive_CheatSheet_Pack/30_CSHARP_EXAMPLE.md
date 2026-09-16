# C# Example — Typed Structured Output

## Example

public sealed class TicketClassification
{
    public string Category { get; set; } = "";
    public string Priority { get; set; } = "";
    public double Confidence { get; set; }
}

## Pattern

Agent response → typed deserialization → business validation → service layer.
