# JMS Reference Architecture

```text
              Java Application
                    │
           JMS / Jakarta Messaging API
                    │
       ConnectionFactory / Destination
                    │
                JMS Provider
     ┌──────────────┼──────────────┐
     ▼              ▼              ▼
  Queue          Topic         Provider HA
     │          Subscriptions      / Store
     ▼
 Consumer(s)

Provider examples:
ActiveMQ / Artemis / IBM MQ / WebLogic / OpenMQ / others
```

## Enterprise Layers
```text
Application
→ Spring JMS / MDB / direct JMS API
→ JMS Provider
→ Broker persistence/HA/protocol
→ Monitoring / Security / Admin
```
