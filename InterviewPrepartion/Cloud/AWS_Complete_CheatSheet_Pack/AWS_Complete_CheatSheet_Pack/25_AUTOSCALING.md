# EC2 Auto Scaling

## Components

```text
Launch Template
Auto Scaling Group
Scaling Policy
Health Checks
```

## Strategies

```text
Target Tracking
Step Scaling
Scheduled Scaling
Predictive approaches
```

## Common Metric

```text
CPU
ALB requests/target
custom CloudWatch metric
```

## Rule

Scale on the metric that represents workload pressure.

## Trap

Autoscaling cannot solve a bottleneck in a fixed-capacity downstream database.
