# Architecture Review Checklist

Ask:

```text
Why is this a separate MFE?
What business capability does it own?
Who owns it?
Can it deploy independently?
What is its public interface?
What state does it share?
Who owns top-level routing?
What happens if it fails to load?
How are framework dependencies shared?
How is CSS isolated?
How is auth provided?
How is it observed?
What is its performance budget?
What is its rollback path?
How are versions kept compatible?
```

## Rule

If an MFE cannot be explained without naming implementation components, the business boundary may be weak.
