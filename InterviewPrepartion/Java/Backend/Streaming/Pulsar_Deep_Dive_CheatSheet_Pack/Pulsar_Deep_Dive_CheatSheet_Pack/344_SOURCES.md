# Sources & Accuracy Notes

Primary baseline: Apache Pulsar official documentation and release information.

Current verified facts:
- Pulsar 4.2.4 released August 3, 2026.
- Pulsar 4.2 active/security support ends September 24, 2026.
- Pulsar 4.0.13 is the current LTS patch; security support runs through October 21, 2027.
- Pulsar 5.0.0-M1 is a preview and is explicitly not intended for production.
- Brokers are stateless serving components; BookKeeper bookies persist messages.
- Metadata store handles coordination and cluster metadata.
- Pulsar has Exclusive, Shared, Failover and Key_Shared subscription types.
- Key_Shared requires key-aware batching or compatible batching behavior.
- Pulsar is built as a multi-tenant system with tenant/namespace policy boundaries.
- Geo-replication persists locally then forwards asynchronously; subscriptions are local to each cluster by default.
- Pulsar IO provides source and sink connectors.
- Pulsar Functions supports at-most-once, at-least-once, effectively-once and manual processing modes.
- Tiered Storage offloads sealed BookKeeper ledgers to long-term storage.

Always verify exact patch-level docs and client compatibility before production configuration changes.
