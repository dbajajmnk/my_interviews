# Spring Data / JPA — Complete Deep-Dive Cheat Sheet


---

<!-- 005_JPA_MENTAL_MODEL.md -->

# JPA Mental Model

## What / Why
Jakarta Persistence defines ORM and persistence semantics; the provider implements them; Spring Data JPA adds repository abstractions.

## Mental Model
```text
JPA Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA Mental Model:** Jakarta Persistence defines ORM and persistence semantics; the provider implements them; Spring Data JPA adds repository abstractions.


---

<!-- 006_JAKARTA_PERSISTENCE_3_2.md -->

# Jakarta Persistence 3.2

## What / Why
Current final persistence specification baseline.

## Mental Model
```text
Jakarta Persistence 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Jakarta Persistence 3.2:** Current final persistence specification baseline.


---

<!-- 007_JPA_VS_HIBERNATE.md -->

# JPA vs Hibernate

## What / Why
JPA is specification; Hibernate ORM is a provider/implementation.

## Mental Model
```text
JPA vs Hibernate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA vs Hibernate:** JPA is specification; Hibernate ORM is a provider/implementation.


---

<!-- 008_JPA_VS_SPRING_DATA_JPA.md -->

# JPA vs Spring Data JPA

## What / Why
JPA defines EntityManager and ORM semantics; Spring Data JPA builds repositories and query abstractions on top.

## Mental Model
```text
JPA vs Spring Data JPA → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA vs Spring Data JPA:** JPA defines EntityManager and ORM semantics; Spring Data JPA builds repositories and query abstractions on top.


---

<!-- 009_ORM.md -->

# ORM

## What / Why
Maps object model to relational tables while managing identity, relationships and unit-of-work semantics.

## Mental Model
```text
ORM → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ORM:** Maps object model to relational tables while managing identity, relationships and unit-of-work semantics.


---

<!-- 00_MASTER_INDEX.md -->

# Spring Data / JPA — Dedicated Deep-Dive Cheat Sheet Pack

**Current Spring Data JPA baseline:** 4.1.1.
**Current Jakarta Persistence baseline:** 3.2.
**Hibernate current-provider awareness:** Hibernate ORM 7.4.x latest stable line (7.4.8.Final as of Sep 13, 2026).

**Scope:** JPA lifecycle, mapping, relationships, persistence context, transactions, locking, JPQL/Criteria/native SQL, Spring Data repositories, Specifications, projections, pagination/scrolling, auditing, Hibernate optimizations, batching, caching, migrations, testing, multi-tenancy, performance and troubleshooting.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_JPA_DECISION_TREE.md`

## JPA Foundations

- JPA Mental Model — `005_JPA_MENTAL_MODEL.md`
- Jakarta Persistence 3.2 — `006_JAKARTA_PERSISTENCE_3_2.md`
- JPA vs Hibernate — `007_JPA_VS_HIBERNATE.md`
- JPA vs Spring Data JPA — `008_JPA_VS_SPRING_DATA_JPA.md`
- ORM — `009_ORM.md`
- Persistence Unit — `010_PERSISTENCE_UNIT.md`
- Persistence Provider — `011_PERSISTENCE_PROVIDER.md`
- EntityManagerFactory — `012_ENTITYMANAGERFACTORY.md`
- EntityManager — `013_ENTITYMANAGER.md`
- Persistence Context — `014_PERSISTENCE_CONTEXT.md`
- Transaction Scoped Context — `015_TRANSACTION_SCOPED_CONTEXT.md`
- Extended Persistence Context — `016_EXTENDED_PERSISTENCE_CONTEXT.md`
- Unit of Work — `017_UNIT_OF_WORK.md`
- Identity Map — `018_IDENTITY_MAP.md`
- Write Behind — `019_WRITE_BEHIND.md`
- SQL Generation — `020_SQL_GENERATION.md`
- Provider Portability — `021_PROVIDER_PORTABILITY.md`

## Entity Lifecycle

- Entity Lifecycle States — `022_ENTITY_LIFECYCLE_STATES.md`
- Transient Entity — `023_TRANSIENT_ENTITY.md`
- Managed Entity — `024_MANAGED_ENTITY.md`
- Detached Entity — `025_DETACHED_ENTITY.md`
- Removed Entity — `026_REMOVED_ENTITY.md`
- persist — `027_PERSIST.md`
- merge — `028_MERGE.md`
- remove — `029_REMOVE.md`
- find — `030_FIND.md`
- getReference — `031_GETREFERENCE.md`
- contains — `032_CONTAINS.md`
- detach — `033_DETACH.md`
- clear — `034_CLEAR.md`
- refresh — `035_REFRESH.md`
- Flush — `036_FLUSH.md`
- Flush vs Commit — `037_FLUSH_VS_COMMIT.md`
- Automatic Dirty Checking — `038_AUTOMATIC_DIRTY_CHECKING.md`
- Detached Update Trap — `039_DETACHED_UPDATE_TRAP.md`

## Entity Mapping Basics

- @Entity — `040_ENTITY.md`
- @Table — `041_TABLE.md`
- @Id — `042_ID.md`
- @GeneratedValue — `043_GENERATEDVALUE.md`
- GenerationType AUTO — `044_GENERATIONTYPE_AUTO.md`
- GenerationType IDENTITY — `045_GENERATIONTYPE_IDENTITY.md`
- GenerationType SEQUENCE — `046_GENERATIONTYPE_SEQUENCE.md`
- GenerationType TABLE — `047_GENERATIONTYPE_TABLE.md`
- GenerationType UUID — `048_GENERATIONTYPE_UUID.md`
- @Column — `049_COLUMN.md`
- @Basic — `050_BASIC.md`
- @Transient — `051_TRANSIENT.md`
- @Access — `052_ACCESS.md`
- Field Access — `053_FIELD_ACCESS.md`
- Property Access — `054_PROPERTY_ACCESS.md`
- Mixed Access — `055_MIXED_ACCESS.md`
- Entity Constructor — `056_ENTITY_CONSTRUCTOR.md`
- Entity Finality — `057_ENTITY_FINALITY.md`
- Entity Equality — `058_ENTITY_EQUALITY.md`

## Basic Types & Converters

- Basic Type Mapping — `059_BASIC_TYPE_MAPPING.md`
- String Mapping — `060_STRING_MAPPING.md`
- Numeric Mapping — `061_NUMERIC_MAPPING.md`
- Boolean Mapping — `062_BOOLEAN_MAPPING.md`
- Enum Mapping — `063_ENUM_MAPPING.md`
- Enum STRING — `064_ENUM_STRING.md`
- Enum ORDINAL Trap — `065_ENUM_ORDINAL_TRAP.md`
- Temporal Mapping — `066_TEMPORAL_MAPPING.md`
- Instant Mapping — `067_INSTANT_MAPPING.md`
- Year Mapping — `068_YEAR_MAPPING.md`
- UUID Mapping — `069_UUID_MAPPING.md`
- @Lob — `070_LOB.md`
- @Enumerated — `071_ENUMERATED.md`
- @Temporal Legacy — `072_TEMPORAL_LEGACY.md`
- @Convert — `073_CONVERT.md`
- AttributeConverter — `074_ATTRIBUTECONVERTER.md`
- @Converter autoApply — `075_CONVERTER_AUTOAPPLY.md`
- Converter Limits — `076_CONVERTER_LIMITS.md`
- JSON Mapping — `077_JSON_MAPPING.md`
- Array Mapping — `078_ARRAY_MAPPING.md`

## Embeddables & Value Objects

- @Embeddable — `079_EMBEDDABLE.md`
- @Embedded — `080_EMBEDDED.md`
- @AttributeOverride — `081_ATTRIBUTEOVERRIDE.md`
- @AssociationOverride — `082_ASSOCIATIONOVERRIDE.md`
- Record Embeddable — `083_RECORD_EMBEDDABLE.md`
- Embeddable Identity — `084_EMBEDDABLE_IDENTITY.md`
- Nested Embeddable — `085_NESTED_EMBEDDABLE.md`
- Embeddable Collection — `086_EMBEDDABLE_COLLECTION.md`
- Value Object Design — `087_VALUE_OBJECT_DESIGN.md`

## Primary Keys

- Simple Primary Key — `088_SIMPLE_PRIMARY_KEY.md`
- Composite Key — `089_COMPOSITE_KEY.md`
- @EmbeddedId — `090_EMBEDDEDID.md`
- @IdClass — `091_IDCLASS.md`
- EmbeddedId vs IdClass — `092_EMBEDDEDID_VS_IDCLASS.md`
- Derived Identity — `093_DERIVED_IDENTITY.md`
- @MapsId — `094_MAPSID.md`
- Natural Key — `095_NATURAL_KEY.md`
- Surrogate Key — `096_SURROGATE_KEY.md`
- Identifier Immutability — `097_IDENTIFIER_IMMUTABILITY.md`
- Sequence Allocation — `098_SEQUENCE_ALLOCATION.md`
- Identity Insert Timing — `099_IDENTITY_INSERT_TIMING.md`

## Relationships

- @OneToOne — `100_ONETOONE.md`
- @OneToMany — `101_ONETOMANY.md`
- @ManyToOne — `102_MANYTOONE.md`
- @ManyToMany — `103_MANYTOMANY.md`
- Owning Side — `104_OWNING_SIDE.md`
- Inverse Side — `105_INVERSE_SIDE.md`
- mappedBy — `106_MAPPEDBY.md`
- @JoinColumn — `107_JOINCOLUMN.md`
- @JoinColumns — `108_JOINCOLUMNS.md`
- @JoinTable — `109_JOINTABLE.md`
- Bidirectional Relationship — `110_BIDIRECTIONAL_RELATIONSHIP.md`
- Unidirectional Relationship — `111_UNIDIRECTIONAL_RELATIONSHIP.md`
- Relationship Synchronization — `112_RELATIONSHIP_SYNCHRONIZATION.md`
- Helper Methods — `113_HELPER_METHODS.md`
- Optional Association — `114_OPTIONAL_ASSOCIATION.md`
- Cascade — `115_CASCADE.md`
- CascadeType PERSIST — `116_CASCADETYPE_PERSIST.md`
- CascadeType MERGE — `117_CASCADETYPE_MERGE.md`
- CascadeType REMOVE — `118_CASCADETYPE_REMOVE.md`
- CascadeType REFRESH — `119_CASCADETYPE_REFRESH.md`
- CascadeType DETACH — `120_CASCADETYPE_DETACH.md`
- CascadeType ALL — `121_CASCADETYPE_ALL.md`
- Cascade Trap — `122_CASCADE_TRAP.md`
- orphanRemoval — `123_ORPHANREMOVAL.md`
- Cascade Remove vs orphanRemoval — `124_CASCADE_REMOVE_VS_ORPHANREMOVAL.md`

## Collections

- @ElementCollection — `125_ELEMENTCOLLECTION.md`
- @CollectionTable — `126_COLLECTIONTABLE.md`
- List Mapping — `127_LIST_MAPPING.md`
- @OrderColumn — `128_ORDERCOLUMN.md`
- @OrderBy — `129_ORDERBY.md`
- Set Mapping — `130_SET_MAPPING.md`
- Map Mapping — `131_MAP_MAPPING.md`
- @MapKey — `132_MAPKEY.md`
- @MapKeyColumn — `133_MAPKEYCOLUMN.md`
- Bag Concept — `134_BAG_CONCEPT.md`
- Collection Dirty Checking — `135_COLLECTION_DIRTY_CHECKING.md`
- Collection Replacement Trap — `136_COLLECTION_REPLACEMENT_TRAP.md`
- Large Collection Trap — `137_LARGE_COLLECTION_TRAP.md`

## Fetch Strategies

- FetchType LAZY — `138_FETCHTYPE_LAZY.md`
- FetchType EAGER — `139_FETCHTYPE_EAGER.md`
- Default Fetch Types — `140_DEFAULT_FETCH_TYPES.md`
- Lazy Proxy — `141_LAZY_PROXY.md`
- Persistent Collection — `142_PERSISTENT_COLLECTION.md`
- LazyInitializationException — `143_LAZYINITIALIZATIONEXCEPTION.md`
- Open Session in View — `144_OPEN_SESSION_IN_VIEW.md`
- OSIV Tradeoff — `145_OSIV_TRADEOFF.md`
- Fetch Join — `146_FETCH_JOIN.md`
- Entity Graph — `147_ENTITY_GRAPH.md`
- @EntityGraph — `148_ENTITYGRAPH.md`
- Named Entity Graph — `149_NAMED_ENTITY_GRAPH.md`
- Fetch Graph vs Load Graph — `150_FETCH_GRAPH_VS_LOAD_GRAPH.md`
- Batch Fetching — `151_BATCH_FETCHING.md`
- Subselect Fetch — `152_SUBSELECT_FETCH.md`
- Fetch Strategy vs Fetch Timing — `153_FETCH_STRATEGY_VS_FETCH_TIMING.md`

## N Plus One

- N Plus One Mental Model — `154_N_PLUS_ONE_MENTAL_MODEL.md`
- N Plus One To Many — `155_N_PLUS_ONE_TO_MANY.md`
- N Plus One To One ManyToOne — `156_N_PLUS_ONE_TO_ONE_MANYTOONE.md`
- Detect N Plus One — `157_DETECT_N_PLUS_ONE.md`
- Fix with Fetch Join — `158_FIX_WITH_FETCH_JOIN.md`
- Fix with EntityGraph — `159_FIX_WITH_ENTITYGRAPH.md`
- Fix with Projection — `160_FIX_WITH_PROJECTION.md`
- Fix with Batch Fetch — `161_FIX_WITH_BATCH_FETCH.md`
- Pagination Fetch Join Trap — `162_PAGINATION_FETCH_JOIN_TRAP.md`
- Multiple Bag Fetch Trap — `163_MULTIPLE_BAG_FETCH_TRAP.md`
- Over Fetching — `164_OVER_FETCHING.md`

## Inheritance

- @Inheritance — `165_INHERITANCE.md`
- SINGLE_TABLE — `166_SINGLE_TABLE.md`
- JOINED — `167_JOINED.md`
- TABLE_PER_CLASS — `168_TABLE_PER_CLASS.md`
- @DiscriminatorColumn — `169_DISCRIMINATORCOLUMN.md`
- @DiscriminatorValue — `170_DISCRIMINATORVALUE.md`
- @MappedSuperclass — `171_MAPPEDSUPERCLASS.md`
- Inheritance Tradeoff — `172_INHERITANCE_TRADEOFF.md`
- Composition vs Inheritance — `173_COMPOSITION_VS_INHERITANCE.md`

## Persistence Context Internals

- First Level Cache — `174_FIRST_LEVEL_CACHE.md`
- Entity Identity Guarantee — `175_ENTITY_IDENTITY_GUARANTEE.md`
- Dirty Checking Snapshot — `176_DIRTY_CHECKING_SNAPSHOT.md`
- Flush Modes — `177_FLUSH_MODES.md`
- AUTO Flush — `178_AUTO_FLUSH.md`
- COMMIT Flush — `179_COMMIT_FLUSH.md`
- Clear for Batch — `180_CLEAR_FOR_BATCH.md`
- Flush for Batch — `181_FLUSH_FOR_BATCH.md`
- Stale Managed State — `182_STALE_MANAGED_STATE.md`
- Refresh After External Change — `183_REFRESH_AFTER_EXTERNAL_CHANGE.md`
- Persistence Context Size — `184_PERSISTENCE_CONTEXT_SIZE.md`

## Transactions

- @Transactional — `185_TRANSACTIONAL.md`
- Transaction Manager — `186_TRANSACTION_MANAGER.md`
- Read Only Transaction — `187_READ_ONLY_TRANSACTION.md`
- Propagation REQUIRED — `188_PROPAGATION_REQUIRED.md`
- Propagation REQUIRES_NEW — `189_PROPAGATION_REQUIRES_NEW.md`
- Propagation SUPPORTS — `190_PROPAGATION_SUPPORTS.md`
- Propagation MANDATORY — `191_PROPAGATION_MANDATORY.md`
- Propagation NEVER — `192_PROPAGATION_NEVER.md`
- Propagation NOT_SUPPORTED — `193_PROPAGATION_NOT_SUPPORTED.md`
- Propagation NESTED — `194_PROPAGATION_NESTED.md`
- Isolation — `195_ISOLATION.md`
- Rollback Rules — `196_ROLLBACK_RULES.md`
- Self Invocation Trap — `197_SELF_INVOCATION_TRAP.md`
- Transaction Boundary Rule — `198_TRANSACTION_BOUNDARY_RULE.md`
- Long Transaction — `199_LONG_TRANSACTION.md`
- Lazy Loading Transaction — `200_LAZY_LOADING_TRANSACTION.md`
- Transactional Tests — `201_TRANSACTIONAL_TESTS.md`

## Locking & Concurrency

- Optimistic Locking — `202_OPTIMISTIC_LOCKING.md`
- @Version — `203_VERSION.md`
- OptimisticLockException — `204_OPTIMISTICLOCKEXCEPTION.md`
- Optimistic Retry — `205_OPTIMISTIC_RETRY.md`
- Pessimistic Locking — `206_PESSIMISTIC_LOCKING.md`
- PESSIMISTIC_READ — `207_PESSIMISTIC_READ.md`
- PESSIMISTIC_WRITE — `208_PESSIMISTIC_WRITE.md`
- PESSIMISTIC_FORCE_INCREMENT — `209_PESSIMISTIC_FORCE_INCREMENT.md`
- @Lock — `210_LOCK.md`
- Lock Timeout — `211_LOCK_TIMEOUT.md`
- Deadlock — `212_DEADLOCK.md`
- Lost Update — `213_LOST_UPDATE.md`
- Write Skew — `214_WRITE_SKEW.md`
- Lock Scope — `215_LOCK_SCOPE.md`
- Optimistic vs Pessimistic — `216_OPTIMISTIC_VS_PESSIMISTIC.md`

## JPQL

- JPQL Mental Model — `217_JPQL_MENTAL_MODEL.md`
- SELECT JPQL — `218_SELECT_JPQL.md`
- FROM — `219_FROM.md`
- JOIN — `220_JOIN.md`
- JOIN FETCH — `221_JOIN_FETCH.md`
- WHERE — `222_WHERE.md`
- GROUP BY — `223_GROUP_BY.md`
- HAVING — `224_HAVING.md`
- ORDER BY — `225_ORDER_BY.md`
- Named Parameter — `226_NAMED_PARAMETER.md`
- Positional Parameter — `227_POSITIONAL_PARAMETER.md`
- Constructor Expression — `228_CONSTRUCTOR_EXPRESSION.md`
- Subquery — `229_SUBQUERY.md`
- CASE — `230_CASE.md`
- COALESCE — `231_COALESCE.md`
- NULLIF — `232_NULLIF.md`
- Functions — `233_FUNCTIONS.md`
- id Function — `234_ID_FUNCTION.md`
- version Function — `235_VERSION_FUNCTION.md`
- cast — `236_CAST.md`
- union intersect except — `237_UNION_INTERSECT_EXCEPT.md`
- Null Precedence — `238_NULL_PRECEDENCE.md`
- getSingleResultOrNull — `239_GETSINGLERESULTORNULL.md`
- JPQL Portability — `240_JPQL_PORTABILITY.md`

## Criteria API

- Criteria API Mental Model — `241_CRITERIA_API_MENTAL_MODEL.md`
- CriteriaBuilder — `242_CRITERIABUILDER.md`
- CriteriaQuery — `243_CRITERIAQUERY.md`
- Root — `244_ROOT.md`
- Join — `245_JOIN.md`
- Fetch — `246_FETCH.md`
- Predicate — `247_PREDICATE.md`
- Path — `248_PATH.md`
- ParameterExpression — `249_PARAMETEREXPRESSION.md`
- Order — `250_ORDER.md`
- Subquery Criteria — `251_SUBQUERY_CRITERIA.md`
- CriteriaUpdate — `252_CRITERIAUPDATE.md`
- CriteriaDelete — `253_CRITERIADELETE.md`
- CriteriaSelect 3.2 — `254_CRITERIASELECT_3_2.md`
- EntityType Join 3.2 — `255_ENTITYTYPE_JOIN_3_2.md`
- Static Metamodel — `256_STATIC_METAMODEL.md`
- Criteria Tradeoff — `257_CRITERIA_TRADEOFF.md`

## Native SQL

- Native Query — `258_NATIVE_QUERY.md`
- @Query nativeQuery — `259_QUERY_NATIVEQUERY.md`
- @NativeQuery — `260_NATIVEQUERY.md`
- Native Projection — `261_NATIVE_PROJECTION.md`
- @SqlResultSetMapping — `262_SQLRESULTSETMAPPING.md`
- @NamedNativeQuery — `263_NAMEDNATIVEQUERY.md`
- NamedNativeQuery 3.2 — `264_NAMEDNATIVEQUERY_3_2.md`
- Native Pagination — `265_NATIVE_PAGINATION.md`
- Database Specific SQL — `266_DATABASE_SPECIFIC_SQL.md`
- Native Query Staleness — `267_NATIVE_QUERY_STALENESS.md`

## Spring Data Repository Core

- Repository — `268_REPOSITORY.md`
- CrudRepository — `269_CRUDREPOSITORY.md`
- ListCrudRepository — `270_LISTCRUDREPOSITORY.md`
- PagingAndSortingRepository — `271_PAGINGANDSORTINGREPOSITORY.md`
- JpaRepository — `272_JPAREPOSITORY.md`
- Repository Proxy — `273_REPOSITORY_PROXY.md`
- Repository Factory — `274_REPOSITORY_FACTORY.md`
- @EnableJpaRepositories — `275_ENABLEJPAREPOSITORIES.md`
- Boot Repository Auto Config — `276_BOOT_REPOSITORY_AUTO_CONFIG.md`
- Base Package Scanning — `277_BASE_PACKAGE_SCANNING.md`
- Repository Composition — `278_REPOSITORY_COMPOSITION.md`
- Repository Method Metadata — `279_REPOSITORY_METHOD_METADATA.md`

## CRUD Semantics

- save — `280_SAVE.md`
- saveAll — `281_SAVEALL.md`
- saveAndFlush — `282_SAVEANDFLUSH.md`
- flush — `283_FLUSH.md`
- delete — `284_DELETE.md`
- deleteById — `285_DELETEBYID.md`
- deleteAll — `286_DELETEALL.md`
- deleteAllInBatch — `287_DELETEALLINBATCH.md`
- deleteAllByIdInBatch — `288_DELETEALLBYIDINBATCH.md`
- New Entity Detection — `289_NEW_ENTITY_DETECTION.md`
- Persistable isNew — `290_PERSISTABLE_ISNEW.md`
- save Trap — `291_SAVE_TRAP.md`
- Merge Trap — `292_MERGE_TRAP.md`

## Derived Query Methods

- Query Derivation — `293_QUERY_DERIVATION.md`
- findBy — `294_FINDBY.md`
- readBy getBy queryBy searchBy — `295_READBY_GETBY_QUERYBY_SEARCHBY.md`
- countBy — `296_COUNTBY.md`
- existsBy — `297_EXISTSBY.md`
- deleteBy removeBy — `298_DELETEBY_REMOVEBY.md`
- And Or — `299_AND_OR.md`
- Between — `300_BETWEEN.md`
- LessThan GreaterThan — `301_LESSTHAN_GREATERTHAN.md`
- Like StartingWith EndingWith Containing — `302_LIKE_STARTINGWITH_ENDINGWITH_CONTAINING.md`
- In NotIn — `303_IN_NOTIN.md`
- IsNull IsNotNull — `304_ISNULL_ISNOTNULL.md`
- True False — `305_TRUE_FALSE.md`
- IgnoreCase — `306_IGNORECASE.md`
- OrderBy — `307_ORDERBY.md`
- Top First — `308_TOP_FIRST.md`
- Distinct — `309_DISTINCT.md`
- Nested Property Traversal — `310_NESTED_PROPERTY_TRAVERSAL.md`
- Underscore Disambiguation — `311_UNDERSCORE_DISAMBIGUATION.md`
- Derived Query Complexity Trap — `312_DERIVED_QUERY_COMPLEXITY_TRAP.md`

## Declared Queries

- @Query — `313_QUERY.md`
- NamedQuery — `314_NAMEDQUERY.md`
- NamedNativeQuery — `315_NAMEDNATIVEQUERY.md`
- Query Lookup Strategy — `316_QUERY_LOOKUP_STRATEGY.md`
- Parameter Binding — `317_PARAMETER_BINDING.md`
- @Param — `318_PARAM.md`
- SpEL in @Query — `319_SPEL_IN_QUERY.md`
- entityName SpEL — `320_ENTITYNAME_SPEL.md`
- Modifying Query — `321_MODIFYING_QUERY.md`
- @Modifying clearAutomatically — `322_MODIFYING_CLEARAUTOMATICALLY.md`
- @Modifying flushAutomatically — `323_MODIFYING_FLUSHAUTOMATICALLY.md`
- Bulk Update Trap — `324_BULK_UPDATE_TRAP.md`
- Query Validation — `325_QUERY_VALIDATION.md`

## Specifications

- Specification Mental Model — `326_SPECIFICATION_MENTAL_MODEL.md`
- JpaSpecificationExecutor — `327_JPASPECIFICATIONEXECUTOR.md`
- Specification toPredicate — `328_SPECIFICATION_TOPREDICATE.md`
- and Specification — `329_AND_SPECIFICATION.md`
- or Specification — `330_OR_SPECIFICATION.md`
- not Specification — `331_NOT_SPECIFICATION.md`
- allOf anyOf — `332_ALLOF_ANYOF.md`
- Unrestricted Specification — `333_UNRESTRICTED_SPECIFICATION.md`
- Specification Reuse — `334_SPECIFICATION_REUSE.md`
- Specification Pagination — `335_SPECIFICATION_PAGINATION.md`
- Specification Projection — `336_SPECIFICATION_PROJECTION.md`
- Specification Count Query — `337_SPECIFICATION_COUNT_QUERY.md`
- Specification Fetch Join Trap — `338_SPECIFICATION_FETCH_JOIN_TRAP.md`

## Query by Example

- QBE Mental Model — `339_QBE_MENTAL_MODEL.md`
- Example — `340_EXAMPLE.md`
- ExampleMatcher — `341_EXAMPLEMATCHER.md`
- Ignore Paths — `342_IGNORE_PATHS.md`
- StringMatcher — `343_STRINGMATCHER.md`
- Null Handling — `344_NULL_HANDLING.md`
- QBE Limits — `345_QBE_LIMITS.md`

## Projections

- Projection Mental Model — `346_PROJECTION_MENTAL_MODEL.md`
- Interface Projection — `347_INTERFACE_PROJECTION.md`
- Closed Projection — `348_CLOSED_PROJECTION.md`
- Open Projection — `349_OPEN_PROJECTION.md`
- Nested Projection — `350_NESTED_PROJECTION.md`
- Class Based Projection — `351_CLASS_BASED_PROJECTION.md`
- Record Projection — `352_RECORD_PROJECTION.md`
- Dynamic Projection — `353_DYNAMIC_PROJECTION.md`
- Projection Constructor — `354_PROJECTION_CONSTRUCTOR.md`
- Nullable Wrapper — `355_NULLABLE_WRAPPER.md`
- Projection Performance — `356_PROJECTION_PERFORMANCE.md`
- Projection Trap — `357_PROJECTION_TRAP.md`

## Pagination & Sorting

- Pageable — `358_PAGEABLE.md`
- Page — `359_PAGE.md`
- Slice — `360_SLICE.md`
- Window — `361_WINDOW.md`
- Sort — `362_SORT.md`
- TypedSort — `363_TYPEDSORT.md`
- Page Count Cost — `364_PAGE_COUNT_COST.md`
- Slice Performance — `365_SLICE_PERFORMANCE.md`
- Offset Pagination — `366_OFFSET_PAGINATION.md`
- Keyset Pagination — `367_KEYSET_PAGINATION.md`
- ScrollPosition — `368_SCROLLPOSITION.md`
- OffsetScrollPosition — `369_OFFSETSCROLLPOSITION.md`
- KeysetScrollPosition — `370_KEYSETSCROLLPOSITION.md`
- WindowIterator — `371_WINDOWITERATOR.md`
- Stable Sort — `372_STABLE_SORT.md`
- Pagination Fetch Join Trap — `373_PAGINATION_FETCH_JOIN_TRAP.md`

## Auditing

- Spring Data Auditing — `374_SPRING_DATA_AUDITING.md`
- @CreatedDate — `375_CREATEDDATE.md`
- @LastModifiedDate — `376_LASTMODIFIEDDATE.md`
- @CreatedBy — `377_CREATEDBY.md`
- @LastModifiedBy — `378_LASTMODIFIEDBY.md`
- @EnableJpaAuditing — `379_ENABLEJPAAUDITING.md`
- AuditorAware — `380_AUDITORAWARE.md`
- DateTimeProvider — `381_DATETIMEPROVIDER.md`
- AuditingEntityListener — `382_AUDITINGENTITYLISTENER.md`
- Embedded Audit Metadata — `383_EMBEDDED_AUDIT_METADATA.md`
- Auditing vs Envers — `384_AUDITING_VS_ENVERS.md`

## Entity Callbacks & Listeners

- @PrePersist — `385_PREPERSIST.md`
- @PostPersist — `386_POSTPERSIST.md`
- @PreUpdate — `387_PREUPDATE.md`
- @PostUpdate — `388_POSTUPDATE.md`
- @PreRemove — `389_PREREMOVE.md`
- @PostRemove — `390_POSTREMOVE.md`
- @PostLoad — `391_POSTLOAD.md`
- @EntityListeners — `392_ENTITYLISTENERS.md`
- Lifecycle Callback Trap — `393_LIFECYCLE_CALLBACK_TRAP.md`
- Domain Event Alternative — `394_DOMAIN_EVENT_ALTERNATIVE.md`

## Spring Data Domain Events

- @DomainEvents — `395_DOMAINEVENTS.md`
- @AfterDomainEventPublication — `396_AFTERDOMAINEVENTPUBLICATION.md`
- AbstractAggregateRoot — `397_ABSTRACTAGGREGATEROOT.md`
- Repository Event Publication — `398_REPOSITORY_EVENT_PUBLICATION.md`
- Domain Event Transaction Caveat — `399_DOMAIN_EVENT_TRANSACTION_CAVEAT.md`
- Outbox for Integration Events — `400_OUTBOX_FOR_INTEGRATION_EVENTS.md`

## Query Hints & Entity Graphs

- @QueryHints — `401_QUERYHINTS.md`
- QueryHint — `402_QUERYHINT.md`
- @EntityGraph — `403_ENTITYGRAPH.md`
- EntityGraph attributePaths — `404_ENTITYGRAPH_ATTRIBUTEPATHS.md`
- NamedEntityGraph — `405_NAMEDENTITYGRAPH.md`
- Fetch Size Hint — `406_FETCH_SIZE_HINT.md`
- Read Only Hint — `407_READ_ONLY_HINT.md`
- Timeout Hint — `408_TIMEOUT_HINT.md`
- Cacheable Hint — `409_CACHEABLE_HINT.md`
- Hint Portability — `410_HINT_PORTABILITY.md`

## Stored Procedures

- @Procedure — `411_PROCEDURE.md`
- NamedStoredProcedureQuery — `412_NAMEDSTOREDPROCEDUREQUERY.md`
- StoredProcedureQuery — `413_STOREDPROCEDUREQUERY.md`
- IN Parameter — `414_IN_PARAMETER.md`
- OUT Parameter — `415_OUT_PARAMETER.md`
- INOUT Parameter — `416_INOUT_PARAMETER.md`
- REF_CURSOR — `417_REF_CURSOR.md`
- Stored Procedure Portability — `418_STORED_PROCEDURE_PORTABILITY.md`
- Procedure Transaction — `419_PROCEDURE_TRANSACTION.md`

## Second Level Cache

- First vs Second Level Cache — `420_FIRST_VS_SECOND_LEVEL_CACHE.md`
- Hibernate L2 Cache — `421_HIBERNATE_L2_CACHE.md`
- JCache — `422_JCACHE.md`
- Cache Region — `423_CACHE_REGION.md`
- READ_ONLY Strategy — `424_READ_ONLY_STRATEGY.md`
- NONSTRICT_READ_WRITE — `425_NONSTRICT_READ_WRITE.md`
- READ_WRITE — `426_READ_WRITE.md`
- TRANSACTIONAL — `427_TRANSACTIONAL.md`
- Query Cache — `428_QUERY_CACHE.md`
- Query Cache Dependency — `429_QUERY_CACHE_DEPENDENCY.md`
- Cache Invalidation — `430_CACHE_INVALIDATION.md`
- L2 Cache Anti Pattern — `431_L2_CACHE_ANTI_PATTERN.md`

## Hibernate Specific Essentials

- Hibernate Session — `432_HIBERNATE_SESSION.md`
- SessionFactory — `433_SESSIONFACTORY.md`
- HQL — `434_HQL.md`
- Hibernate FetchMode — `435_HIBERNATE_FETCHMODE.md`
- @BatchSize — `436_BATCHSIZE.md`
- @Fetch — `437_FETCH.md`
- @Immutable — `438_IMMUTABLE.md`
- @CreationTimestamp — `439_CREATIONTIMESTAMP.md`
- @UpdateTimestamp — `440_UPDATETIMESTAMP.md`
- @DynamicUpdate — `441_DYNAMICUPDATE.md`
- @DynamicInsert — `442_DYNAMICINSERT.md`
- @NaturalId — `443_NATURALID.md`
- @Formula — `444_FORMULA.md`
- @Where Legacy Awareness — `445_WHERE_LEGACY_AWARENESS.md`
- @SQLRestriction — `446_SQLRESTRICTION.md`
- @Filter — `447_FILTER.md`
- @SoftDelete — `448_SOFTDELETE.md`
- @JdbcTypeCode — `449_JDBCTYPECODE.md`
- Bytecode Enhancement — `450_BYTECODE_ENHANCEMENT.md`
- Hibernate Statistics — `451_HIBERNATE_STATISTICS.md`
- Hibernate 7.4 — `452_HIBERNATE_7_4.md`

## Soft Delete

- Soft Delete Mental Model — `453_SOFT_DELETE_MENTAL_MODEL.md`
- Soft Delete Column — `454_SOFT_DELETE_COLUMN.md`
- Hibernate @SoftDelete — `455_HIBERNATE_SOFTDELETE.md`
- Repository Query Filtering — `456_REPOSITORY_QUERY_FILTERING.md`
- Unique Constraint Trap — `457_UNIQUE_CONSTRAINT_TRAP.md`
- Association Trap — `458_ASSOCIATION_TRAP.md`
- Restore — `459_RESTORE.md`
- Audit vs Soft Delete — `460_AUDIT_VS_SOFT_DELETE.md`

## Envers

- Hibernate Envers — `461_HIBERNATE_ENVERS.md`
- @Audited — `462_AUDITED.md`
- Revision — `463_REVISION.md`
- Revision Entity — `464_REVISION_ENTITY.md`
- RevisionRepository — `465_REVISIONREPOSITORY.md`
- Revision Number — `466_REVISION_NUMBER.md`
- Revision Type — `467_REVISION_TYPE.md`
- Find Revisions — `468_FIND_REVISIONS.md`
- Envers Storage Cost — `469_ENVERS_STORAGE_COST.md`
- Envers vs Event Sourcing — `470_ENVERS_VS_EVENT_SOURCING.md`

## Bulk Processing & Batching

- JDBC Batching — `471_JDBC_BATCHING.md`
- hibernate jdbc batch_size — `472_HIBERNATE_JDBC_BATCH_SIZE.md`
- Order Inserts — `473_ORDER_INSERTS.md`
- Order Updates — `474_ORDER_UPDATES.md`
- Batch Versioned Data — `475_BATCH_VERSIONED_DATA.md`
- Identity Batch Limitation — `476_IDENTITY_BATCH_LIMITATION.md`
- Sequence for Batching — `477_SEQUENCE_FOR_BATCHING.md`
- Flush Clear Loop — `478_FLUSH_CLEAR_LOOP.md`
- saveAll Trap — `479_SAVEALL_TRAP.md`
- Batch Fetch vs JDBC Batch — `480_BATCH_FETCH_VS_JDBC_BATCH.md`
- Bulk JPQL Update — `481_BULK_JPQL_UPDATE.md`
- StatelessSession Awareness — `482_STATELESSSESSION_AWARENESS.md`

## Database Migrations

- Schema Generation — `483_SCHEMA_GENERATION.md`
- ddl-auto create — `484_DDL_AUTO_CREATE.md`
- ddl-auto update — `485_DDL_AUTO_UPDATE.md`
- ddl-auto validate — `486_DDL_AUTO_VALIDATE.md`
- Flyway — `487_FLYWAY.md`
- Liquibase — `488_LIQUIBASE.md`
- Migration Before App — `489_MIGRATION_BEFORE_APP.md`
- Expand Contract — `490_EXPAND_CONTRACT.md`
- Index Migration — `491_INDEX_MIGRATION.md`
- Column Rename — `492_COLUMN_RENAME.md`
- Entity Migration Alignment — `493_ENTITY_MIGRATION_ALIGNMENT.md`

## Testing JPA

- @DataJpaTest — `494_DATAJPATEST.md`
- TestEntityManager — `495_TESTENTITYMANAGER.md`
- Transactional Test Rollback — `496_TRANSACTIONAL_TEST_ROLLBACK.md`
- Flush in Tests — `497_FLUSH_IN_TESTS.md`
- Clear in Tests — `498_CLEAR_IN_TESTS.md`
- Testcontainers — `499_TESTCONTAINERS.md`
- H2 Trap — `500_H2_TRAP.md`
- Repository Test — `501_REPOSITORY_TEST.md`
- Mapping Test — `502_MAPPING_TEST.md`
- N Plus One Test — `503_N_PLUS_ONE_TEST.md`
- Optimistic Lock Test — `504_OPTIMISTIC_LOCK_TEST.md`
- Pessimistic Lock Test — `505_PESSIMISTIC_LOCK_TEST.md`
- Migration Test — `506_MIGRATION_TEST.md`

## Performance & SQL Diagnostics

- SQL Logging — `507_SQL_LOGGING.md`
- Bind Parameter Logging — `508_BIND_PARAMETER_LOGGING.md`
- Hibernate Statistics — `509_HIBERNATE_STATISTICS.md`
- StatementInspector — `510_STATEMENTINSPECTOR.md`
- Datasource Proxy — `511_DATASOURCE_PROXY.md`
- APM Database Spans — `512_APM_DATABASE_SPANS.md`
- Slow Query Log — `513_SLOW_QUERY_LOG.md`
- Explain Plan — `514_EXPLAIN_PLAN.md`
- Indexing — `515_INDEXING.md`
- Covering Index — `516_COVERING_INDEX.md`
- Selectivity — `517_SELECTIVITY.md`
- Connection Pool — `518_CONNECTION_POOL.md`
- Pool Size Rule — `519_POOL_SIZE_RULE.md`
- Query Timeout — `520_QUERY_TIMEOUT.md`
- Fetch Size — `521_FETCH_SIZE.md`
- Read Only Query — `522_READ_ONLY_QUERY.md`
- DTO Query — `523_DTO_QUERY.md`
- Entity Graph Size — `524_ENTITY_GRAPH_SIZE.md`

## Streaming & Large Results

- Repository Stream — `525_REPOSITORY_STREAM.md`
- Stream Transaction Scope — `526_STREAM_TRANSACTION_SCOPE.md`
- Scrollable Results — `527_SCROLLABLE_RESULTS.md`
- Pagination for Large Data — `528_PAGINATION_FOR_LARGE_DATA.md`
- Chunk Processing — `529_CHUNK_PROCESSING.md`
- Entity Detach — `530_ENTITY_DETACH.md`
- JPA Is Blocking — `531_JPA_IS_BLOCKING.md`
- Reactive Trap — `532_REACTIVE_TRAP.md`

## Multi Tenancy

- Multi Tenancy Strategies — `533_MULTI_TENANCY_STRATEGIES.md`
- Database Per Tenant — `534_DATABASE_PER_TENANT.md`
- Schema Per Tenant — `535_SCHEMA_PER_TENANT.md`
- Discriminator Tenant — `536_DISCRIMINATOR_TENANT.md`
- Current Tenant Identifier — `537_CURRENT_TENANT_IDENTIFIER.md`
- MultiTenantConnectionProvider — `538_MULTITENANTCONNECTIONPROVIDER.md`
- Tenant Filter — `539_TENANT_FILTER.md`
- Tenant Security — `540_TENANT_SECURITY.md`
- Tenant Unique Constraints — `541_TENANT_UNIQUE_CONSTRAINTS.md`
- Tenant Cache Isolation — `542_TENANT_CACHE_ISOLATION.md`
- Tenant Migrations — `543_TENANT_MIGRATIONS.md`

## DDD & Aggregate Persistence

- Aggregate Root — `544_AGGREGATE_ROOT.md`
- Repository per Aggregate — `545_REPOSITORY_PER_AGGREGATE.md`
- Entity vs Value Object — `546_ENTITY_VS_VALUE_OBJECT.md`
- Cascade Inside Aggregate — `547_CASCADE_INSIDE_AGGREGATE.md`
- orphanRemoval Aggregate — `548_ORPHANREMOVAL_AGGREGATE.md`
- ManyToMany DDD Trap — `549_MANYTOMANY_DDD_TRAP.md`
- Association Entity — `550_ASSOCIATION_ENTITY.md`
- Lazy Aggregate Boundary — `551_LAZY_AGGREGATE_BOUNDARY.md`
- Domain Logic in Entity — `552_DOMAIN_LOGIC_IN_ENTITY.md`
- Repository Abstraction — `553_REPOSITORY_ABSTRACTION.md`

## Spring Data Custom Repositories

- Repository Fragment — `554_REPOSITORY_FRAGMENT.md`
- Custom Repository Interface — `555_CUSTOM_REPOSITORY_INTERFACE.md`
- Fragment Implementation — `556_FRAGMENT_IMPLEMENTATION.md`
- EntityManager Injection — `557_ENTITYMANAGER_INJECTION.md`
- JdbcTemplate in Fragment — `558_JDBCTEMPLATE_IN_FRAGMENT.md`
- Querydsl Fragment — `559_QUERYDSL_FRAGMENT.md`
- Base Repository Customization — `560_BASE_REPOSITORY_CUSTOMIZATION.md`
- JpaRepositoryFactoryBean — `561_JPAREPOSITORYFACTORYBEAN.md`
- Custom Base Repository — `562_CUSTOM_BASE_REPOSITORY.md`
- Repository Fragment Composition — `563_REPOSITORY_FRAGMENT_COMPOSITION.md`

## Spring Data SpEL & Context

- SpEL Entity Name — `564_SPEL_ENTITY_NAME.md`
- Security Principal in Query — `565_SECURITY_PRINCIPAL_IN_QUERY.md`
- EvaluationContextExtension — `566_EVALUATIONCONTEXTEXTENSION.md`
- SpEL Risk — `567_SPEL_RISK.md`

## Return Types

- Optional — `568_OPTIONAL.md`
- List — `569_LIST.md`
- Set — `570_SET.md`
- Stream — `571_STREAM.md`
- Page — `572_PAGE.md`
- Slice — `573_SLICE.md`
- Window — `574_WINDOW.md`
- Future Async Repository — `575_FUTURE_ASYNC_REPOSITORY.md`
- CompletableFuture — `576_COMPLETABLEFUTURE.md`
- Vavr Collections — `577_VAVR_COLLECTIONS.md`
- Nullability — `578_NULLABILITY.md`

## Async Repositories

- @Async Repository — `579_ASYNC_REPOSITORY.md`
- Async Does Not Mean Reactive — `580_ASYNC_DOES_NOT_MEAN_REACTIVE.md`
- Executor Sizing — `581_EXECUTOR_SIZING.md`
- Transaction Propagation Async — `582_TRANSACTION_PROPAGATION_ASYNC.md`
- Async Use Case — `583_ASYNC_USE_CASE.md`

## Spring Data JPA 4.x Modern Features

- Spring Data JPA 4.1.1 — `584_SPRING_DATA_JPA_4_1_1.md`
- 4.2.0 M1 — `585_4_2_0_M1.md`
- Spring Data Commons 4.1 — `586_SPRING_DATA_COMMONS_4_1.md`
- Jakarta Namespace — `587_JAKARTA_NAMESPACE.md`
- Scroll API — `588_SCROLL_API.md`
- Fluent Specification Query — `589_FLUENT_SPECIFICATION_QUERY.md`
- Delete Specification — `590_DELETE_SPECIFICATION.md`
- Repository Modernization — `591_REPOSITORY_MODERNIZATION.md`

## Jakarta Persistence 3.2 Features

- Record Embeddables 3.2 — `592_RECORD_EMBEDDABLES_3_2.md`
- Instant 3.2 — `593_INSTANT_3_2.md`
- Year 3.2 — `594_YEAR_3_2.md`
- Set Operations 3.2 — `595_SET_OPERATIONS_3_2.md`
- String Concatenation 3.2 — `596_STRING_CONCATENATION_3_2.md`
- String Functions 3.2 — `597_STRING_FUNCTIONS_3_2.md`
- cast 3.2 — `598_CAST_3_2.md`
- id 3.2 — `599_ID_3_2.md`
- version 3.2 — `600_VERSION_3_2.md`
- Null Precedence 3.2 — `601_NULL_PRECEDENCE_3_2.md`
- getSingleResultOrNull 3.2 — `602_GETSINGLERESULTORNULL_3_2.md`
- CriteriaSelect 3.2 — `603_CRITERIASELECT_3_2.md`
- EntityType Criteria Join 3.2 — `604_ENTITYTYPE_CRITERIA_JOIN_3_2.md`

## Security

- SQL Injection — `605_SQL_INJECTION.md`
- Dynamic Sort Injection — `606_DYNAMIC_SORT_INJECTION.md`
- Tenant Predicate — `607_TENANT_PREDICATE.md`
- Mass Assignment — `608_MASS_ASSIGNMENT.md`
- Sensitive Field Projection — `609_SENSITIVE_FIELD_PROJECTION.md`
- Encrypted Columns — `610_ENCRYPTED_COLUMNS.md`
- Credential Logging — `611_CREDENTIAL_LOGGING.md`
- Row Level Security — `612_ROW_LEVEL_SECURITY.md`
- Soft Delete Security — `613_SOFT_DELETE_SECURITY.md`

## Troubleshooting

- LazyInitializationException — `614_LAZYINITIALIZATIONEXCEPTION.md`
- Detached Entity Passed to Persist — `615_DETACHED_ENTITY_PASSED_TO_PERSIST.md`
- TransientObjectException — `616_TRANSIENTOBJECTEXCEPTION.md`
- PersistentObjectException — `617_PERSISTENTOBJECTEXCEPTION.md`
- EntityExistsException — `618_ENTITYEXISTSEXCEPTION.md`
- OptimisticLockException — `619_OPTIMISTICLOCKEXCEPTION.md`
- PessimisticLockException — `620_PESSIMISTICLOCKEXCEPTION.md`
- LockTimeoutException — `621_LOCKTIMEOUTEXCEPTION.md`
- TransactionRequiredException — `622_TRANSACTIONREQUIREDEXCEPTION.md`
- NonUniqueResultException — `623_NONUNIQUERESULTEXCEPTION.md`
- NoResultException — `624_NORESULTEXCEPTION.md`
- N Plus One — `625_N_PLUS_ONE.md`
- MultipleBagFetchException — `626_MULTIPLEBAGFETCHEXCEPTION.md`
- Batch Not Working — `627_BATCH_NOT_WORKING.md`
- Save Did Not Update — `628_SAVE_DID_NOT_UPDATE.md`
- Delete Did Not Cascade — `629_DELETE_DID_NOT_CASCADE.md`
- Duplicate Key on Flush — `630_DUPLICATE_KEY_ON_FLUSH.md`
- Unexpected Flush — `631_UNEXPECTED_FLUSH.md`
- Stale Data After Bulk Update — `632_STALE_DATA_AFTER_BULK_UPDATE.md`
- Page Query Slow — `633_PAGE_QUERY_SLOW.md`
- High Memory — `634_HIGH_MEMORY.md`
- Connection Pool Exhausted — `635_CONNECTION_POOL_EXHAUSTED.md`
- Golden JPA Debug Flow — `636_GOLDEN_JPA_DEBUG_FLOW.md`

## System Design & Interviews

- Design CRUD Service — `637_DESIGN_CRUD_SERVICE.md`
- Design Read Heavy API — `638_DESIGN_READ_HEAVY_API.md`
- Design Write Heavy Import — `639_DESIGN_WRITE_HEAVY_IMPORT.md`
- Design Aggregate Persistence — `640_DESIGN_AGGREGATE_PERSISTENCE.md`
- Design Audit History — `641_DESIGN_AUDIT_HISTORY.md`
- Design Multi Tenant JPA — `642_DESIGN_MULTI_TENANT_JPA.md`
- Design Soft Delete — `643_DESIGN_SOFT_DELETE.md`
- Design Concurrency — `644_DESIGN_CONCURRENCY.md`
- Design Outbox — `645_DESIGN_OUTBOX.md`
- JPA vs Hibernate — `646_JPA_VS_HIBERNATE.md`
- JPA vs Spring Data JPA — `647_JPA_VS_SPRING_DATA_JPA.md`
- JpaRepository vs EntityManager — `648_JPAREPOSITORY_VS_ENTITYMANAGER.md`
- persist vs merge — `649_PERSIST_VS_MERGE.md`
- save vs persist — `650_SAVE_VS_PERSIST.md`
- LAZY vs EAGER — `651_LAZY_VS_EAGER.md`
- Fetch Join vs EntityGraph — `652_FETCH_JOIN_VS_ENTITYGRAPH.md`
- Page vs Slice vs Window — `653_PAGE_VS_SLICE_VS_WINDOW.md`
- Specification vs Query by Example — `654_SPECIFICATION_VS_QUERY_BY_EXAMPLE.md`
- Projection vs Entity — `655_PROJECTION_VS_ENTITY.md`
- Optimistic vs Pessimistic — `656_OPTIMISTIC_VS_PESSIMISTIC.md`
- First vs Second Level Cache — `657_FIRST_VS_SECOND_LEVEL_CACHE.md`
- JPA vs R2DBC — `658_JPA_VS_R2DBC.md`
- When Not to Use JPA — `659_WHEN_NOT_TO_USE_JPA.md`
- Spring Data JPA Anti Patterns — `660_SPRING_DATA_JPA_ANTI_PATTERNS.md`
- Spring Data JPA Interview Traps — `661_SPRING_DATA_JPA_INTERVIEW_TRAPS.md`


---

<!-- 010_PERSISTENCE_UNIT.md -->

# Persistence Unit

## What / Why
Configuration boundary describing entities/provider/database settings.

## Mental Model
```text
Persistence Unit → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Persistence Unit:** Configuration boundary describing entities/provider/database settings.


---

<!-- 011_PERSISTENCE_PROVIDER.md -->

# Persistence Provider

## What / Why
Implementation that creates EntityManagerFactory and executes persistence semantics.

## Mental Model
```text
Persistence Provider → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Persistence Provider:** Implementation that creates EntityManagerFactory and executes persistence semantics.


---

<!-- 012_ENTITYMANAGERFACTORY.md -->

# EntityManagerFactory

## What / Why
Heavyweight thread-safe factory for EntityManager instances.

## Mental Model
```text
EntityManagerFactory → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityManagerFactory:** Heavyweight thread-safe factory for EntityManager instances.


---

<!-- 013_ENTITYMANAGER.md -->

# EntityManager

## What / Why
Persistence-context API for finding, persisting, merging, removing and querying entities.

## Mental Model
```text
EntityManager → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityManager:** Persistence-context API for finding, persisting, merging, removing and querying entities.


---

<!-- 014_PERSISTENCE_CONTEXT.md -->

# Persistence Context

## What / Why
Identity map/unit of work tracking managed entity state.

## Mental Model
```text
Persistence Context → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Persistence Context:** Identity map/unit of work tracking managed entity state.


---

<!-- 015_TRANSACTION_SCOPED_CONTEXT.md -->

# Transaction Scoped Context

## What / Why
Default persistence context lifetime bound to transaction.

## Mental Model
```text
Transaction Scoped Context → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transaction Scoped Context:** Default persistence context lifetime bound to transaction.


---

<!-- 016_EXTENDED_PERSISTENCE_CONTEXT.md -->

# Extended Persistence Context

## What / Why
Longer-lived context used in specialized stateful flows.

## Mental Model
```text
Extended Persistence Context → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Extended Persistence Context:** Longer-lived context used in specialized stateful flows.


---

<!-- 017_UNIT_OF_WORK.md -->

# Unit of Work

## What / Why
Collect changes to managed entities and synchronize at flush/commit.

## Mental Model
```text
Unit of Work → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Unit of Work:** Collect changes to managed entities and synchronize at flush/commit.


---

<!-- 018_IDENTITY_MAP.md -->

# Identity Map

## What / Why
Within one persistence context, one database identity maps to one managed object instance.

## Mental Model
```text
Identity Map → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Identity Map:** Within one persistence context, one database identity maps to one managed object instance.


---

<!-- 019_WRITE_BEHIND.md -->

# Write Behind

## What / Why
Changes are accumulated in memory and synchronized later at flush.

## Mental Model
```text
Write Behind → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Write Behind:** Changes are accumulated in memory and synchronized later at flush.


---

<!-- 01_30_SECOND_RECALL.md -->

# Spring Data / JPA — 30-Second Recall

```text
Controller
   ↓
Service @Transactional
   ↓
Spring Data Repository
   ↓
EntityManager
   ↓
Persistence Context
   ↓
Hibernate / JPA Provider
   ↓
JDBC
   ↓
Database
```

## Entity Lifecycle
```text
Transient
  └─ persist → Managed
Managed
  ├─ dirty checking → SQL on flush
  ├─ remove → Removed
  └─ detach/clear/close → Detached
Detached
  └─ merge → managed copy
```

## Golden Rules
```text
JPA = specification
Hibernate = provider
Spring Data JPA = repository abstraction
Transaction = business boundary
LAZY/EAGER != SQL strategy
N+1 must be measured
save() != always INSERT
```


---

<!-- 020_SQL_GENERATION.md -->

# SQL Generation

## What / Why
Provider translates mappings and JPQL/Criteria operations into SQL.

## Mental Model
```text
SQL Generation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SQL Generation:** Provider translates mappings and JPQL/Criteria operations into SQL.


---

<!-- 021_PROVIDER_PORTABILITY.md -->

# Provider Portability

## What / Why
Portable JPA code avoids provider-specific annotations/query hints unless justified.

## Mental Model
```text
Provider Portability → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Provider Portability:** Portable JPA code avoids provider-specific annotations/query hints unless justified.


---

<!-- 022_ENTITY_LIFECYCLE_STATES.md -->

# Entity Lifecycle States

## What / Why
Transient, managed, detached and removed are the core entity states.

## Mental Model
```text
Entity Lifecycle States → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Lifecycle States:** Transient, managed, detached and removed are the core entity states.


---

<!-- 023_TRANSIENT_ENTITY.md -->

# Transient Entity

## What / Why
New object not associated with persistence context.

## Mental Model
```text
Transient Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transient Entity:** New object not associated with persistence context.


---

<!-- 024_MANAGED_ENTITY.md -->

# Managed Entity

## What / Why
Tracked by persistence context; changes participate in dirty checking.

## Mental Model
```text
Managed Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Managed Entity:** Tracked by persistence context; changes participate in dirty checking.


---

<!-- 025_DETACHED_ENTITY.md -->

# Detached Entity

## What / Why
Previously managed object no longer associated with current persistence context.

## Mental Model
```text
Detached Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Detached Entity:** Previously managed object no longer associated with current persistence context.


---

<!-- 026_REMOVED_ENTITY.md -->

# Removed Entity

## What / Why
Managed entity scheduled for deletion.

## Mental Model
```text
Removed Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Removed Entity:** Managed entity scheduled for deletion.


---

<!-- 027_PERSIST.md -->

# persist

## What / Why
Makes a new entity managed and schedules insert.

## Mental Model
```text
persist → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **persist:** Makes a new entity managed and schedules insert.


---

<!-- 028_MERGE.md -->

# merge

## What / Why
Copies detached/transient state into a managed instance and returns that managed instance.

## Mental Model
```text
merge → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **merge:** Copies detached/transient state into a managed instance and returns that managed instance.


---

<!-- 029_REMOVE.md -->

# remove

## What / Why
Marks managed entity for deletion.

## Mental Model
```text
remove → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **remove:** Marks managed entity for deletion.


---

<!-- 02_CURRENT_BASELINE.md -->

# Current Baseline — September 2026

## Spring Data JPA
**4.1.1** is the current stable Spring Data JPA line.

Other official lines:
- 4.0.7 stable
- 3.5.13 stable
- 4.2.0-M1 preview

## Jakarta Persistence
**Jakarta Persistence 3.2** is the current final specification.

Selected 3.2 additions:
- record embeddables
- `Instant` and `Year` mappings
- JPQL/Criteria `union`, `intersect`, `except`
- `cast`, `left`, `right`, `replace`
- `id()` and `version()`
- null precedence in ordering
- `getSingleResultOrNull()`
- expanded Criteria API support

## Hibernate Awareness
Hibernate ORM **7.4.8.Final** is the latest stable provider line as of September 13, 2026.

Use Spring Boot dependency management for the actual application combination instead of manually forcing unrelated Spring Data/Hibernate versions.


---

<!-- 030_FIND.md -->

# find

## What / Why
Loads by primary key and returns managed entity.

## Mental Model
```text
find → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **find:** Loads by primary key and returns managed entity.


---

<!-- 031_GETREFERENCE.md -->

# getReference

## What / Why
Returns lazy reference/proxy where provider can defer loading.

## Mental Model
```text
getReference → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **getReference:** Returns lazy reference/proxy where provider can defer loading.


---

<!-- 032_CONTAINS.md -->

# contains

## What / Why
Checks whether entity instance is managed.

## Mental Model
```text
contains → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **contains:** Checks whether entity instance is managed.


---

<!-- 033_DETACH.md -->

# detach

## What / Why
Removes one entity from persistence context.

## Mental Model
```text
detach → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **detach:** Removes one entity from persistence context.


---

<!-- 034_CLEAR.md -->

# clear

## What / Why
Detaches all managed entities.

## Mental Model
```text
clear → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **clear:** Detaches all managed entities.


---

<!-- 035_REFRESH.md -->

# refresh

## What / Why
Reloads entity state from database.

## Mental Model
```text
refresh → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **refresh:** Reloads entity state from database.


---

<!-- 036_FLUSH.md -->

# Flush

## What / Why
Synchronizes persistence-context changes to database.

## Mental Model
```text
Flush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flush:** Synchronizes persistence-context changes to database.


---

<!-- 037_FLUSH_VS_COMMIT.md -->

# Flush vs Commit

## What / Why
Flush emits SQL; commit finalizes transaction.

## Mental Model
```text
Flush vs Commit → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flush vs Commit:** Flush emits SQL; commit finalizes transaction.


---

<!-- 038_AUTOMATIC_DIRTY_CHECKING.md -->

# Automatic Dirty Checking

## What / Why
Provider detects changes to managed state and writes updates at flush.

## Mental Model
```text
Automatic Dirty Checking → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Automatic Dirty Checking:** Provider detects changes to managed state and writes updates at flush.


---

<!-- 039_DETACHED_UPDATE_TRAP.md -->

# Detached Update Trap

## What / Why
Changing detached entity does nothing unless state is merged/reloaded/updated through a managed instance.

## Mental Model
```text
Detached Update Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Detached Update Trap:** Changing detached entity does nothing unless state is merged/reloaded/updated through a managed instance.


---

<!-- 03_REFERENCE_ARCHITECTURE.md -->

# Spring Data / JPA Reference Architecture

```text
HTTP / Messaging
      ↓
Application Service
   @Transactional
      ↓
Repository Interface
      ↓
Spring Data Repository Proxy
      ↓
EntityManager
      ↓
Persistence Context
 ┌────┼──────────────┐
 ↓    ↓              ↓
L1   Dirty         Query
Cache Checking     Engine
      ↓
JPA Provider (Hibernate)
      ↓
JDBC / Connection Pool
      ↓
Relational Database
```

## Cross-Cutting
```text
Entity mappings
Transactions
Locks
Fetch plans
Auditing
Migrations
SQL diagnostics
Caching
Multi-tenancy
Security
```


---

<!-- 040_ENTITY.md -->

# @Entity

## What / Why
Marks persistent entity class.

## Mental Model
```text
@Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Entity:** Marks persistent entity class.


---

<!-- 041_TABLE.md -->

# @Table

## What / Why
Customizes table/schema/catalog/constraints metadata.

## Mental Model
```text
@Table → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Table:** Customizes table/schema/catalog/constraints metadata.


---

<!-- 042_ID.md -->

# @Id

## What / Why
Declares primary key attribute.

## Mental Model
```text
@Id → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Id:** Declares primary key attribute.


---

<!-- 043_GENERATEDVALUE.md -->

# @GeneratedValue

## What / Why
Configures generated identifier strategy.

## Mental Model
```text
@GeneratedValue → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@GeneratedValue:** Configures generated identifier strategy.


---

<!-- 044_GENERATIONTYPE_AUTO.md -->

# GenerationType AUTO

## What / Why
Provider selects identifier strategy.

## Mental Model
```text
GenerationType AUTO → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **GenerationType AUTO:** Provider selects identifier strategy.


---

<!-- 045_GENERATIONTYPE_IDENTITY.md -->

# GenerationType IDENTITY

## What / Why
Database identity/auto-increment style identifier generation.

## Mental Model
```text
GenerationType IDENTITY → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **GenerationType IDENTITY:** Database identity/auto-increment style identifier generation.


---

<!-- 046_GENERATIONTYPE_SEQUENCE.md -->

# GenerationType SEQUENCE

## What / Why
Database sequence-based identifier generation.

## Mental Model
```text
GenerationType SEQUENCE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **GenerationType SEQUENCE:** Database sequence-based identifier generation.


---

<!-- 047_GENERATIONTYPE_TABLE.md -->

# GenerationType TABLE

## What / Why
Table-based identifier generation.

## Mental Model
```text
GenerationType TABLE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **GenerationType TABLE:** Table-based identifier generation.


---

<!-- 048_GENERATIONTYPE_UUID.md -->

# GenerationType UUID

## What / Why
Jakarta Persistence supports UUID generation.

## Mental Model
```text
GenerationType UUID → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **GenerationType UUID:** Jakarta Persistence supports UUID generation.


---

<!-- 049_COLUMN.md -->

# @Column

## What / Why
Maps basic attribute to column metadata.

## Mental Model
```text
@Column → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Column:** Maps basic attribute to column metadata.


---

<!-- 04_JPA_DECISION_TREE.md -->

# Spring Data / JPA Decision Tree

```text
Need ordinary transactional relational CRUD/domain persistence?
→ JPA + Spring Data JPA

Need dynamic filters?
→ Specification

Need simple probe matching?
→ Query by Example

Need optimized read shape?
→ DTO/interface Projection

Need exact DB-specific query?
→ Native SQL / JdbcClient / custom repository

Need large deep pagination?
→ Keyset/Window

Need read-modify-write concurrency?
├─ low contention → @Version optimistic lock
└─ short high contention → pessimistic lock

Need huge batch/ETL?
→ JDBC batching / bulk JPQL / JdbcClient / Spring Batch
  rather than keeping millions of managed entities

Need end-to-end reactive database access?
→ R2DBC, not JpaRepository wrapped in Mono
```


---

<!-- 050_BASIC.md -->

# @Basic

## What / Why
Basic persistent attribute configuration including optional/fetch.

## Mental Model
```text
@Basic → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Basic:** Basic persistent attribute configuration including optional/fetch.


---

<!-- 051_TRANSIENT.md -->

# @Transient

## What / Why
Excludes attribute from persistence mapping.

## Mental Model
```text
@Transient → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Transient:** Excludes attribute from persistence mapping.


---

<!-- 052_ACCESS.md -->

# @Access

## What / Why
Selects field or property access.

## Mental Model
```text
@Access → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Access:** Selects field or property access.


---

<!-- 053_FIELD_ACCESS.md -->

# Field Access

## What / Why
Provider reads/writes fields directly.

## Mental Model
```text
Field Access → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Field Access:** Provider reads/writes fields directly.


---

<!-- 054_PROPERTY_ACCESS.md -->

# Property Access

## What / Why
Provider uses getters/setters.

## Mental Model
```text
Property Access → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Property Access:** Provider uses getters/setters.


---

<!-- 055_MIXED_ACCESS.md -->

# Mixed Access

## What / Why
Attribute-level @Access can override class default carefully.

## Mental Model
```text
Mixed Access → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Mixed Access:** Attribute-level @Access can override class default carefully.


---

<!-- 056_ENTITY_CONSTRUCTOR.md -->

# Entity Constructor

## What / Why
Entities require accessible no-arg constructor under persistence rules.

## Mental Model
```text
Entity Constructor → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Constructor:** Entities require accessible no-arg constructor under persistence rules.


---

<!-- 057_ENTITY_FINALITY.md -->

# Entity Finality

## What / Why
Proxy/lazy-loading considerations make final entities/methods provider-sensitive.

## Mental Model
```text
Entity Finality → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Finality:** Proxy/lazy-loading considerations make final entities/methods provider-sensitive.


---

<!-- 058_ENTITY_EQUALITY.md -->

# Entity Equality

## What / Why
equals/hashCode must respect persistence identity and lifecycle.

## Mental Model
```text
Entity Equality → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Equality:** equals/hashCode must respect persistence identity and lifecycle.


---

<!-- 059_BASIC_TYPE_MAPPING.md -->

# Basic Type Mapping

## What / Why
JPA maps Java scalar types to JDBC/database types.

## Mental Model
```text
Basic Type Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Basic Type Mapping:** JPA maps Java scalar types to JDBC/database types.


---

<!-- 060_STRING_MAPPING.md -->

# String Mapping

## What / Why
String maps to character/text column.

## Mental Model
```text
String Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **String Mapping:** String maps to character/text column.


---

<!-- 061_NUMERIC_MAPPING.md -->

# Numeric Mapping

## What / Why
Primitive/wrapper numeric types map to numeric columns.

## Mental Model
```text
Numeric Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Numeric Mapping:** Primitive/wrapper numeric types map to numeric columns.


---

<!-- 062_BOOLEAN_MAPPING.md -->

# Boolean Mapping

## What / Why
Boolean database representation is dialect/provider dependent.

## Mental Model
```text
Boolean Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Boolean Mapping:** Boolean database representation is dialect/provider dependent.


---

<!-- 063_ENUM_MAPPING.md -->

# Enum Mapping

## What / Why
Enum may map as ORDINAL or STRING.

## Mental Model
```text
Enum Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Enum Mapping:** Enum may map as ORDINAL or STRING.


---

<!-- 064_ENUM_STRING.md -->

# Enum STRING

## What / Why
Safer for reordering but renaming remains a data migration concern.

## Mental Model
```text
Enum STRING → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Enum STRING:** Safer for reordering but renaming remains a data migration concern.


---

<!-- 065_ENUM_ORDINAL_TRAP.md -->

# Enum ORDINAL Trap

## What / Why
Reordering enum constants can corrupt meaning.

## Mental Model
```text
Enum ORDINAL Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Enum ORDINAL Trap:** Reordering enum constants can corrupt meaning.


---

<!-- 066_TEMPORAL_MAPPING.md -->

# Temporal Mapping

## What / Why
java.time types are directly supported in modern JPA.

## Mental Model
```text
Temporal Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Temporal Mapping:** java.time types are directly supported in modern JPA.


---

<!-- 067_INSTANT_MAPPING.md -->

# Instant Mapping

## What / Why
Jakarta Persistence 3.2 explicitly supports Instant.

## Mental Model
```text
Instant Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Instant Mapping:** Jakarta Persistence 3.2 explicitly supports Instant.


---

<!-- 068_YEAR_MAPPING.md -->

# Year Mapping

## What / Why
Jakarta Persistence 3.2 supports Year.

## Mental Model
```text
Year Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Year Mapping:** Jakarta Persistence 3.2 supports Year.


---

<!-- 069_UUID_MAPPING.md -->

# UUID Mapping

## What / Why
UUID basic type and identifier support.

## Mental Model
```text
UUID Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **UUID Mapping:** UUID basic type and identifier support.


---

<!-- 070_LOB.md -->

# @Lob

## What / Why
Large object mapping for CLOB/BLOB-like values.

## Mental Model
```text
@Lob → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Lob:** Large object mapping for CLOB/BLOB-like values.


---

<!-- 071_ENUMERATED.md -->

# @Enumerated

## What / Why
Controls enum representation.

## Mental Model
```text
@Enumerated → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Enumerated:** Controls enum representation.


---

<!-- 072_TEMPORAL_LEGACY.md -->

# @Temporal Legacy

## What / Why
Legacy java.util.Date/Calendar temporal annotation.

## Mental Model
```text
@Temporal Legacy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Temporal Legacy:** Legacy java.util.Date/Calendar temporal annotation.


---

<!-- 073_CONVERT.md -->

# @Convert

## What / Why
Applies AttributeConverter.

## Mental Model
```text
@Convert → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Convert:** Applies AttributeConverter.


---

<!-- 074_ATTRIBUTECONVERTER.md -->

# AttributeConverter

## What / Why
Converts entity attribute to/from database column representation.

## Mental Model
```text
AttributeConverter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **AttributeConverter:** Converts entity attribute to/from database column representation.


---

<!-- 075_CONVERTER_AUTOAPPLY.md -->

# @Converter autoApply

## What / Why
Automatically applies converter to compatible attributes.

## Mental Model
```text
@Converter autoApply → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Converter autoApply:** Automatically applies converter to compatible attributes.


---

<!-- 076_CONVERTER_LIMITS.md -->

# Converter Limits

## What / Why
Converters do not replace relationship/entity mappings.

## Mental Model
```text
Converter Limits → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Converter Limits:** Converters do not replace relationship/entity mappings.


---

<!-- 077_JSON_MAPPING.md -->

# JSON Mapping

## What / Why
JSON column mapping is typically provider/dialect-specific rather than portable JPA.

## Mental Model
```text
JSON Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JSON Mapping:** JSON column mapping is typically provider/dialect-specific rather than portable JPA.


---

<!-- 078_ARRAY_MAPPING.md -->

# Array Mapping

## What / Why
Database arrays are provider/dialect specific.

## Mental Model
```text
Array Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Array Mapping:** Database arrays are provider/dialect specific.


---

<!-- 079_EMBEDDABLE.md -->

# @Embeddable

## What / Why
Defines reusable value-type mapping.

## Mental Model
```text
@Embeddable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Embeddable:** Defines reusable value-type mapping.


---

<!-- 080_EMBEDDED.md -->

# @Embedded

## What / Why
Embeds value object columns into owning entity table.

## Mental Model
```text
@Embedded → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Embedded:** Embeds value object columns into owning entity table.


---

<!-- 081_ATTRIBUTEOVERRIDE.md -->

# @AttributeOverride

## What / Why
Overrides embedded column mapping.

## Mental Model
```text
@AttributeOverride → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@AttributeOverride:** Overrides embedded column mapping.


---

<!-- 082_ASSOCIATIONOVERRIDE.md -->

# @AssociationOverride

## What / Why
Overrides association inside embeddable.

## Mental Model
```text
@AssociationOverride → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@AssociationOverride:** Overrides association inside embeddable.


---

<!-- 083_RECORD_EMBEDDABLE.md -->

# Record Embeddable

## What / Why
Jakarta Persistence 3.2 supports Java record types as embeddable classes.

## Mental Model
```text
Record Embeddable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Record Embeddable:** Jakarta Persistence 3.2 supports Java record types as embeddable classes.


---

<!-- 084_EMBEDDABLE_IDENTITY.md -->

# Embeddable Identity

## What / Why
Embeddables have value semantics, not independent entity identity.

## Mental Model
```text
Embeddable Identity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Embeddable Identity:** Embeddables have value semantics, not independent entity identity.


---

<!-- 085_NESTED_EMBEDDABLE.md -->

# Nested Embeddable

## What / Why
Embeddables can contain nested embeddables where mapping rules allow.

## Mental Model
```text
Nested Embeddable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Nested Embeddable:** Embeddables can contain nested embeddables where mapping rules allow.


---

<!-- 086_EMBEDDABLE_COLLECTION.md -->

# Embeddable Collection

## What / Why
@ElementCollection can persist collections of embeddable values.

## Mental Model
```text
Embeddable Collection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Embeddable Collection:** @ElementCollection can persist collections of embeddable values.


---

<!-- 087_VALUE_OBJECT_DESIGN.md -->

# Value Object Design

## What / Why
Embeddables are ideal for immutable domain value types.

## Mental Model
```text
Value Object Design → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Value Object Design:** Embeddables are ideal for immutable domain value types.


---

<!-- 088_SIMPLE_PRIMARY_KEY.md -->

# Simple Primary Key

## What / Why
Single @Id attribute.

## Mental Model
```text
Simple Primary Key → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Simple Primary Key:** Single @Id attribute.


---

<!-- 089_COMPOSITE_KEY.md -->

# Composite Key

## What / Why
Entity identity formed from multiple attributes.

## Mental Model
```text
Composite Key → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Composite Key:** Entity identity formed from multiple attributes.


---

<!-- 090_EMBEDDEDID.md -->

# @EmbeddedId

## What / Why
Uses embeddable composite identifier.

## Mental Model
```text
@EmbeddedId → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@EmbeddedId:** Uses embeddable composite identifier.


---

<!-- 091_IDCLASS.md -->

# @IdClass

## What / Why
Maps composite ID through separate ID class.

## Mental Model
```text
@IdClass → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@IdClass:** Maps composite ID through separate ID class.


---

<!-- 092_EMBEDDEDID_VS_IDCLASS.md -->

# EmbeddedId vs IdClass

## What / Why
EmbeddedId models one value object; IdClass keeps entity attributes separate.

## Mental Model
```text
EmbeddedId vs IdClass → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EmbeddedId vs IdClass:** EmbeddedId models one value object; IdClass keeps entity attributes separate.


---

<!-- 093_DERIVED_IDENTITY.md -->

# Derived Identity

## What / Why
Dependent entity identity can derive from relationship.

## Mental Model
```text
Derived Identity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Derived Identity:** Dependent entity identity can derive from relationship.


---

<!-- 094_MAPSID.md -->

# @MapsId

## What / Why
Maps relationship into embedded/composite identifier.

## Mental Model
```text
@MapsId → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@MapsId:** Maps relationship into embedded/composite identifier.


---

<!-- 095_NATURAL_KEY.md -->

# Natural Key

## What / Why
Business-meaningful unique identifier distinct from surrogate primary key.

## Mental Model
```text
Natural Key → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Natural Key:** Business-meaningful unique identifier distinct from surrogate primary key.


---

<!-- 096_SURROGATE_KEY.md -->

# Surrogate Key

## What / Why
Synthetic technical identifier.

## Mental Model
```text
Surrogate Key → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Surrogate Key:** Synthetic technical identifier.


---

<!-- 097_IDENTIFIER_IMMUTABILITY.md -->

# Identifier Immutability

## What / Why
Primary key should not change after entity becomes persistent.

## Mental Model
```text
Identifier Immutability → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Identifier Immutability:** Primary key should not change after entity becomes persistent.


---

<!-- 098_SEQUENCE_ALLOCATION.md -->

# Sequence Allocation

## What / Why
Provider can allocate sequence blocks for performance.

## Mental Model
```text
Sequence Allocation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Sequence Allocation:** Provider can allocate sequence blocks for performance.


---

<!-- 099_IDENTITY_INSERT_TIMING.md -->

# Identity Insert Timing

## What / Why
IDENTITY often requires insert earlier to obtain generated key.

## Mental Model
```text
Identity Insert Timing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Identity Insert Timing:** IDENTITY often requires insert earlier to obtain generated key.


---

<!-- 100_ONETOONE.md -->

# @OneToOne

## What / Why
Maps one-to-one association.

## Mental Model
```text
@OneToOne → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@OneToOne:** Maps one-to-one association.


---

<!-- 101_ONETOMANY.md -->

# @OneToMany

## What / Why
Maps one parent to many children.

## Mental Model
```text
@OneToMany → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@OneToMany:** Maps one parent to many children.


---

<!-- 102_MANYTOONE.md -->

# @ManyToOne

## What / Why
Maps many entities to one parent.

## Mental Model
```text
@ManyToOne → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@ManyToOne:** Maps many entities to one parent.


---

<!-- 103_MANYTOMANY.md -->

# @ManyToMany

## What / Why
Maps many-to-many association through join table.

## Mental Model
```text
@ManyToMany → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@ManyToMany:** Maps many-to-many association through join table.


---

<!-- 104_OWNING_SIDE.md -->

# Owning Side

## What / Why
Side that controls foreign-key/join-table update.

## Mental Model
```text
Owning Side → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Owning Side:** Side that controls foreign-key/join-table update.


---

<!-- 105_INVERSE_SIDE.md -->

# Inverse Side

## What / Why
mappedBy side reflecting relationship.

## Mental Model
```text
Inverse Side → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Inverse Side:** mappedBy side reflecting relationship.


---

<!-- 106_MAPPEDBY.md -->

# mappedBy

## What / Why
Declares relationship is controlled by other side.

## Mental Model
```text
mappedBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **mappedBy:** Declares relationship is controlled by other side.


---

<!-- 107_JOINCOLUMN.md -->

# @JoinColumn

## What / Why
Defines FK join column.

## Mental Model
```text
@JoinColumn → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@JoinColumn:** Defines FK join column.


---

<!-- 108_JOINCOLUMNS.md -->

# @JoinColumns

## What / Why
Composite foreign-key mapping.

## Mental Model
```text
@JoinColumns → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@JoinColumns:** Composite foreign-key mapping.


---

<!-- 109_JOINTABLE.md -->

# @JoinTable

## What / Why
Maps association through intermediate table.

## Mental Model
```text
@JoinTable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@JoinTable:** Maps association through intermediate table.


---

<!-- 110_BIDIRECTIONAL_RELATIONSHIP.md -->

# Bidirectional Relationship

## What / Why
Both sides navigate same association.

## Mental Model
```text
Bidirectional Relationship → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Bidirectional Relationship:** Both sides navigate same association.


---

<!-- 111_UNIDIRECTIONAL_RELATIONSHIP.md -->

# Unidirectional Relationship

## What / Why
Only one side exposes association.

## Mental Model
```text
Unidirectional Relationship → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Unidirectional Relationship:** Only one side exposes association.


---

<!-- 112_RELATIONSHIP_SYNCHRONIZATION.md -->

# Relationship Synchronization

## What / Why
Application should keep both sides of bidirectional association consistent.

## Mental Model
```text
Relationship Synchronization → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Relationship Synchronization:** Application should keep both sides of bidirectional association consistent.


---

<!-- 113_HELPER_METHODS.md -->

# Helper Methods

## What / Why
add/remove helpers maintain both sides.

## Mental Model
```text
Helper Methods → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Helper Methods:** add/remove helpers maintain both sides.


---

<!-- 114_OPTIONAL_ASSOCIATION.md -->

# Optional Association

## What / Why
`optional` describes nullable association semantics.

## Mental Model
```text
Optional Association → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optional Association:** `optional` describes nullable association semantics.


---

<!-- 115_CASCADE.md -->

# Cascade

## What / Why
Propagates persistence operations to related entities.

## Mental Model
```text
Cascade → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cascade:** Propagates persistence operations to related entities.


---

<!-- 116_CASCADETYPE_PERSIST.md -->

# CascadeType PERSIST

## What / Why
Propagates persist.

## Mental Model
```text
CascadeType PERSIST → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CascadeType PERSIST:** Propagates persist.


---

<!-- 117_CASCADETYPE_MERGE.md -->

# CascadeType MERGE

## What / Why
Propagates merge.

## Mental Model
```text
CascadeType MERGE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CascadeType MERGE:** Propagates merge.


---

<!-- 118_CASCADETYPE_REMOVE.md -->

# CascadeType REMOVE

## What / Why
Propagates remove.

## Mental Model
```text
CascadeType REMOVE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CascadeType REMOVE:** Propagates remove.


---

<!-- 119_CASCADETYPE_REFRESH.md -->

# CascadeType REFRESH

## What / Why
Propagates refresh.

## Mental Model
```text
CascadeType REFRESH → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CascadeType REFRESH:** Propagates refresh.


---

<!-- 120_CASCADETYPE_DETACH.md -->

# CascadeType DETACH

## What / Why
Propagates detach.

## Mental Model
```text
CascadeType DETACH → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CascadeType DETACH:** Propagates detach.


---

<!-- 121_CASCADETYPE_ALL.md -->

# CascadeType ALL

## What / Why
All cascade operations.

## Mental Model
```text
CascadeType ALL → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CascadeType ALL:** All cascade operations.


---

<!-- 122_CASCADE_TRAP.md -->

# Cascade Trap

## What / Why
Cascade is operation propagation, not fetch strategy.

## Mental Model
```text
Cascade Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cascade Trap:** Cascade is operation propagation, not fetch strategy.


---

<!-- 123_ORPHANREMOVAL.md -->

# orphanRemoval

## What / Why
Deletes child removed from ownership collection/reference.

## Mental Model
```text
orphanRemoval → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **orphanRemoval:** Deletes child removed from ownership collection/reference.


---

<!-- 124_CASCADE_REMOVE_VS_ORPHANREMOVAL.md -->

# Cascade Remove vs orphanRemoval

## What / Why
Remove propagates parent deletion; orphanRemoval reacts to relationship removal.

## Mental Model
```text
Cascade Remove vs orphanRemoval → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cascade Remove vs orphanRemoval:** Remove propagates parent deletion; orphanRemoval reacts to relationship removal.


---

<!-- 125_ELEMENTCOLLECTION.md -->

# @ElementCollection

## What / Why
Persists collection of basic/embeddable values.

## Mental Model
```text
@ElementCollection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@ElementCollection:** Persists collection of basic/embeddable values.


---

<!-- 126_COLLECTIONTABLE.md -->

# @CollectionTable

## What / Why
Defines table for element collection.

## Mental Model
```text
@CollectionTable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@CollectionTable:** Defines table for element collection.


---

<!-- 127_LIST_MAPPING.md -->

# List Mapping

## What / Why
Ordered collection semantics need order column when DB order matters.

## Mental Model
```text
List Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **List Mapping:** Ordered collection semantics need order column when DB order matters.


---

<!-- 128_ORDERCOLUMN.md -->

# @OrderColumn

## What / Why
Persists list position.

## Mental Model
```text
@OrderColumn → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@OrderColumn:** Persists list position.


---

<!-- 129_ORDERBY.md -->

# @OrderBy

## What / Why
Orders collection retrieval using entity attributes.

## Mental Model
```text
@OrderBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@OrderBy:** Orders collection retrieval using entity attributes.


---

<!-- 130_SET_MAPPING.md -->

# Set Mapping

## What / Why
Uniqueness based on equals/hashCode and relational data constraints.

## Mental Model
```text
Set Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Set Mapping:** Uniqueness based on equals/hashCode and relational data constraints.


---

<!-- 131_MAP_MAPPING.md -->

# Map Mapping

## What / Why
Map keys can be basic/entity-derived with specific mapping annotations.

## Mental Model
```text
Map Mapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Map Mapping:** Map keys can be basic/entity-derived with specific mapping annotations.


---

<!-- 132_MAPKEY.md -->

# @MapKey

## What / Why
Use entity attribute as map key.

## Mental Model
```text
@MapKey → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@MapKey:** Use entity attribute as map key.


---

<!-- 133_MAPKEYCOLUMN.md -->

# @MapKeyColumn

## What / Why
Persist basic map key column.

## Mental Model
```text
@MapKeyColumn → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@MapKeyColumn:** Persist basic map key column.


---

<!-- 134_BAG_CONCEPT.md -->

# Bag Concept

## What / Why
Hibernate bag allows duplicates without persistent order; provider-specific performance implications.

## Mental Model
```text
Bag Concept → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Bag Concept:** Hibernate bag allows duplicates without persistent order; provider-specific performance implications.


---

<!-- 135_COLLECTION_DIRTY_CHECKING.md -->

# Collection Dirty Checking

## What / Why
Provider compares/watches collection changes to generate SQL.

## Mental Model
```text
Collection Dirty Checking → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Collection Dirty Checking:** Provider compares/watches collection changes to generate SQL.


---

<!-- 136_COLLECTION_REPLACEMENT_TRAP.md -->

# Collection Replacement Trap

## What / Why
Replacing managed collection instance can trigger excessive deletes/inserts.

## Mental Model
```text
Collection Replacement Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Collection Replacement Trap:** Replacing managed collection instance can trigger excessive deletes/inserts.


---

<!-- 137_LARGE_COLLECTION_TRAP.md -->

# Large Collection Trap

## What / Why
Huge entity collections are poor fit for normal ORM navigation.

## Mental Model
```text
Large Collection Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Large Collection Trap:** Huge entity collections are poor fit for normal ORM navigation.


---

<!-- 138_FETCHTYPE_LAZY.md -->

# FetchType LAZY

## What / Why
Load association/value on access when provider can support.

## Mental Model
```text
FetchType LAZY → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **FetchType LAZY:** Load association/value on access when provider can support.


---

<!-- 139_FETCHTYPE_EAGER.md -->

# FetchType EAGER

## What / Why
Provider must fetch by access completion rules; exact SQL strategy is provider-specific.

## Mental Model
```text
FetchType EAGER → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **FetchType EAGER:** Provider must fetch by access completion rules; exact SQL strategy is provider-specific.


---

<!-- 140_DEFAULT_FETCH_TYPES.md -->

# Default Fetch Types

## What / Why
To-one defaults EAGER in JPA; to-many defaults LAZY.

## Mental Model
```text
Default Fetch Types → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Default Fetch Types:** To-one defaults EAGER in JPA; to-many defaults LAZY.


---

<!-- 141_LAZY_PROXY.md -->

# Lazy Proxy

## What / Why
Provider proxy defers entity loading.

## Mental Model
```text
Lazy Proxy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lazy Proxy:** Provider proxy defers entity loading.


---

<!-- 142_PERSISTENT_COLLECTION.md -->

# Persistent Collection

## What / Why
Provider collection wrapper supports lazy loading and dirty tracking.

## Mental Model
```text
Persistent Collection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Persistent Collection:** Provider collection wrapper supports lazy loading and dirty tracking.


---

<!-- 143_LAZYINITIALIZATIONEXCEPTION.md -->

# LazyInitializationException

## What / Why
Hibernate-specific failure when lazy association accessed without active persistence context.

## Mental Model
```text
LazyInitializationException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **LazyInitializationException:** Hibernate-specific failure when lazy association accessed without active persistence context.


---

<!-- 144_OPEN_SESSION_IN_VIEW.md -->

# Open Session in View

## What / Why
Keeps context open across web rendering but can hide N+1 and transaction boundaries.

## Mental Model
```text
Open Session in View → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Open Session in View:** Keeps context open across web rendering but can hide N+1 and transaction boundaries.


---

<!-- 145_OSIV_TRADEOFF.md -->

# OSIV Tradeoff

## What / Why
Convenient lazy access vs unpredictable queries and long persistence context.

## Mental Model
```text
OSIV Tradeoff → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **OSIV Tradeoff:** Convenient lazy access vs unpredictable queries and long persistence context.


---

<!-- 146_FETCH_JOIN.md -->

# Fetch Join

## What / Why
JPQL join fetch loads association in same query.

## Mental Model
```text
Fetch Join → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch Join:** JPQL join fetch loads association in same query.


---

<!-- 147_ENTITY_GRAPH.md -->

# Entity Graph

## What / Why
Declarative fetch plan overriding default fetch behavior.

## Mental Model
```text
Entity Graph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Graph:** Declarative fetch plan overriding default fetch behavior.


---

<!-- 148_ENTITYGRAPH.md -->

# @EntityGraph

## What / Why
Spring Data repository method can apply entity graph.

## Mental Model
```text
@EntityGraph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@EntityGraph:** Spring Data repository method can apply entity graph.


---

<!-- 149_NAMED_ENTITY_GRAPH.md -->

# Named Entity Graph

## What / Why
Reusable named fetch graph.

## Mental Model
```text
Named Entity Graph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Named Entity Graph:** Reusable named fetch graph.


---

<!-- 150_FETCH_GRAPH_VS_LOAD_GRAPH.md -->

# Fetch Graph vs Load Graph

## What / Why
Graph semantics differ in treatment of unspecified attributes.

## Mental Model
```text
Fetch Graph vs Load Graph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch Graph vs Load Graph:** Graph semantics differ in treatment of unspecified attributes.


---

<!-- 151_BATCH_FETCHING.md -->

# Batch Fetching

## What / Why
Provider loads multiple lazy associations/entities in batches.

## Mental Model
```text
Batch Fetching → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Batch Fetching:** Provider loads multiple lazy associations/entities in batches.


---

<!-- 152_SUBSELECT_FETCH.md -->

# Subselect Fetch

## What / Why
Hibernate-specific collection fetch optimization.

## Mental Model
```text
Subselect Fetch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Subselect Fetch:** Hibernate-specific collection fetch optimization.


---

<!-- 153_FETCH_STRATEGY_VS_FETCH_TIMING.md -->

# Fetch Strategy vs Fetch Timing

## What / Why
LAZY/EAGER timing does not prescribe join/select implementation.

## Mental Model
```text
Fetch Strategy vs Fetch Timing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch Strategy vs Fetch Timing:** LAZY/EAGER timing does not prescribe join/select implementation.


---

<!-- 154_N_PLUS_ONE_MENTAL_MODEL.md -->

# N Plus One Mental Model

## What / Why
One query loads parents, then N additional queries load associations.

## Mental Model
```text
N Plus One Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **N Plus One Mental Model:** One query loads parents, then N additional queries load associations.


---

<!-- 155_N_PLUS_ONE_TO_MANY.md -->

# N Plus One To Many

## What / Why
Iterating lazy child collections can trigger N extra selects.

## Mental Model
```text
N Plus One To Many → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **N Plus One To Many:** Iterating lazy child collections can trigger N extra selects.


---

<!-- 156_N_PLUS_ONE_TO_ONE_MANYTOONE.md -->

# N Plus One To One ManyToOne

## What / Why
EAGER to-one may still produce additional selects.

## Mental Model
```text
N Plus One To One ManyToOne → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **N Plus One To One ManyToOne:** EAGER to-one may still produce additional selects.


---

<!-- 157_DETECT_N_PLUS_ONE.md -->

# Detect N Plus One

## What / Why
Use SQL logs, Hibernate statistics, datasource proxy/APM.

## Mental Model
```text
Detect N Plus One → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Detect N Plus One:** Use SQL logs, Hibernate statistics, datasource proxy/APM.


---

<!-- 158_FIX_WITH_FETCH_JOIN.md -->

# Fix with Fetch Join

## What / Why
Load needed relationships in one query.

## Mental Model
```text
Fix with Fetch Join → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fix with Fetch Join:** Load needed relationships in one query.


---

<!-- 159_FIX_WITH_ENTITYGRAPH.md -->

# Fix with EntityGraph

## What / Why
Apply explicit graph per use case.

## Mental Model
```text
Fix with EntityGraph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fix with EntityGraph:** Apply explicit graph per use case.


---

<!-- 160_FIX_WITH_PROJECTION.md -->

# Fix with Projection

## What / Why
Query only required fields.

## Mental Model
```text
Fix with Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fix with Projection:** Query only required fields.


---

<!-- 161_FIX_WITH_BATCH_FETCH.md -->

# Fix with Batch Fetch

## What / Why
Reduce N queries into batches.

## Mental Model
```text
Fix with Batch Fetch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fix with Batch Fetch:** Reduce N queries into batches.


---

<!-- 162_PAGINATION_FETCH_JOIN_TRAP.md -->

# Pagination Fetch Join Trap

## What / Why
Collection fetch joins plus pagination can create wrong/expensive behavior.

## Mental Model
```text
Pagination Fetch Join Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pagination Fetch Join Trap:** Collection fetch joins plus pagination can create wrong/expensive behavior.


---

<!-- 163_MULTIPLE_BAG_FETCH_TRAP.md -->

# Multiple Bag Fetch Trap

## What / Why
Hibernate can reject joining multiple bag collections.

## Mental Model
```text
Multiple Bag Fetch Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Multiple Bag Fetch Trap:** Hibernate can reject joining multiple bag collections.


---

<!-- 164_OVER_FETCHING.md -->

# Over Fetching

## What / Why
Fixing N+1 by always eager-fetching everything creates memory/query problems.

## Mental Model
```text
Over Fetching → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Over Fetching:** Fixing N+1 by always eager-fetching everything creates memory/query problems.


---

<!-- 165_INHERITANCE.md -->

# @Inheritance

## What / Why
Configures entity inheritance mapping strategy.

## Mental Model
```text
@Inheritance → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Inheritance:** Configures entity inheritance mapping strategy.


---

<!-- 166_SINGLE_TABLE.md -->

# SINGLE_TABLE

## What / Why
One table stores hierarchy using discriminator.

## Mental Model
```text
SINGLE_TABLE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SINGLE_TABLE:** One table stores hierarchy using discriminator.


---

<!-- 167_JOINED.md -->

# JOINED

## What / Why
Separate subclass tables joined to base.

## Mental Model
```text
JOINED → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JOINED:** Separate subclass tables joined to base.


---

<!-- 168_TABLE_PER_CLASS.md -->

# TABLE_PER_CLASS

## What / Why
Each concrete class has complete columns.

## Mental Model
```text
TABLE_PER_CLASS → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **TABLE_PER_CLASS:** Each concrete class has complete columns.


---

<!-- 169_DISCRIMINATORCOLUMN.md -->

# @DiscriminatorColumn

## What / Why
Identifies subtype in single-table inheritance.

## Mental Model
```text
@DiscriminatorColumn → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@DiscriminatorColumn:** Identifies subtype in single-table inheritance.


---

<!-- 170_DISCRIMINATORVALUE.md -->

# @DiscriminatorValue

## What / Why
Subtype discriminator value.

## Mental Model
```text
@DiscriminatorValue → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@DiscriminatorValue:** Subtype discriminator value.


---

<!-- 171_MAPPEDSUPERCLASS.md -->

# @MappedSuperclass

## What / Why
Shares mappings without being queryable entity.

## Mental Model
```text
@MappedSuperclass → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@MappedSuperclass:** Shares mappings without being queryable entity.


---

<!-- 172_INHERITANCE_TRADEOFF.md -->

# Inheritance Tradeoff

## What / Why
Choose based on polymorphic query frequency, normalization and write/read cost.

## Mental Model
```text
Inheritance Tradeoff → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Inheritance Tradeoff:** Choose based on polymorphic query frequency, normalization and write/read cost.


---

<!-- 173_COMPOSITION_VS_INHERITANCE.md -->

# Composition vs Inheritance

## What / Why
Embeddables/associations may model domain more cleanly than entity inheritance.

## Mental Model
```text
Composition vs Inheritance → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Composition vs Inheritance:** Embeddables/associations may model domain more cleanly than entity inheritance.


---

<!-- 174_FIRST_LEVEL_CACHE.md -->

# First Level Cache

## What / Why
Persistence context caches managed entities by identity.

## Mental Model
```text
First Level Cache → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **First Level Cache:** Persistence context caches managed entities by identity.


---

<!-- 175_ENTITY_IDENTITY_GUARANTEE.md -->

# Entity Identity Guarantee

## What / Why
Repeated find of same identity in same context returns same managed instance.

## Mental Model
```text
Entity Identity Guarantee → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Identity Guarantee:** Repeated find of same identity in same context returns same managed instance.


---

<!-- 176_DIRTY_CHECKING_SNAPSHOT.md -->

# Dirty Checking Snapshot

## What / Why
Provider tracks original state/snapshots or bytecode-enhanced changes.

## Mental Model
```text
Dirty Checking Snapshot → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Dirty Checking Snapshot:** Provider tracks original state/snapshots or bytecode-enhanced changes.


---

<!-- 177_FLUSH_MODES.md -->

# Flush Modes

## What / Why
AUTO and COMMIT are standard JPA flush modes.

## Mental Model
```text
Flush Modes → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flush Modes:** AUTO and COMMIT are standard JPA flush modes.


---

<!-- 178_AUTO_FLUSH.md -->

# AUTO Flush

## What / Why
Provider may flush before queries to preserve query correctness.

## Mental Model
```text
AUTO Flush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **AUTO Flush:** Provider may flush before queries to preserve query correctness.


---

<!-- 179_COMMIT_FLUSH.md -->

# COMMIT Flush

## What / Why
Provider may defer synchronization until commit.

## Mental Model
```text
COMMIT Flush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **COMMIT Flush:** Provider may defer synchronization until commit.


---

<!-- 180_CLEAR_FOR_BATCH.md -->

# Clear for Batch

## What / Why
Clear persistence context periodically during bulk processing to bound memory.

## Mental Model
```text
Clear for Batch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Clear for Batch:** Clear persistence context periodically during bulk processing to bound memory.


---

<!-- 181_FLUSH_FOR_BATCH.md -->

# Flush for Batch

## What / Why
Flush periodically to push batched SQL.

## Mental Model
```text
Flush for Batch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flush for Batch:** Flush periodically to push batched SQL.


---

<!-- 182_STALE_MANAGED_STATE.md -->

# Stale Managed State

## What / Why
Bulk SQL/JPQL updates bypass managed entity state and can make context stale.

## Mental Model
```text
Stale Managed State → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Stale Managed State:** Bulk SQL/JPQL updates bypass managed entity state and can make context stale.


---

<!-- 183_REFRESH_AFTER_EXTERNAL_CHANGE.md -->

# Refresh After External Change

## What / Why
Refresh or clear context after external/bulk updates when necessary.

## Mental Model
```text
Refresh After External Change → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Refresh After External Change:** Refresh or clear context after external/bulk updates when necessary.


---

<!-- 184_PERSISTENCE_CONTEXT_SIZE.md -->

# Persistence Context Size

## What / Why
Large managed graphs consume memory and slow dirty checking.

## Mental Model
```text
Persistence Context Size → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Persistence Context Size:** Large managed graphs consume memory and slow dirty checking.


---

<!-- 185_TRANSACTIONAL.md -->

# @Transactional

## What / Why
Spring transaction boundary around service/repository operations.

## Mental Model
```text
@Transactional → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Transactional:** Spring transaction boundary around service/repository operations.


---

<!-- 186_TRANSACTION_MANAGER.md -->

# Transaction Manager

## What / Why
JpaTransactionManager coordinates EntityManager and JDBC connection for one persistence unit.

## Mental Model
```text
Transaction Manager → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transaction Manager:** JpaTransactionManager coordinates EntityManager and JDBC connection for one persistence unit.


---

<!-- 187_READ_ONLY_TRANSACTION.md -->

# Read Only Transaction

## What / Why
Hint/optimization intent; not a database security guarantee.

## Mental Model
```text
Read Only Transaction → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Read Only Transaction:** Hint/optimization intent; not a database security guarantee.


---

<!-- 188_PROPAGATION_REQUIRED.md -->

# Propagation REQUIRED

## What / Why
Join existing or create new transaction.

## Mental Model
```text
Propagation REQUIRED → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation REQUIRED:** Join existing or create new transaction.


---

<!-- 189_PROPAGATION_REQUIRES_NEW.md -->

# Propagation REQUIRES_NEW

## What / Why
Suspend existing and create independent transaction.

## Mental Model
```text
Propagation REQUIRES_NEW → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation REQUIRES_NEW:** Suspend existing and create independent transaction.


---

<!-- 190_PROPAGATION_SUPPORTS.md -->

# Propagation SUPPORTS

## What / Why
Join if one exists; otherwise nontransactional.

## Mental Model
```text
Propagation SUPPORTS → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation SUPPORTS:** Join if one exists; otherwise nontransactional.


---

<!-- 191_PROPAGATION_MANDATORY.md -->

# Propagation MANDATORY

## What / Why
Require existing transaction.

## Mental Model
```text
Propagation MANDATORY → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation MANDATORY:** Require existing transaction.


---

<!-- 192_PROPAGATION_NEVER.md -->

# Propagation NEVER

## What / Why
Fail if transaction exists.

## Mental Model
```text
Propagation NEVER → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation NEVER:** Fail if transaction exists.


---

<!-- 193_PROPAGATION_NOT_SUPPORTED.md -->

# Propagation NOT_SUPPORTED

## What / Why
Suspend transaction and execute without.

## Mental Model
```text
Propagation NOT_SUPPORTED → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation NOT_SUPPORTED:** Suspend transaction and execute without.


---

<!-- 194_PROPAGATION_NESTED.md -->

# Propagation NESTED

## What / Why
Savepoint semantics when transaction manager/resource supports them.

## Mental Model
```text
Propagation NESTED → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Propagation NESTED:** Savepoint semantics when transaction manager/resource supports them.


---

<!-- 195_ISOLATION.md -->

# Isolation

## What / Why
Database isolation level configured through Spring transaction semantics/provider.

## Mental Model
```text
Isolation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Isolation:** Database isolation level configured through Spring transaction semantics/provider.


---

<!-- 196_ROLLBACK_RULES.md -->

# Rollback Rules

## What / Why
Runtime exceptions roll back by default; customize checked exception behavior.

## Mental Model
```text
Rollback Rules → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Rollback Rules:** Runtime exceptions roll back by default; customize checked exception behavior.


---

<!-- 197_SELF_INVOCATION_TRAP.md -->

# Self Invocation Trap

## What / Why
Proxy-based @Transactional may be bypassed by internal self-call.

## Mental Model
```text
Self Invocation Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Self Invocation Trap:** Proxy-based @Transactional may be bypassed by internal self-call.


---

<!-- 198_TRANSACTION_BOUNDARY_RULE.md -->

# Transaction Boundary Rule

## What / Why
Put transaction around business use case, not each repository call.

## Mental Model
```text
Transaction Boundary Rule → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transaction Boundary Rule:** Put transaction around business use case, not each repository call.


---

<!-- 199_LONG_TRANSACTION.md -->

# Long Transaction

## What / Why
Avoid holding DB transaction across slow remote calls.

## Mental Model
```text
Long Transaction → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Long Transaction:** Avoid holding DB transaction across slow remote calls.


---

<!-- 200_LAZY_LOADING_TRANSACTION.md -->

# Lazy Loading Transaction

## What / Why
Lazy association access generally requires active persistence context.

## Mental Model
```text
Lazy Loading Transaction → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lazy Loading Transaction:** Lazy association access generally requires active persistence context.


---

<!-- 201_TRANSACTIONAL_TESTS.md -->

# Transactional Tests

## What / Why
Spring test transactions may auto-rollback, which can hide commit-time behavior.

## Mental Model
```text
Transactional Tests → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transactional Tests:** Spring test transactions may auto-rollback, which can hide commit-time behavior.


---

<!-- 202_OPTIMISTIC_LOCKING.md -->

# Optimistic Locking

## What / Why
Detect conflicting updates using version column.

## Mental Model
```text
Optimistic Locking → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optimistic Locking:** Detect conflicting updates using version column.


---

<!-- 203_VERSION.md -->

# @Version

## What / Why
Marks optimistic-lock version attribute.

## Mental Model
```text
@Version → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Version:** Marks optimistic-lock version attribute.


---

<!-- 204_OPTIMISTICLOCKEXCEPTION.md -->

# OptimisticLockException

## What / Why
Raised on stale version update.

## Mental Model
```text
OptimisticLockException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **OptimisticLockException:** Raised on stale version update.


---

<!-- 205_OPTIMISTIC_RETRY.md -->

# Optimistic Retry

## What / Why
Reload/retry carefully for idempotent business operations.

## Mental Model
```text
Optimistic Retry → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optimistic Retry:** Reload/retry carefully for idempotent business operations.


---

<!-- 206_PESSIMISTIC_LOCKING.md -->

# Pessimistic Locking

## What / Why
Database lock acquired during transaction.

## Mental Model
```text
Pessimistic Locking → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pessimistic Locking:** Database lock acquired during transaction.


---

<!-- 207_PESSIMISTIC_READ.md -->

# PESSIMISTIC_READ

## What / Why
Shared/read lock where supported.

## Mental Model
```text
PESSIMISTIC_READ → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **PESSIMISTIC_READ:** Shared/read lock where supported.


---

<!-- 208_PESSIMISTIC_WRITE.md -->

# PESSIMISTIC_WRITE

## What / Why
Exclusive/update lock.

## Mental Model
```text
PESSIMISTIC_WRITE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **PESSIMISTIC_WRITE:** Exclusive/update lock.


---

<!-- 209_PESSIMISTIC_FORCE_INCREMENT.md -->

# PESSIMISTIC_FORCE_INCREMENT

## What / Why
Lock plus version increment.

## Mental Model
```text
PESSIMISTIC_FORCE_INCREMENT → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **PESSIMISTIC_FORCE_INCREMENT:** Lock plus version increment.


---

<!-- 210_LOCK.md -->

# @Lock

## What / Why
Spring Data repository method lock mode annotation.

## Mental Model
```text
@Lock → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Lock:** Spring Data repository method lock mode annotation.


---

<!-- 211_LOCK_TIMEOUT.md -->

# Lock Timeout

## What / Why
Provider/database hint bounds lock wait.

## Mental Model
```text
Lock Timeout → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lock Timeout:** Provider/database hint bounds lock wait.


---

<!-- 212_DEADLOCK.md -->

# Deadlock

## What / Why
Competing lock order can cause database deadlock.

## Mental Model
```text
Deadlock → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Deadlock:** Competing lock order can cause database deadlock.


---

<!-- 213_LOST_UPDATE.md -->

# Lost Update

## What / Why
Concurrent writes overwrite each other without version/locking.

## Mental Model
```text
Lost Update → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lost Update:** Concurrent writes overwrite each other without version/locking.


---

<!-- 214_WRITE_SKEW.md -->

# Write Skew

## What / Why
Isolation/business invariants may require stronger locking/checks.

## Mental Model
```text
Write Skew → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Write Skew:** Isolation/business invariants may require stronger locking/checks.


---

<!-- 215_LOCK_SCOPE.md -->

# Lock Scope

## What / Why
Association lock propagation is provider/database dependent.

## Mental Model
```text
Lock Scope → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lock Scope:** Association lock propagation is provider/database dependent.


---

<!-- 216_OPTIMISTIC_VS_PESSIMISTIC.md -->

# Optimistic vs Pessimistic

## What / Why
Prefer optimistic for low contention; pessimistic for short high-contention critical sections.

## Mental Model
```text
Optimistic vs Pessimistic → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optimistic vs Pessimistic:** Prefer optimistic for low contention; pessimistic for short high-contention critical sections.


---

<!-- 217_JPQL_MENTAL_MODEL.md -->

# JPQL Mental Model

## What / Why
Object-oriented query language over entity model rather than tables.

## Mental Model
```text
JPQL Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPQL Mental Model:** Object-oriented query language over entity model rather than tables.


---

<!-- 218_SELECT_JPQL.md -->

# SELECT JPQL

## What / Why
Query entities/attributes/DTOs.

## Mental Model
```text
SELECT JPQL → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SELECT JPQL:** Query entities/attributes/DTOs.


---

<!-- 219_FROM.md -->

# FROM

## What / Why
Entity names and aliases.

## Mental Model
```text
FROM → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **FROM:** Entity names and aliases.


---

<!-- 220_JOIN.md -->

# JOIN

## What / Why
Navigate mapped relationships.

## Mental Model
```text
JOIN → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JOIN:** Navigate mapped relationships.


---

<!-- 221_JOIN_FETCH.md -->

# JOIN FETCH

## What / Why
Fetch association in query.

## Mental Model
```text
JOIN FETCH → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JOIN FETCH:** Fetch association in query.


---

<!-- 222_WHERE.md -->

# WHERE

## What / Why
Predicate over entity attributes.

## Mental Model
```text
WHERE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **WHERE:** Predicate over entity attributes.


---

<!-- 223_GROUP_BY.md -->

# GROUP BY

## What / Why
Aggregate grouping.

## Mental Model
```text
GROUP BY → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **GROUP BY:** Aggregate grouping.


---

<!-- 224_HAVING.md -->

# HAVING

## What / Why
Filter groups.

## Mental Model
```text
HAVING → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **HAVING:** Filter groups.


---

<!-- 225_ORDER_BY.md -->

# ORDER BY

## What / Why
Sort query results.

## Mental Model
```text
ORDER BY → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ORDER BY:** Sort query results.


---

<!-- 226_NAMED_PARAMETER.md -->

# Named Parameter

## What / Why
`:name` parameter binding.

## Mental Model
```text
Named Parameter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Named Parameter:** `:name` parameter binding.


---

<!-- 227_POSITIONAL_PARAMETER.md -->

# Positional Parameter

## What / Why
`?1` positional binding.

## Mental Model
```text
Positional Parameter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Positional Parameter:** `?1` positional binding.


---

<!-- 228_CONSTRUCTOR_EXPRESSION.md -->

# Constructor Expression

## What / Why
`select new ...` DTO construction.

## Mental Model
```text
Constructor Expression → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Constructor Expression:** `select new ...` DTO construction.


---

<!-- 229_SUBQUERY.md -->

# Subquery

## What / Why
Nested query in supported clauses.

## Mental Model
```text
Subquery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Subquery:** Nested query in supported clauses.


---

<!-- 230_CASE.md -->

# CASE

## What / Why
Conditional expression.

## Mental Model
```text
CASE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CASE:** Conditional expression.


---

<!-- 231_COALESCE.md -->

# COALESCE

## What / Why
First non-null expression.

## Mental Model
```text
COALESCE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **COALESCE:** First non-null expression.


---

<!-- 232_NULLIF.md -->

# NULLIF

## What / Why
Returns null when expressions equal.

## Mental Model
```text
NULLIF → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NULLIF:** Returns null when expressions equal.


---

<!-- 233_FUNCTIONS.md -->

# Functions

## What / Why
Standard JPQL functions plus provider extensions.

## Mental Model
```text
Functions → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Functions:** Standard JPQL functions plus provider extensions.


---

<!-- 234_ID_FUNCTION.md -->

# id Function

## What / Why
Jakarta Persistence 3.2 adds `id(...)`.

## Mental Model
```text
id Function → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **id Function:** Jakarta Persistence 3.2 adds `id(...)`.


---

<!-- 235_VERSION_FUNCTION.md -->

# version Function

## What / Why
Jakarta Persistence 3.2 adds `version(...)`.

## Mental Model
```text
version Function → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **version Function:** Jakarta Persistence 3.2 adds `version(...)`.


---

<!-- 236_CAST.md -->

# cast

## What / Why
Jakarta Persistence 3.2 adds cast support.

## Mental Model
```text
cast → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **cast:** Jakarta Persistence 3.2 adds cast support.


---

<!-- 237_UNION_INTERSECT_EXCEPT.md -->

# union intersect except

## What / Why
Jakarta Persistence 3.2 adds set operations.

## Mental Model
```text
union intersect except → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **union intersect except:** Jakarta Persistence 3.2 adds set operations.


---

<!-- 238_NULL_PRECEDENCE.md -->

# Null Precedence

## What / Why
3.2 supports null-first/null-last ordering.

## Mental Model
```text
Null Precedence → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Null Precedence:** 3.2 supports null-first/null-last ordering.


---

<!-- 239_GETSINGLERESULTORNULL.md -->

# getSingleResultOrNull

## What / Why
3.2 provides null-returning single result API.

## Mental Model
```text
getSingleResultOrNull → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **getSingleResultOrNull:** 3.2 provides null-returning single result API.


---

<!-- 240_JPQL_PORTABILITY.md -->

# JPQL Portability

## What / Why
Provider-specific functions/HQL extensions reduce portability.

## Mental Model
```text
JPQL Portability → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPQL Portability:** Provider-specific functions/HQL extensions reduce portability.


---

<!-- 241_CRITERIA_API_MENTAL_MODEL.md -->

# Criteria API Mental Model

## What / Why
Type-safe-ish programmatic query construction using metamodel/expression objects.

## Mental Model
```text
Criteria API Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Criteria API Mental Model:** Type-safe-ish programmatic query construction using metamodel/expression objects.


---

<!-- 242_CRITERIABUILDER.md -->

# CriteriaBuilder

## What / Why
Factory for predicates, expressions and queries.

## Mental Model
```text
CriteriaBuilder → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CriteriaBuilder:** Factory for predicates, expressions and queries.


---

<!-- 243_CRITERIAQUERY.md -->

# CriteriaQuery

## What / Why
Structured select query.

## Mental Model
```text
CriteriaQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CriteriaQuery:** Structured select query.


---

<!-- 244_ROOT.md -->

# Root

## What / Why
Query root entity.

## Mental Model
```text
Root → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Root:** Query root entity.


---

<!-- 245_JOIN.md -->

# Join

## What / Why
Programmatic entity association join.

## Mental Model
```text
Join → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Join:** Programmatic entity association join.


---

<!-- 246_FETCH.md -->

# Fetch

## What / Why
Programmatic fetch join.

## Mental Model
```text
Fetch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch:** Programmatic fetch join.


---

<!-- 247_PREDICATE.md -->

# Predicate

## What / Why
Boolean condition.

## Mental Model
```text
Predicate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Predicate:** Boolean condition.


---

<!-- 248_PATH.md -->

# Path

## What / Why
Navigates entity attributes.

## Mental Model
```text
Path → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Path:** Navigates entity attributes.


---

<!-- 249_PARAMETEREXPRESSION.md -->

# ParameterExpression

## What / Why
Typed query parameter.

## Mental Model
```text
ParameterExpression → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ParameterExpression:** Typed query parameter.


---

<!-- 250_ORDER.md -->

# Order

## What / Why
Criteria ordering.

## Mental Model
```text
Order → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Order:** Criteria ordering.


---

<!-- 251_SUBQUERY_CRITERIA.md -->

# Subquery Criteria

## What / Why
Nested Criteria subquery.

## Mental Model
```text
Subquery Criteria → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Subquery Criteria:** Nested Criteria subquery.


---

<!-- 252_CRITERIAUPDATE.md -->

# CriteriaUpdate

## What / Why
Bulk update query.

## Mental Model
```text
CriteriaUpdate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CriteriaUpdate:** Bulk update query.


---

<!-- 253_CRITERIADELETE.md -->

# CriteriaDelete

## What / Why
Bulk delete query.

## Mental Model
```text
CriteriaDelete → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CriteriaDelete:** Bulk delete query.


---

<!-- 254_CRITERIASELECT_3_2.md -->

# CriteriaSelect 3.2

## What / Why
Jakarta Persistence 3.2 adds common select criteria abstractions.

## Mental Model
```text
CriteriaSelect 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CriteriaSelect 3.2:** Jakarta Persistence 3.2 adds common select criteria abstractions.


---

<!-- 255_ENTITYTYPE_JOIN_3_2.md -->

# EntityType Join 3.2

## What / Why
3.2 expands criteria joins involving EntityType.

## Mental Model
```text
EntityType Join 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityType Join 3.2:** 3.2 expands criteria joins involving EntityType.


---

<!-- 256_STATIC_METAMODEL.md -->

# Static Metamodel

## What / Why
Generated `_` metamodel classes improve attribute refactoring safety.

## Mental Model
```text
Static Metamodel → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Static Metamodel:** Generated `_` metamodel classes improve attribute refactoring safety.


---

<!-- 257_CRITERIA_TRADEOFF.md -->

# Criteria Tradeoff

## What / Why
Verbose but useful for dynamic optional filters/specification frameworks.

## Mental Model
```text
Criteria Tradeoff → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Criteria Tradeoff:** Verbose but useful for dynamic optional filters/specification frameworks.


---

<!-- 258_NATIVE_QUERY.md -->

# Native Query

## What / Why
Execute database SQL directly through EntityManager/repository.

## Mental Model
```text
Native Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Native Query:** Execute database SQL directly through EntityManager/repository.


---

<!-- 259_QUERY_NATIVEQUERY.md -->

# @Query nativeQuery

## What / Why
Spring Data JPA native query declaration.

## Mental Model
```text
@Query nativeQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Query nativeQuery:** Spring Data JPA native query declaration.


---

<!-- 260_NATIVEQUERY.md -->

# @NativeQuery

## What / Why
Spring Data JPA convenience annotation for native SQL features.

## Mental Model
```text
@NativeQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@NativeQuery:** Spring Data JPA convenience annotation for native SQL features.


---

<!-- 261_NATIVE_PROJECTION.md -->

# Native Projection

## What / Why
Map native query results to interfaces/DTOs/result mappings.

## Mental Model
```text
Native Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Native Projection:** Map native query results to interfaces/DTOs/result mappings.


---

<!-- 262_SQLRESULTSETMAPPING.md -->

# @SqlResultSetMapping

## What / Why
Defines mapping from native SQL result to entities/DTO constructor.

## Mental Model
```text
@SqlResultSetMapping → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@SqlResultSetMapping:** Defines mapping from native SQL result to entities/DTO constructor.


---

<!-- 263_NAMEDNATIVEQUERY.md -->

# @NamedNativeQuery

## What / Why
Reusable named native SQL query.

## Mental Model
```text
@NamedNativeQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@NamedNativeQuery:** Reusable named native SQL query.


---

<!-- 264_NAMEDNATIVEQUERY_3_2.md -->

# NamedNativeQuery 3.2

## What / Why
Jakarta Persistence 3.2 expands metadata options such as entities/classes/columns.

## Mental Model
```text
NamedNativeQuery 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NamedNativeQuery 3.2:** Jakarta Persistence 3.2 expands metadata options such as entities/classes/columns.


---

<!-- 265_NATIVE_PAGINATION.md -->

# Native Pagination

## What / Why
Count query may need explicit declaration/rewrite.

## Mental Model
```text
Native Pagination → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Native Pagination:** Count query may need explicit declaration/rewrite.


---

<!-- 266_DATABASE_SPECIFIC_SQL.md -->

# Database Specific SQL

## What / Why
Native query intentionally trades portability for DB features/performance.

## Mental Model
```text
Database Specific SQL → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Database Specific SQL:** Native query intentionally trades portability for DB features/performance.


---

<!-- 267_NATIVE_QUERY_STALENESS.md -->

# Native Query Staleness

## What / Why
Bulk/native modifications can bypass persistence-context state.

## Mental Model
```text
Native Query Staleness → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Native Query Staleness:** Bulk/native modifications can bypass persistence-context state.


---

<!-- 268_REPOSITORY.md -->

# Repository

## What / Why
Marker root interface.

## Mental Model
```text
Repository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository:** Marker root interface.


---

<!-- 269_CRUDREPOSITORY.md -->

# CrudRepository

## What / Why
Basic CRUD operations.

## Mental Model
```text
CrudRepository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CrudRepository:** Basic CRUD operations.


---

<!-- 270_LISTCRUDREPOSITORY.md -->

# ListCrudRepository

## What / Why
CRUD returning List for multi-row methods.

## Mental Model
```text
ListCrudRepository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ListCrudRepository:** CRUD returning List for multi-row methods.


---

<!-- 271_PAGINGANDSORTINGREPOSITORY.md -->

# PagingAndSortingRepository

## What / Why
Pagination/sorting contract.

## Mental Model
```text
PagingAndSortingRepository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **PagingAndSortingRepository:** Pagination/sorting contract.


---

<!-- 272_JPAREPOSITORY.md -->

# JpaRepository

## What / Why
JPA-specific repository combining CRUD/paging plus flush/batch methods.

## Mental Model
```text
JpaRepository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JpaRepository:** JPA-specific repository combining CRUD/paging plus flush/batch methods.


---

<!-- 273_REPOSITORY_PROXY.md -->

# Repository Proxy

## What / Why
Spring Data creates runtime proxy implementing repository interface.

## Mental Model
```text
Repository Proxy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Proxy:** Spring Data creates runtime proxy implementing repository interface.


---

<!-- 274_REPOSITORY_FACTORY.md -->

# Repository Factory

## What / Why
Infrastructure creates repository proxy and query methods.

## Mental Model
```text
Repository Factory → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Factory:** Infrastructure creates repository proxy and query methods.


---

<!-- 275_ENABLEJPAREPOSITORIES.md -->

# @EnableJpaRepositories

## What / Why
Explicitly enables repository scanning/configuration.

## Mental Model
```text
@EnableJpaRepositories → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@EnableJpaRepositories:** Explicitly enables repository scanning/configuration.


---

<!-- 276_BOOT_REPOSITORY_AUTO_CONFIG.md -->

# Boot Repository Auto Config

## What / Why
Spring Boot auto-configures repositories when JPA infrastructure present.

## Mental Model
```text
Boot Repository Auto Config → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Boot Repository Auto Config:** Spring Boot auto-configures repositories when JPA infrastructure present.


---

<!-- 277_BASE_PACKAGE_SCANNING.md -->

# Base Package Scanning

## What / Why
Repository/entity package placement affects discovery.

## Mental Model
```text
Base Package Scanning → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Base Package Scanning:** Repository/entity package placement affects discovery.


---

<!-- 278_REPOSITORY_COMPOSITION.md -->

# Repository Composition

## What / Why
Repository interface combines fragments/aspects.

## Mental Model
```text
Repository Composition → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Composition:** Repository interface combines fragments/aspects.


---

<!-- 279_REPOSITORY_METHOD_METADATA.md -->

# Repository Method Metadata

## What / Why
Metadata about domain type/method influences query execution.

## Mental Model
```text
Repository Method Metadata → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Method Metadata:** Metadata about domain type/method influences query execution.


---

<!-- 280_SAVE.md -->

# save

## What / Why
Persists new or merges existing entity depending new-detection strategy.

## Mental Model
```text
save → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **save:** Persists new or merges existing entity depending new-detection strategy.


---

<!-- 281_SAVEALL.md -->

# saveAll

## What / Why
Processes multiple entities; batching depends provider/config.

## Mental Model
```text
saveAll → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **saveAll:** Processes multiple entities; batching depends provider/config.


---

<!-- 282_SAVEANDFLUSH.md -->

# saveAndFlush

## What / Why
Saves then flushes immediately.

## Mental Model
```text
saveAndFlush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **saveAndFlush:** Saves then flushes immediately.


---

<!-- 283_FLUSH.md -->

# flush

## What / Why
Forces persistence context synchronization.

## Mental Model
```text
flush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **flush:** Forces persistence context synchronization.


---

<!-- 284_DELETE.md -->

# delete

## What / Why
Removes entity.

## Mental Model
```text
delete → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **delete:** Removes entity.


---

<!-- 285_DELETEBYID.md -->

# deleteById

## What / Why
Deletes by identity.

## Mental Model
```text
deleteById → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **deleteById:** Deletes by identity.


---

<!-- 286_DELETEALL.md -->

# deleteAll

## What / Why
Deletes all entities, potentially entity-by-entity.

## Mental Model
```text
deleteAll → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **deleteAll:** Deletes all entities, potentially entity-by-entity.


---

<!-- 287_DELETEALLINBATCH.md -->

# deleteAllInBatch

## What / Why
Bulk deletion using query; bypasses entity lifecycle/cascades in important ways.

## Mental Model
```text
deleteAllInBatch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **deleteAllInBatch:** Bulk deletion using query; bypasses entity lifecycle/cascades in important ways.


---

<!-- 288_DELETEALLBYIDINBATCH.md -->

# deleteAllByIdInBatch

## What / Why
Bulk delete by IDs.

## Mental Model
```text
deleteAllByIdInBatch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **deleteAllByIdInBatch:** Bulk delete by IDs.


---

<!-- 289_NEW_ENTITY_DETECTION.md -->

# New Entity Detection

## What / Why
Spring Data decides persist vs merge using version/id/Persistable strategy.

## Mental Model
```text
New Entity Detection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **New Entity Detection:** Spring Data decides persist vs merge using version/id/Persistable strategy.


---

<!-- 290_PERSISTABLE_ISNEW.md -->

# Persistable isNew

## What / Why
Domain type can implement Persistable to customize new detection.

## Mental Model
```text
Persistable isNew → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Persistable isNew:** Domain type can implement Persistable to customize new detection.


---

<!-- 291_SAVE_TRAP.md -->

# save Trap

## What / Why
Calling save on already managed entity is usually unnecessary.

## Mental Model
```text
save Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **save Trap:** Calling save on already managed entity is usually unnecessary.


---

<!-- 292_MERGE_TRAP.md -->

# Merge Trap

## What / Why
save on detached entity returns managed merged instance; passed instance remains detached.

## Mental Model
```text
Merge Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Merge Trap:** save on detached entity returns managed merged instance; passed instance remains detached.


---

<!-- 293_QUERY_DERIVATION.md -->

# Query Derivation

## What / Why
Spring Data parses repository method name into query.

## Mental Model
```text
Query Derivation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Query Derivation:** Spring Data parses repository method name into query.


---

<!-- 294_FINDBY.md -->

# findBy

## What / Why
Basic derived query prefix.

## Mental Model
```text
findBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **findBy:** Basic derived query prefix.


---

<!-- 295_READBY_GETBY_QUERYBY_SEARCHBY.md -->

# readBy getBy queryBy searchBy

## What / Why
Supported query prefixes/aliases.

## Mental Model
```text
readBy getBy queryBy searchBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **readBy getBy queryBy searchBy:** Supported query prefixes/aliases.


---

<!-- 296_COUNTBY.md -->

# countBy

## What / Why
Derived count query.

## Mental Model
```text
countBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **countBy:** Derived count query.


---

<!-- 297_EXISTSBY.md -->

# existsBy

## What / Why
Derived existence query.

## Mental Model
```text
existsBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **existsBy:** Derived existence query.


---

<!-- 298_DELETEBY_REMOVEBY.md -->

# deleteBy removeBy

## What / Why
Derived delete query.

## Mental Model
```text
deleteBy removeBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **deleteBy removeBy:** Derived delete query.


---

<!-- 299_AND_OR.md -->

# And Or

## What / Why
Combine predicates in method name.

## Mental Model
```text
And Or → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **And Or:** Combine predicates in method name.


---

<!-- 300_BETWEEN.md -->

# Between

## What / Why
Range query keyword.

## Mental Model
```text
Between → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Between:** Range query keyword.


---

<!-- 301_LESSTHAN_GREATERTHAN.md -->

# LessThan GreaterThan

## What / Why
Comparison keywords.

## Mental Model
```text
LessThan GreaterThan → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **LessThan GreaterThan:** Comparison keywords.


---

<!-- 302_LIKE_STARTINGWITH_ENDINGWITH_CONTAINING.md -->

# Like StartingWith EndingWith Containing

## What / Why
String pattern keywords.

## Mental Model
```text
Like StartingWith EndingWith Containing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Like StartingWith EndingWith Containing:** String pattern keywords.


---

<!-- 303_IN_NOTIN.md -->

# In NotIn

## What / Why
Collection membership.

## Mental Model
```text
In NotIn → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **In NotIn:** Collection membership.


---

<!-- 304_ISNULL_ISNOTNULL.md -->

# IsNull IsNotNull

## What / Why
Null checks.

## Mental Model
```text
IsNull IsNotNull → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **IsNull IsNotNull:** Null checks.


---

<!-- 305_TRUE_FALSE.md -->

# True False

## What / Why
Boolean predicates.

## Mental Model
```text
True False → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **True False:** Boolean predicates.


---

<!-- 306_IGNORECASE.md -->

# IgnoreCase

## What / Why
Case-insensitive string matching.

## Mental Model
```text
IgnoreCase → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **IgnoreCase:** Case-insensitive string matching.


---

<!-- 307_ORDERBY.md -->

# OrderBy

## What / Why
Static ordering in method name.

## Mental Model
```text
OrderBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **OrderBy:** Static ordering in method name.


---

<!-- 308_TOP_FIRST.md -->

# Top First

## What / Why
Limit result count.

## Mental Model
```text
Top First → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Top First:** Limit result count.


---

<!-- 309_DISTINCT.md -->

# Distinct

## What / Why
Distinct result semantics.

## Mental Model
```text
Distinct → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Distinct:** Distinct result semantics.


---

<!-- 310_NESTED_PROPERTY_TRAVERSAL.md -->

# Nested Property Traversal

## What / Why
Method names can navigate nested mapped properties.

## Mental Model
```text
Nested Property Traversal → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Nested Property Traversal:** Method names can navigate nested mapped properties.


---

<!-- 311_UNDERSCORE_DISAMBIGUATION.md -->

# Underscore Disambiguation

## What / Why
Use underscore to resolve ambiguous nested property parsing.

## Mental Model
```text
Underscore Disambiguation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Underscore Disambiguation:** Use underscore to resolve ambiguous nested property parsing.


---

<!-- 312_DERIVED_QUERY_COMPLEXITY_TRAP.md -->

# Derived Query Complexity Trap

## What / Why
Very long method names become unreadable; switch to @Query/Specification.

## Mental Model
```text
Derived Query Complexity Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Derived Query Complexity Trap:** Very long method names become unreadable; switch to @Query/Specification.


---

<!-- 313_QUERY.md -->

# @Query

## What / Why
Declares JPQL or native query on repository method.

## Mental Model
```text
@Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Query:** Declares JPQL or native query on repository method.


---

<!-- 314_NAMEDQUERY.md -->

# NamedQuery

## What / Why
Entity-level named JPQL query.

## Mental Model
```text
NamedQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NamedQuery:** Entity-level named JPQL query.


---

<!-- 315_NAMEDNATIVEQUERY.md -->

# NamedNativeQuery

## What / Why
Entity-level named SQL query.

## Mental Model
```text
NamedNativeQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NamedNativeQuery:** Entity-level named SQL query.


---

<!-- 316_QUERY_LOOKUP_STRATEGY.md -->

# Query Lookup Strategy

## What / Why
CREATE, USE_DECLARED_QUERY, CREATE_IF_NOT_FOUND.

## Mental Model
```text
Query Lookup Strategy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Query Lookup Strategy:** CREATE, USE_DECLARED_QUERY, CREATE_IF_NOT_FOUND.


---

<!-- 317_PARAMETER_BINDING.md -->

# Parameter Binding

## What / Why
Bind method args by name/position.

## Mental Model
```text
Parameter Binding → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Parameter Binding:** Bind method args by name/position.


---

<!-- 318_PARAM.md -->

# @Param

## What / Why
Explicit named parameter binding.

## Mental Model
```text
@Param → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Param:** Explicit named parameter binding.


---

<!-- 319_SPEL_IN_QUERY.md -->

# SpEL in @Query

## What / Why
Spring Expression Language can provide entity/user/context values where supported.

## Mental Model
```text
SpEL in @Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SpEL in @Query:** Spring Expression Language can provide entity/user/context values where supported.


---

<!-- 320_ENTITYNAME_SPEL.md -->

# entityName SpEL

## What / Why
`#{#entityName}` supports generic repository queries.

## Mental Model
```text
entityName SpEL → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **entityName SpEL:** `#{#entityName}` supports generic repository queries.


---

<!-- 321_MODIFYING_QUERY.md -->

# Modifying Query

## What / Why
@Modifying marks update/delete query.

## Mental Model
```text
Modifying Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Modifying Query:** @Modifying marks update/delete query.


---

<!-- 322_MODIFYING_CLEARAUTOMATICALLY.md -->

# @Modifying clearAutomatically

## What / Why
Optionally clears persistence context after bulk modification.

## Mental Model
```text
@Modifying clearAutomatically → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Modifying clearAutomatically:** Optionally clears persistence context after bulk modification.


---

<!-- 323_MODIFYING_FLUSHAUTOMATICALLY.md -->

# @Modifying flushAutomatically

## What / Why
Optionally flushes before modifying query.

## Mental Model
```text
@Modifying flushAutomatically → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Modifying flushAutomatically:** Optionally flushes before modifying query.


---

<!-- 324_BULK_UPDATE_TRAP.md -->

# Bulk Update Trap

## What / Why
Bulk JPQL skips entity callbacks/dirty checking and can stale managed state.

## Mental Model
```text
Bulk Update Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Bulk Update Trap:** Bulk JPQL skips entity callbacks/dirty checking and can stale managed state.


---

<!-- 325_QUERY_VALIDATION.md -->

# Query Validation

## What / Why
Declared JPQL is often validated at startup depending provider/repository initialization.

## Mental Model
```text
Query Validation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Query Validation:** Declared JPQL is often validated at startup depending provider/repository initialization.


---

<!-- 326_SPECIFICATION_MENTAL_MODEL.md -->

# Specification Mental Model

## What / Why
Composable Criteria predicates for dynamic query construction.

## Mental Model
```text
Specification Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification Mental Model:** Composable Criteria predicates for dynamic query construction.


---

<!-- 327_JPASPECIFICATIONEXECUTOR.md -->

# JpaSpecificationExecutor

## What / Why
Repository support for Specification queries.

## Mental Model
```text
JpaSpecificationExecutor → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JpaSpecificationExecutor:** Repository support for Specification queries.


---

<!-- 328_SPECIFICATION_TOPREDICATE.md -->

# Specification toPredicate

## What / Why
Builds Predicate from Root, CriteriaQuery and CriteriaBuilder.

## Mental Model
```text
Specification toPredicate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification toPredicate:** Builds Predicate from Root, CriteriaQuery and CriteriaBuilder.


---

<!-- 329_AND_SPECIFICATION.md -->

# and Specification

## What / Why
Logical conjunction.

## Mental Model
```text
and Specification → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **and Specification:** Logical conjunction.


---

<!-- 330_OR_SPECIFICATION.md -->

# or Specification

## What / Why
Logical disjunction.

## Mental Model
```text
or Specification → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **or Specification:** Logical disjunction.


---

<!-- 331_NOT_SPECIFICATION.md -->

# not Specification

## What / Why
Negates specification.

## Mental Model
```text
not Specification → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **not Specification:** Negates specification.


---

<!-- 332_ALLOF_ANYOF.md -->

# allOf anyOf

## What / Why
Compose many specifications.

## Mental Model
```text
allOf anyOf → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **allOf anyOf:** Compose many specifications.


---

<!-- 333_UNRESTRICTED_SPECIFICATION.md -->

# Unrestricted Specification

## What / Why
Spring Data supports neutral/no-op specification semantics.

## Mental Model
```text
Unrestricted Specification → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Unrestricted Specification:** Spring Data supports neutral/no-op specification semantics.


---

<!-- 334_SPECIFICATION_REUSE.md -->

# Specification Reuse

## What / Why
Encapsulate domain query rules.

## Mental Model
```text
Specification Reuse → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification Reuse:** Encapsulate domain query rules.


---

<!-- 335_SPECIFICATION_PAGINATION.md -->

# Specification Pagination

## What / Why
Combine dynamic filters with Pageable.

## Mental Model
```text
Specification Pagination → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification Pagination:** Combine dynamic filters with Pageable.


---

<!-- 336_SPECIFICATION_PROJECTION.md -->

# Specification Projection

## What / Why
Fluent query APIs can combine specs with projection in modern Spring Data.

## Mental Model
```text
Specification Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification Projection:** Fluent query APIs can combine specs with projection in modern Spring Data.


---

<!-- 337_SPECIFICATION_COUNT_QUERY.md -->

# Specification Count Query

## What / Why
Complex joins may require optimized count specification.

## Mental Model
```text
Specification Count Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification Count Query:** Complex joins may require optimized count specification.


---

<!-- 338_SPECIFICATION_FETCH_JOIN_TRAP.md -->

# Specification Fetch Join Trap

## What / Why
Fetch manipulation inside Specification can complicate count queries.

## Mental Model
```text
Specification Fetch Join Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification Fetch Join Trap:** Fetch manipulation inside Specification can complicate count queries.


---

<!-- 339_QBE_MENTAL_MODEL.md -->

# QBE Mental Model

## What / Why
Build query from example entity plus matching rules.

## Mental Model
```text
QBE Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **QBE Mental Model:** Build query from example entity plus matching rules.


---

<!-- 340_EXAMPLE.md -->

# Example

## What / Why
Probe object + ExampleMatcher.

## Mental Model
```text
Example → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Example:** Probe object + ExampleMatcher.


---

<!-- 341_EXAMPLEMATCHER.md -->

# ExampleMatcher

## What / Why
Controls string/null/property matching.

## Mental Model
```text
ExampleMatcher → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ExampleMatcher:** Controls string/null/property matching.


---

<!-- 342_IGNORE_PATHS.md -->

# Ignore Paths

## What / Why
Exclude probe fields.

## Mental Model
```text
Ignore Paths → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Ignore Paths:** Exclude probe fields.


---

<!-- 343_STRINGMATCHER.md -->

# StringMatcher

## What / Why
Exact/starting/ending/containing/regex-like provider behavior where supported.

## Mental Model
```text
StringMatcher → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **StringMatcher:** Exact/starting/ending/containing/regex-like provider behavior where supported.


---

<!-- 344_NULL_HANDLING.md -->

# Null Handling

## What / Why
Include or ignore null probe values.

## Mental Model
```text
Null Handling → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Null Handling:** Include or ignore null probe values.


---

<!-- 345_QBE_LIMITS.md -->

# QBE Limits

## What / Why
No grouped boolean logic or complex joins; use Specification/Querydsl for advanced queries.

## Mental Model
```text
QBE Limits → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **QBE Limits:** No grouped boolean logic or complex joins; use Specification/Querydsl for advanced queries.


---

<!-- 346_PROJECTION_MENTAL_MODEL.md -->

# Projection Mental Model

## What / Why
Return only required fields instead of full entity graph.

## Mental Model
```text
Projection Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Projection Mental Model:** Return only required fields instead of full entity graph.


---

<!-- 347_INTERFACE_PROJECTION.md -->

# Interface Projection

## What / Why
Spring Data maps selected properties into interface.

## Mental Model
```text
Interface Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Interface Projection:** Spring Data maps selected properties into interface.


---

<!-- 348_CLOSED_PROJECTION.md -->

# Closed Projection

## What / Why
Accessor names map directly to entity properties.

## Mental Model
```text
Closed Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Closed Projection:** Accessor names map directly to entity properties.


---

<!-- 349_OPEN_PROJECTION.md -->

# Open Projection

## What / Why
SpEL-computed properties may force broader entity loading.

## Mental Model
```text
Open Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Open Projection:** SpEL-computed properties may force broader entity loading.


---

<!-- 350_NESTED_PROJECTION.md -->

# Nested Projection

## What / Why
Projection can expose nested property projections.

## Mental Model
```text
Nested Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Nested Projection:** Projection can expose nested property projections.


---

<!-- 351_CLASS_BASED_PROJECTION.md -->

# Class Based Projection

## What / Why
DTO class/record constructor projection.

## Mental Model
```text
Class Based Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Class Based Projection:** DTO class/record constructor projection.


---

<!-- 352_RECORD_PROJECTION.md -->

# Record Projection

## What / Why
Java records fit immutable DTO projection.

## Mental Model
```text
Record Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Record Projection:** Java records fit immutable DTO projection.


---

<!-- 353_DYNAMIC_PROJECTION.md -->

# Dynamic Projection

## What / Why
Repository method accepts projection class parameter.

## Mental Model
```text
Dynamic Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Dynamic Projection:** Repository method accepts projection class parameter.


---

<!-- 354_PROJECTION_CONSTRUCTOR.md -->

# Projection Constructor

## What / Why
Single constructor or @PersistenceCreator guides mapping.

## Mental Model
```text
Projection Constructor → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Projection Constructor:** Single constructor or @PersistenceCreator guides mapping.


---

<!-- 355_NULLABLE_WRAPPER.md -->

# Nullable Wrapper

## What / Why
Projection accessors can use Optional-like wrappers.

## Mental Model
```text
Nullable Wrapper → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Nullable Wrapper:** Projection accessors can use Optional-like wrappers.


---

<!-- 356_PROJECTION_PERFORMANCE.md -->

# Projection Performance

## What / Why
Interface/DTO projection can reduce selected columns and entity management overhead.

## Mental Model
```text
Projection Performance → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Projection Performance:** Interface/DTO projection can reduce selected columns and entity management overhead.


---

<!-- 357_PROJECTION_TRAP.md -->

# Projection Trap

## What / Why
Nested joins may still materialize full joined structures depending query/provider.

## Mental Model
```text
Projection Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Projection Trap:** Nested joins may still materialize full joined structures depending query/provider.


---

<!-- 358_PAGEABLE.md -->

# Pageable

## What / Why
Page number/size/sort request abstraction.

## Mental Model
```text
Pageable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pageable:** Page number/size/sort request abstraction.


---

<!-- 359_PAGE.md -->

# Page

## What / Why
Content + total count + pages metadata.

## Mental Model
```text
Page → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Page:** Content + total count + pages metadata.


---

<!-- 360_SLICE.md -->

# Slice

## What / Why
Content + whether next slice exists, without full total count.

## Mental Model
```text
Slice → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Slice:** Content + whether next slice exists, without full total count.


---

<!-- 361_WINDOW.md -->

# Window

## What / Why
Window-based scrolling result abstraction.

## Mental Model
```text
Window → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Window:** Window-based scrolling result abstraction.


---

<!-- 362_SORT.md -->

# Sort

## What / Why
Sort orders by property.

## Mental Model
```text
Sort → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Sort:** Sort orders by property.


---

<!-- 363_TYPEDSORT.md -->

# TypedSort

## What / Why
Type-oriented sort builder.

## Mental Model
```text
TypedSort → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **TypedSort:** Type-oriented sort builder.


---

<!-- 364_PAGE_COUNT_COST.md -->

# Page Count Cost

## What / Why
Page may execute count query; expensive on complex datasets.

## Mental Model
```text
Page Count Cost → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Page Count Cost:** Page may execute count query; expensive on complex datasets.


---

<!-- 365_SLICE_PERFORMANCE.md -->

# Slice Performance

## What / Why
Avoids count query when total not required.

## Mental Model
```text
Slice Performance → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Slice Performance:** Avoids count query when total not required.


---

<!-- 366_OFFSET_PAGINATION.md -->

# Offset Pagination

## What / Why
LIMIT/OFFSET style pagination.

## Mental Model
```text
Offset Pagination → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Offset Pagination:** LIMIT/OFFSET style pagination.


---

<!-- 367_KEYSET_PAGINATION.md -->

# Keyset Pagination

## What / Why
Seek pagination using last-seen keys for scalable deep navigation.

## Mental Model
```text
Keyset Pagination → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Keyset Pagination:** Seek pagination using last-seen keys for scalable deep navigation.


---

<!-- 368_SCROLLPOSITION.md -->

# ScrollPosition

## What / Why
Represents scrolling position.

## Mental Model
```text
ScrollPosition → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ScrollPosition:** Represents scrolling position.


---

<!-- 369_OFFSETSCROLLPOSITION.md -->

# OffsetScrollPosition

## What / Why
Offset-based scroll position.

## Mental Model
```text
OffsetScrollPosition → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **OffsetScrollPosition:** Offset-based scroll position.


---

<!-- 370_KEYSETSCROLLPOSITION.md -->

# KeysetScrollPosition

## What / Why
Keyset-based scroll state.

## Mental Model
```text
KeysetScrollPosition → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **KeysetScrollPosition:** Keyset-based scroll state.


---

<!-- 371_WINDOWITERATOR.md -->

# WindowIterator

## What / Why
Iterates through Window results.

## Mental Model
```text
WindowIterator → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **WindowIterator:** Iterates through Window results.


---

<!-- 372_STABLE_SORT.md -->

# Stable Sort

## What / Why
Keyset pagination requires deterministic unique sort.

## Mental Model
```text
Stable Sort → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Stable Sort:** Keyset pagination requires deterministic unique sort.


---

<!-- 373_PAGINATION_FETCH_JOIN_TRAP.md -->

# Pagination Fetch Join Trap

## What / Why
To-many fetch joins distort rows/count/pagination.

## Mental Model
```text
Pagination Fetch Join Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pagination Fetch Join Trap:** To-many fetch joins distort rows/count/pagination.


---

<!-- 374_SPRING_DATA_AUDITING.md -->

# Spring Data Auditing

## What / Why
Automatically populates created/modified user/time fields.

## Mental Model
```text
Spring Data Auditing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Spring Data Auditing:** Automatically populates created/modified user/time fields.


---

<!-- 375_CREATEDDATE.md -->

# @CreatedDate

## What / Why
Creation timestamp.

## Mental Model
```text
@CreatedDate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@CreatedDate:** Creation timestamp.


---

<!-- 376_LASTMODIFIEDDATE.md -->

# @LastModifiedDate

## What / Why
Last modification timestamp.

## Mental Model
```text
@LastModifiedDate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@LastModifiedDate:** Last modification timestamp.


---

<!-- 377_CREATEDBY.md -->

# @CreatedBy

## What / Why
Creating principal.

## Mental Model
```text
@CreatedBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@CreatedBy:** Creating principal.


---

<!-- 378_LASTMODIFIEDBY.md -->

# @LastModifiedBy

## What / Why
Last modifying principal.

## Mental Model
```text
@LastModifiedBy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@LastModifiedBy:** Last modifying principal.


---

<!-- 379_ENABLEJPAAUDITING.md -->

# @EnableJpaAuditing

## What / Why
Enables repository auditing infrastructure.

## Mental Model
```text
@EnableJpaAuditing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@EnableJpaAuditing:** Enables repository auditing infrastructure.


---

<!-- 380_AUDITORAWARE.md -->

# AuditorAware

## What / Why
Supplies current auditor/principal.

## Mental Model
```text
AuditorAware → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **AuditorAware:** Supplies current auditor/principal.


---

<!-- 381_DATETIMEPROVIDER.md -->

# DateTimeProvider

## What / Why
Custom clock/time source.

## Mental Model
```text
DateTimeProvider → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **DateTimeProvider:** Custom clock/time source.


---

<!-- 382_AUDITINGENTITYLISTENER.md -->

# AuditingEntityListener

## What / Why
Entity listener applying audit values.

## Mental Model
```text
AuditingEntityListener → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **AuditingEntityListener:** Entity listener applying audit values.


---

<!-- 383_EMBEDDED_AUDIT_METADATA.md -->

# Embedded Audit Metadata

## What / Why
Audit fields can live in embeddable object.

## Mental Model
```text
Embedded Audit Metadata → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Embedded Audit Metadata:** Audit fields can live in embeddable object.


---

<!-- 384_AUDITING_VS_ENVERS.md -->

# Auditing vs Envers

## What / Why
Spring Data auditing stores current metadata; Envers stores historical revisions.

## Mental Model
```text
Auditing vs Envers → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Auditing vs Envers:** Spring Data auditing stores current metadata; Envers stores historical revisions.


---

<!-- 385_PREPERSIST.md -->

# @PrePersist

## What / Why
Callback before insert.

## Mental Model
```text
@PrePersist → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PrePersist:** Callback before insert.


---

<!-- 386_POSTPERSIST.md -->

# @PostPersist

## What / Why
Callback after insert.

## Mental Model
```text
@PostPersist → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PostPersist:** Callback after insert.


---

<!-- 387_PREUPDATE.md -->

# @PreUpdate

## What / Why
Callback before update.

## Mental Model
```text
@PreUpdate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PreUpdate:** Callback before update.


---

<!-- 388_POSTUPDATE.md -->

# @PostUpdate

## What / Why
Callback after update.

## Mental Model
```text
@PostUpdate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PostUpdate:** Callback after update.


---

<!-- 389_PREREMOVE.md -->

# @PreRemove

## What / Why
Callback before delete.

## Mental Model
```text
@PreRemove → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PreRemove:** Callback before delete.


---

<!-- 390_POSTREMOVE.md -->

# @PostRemove

## What / Why
Callback after delete.

## Mental Model
```text
@PostRemove → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PostRemove:** Callback after delete.


---

<!-- 391_POSTLOAD.md -->

# @PostLoad

## What / Why
Callback after entity load.

## Mental Model
```text
@PostLoad → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@PostLoad:** Callback after entity load.


---

<!-- 392_ENTITYLISTENERS.md -->

# @EntityListeners

## What / Why
Registers listener class.

## Mental Model
```text
@EntityListeners → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@EntityListeners:** Registers listener class.


---

<!-- 393_LIFECYCLE_CALLBACK_TRAP.md -->

# Lifecycle Callback Trap

## What / Why
Avoid heavy I/O/business workflows inside entity callbacks.

## Mental Model
```text
Lifecycle Callback Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lifecycle Callback Trap:** Avoid heavy I/O/business workflows inside entity callbacks.


---

<!-- 394_DOMAIN_EVENT_ALTERNATIVE.md -->

# Domain Event Alternative

## What / Why
Use transactional events/outbox instead of hidden entity callback side effects.

## Mental Model
```text
Domain Event Alternative → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Domain Event Alternative:** Use transactional events/outbox instead of hidden entity callback side effects.


---

<!-- 395_DOMAINEVENTS.md -->

# @DomainEvents

## What / Why
Exposes domain events from aggregate root.

## Mental Model
```text
@DomainEvents → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@DomainEvents:** Exposes domain events from aggregate root.


---

<!-- 396_AFTERDOMAINEVENTPUBLICATION.md -->

# @AfterDomainEventPublication

## What / Why
Callback after events are published.

## Mental Model
```text
@AfterDomainEventPublication → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@AfterDomainEventPublication:** Callback after events are published.


---

<!-- 397_ABSTRACTAGGREGATEROOT.md -->

# AbstractAggregateRoot

## What / Why
Convenience base class for domain event registration.

## Mental Model
```text
AbstractAggregateRoot → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **AbstractAggregateRoot:** Convenience base class for domain event registration.


---

<!-- 398_REPOSITORY_EVENT_PUBLICATION.md -->

# Repository Event Publication

## What / Why
Events are published around repository save/delete lifecycle.

## Mental Model
```text
Repository Event Publication → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Event Publication:** Events are published around repository save/delete lifecycle.


---

<!-- 399_DOMAIN_EVENT_TRANSACTION_CAVEAT.md -->

# Domain Event Transaction Caveat

## What / Why
ApplicationEvent publication is not automatically durable integration messaging.

## Mental Model
```text
Domain Event Transaction Caveat → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Domain Event Transaction Caveat:** ApplicationEvent publication is not automatically durable integration messaging.


---

<!-- 400_OUTBOX_FOR_INTEGRATION_EVENTS.md -->

# Outbox for Integration Events

## What / Why
Persist outbox in same DB transaction for reliable external publication.

## Mental Model
```text
Outbox for Integration Events → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Outbox for Integration Events:** Persist outbox in same DB transaction for reliable external publication.


---

<!-- 401_QUERYHINTS.md -->

# @QueryHints

## What / Why
Applies provider/JPA query hints.

## Mental Model
```text
@QueryHints → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@QueryHints:** Applies provider/JPA query hints.


---

<!-- 402_QUERYHINT.md -->

# QueryHint

## What / Why
JPA query hint metadata.

## Mental Model
```text
QueryHint → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **QueryHint:** JPA query hint metadata.


---

<!-- 403_ENTITYGRAPH.md -->

# @EntityGraph

## What / Why
Apply named/ad hoc entity graph.

## Mental Model
```text
@EntityGraph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@EntityGraph:** Apply named/ad hoc entity graph.


---

<!-- 404_ENTITYGRAPH_ATTRIBUTEPATHS.md -->

# EntityGraph attributePaths

## What / Why
Ad hoc fetch paths.

## Mental Model
```text
EntityGraph attributePaths → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityGraph attributePaths:** Ad hoc fetch paths.


---

<!-- 405_NAMEDENTITYGRAPH.md -->

# NamedEntityGraph

## What / Why
Reusable graph definition.

## Mental Model
```text
NamedEntityGraph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NamedEntityGraph:** Reusable graph definition.


---

<!-- 406_FETCH_SIZE_HINT.md -->

# Fetch Size Hint

## What / Why
Provider/JDBC hint for result-fetching behavior.

## Mental Model
```text
Fetch Size Hint → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch Size Hint:** Provider/JDBC hint for result-fetching behavior.


---

<!-- 407_READ_ONLY_HINT.md -->

# Read Only Hint

## What / Why
Hibernate-specific read-only query optimization.

## Mental Model
```text
Read Only Hint → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Read Only Hint:** Hibernate-specific read-only query optimization.


---

<!-- 408_TIMEOUT_HINT.md -->

# Timeout Hint

## What / Why
Provider/database query timeout.

## Mental Model
```text
Timeout Hint → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Timeout Hint:** Provider/database query timeout.


---

<!-- 409_CACHEABLE_HINT.md -->

# Cacheable Hint

## What / Why
Hibernate-specific second-level/query cache hint.

## Mental Model
```text
Cacheable Hint → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cacheable Hint:** Hibernate-specific second-level/query cache hint.


---

<!-- 410_HINT_PORTABILITY.md -->

# Hint Portability

## What / Why
Unrecognized provider hints may be ignored.

## Mental Model
```text
Hint Portability → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hint Portability:** Unrecognized provider hints may be ignored.


---

<!-- 411_PROCEDURE.md -->

# @Procedure

## What / Why
Spring Data repository method invokes stored procedure.

## Mental Model
```text
@Procedure → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Procedure:** Spring Data repository method invokes stored procedure.


---

<!-- 412_NAMEDSTOREDPROCEDUREQUERY.md -->

# NamedStoredProcedureQuery

## What / Why
JPA named stored-procedure mapping.

## Mental Model
```text
NamedStoredProcedureQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NamedStoredProcedureQuery:** JPA named stored-procedure mapping.


---

<!-- 413_STOREDPROCEDUREQUERY.md -->

# StoredProcedureQuery

## What / Why
EntityManager stored procedure API.

## Mental Model
```text
StoredProcedureQuery → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **StoredProcedureQuery:** EntityManager stored procedure API.


---

<!-- 414_IN_PARAMETER.md -->

# IN Parameter

## What / Why
Input parameter.

## Mental Model
```text
IN Parameter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **IN Parameter:** Input parameter.


---

<!-- 415_OUT_PARAMETER.md -->

# OUT Parameter

## What / Why
Output parameter.

## Mental Model
```text
OUT Parameter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **OUT Parameter:** Output parameter.


---

<!-- 416_INOUT_PARAMETER.md -->

# INOUT Parameter

## What / Why
Input/output parameter.

## Mental Model
```text
INOUT Parameter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **INOUT Parameter:** Input/output parameter.


---

<!-- 417_REF_CURSOR.md -->

# REF_CURSOR

## What / Why
Cursor output where database/provider supports.

## Mental Model
```text
REF_CURSOR → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **REF_CURSOR:** Cursor output where database/provider supports.


---

<!-- 418_STORED_PROCEDURE_PORTABILITY.md -->

# Stored Procedure Portability

## What / Why
Syntax/result semantics vary heavily by database.

## Mental Model
```text
Stored Procedure Portability → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Stored Procedure Portability:** Syntax/result semantics vary heavily by database.


---

<!-- 419_PROCEDURE_TRANSACTION.md -->

# Procedure Transaction

## What / Why
Procedure participates in current transaction according to DB/provider behavior.

## Mental Model
```text
Procedure Transaction → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Procedure Transaction:** Procedure participates in current transaction according to DB/provider behavior.


---

<!-- 420_FIRST_VS_SECOND_LEVEL_CACHE.md -->

# First vs Second Level Cache

## What / Why
Persistence context is mandatory L1; L2 is optional provider cache shared across contexts.

## Mental Model
```text
First vs Second Level Cache → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **First vs Second Level Cache:** Persistence context is mandatory L1; L2 is optional provider cache shared across contexts.


---

<!-- 421_HIBERNATE_L2_CACHE.md -->

# Hibernate L2 Cache

## What / Why
Provider-specific second-level entity/collection cache.

## Mental Model
```text
Hibernate L2 Cache → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate L2 Cache:** Provider-specific second-level entity/collection cache.


---

<!-- 422_JCACHE.md -->

# JCache

## What / Why
Standard caching API integration supported by Hibernate.

## Mental Model
```text
JCache → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JCache:** Standard caching API integration supported by Hibernate.


---

<!-- 423_CACHE_REGION.md -->

# Cache Region

## What / Why
Named region stores entity/collection entries.

## Mental Model
```text
Cache Region → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cache Region:** Named region stores entity/collection entries.


---

<!-- 424_READ_ONLY_STRATEGY.md -->

# READ_ONLY Strategy

## What / Why
For immutable data.

## Mental Model
```text
READ_ONLY Strategy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **READ_ONLY Strategy:** For immutable data.


---

<!-- 425_NONSTRICT_READ_WRITE.md -->

# NONSTRICT_READ_WRITE

## What / Why
Allows limited staleness.

## Mental Model
```text
NONSTRICT_READ_WRITE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NONSTRICT_READ_WRITE:** Allows limited staleness.


---

<!-- 426_READ_WRITE.md -->

# READ_WRITE

## What / Why
Coordinates updates with soft-lock style semantics.

## Mental Model
```text
READ_WRITE → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **READ_WRITE:** Coordinates updates with soft-lock style semantics.


---

<!-- 427_TRANSACTIONAL.md -->

# TRANSACTIONAL

## What / Why
Requires transactional cache provider semantics.

## Mental Model
```text
TRANSACTIONAL → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **TRANSACTIONAL:** Requires transactional cache provider semantics.


---

<!-- 428_QUERY_CACHE.md -->

# Query Cache

## What / Why
Caches query result identifiers, not full entity state alone.

## Mental Model
```text
Query Cache → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Query Cache:** Caches query result identifiers, not full entity state alone.


---

<!-- 429_QUERY_CACHE_DEPENDENCY.md -->

# Query Cache Dependency

## What / Why
Useful only with appropriate L2 cached entities/regions.

## Mental Model
```text
Query Cache Dependency → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Query Cache Dependency:** Useful only with appropriate L2 cached entities/regions.


---

<!-- 430_CACHE_INVALIDATION.md -->

# Cache Invalidation

## What / Why
Hardest part of caching; write frequency/distributed deployment matter.

## Mental Model
```text
Cache Invalidation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cache Invalidation:** Hardest part of caching; write frequency/distributed deployment matter.


---

<!-- 431_L2_CACHE_ANTI_PATTERN.md -->

# L2 Cache Anti Pattern

## What / Why
Do not enable globally without workload evidence.

## Mental Model
```text
L2 Cache Anti Pattern → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **L2 Cache Anti Pattern:** Do not enable globally without workload evidence.


---

<!-- 432_HIBERNATE_SESSION.md -->

# Hibernate Session

## What / Why
Provider API underlying JPA EntityManager.

## Mental Model
```text
Hibernate Session → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate Session:** Provider API underlying JPA EntityManager.


---

<!-- 433_SESSIONFACTORY.md -->

# SessionFactory

## What / Why
Hibernate provider factory.

## Mental Model
```text
SessionFactory → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SessionFactory:** Hibernate provider factory.


---

<!-- 434_HQL.md -->

# HQL

## What / Why
Hibernate query language, a superset/evolution beyond portable JPQL.

## Mental Model
```text
HQL → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **HQL:** Hibernate query language, a superset/evolution beyond portable JPQL.


---

<!-- 435_HIBERNATE_FETCHMODE.md -->

# Hibernate FetchMode

## What / Why
Provider-specific fetch configuration.

## Mental Model
```text
Hibernate FetchMode → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate FetchMode:** Provider-specific fetch configuration.


---

<!-- 436_BATCHSIZE.md -->

# @BatchSize

## What / Why
Hibernate-specific batch fetching.

## Mental Model
```text
@BatchSize → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@BatchSize:** Hibernate-specific batch fetching.


---

<!-- 437_FETCH.md -->

# @Fetch

## What / Why
Hibernate-specific fetch strategy.

## Mental Model
```text
@Fetch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Fetch:** Hibernate-specific fetch strategy.


---

<!-- 438_IMMUTABLE.md -->

# @Immutable

## What / Why
Marks entity/collection immutable.

## Mental Model
```text
@Immutable → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Immutable:** Marks entity/collection immutable.


---

<!-- 439_CREATIONTIMESTAMP.md -->

# @CreationTimestamp

## What / Why
Provider-generated creation timestamp.

## Mental Model
```text
@CreationTimestamp → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@CreationTimestamp:** Provider-generated creation timestamp.


---

<!-- 440_UPDATETIMESTAMP.md -->

# @UpdateTimestamp

## What / Why
Provider-generated update timestamp.

## Mental Model
```text
@UpdateTimestamp → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@UpdateTimestamp:** Provider-generated update timestamp.


---

<!-- 441_DYNAMICUPDATE.md -->

# @DynamicUpdate

## What / Why
Generate update SQL with changed columns.

## Mental Model
```text
@DynamicUpdate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@DynamicUpdate:** Generate update SQL with changed columns.


---

<!-- 442_DYNAMICINSERT.md -->

# @DynamicInsert

## What / Why
Generate insert SQL with non-null/default-relevant columns.

## Mental Model
```text
@DynamicInsert → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@DynamicInsert:** Generate insert SQL with non-null/default-relevant columns.


---

<!-- 443_NATURALID.md -->

# @NaturalId

## What / Why
Hibernate natural-key mapping.

## Mental Model
```text
@NaturalId → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@NaturalId:** Hibernate natural-key mapping.


---

<!-- 444_FORMULA.md -->

# @Formula

## What / Why
Read-only SQL expression property.

## Mental Model
```text
@Formula → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Formula:** Read-only SQL expression property.


---

<!-- 445_WHERE_LEGACY_AWARENESS.md -->

# @Where Legacy Awareness

## What / Why
Provider-specific row filtering patterns have evolved; prefer current supported annotations/features.

## Mental Model
```text
@Where Legacy Awareness → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Where Legacy Awareness:** Provider-specific row filtering patterns have evolved; prefer current supported annotations/features.


---

<!-- 446_SQLRESTRICTION.md -->

# @SQLRestriction

## What / Why
Hibernate SQL restriction filter.

## Mental Model
```text
@SQLRestriction → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@SQLRestriction:** Hibernate SQL restriction filter.


---

<!-- 447_FILTER.md -->

# @Filter

## What / Why
Parameterized dynamic filtering.

## Mental Model
```text
@Filter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Filter:** Parameterized dynamic filtering.


---

<!-- 448_SOFTDELETE.md -->

# @SoftDelete

## What / Why
Hibernate native soft-delete support in modern ORM.

## Mental Model
```text
@SoftDelete → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@SoftDelete:** Hibernate native soft-delete support in modern ORM.


---

<!-- 449_JDBCTYPECODE.md -->

# @JdbcTypeCode

## What / Why
Explicit JDBC type mapping, useful for JSON/custom types.

## Mental Model
```text
@JdbcTypeCode → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@JdbcTypeCode:** Explicit JDBC type mapping, useful for JSON/custom types.


---

<!-- 450_BYTECODE_ENHANCEMENT.md -->

# Bytecode Enhancement

## What / Why
Can improve dirty tracking/lazy attributes.

## Mental Model
```text
Bytecode Enhancement → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Bytecode Enhancement:** Can improve dirty tracking/lazy attributes.


---

<!-- 450_HIGH_VALUE_COMPARISONS.md -->

# Spring Data / JPA — High-Value Comparisons

## JPA vs Hibernate vs Spring Data JPA
| JPA | Hibernate | Spring Data JPA |
|---|---|---|
| specification | JPA provider | repository abstraction |
| EntityManager | Session/SQL engine | JpaRepository |
| portable semantics | extensions/optimizations | query derivation/specifications |

## persist vs merge
| persist | merge |
|---|---|
| new entity | detached/transient state copy |
| same instance becomes managed | returned instance is managed |
| no return | returns managed copy |

## LAZY vs EAGER
| LAZY | EAGER |
|---|---|
| defer loading | must be available eagerly |
| may proxy/select | does not guarantee join |
| needs context when accessed | can still cause N+1 |

## Page vs Slice vs Window
| Page | Slice | Window |
|---|---|---|
| total count | no total count | scrolling |
| count query | cheaper | offset/keyset |
| standard UI paging | next/previous | large data traversal |

## Optimistic vs Pessimistic
| Optimistic | Pessimistic |
|---|---|
| @Version | DB lock |
| detect conflict | prevent competing write/read |
| high concurrency | hot critical rows |

## Entity vs Projection
| Entity | Projection |
|---|---|
| managed | read model |
| dirty checking | no aggregate lifecycle |
| full domain behavior | smaller query shape |


---

<!-- 451_HIBERNATE_STATISTICS.md -->

# Hibernate Statistics

## What / Why
Runtime metrics for entity/query/cache activity.

## Mental Model
```text
Hibernate Statistics → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate Statistics:** Runtime metrics for entity/query/cache activity.


---

<!-- 451_INTERVIEW_TRAPS.md -->

# Spring Data / JPA Interview Traps

1. JPA is not Hibernate.
2. Spring Data JPA is not JPA itself.
3. EntityManager is not a repository.
4. Persistence context is a first-level cache and identity map.
5. `persist()` and `merge()` have different semantics.
6. `merge()` returns the managed instance; the argument remains detached.
7. `save()` may call persist or merge.
8. Calling `save()` on an already managed entity is usually unnecessary.
9. Dirty checking happens on managed entities.
10. SQL may execute at flush, not where setter/save appears in code.
11. Flush is not commit.
12. AUTO flush may happen before a query.
13. EAGER does not mean JOIN.
14. LAZY does not always mean an extra query if fetch plan overrides it.
15. To-one defaults are EAGER in JPA.
16. To-many defaults are LAZY.
17. N+1 can happen with EAGER associations too.
18. Fetch join plus collection pagination is dangerous.
19. `@EntityGraph` controls fetch plan, not authorization.
20. Cascade is not fetch strategy.
21. orphanRemoval is not identical to cascade REMOVE.
22. Bidirectional associations must be synchronized in Java.
23. Many-to-many often deserves an association entity.
24. Bulk JPQL update bypasses dirty checking/entity callbacks.
25. Bulk updates can stale the persistence context.
26. CLIENT-side UUID/sequence strategy can batch inserts better than IDENTITY in many setups.
27. `saveAll()` alone does not guarantee JDBC batching.
28. First-level cache cannot be disabled like L2 cache.
29. L2 cache is provider-specific/optional.
30. Query cache is not a magic general-purpose cache.
31. `@Transactional(readOnly=true)` is not a security boundary.
32. Self-invocation can bypass proxy-based transactions.
33. Long transactions across remote calls exhaust connections/locks.
34. Optimistic locking detects conflicts; it does not prevent them.
35. Pessimistic locks can deadlock.
36. H2 passing tests do not guarantee production DB SQL behavior.
37. JPA is blocking; wrapping JpaRepository in Mono does not make it reactive.
38. DTO projections are often better than entities for read APIs.
39. Page can issue an expensive count query.
40. Keyset scrolling needs stable unique ordering.


---

<!-- 452_HIBERNATE_7_4.md -->

# Hibernate 7.4

## What / Why
Current latest stable Hibernate provider line for current-feature awareness.

## Mental Model
```text
Hibernate 7.4 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate 7.4:** Current latest stable Hibernate provider line for current-feature awareness.


---

<!-- 452_PRODUCTION_CHECKLIST.md -->

# Spring Data / JPA Production Checklist

## Mapping
- explicit ownership/cascade
- LAZY-first association strategy where appropriate
- no accidental giant graphs
- stable equals/hashCode
- indexes/unique constraints match model

## Transactions
- service-layer business boundaries
- no slow remote calls inside DB transaction
- correct rollback rules
- concurrency strategy defined
- lock timeout configured where used

## Queries
- SQL inspected
- N+1 tested
- projections for read-heavy endpoints
- pagination/count cost measured
- dynamic filters safe/parameterized

## Performance
- JDBC pool sized to DB capacity
- batching verified in SQL
- persistence context bounded in bulk jobs
- slow-query/EXPLAIN process
- cache only where justified

## Operations
- Flyway/Liquibase migrations
- production database integration tests
- metrics/traces
- tenant isolation
- backup/recovery handled at DB layer


---

<!-- 453_SOFT_DELETE_MENTAL_MODEL.md -->

# Soft Delete Mental Model

## What / Why
Mark row deleted instead of physical DELETE.

## Mental Model
```text
Soft Delete Mental Model → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Soft Delete Mental Model:** Mark row deleted instead of physical DELETE.


---

<!-- 453_TROUBLESHOOTING_FLOW.md -->

# Spring Data / JPA Troubleshooting — Golden Flow

```text
1. Transaction
   ├─ active?
   ├─ proxy applied?
   └─ rollback/commit?

2. Entity State
   ├─ transient?
   ├─ managed?
   ├─ detached?
   └─ removed?

3. Persistence Context
   ├─ stale?
   ├─ dirty?
   ├─ flush?
   └─ too large?

4. Query / Fetch
   ├─ derived/JPQL/native?
   ├─ fetch graph?
   ├─ N+1?
   └─ count/pagination?

5. SQL / DB
   ├─ generated SQL?
   ├─ indexes?
   ├─ lock?
   ├─ execution plan?
   └─ constraint?

6. Provider
   ├─ Hibernate-specific setting?
   ├─ batching?
   └─ cache?
```


---

<!-- 454_SOFT_DELETE_COLUMN.md -->

# Soft Delete Column

## What / Why
Boolean/status/timestamp indicates active/deleted.

## Mental Model
```text
Soft Delete Column → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Soft Delete Column:** Boolean/status/timestamp indicates active/deleted.


---

<!-- 454_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary current references:
- Spring Data JPA 4.1.1 official reference
- Jakarta Persistence 3.2 specification/Javadoc
- Hibernate ORM 7.4 current documentation for provider-specific awareness

Current verified baseline:
- Spring Data JPA 4.1.1 is current stable.
- 4.2.0-M1 is preview.
- Jakarta Persistence 3.2 is final and part of Jakarta EE 11.
- Persistence 3.2 adds record embeddables, Instant/Year, query set operations, cast, string functions, id/version functions, null precedence, getSingleResultOrNull and Criteria enhancements.
- Hibernate ORM 7.4.8.Final is latest stable Hibernate line as of September 13, 2026.

Use Spring Boot dependency management to determine the supported Spring Data JPA/Hibernate combination for an actual project.


---

<!-- 455_HIBERNATE_SOFTDELETE.md -->

# Hibernate @SoftDelete

## What / Why
Provider-native soft-delete capability.

## Mental Model
```text
Hibernate @SoftDelete → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate @SoftDelete:** Provider-native soft-delete capability.


---

<!-- 456_REPOSITORY_QUERY_FILTERING.md -->

# Repository Query Filtering

## What / Why
All normal reads must consistently exclude deleted rows.

## Mental Model
```text
Repository Query Filtering → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Query Filtering:** All normal reads must consistently exclude deleted rows.


---

<!-- 457_UNIQUE_CONSTRAINT_TRAP.md -->

# Unique Constraint Trap

## What / Why
Soft-deleted rows can still conflict with unique indexes.

## Mental Model
```text
Unique Constraint Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Unique Constraint Trap:** Soft-deleted rows can still conflict with unique indexes.


---

<!-- 458_ASSOCIATION_TRAP.md -->

# Association Trap

## What / Why
Soft-deleted related rows may appear depending provider/filter semantics.

## Mental Model
```text
Association Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Association Trap:** Soft-deleted related rows may appear depending provider/filter semantics.


---

<!-- 459_RESTORE.md -->

# Restore

## What / Why
Undelete requires explicit domain semantics.

## Mental Model
```text
Restore → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Restore:** Undelete requires explicit domain semantics.


---

<!-- 460_AUDIT_VS_SOFT_DELETE.md -->

# Audit vs Soft Delete

## What / Why
Soft delete preserves row; audit history tracks changes over time.

## Mental Model
```text
Audit vs Soft Delete → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Audit vs Soft Delete:** Soft delete preserves row; audit history tracks changes over time.


---

<!-- 461_HIBERNATE_ENVERS.md -->

# Hibernate Envers

## What / Why
Audit/history module storing entity revisions.

## Mental Model
```text
Hibernate Envers → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate Envers:** Audit/history module storing entity revisions.


---

<!-- 462_AUDITED.md -->

# @Audited

## What / Why
Marks entity/attribute for revision tracking.

## Mental Model
```text
@Audited → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Audited:** Marks entity/attribute for revision tracking.


---

<!-- 463_REVISION.md -->

# Revision

## What / Why
Global revision record grouping audited changes.

## Mental Model
```text
Revision → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Revision:** Global revision record grouping audited changes.


---

<!-- 464_REVISION_ENTITY.md -->

# Revision Entity

## What / Why
Custom revision metadata such as user/request.

## Mental Model
```text
Revision Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Revision Entity:** Custom revision metadata such as user/request.


---

<!-- 465_REVISIONREPOSITORY.md -->

# RevisionRepository

## What / Why
Spring Data Envers repository abstraction.

## Mental Model
```text
RevisionRepository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **RevisionRepository:** Spring Data Envers repository abstraction.


---

<!-- 466_REVISION_NUMBER.md -->

# Revision Number

## What / Why
Monotonic revision identifier.

## Mental Model
```text
Revision Number → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Revision Number:** Monotonic revision identifier.


---

<!-- 467_REVISION_TYPE.md -->

# Revision Type

## What / Why
ADD/MOD/DEL change type.

## Mental Model
```text
Revision Type → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Revision Type:** ADD/MOD/DEL change type.


---

<!-- 468_FIND_REVISIONS.md -->

# Find Revisions

## What / Why
Query entity historical states.

## Mental Model
```text
Find Revisions → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Find Revisions:** Query entity historical states.


---

<!-- 469_ENVERS_STORAGE_COST.md -->

# Envers Storage Cost

## What / Why
Audit tables increase writes/storage.

## Mental Model
```text
Envers Storage Cost → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Envers Storage Cost:** Audit tables increase writes/storage.


---

<!-- 470_ENVERS_VS_EVENT_SOURCING.md -->

# Envers vs Event Sourcing

## What / Why
Audit history is not equivalent to domain event sourcing.

## Mental Model
```text
Envers vs Event Sourcing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Envers vs Event Sourcing:** Audit history is not equivalent to domain event sourcing.


---

<!-- 471_JDBC_BATCHING.md -->

# JDBC Batching

## What / Why
Provider groups similar SQL statements into JDBC batches.

## Mental Model
```text
JDBC Batching → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JDBC Batching:** Provider groups similar SQL statements into JDBC batches.


---

<!-- 472_HIBERNATE_JDBC_BATCH_SIZE.md -->

# hibernate jdbc batch_size

## What / Why
Hibernate setting controlling JDBC batch size.

## Mental Model
```text
hibernate jdbc batch_size → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **hibernate jdbc batch_size:** Hibernate setting controlling JDBC batch size.


---

<!-- 473_ORDER_INSERTS.md -->

# Order Inserts

## What / Why
Provider can order inserts to improve batch grouping.

## Mental Model
```text
Order Inserts → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Order Inserts:** Provider can order inserts to improve batch grouping.


---

<!-- 474_ORDER_UPDATES.md -->

# Order Updates

## What / Why
Provider can order updates.

## Mental Model
```text
Order Updates → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Order Updates:** Provider can order updates.


---

<!-- 475_BATCH_VERSIONED_DATA.md -->

# Batch Versioned Data

## What / Why
Versioned entity batching requires provider support/config.

## Mental Model
```text
Batch Versioned Data → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Batch Versioned Data:** Versioned entity batching requires provider support/config.


---

<!-- 476_IDENTITY_BATCH_LIMITATION.md -->

# Identity Batch Limitation

## What / Why
IDENTITY generation can inhibit insert batching.

## Mental Model
```text
Identity Batch Limitation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Identity Batch Limitation:** IDENTITY generation can inhibit insert batching.


---

<!-- 477_SEQUENCE_FOR_BATCHING.md -->

# Sequence for Batching

## What / Why
Sequence allocation is generally more batch-friendly.

## Mental Model
```text
Sequence for Batching → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Sequence for Batching:** Sequence allocation is generally more batch-friendly.


---

<!-- 478_FLUSH_CLEAR_LOOP.md -->

# Flush Clear Loop

## What / Why
Periodically flush and clear in bulk writes.

## Mental Model
```text
Flush Clear Loop → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flush Clear Loop:** Periodically flush and clear in bulk writes.


---

<!-- 479_SAVEALL_TRAP.md -->

# saveAll Trap

## What / Why
saveAll alone does not guarantee JDBC batching.

## Mental Model
```text
saveAll Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **saveAll Trap:** saveAll alone does not guarantee JDBC batching.


---

<!-- 480_BATCH_FETCH_VS_JDBC_BATCH.md -->

# Batch Fetch vs JDBC Batch

## What / Why
Batch fetching optimizes SELECTs; JDBC batching optimizes DML.

## Mental Model
```text
Batch Fetch vs JDBC Batch → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Batch Fetch vs JDBC Batch:** Batch fetching optimizes SELECTs; JDBC batching optimizes DML.


---

<!-- 481_BULK_JPQL_UPDATE.md -->

# Bulk JPQL Update

## What / Why
One SQL update can outperform loading/modifying entities when callbacks/locking are not needed.

## Mental Model
```text
Bulk JPQL Update → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Bulk JPQL Update:** One SQL update can outperform loading/modifying entities when callbacks/locking are not needed.


---

<!-- 482_STATELESSSESSION_AWARENESS.md -->

# StatelessSession Awareness

## What / Why
Hibernate StatelessSession can fit special bulk workloads outside normal persistence-context semantics.

## Mental Model
```text
StatelessSession Awareness → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **StatelessSession Awareness:** Hibernate StatelessSession can fit special bulk workloads outside normal persistence-context semantics.


---

<!-- 483_SCHEMA_GENERATION.md -->

# Schema Generation

## What / Why
JPA/provider can generate schema for dev/test, but production migration needs controlled tooling.

## Mental Model
```text
Schema Generation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Schema Generation:** JPA/provider can generate schema for dev/test, but production migration needs controlled tooling.


---

<!-- 484_DDL_AUTO_CREATE.md -->

# ddl-auto create

## What / Why
Recreates schema; unsafe for production.

## Mental Model
```text
ddl-auto create → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ddl-auto create:** Recreates schema; unsafe for production.


---

<!-- 485_DDL_AUTO_UPDATE.md -->

# ddl-auto update

## What / Why
Convenient development option but not controlled production migration strategy.

## Mental Model
```text
ddl-auto update → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ddl-auto update:** Convenient development option but not controlled production migration strategy.


---

<!-- 486_DDL_AUTO_VALIDATE.md -->

# ddl-auto validate

## What / Why
Validate entity mappings against existing schema.

## Mental Model
```text
ddl-auto validate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ddl-auto validate:** Validate entity mappings against existing schema.


---

<!-- 487_FLYWAY.md -->

# Flyway

## What / Why
Versioned SQL migration tool commonly used with Spring Boot.

## Mental Model
```text
Flyway → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flyway:** Versioned SQL migration tool commonly used with Spring Boot.


---

<!-- 488_LIQUIBASE.md -->

# Liquibase

## What / Why
Changelog-based migration tool.

## Mental Model
```text
Liquibase → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Liquibase:** Changelog-based migration tool.


---

<!-- 489_MIGRATION_BEFORE_APP.md -->

# Migration Before App

## What / Why
Apply compatible schema migration before code that depends on it.

## Mental Model
```text
Migration Before App → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Migration Before App:** Apply compatible schema migration before code that depends on it.


---

<!-- 490_EXPAND_CONTRACT.md -->

# Expand Contract

## What / Why
Use backward-compatible multi-step schema changes for rolling deployments.

## Mental Model
```text
Expand Contract → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Expand Contract:** Use backward-compatible multi-step schema changes for rolling deployments.


---

<!-- 491_INDEX_MIGRATION.md -->

# Index Migration

## What / Why
Large index creation requires operational planning.

## Mental Model
```text
Index Migration → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Index Migration:** Large index creation requires operational planning.


---

<!-- 492_COLUMN_RENAME.md -->

# Column Rename

## What / Why
Use expand/backfill/dual-read-write/contract for zero-downtime.

## Mental Model
```text
Column Rename → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Column Rename:** Use expand/backfill/dual-read-write/contract for zero-downtime.


---

<!-- 493_ENTITY_MIGRATION_ALIGNMENT.md -->

# Entity Migration Alignment

## What / Why
ORM mapping and DB migration must version together.

## Mental Model
```text
Entity Migration Alignment → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Migration Alignment:** ORM mapping and DB migration must version together.


---

<!-- 494_DATAJPATEST.md -->

# @DataJpaTest

## What / Why
Slice test for JPA repositories/entities.

## Mental Model
```text
@DataJpaTest → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@DataJpaTest:** Slice test for JPA repositories/entities.


---

<!-- 495_TESTENTITYMANAGER.md -->

# TestEntityManager

## What / Why
Spring Boot test helper around EntityManager.

## Mental Model
```text
TestEntityManager → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **TestEntityManager:** Spring Boot test helper around EntityManager.


---

<!-- 496_TRANSACTIONAL_TEST_ROLLBACK.md -->

# Transactional Test Rollback

## What / Why
Test framework often rolls back by default.

## Mental Model
```text
Transactional Test Rollback → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transactional Test Rollback:** Test framework often rolls back by default.


---

<!-- 497_FLUSH_IN_TESTS.md -->

# Flush in Tests

## What / Why
Flush explicitly to reveal DB constraints/SQL exceptions before test ends.

## Mental Model
```text
Flush in Tests → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Flush in Tests:** Flush explicitly to reveal DB constraints/SQL exceptions before test ends.


---

<!-- 498_CLEAR_IN_TESTS.md -->

# Clear in Tests

## What / Why
Clear persistence context to prove queries actually reload from DB.

## Mental Model
```text
Clear in Tests → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Clear in Tests:** Clear persistence context to prove queries actually reload from DB.


---

<!-- 499_TESTCONTAINERS.md -->

# Testcontainers

## What / Why
Use real target database for dialect/query/locking behavior.

## Mental Model
```text
Testcontainers → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Testcontainers:** Use real target database for dialect/query/locking behavior.


---

<!-- 500_H2_TRAP.md -->

# H2 Trap

## What / Why
H2 behavior can differ from PostgreSQL/MySQL/Oracle/SQL Server.

## Mental Model
```text
H2 Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **H2 Trap:** H2 behavior can differ from PostgreSQL/MySQL/Oracle/SQL Server.


---

<!-- 501_REPOSITORY_TEST.md -->

# Repository Test

## What / Why
Verify derived/@Query/specification semantics.

## Mental Model
```text
Repository Test → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Test:** Verify derived/@Query/specification semantics.


---

<!-- 502_MAPPING_TEST.md -->

# Mapping Test

## What / Why
Verify cascades, orphan removal, constraints and lifecycle.

## Mental Model
```text
Mapping Test → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Mapping Test:** Verify cascades, orphan removal, constraints and lifecycle.


---

<!-- 503_N_PLUS_ONE_TEST.md -->

# N Plus One Test

## What / Why
Assert query count for critical read paths.

## Mental Model
```text
N Plus One Test → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **N Plus One Test:** Assert query count for critical read paths.


---

<!-- 504_OPTIMISTIC_LOCK_TEST.md -->

# Optimistic Lock Test

## What / Why
Use concurrent transactions/EntityManagers.

## Mental Model
```text
Optimistic Lock Test → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optimistic Lock Test:** Use concurrent transactions/EntityManagers.


---

<!-- 505_PESSIMISTIC_LOCK_TEST.md -->

# Pessimistic Lock Test

## What / Why
Requires real database behavior.

## Mental Model
```text
Pessimistic Lock Test → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pessimistic Lock Test:** Requires real database behavior.


---

<!-- 506_MIGRATION_TEST.md -->

# Migration Test

## What / Why
Run Flyway/Liquibase against real DB container.

## Mental Model
```text
Migration Test → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Migration Test:** Run Flyway/Liquibase against real DB container.


---

<!-- 507_SQL_LOGGING.md -->

# SQL Logging

## What / Why
Inspect generated SQL during development/troubleshooting.

## Mental Model
```text
SQL Logging → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SQL Logging:** Inspect generated SQL during development/troubleshooting.


---

<!-- 508_BIND_PARAMETER_LOGGING.md -->

# Bind Parameter Logging

## What / Why
Useful but may leak sensitive values.

## Mental Model
```text
Bind Parameter Logging → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Bind Parameter Logging:** Useful but may leak sensitive values.


---

<!-- 509_HIBERNATE_STATISTICS.md -->

# Hibernate Statistics

## What / Why
Count queries/entities/collections/cache hits.

## Mental Model
```text
Hibernate Statistics → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Hibernate Statistics:** Count queries/entities/collections/cache hits.


---

<!-- 510_STATEMENTINSPECTOR.md -->

# StatementInspector

## What / Why
Hibernate hook to inspect generated SQL.

## Mental Model
```text
StatementInspector → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **StatementInspector:** Hibernate hook to inspect generated SQL.


---

<!-- 511_DATASOURCE_PROXY.md -->

# Datasource Proxy

## What / Why
Wrap DataSource to measure/count SQL.

## Mental Model
```text
Datasource Proxy → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Datasource Proxy:** Wrap DataSource to measure/count SQL.


---

<!-- 512_APM_DATABASE_SPANS.md -->

# APM Database Spans

## What / Why
Trace request → repository → SQL latency.

## Mental Model
```text
APM Database Spans → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **APM Database Spans:** Trace request → repository → SQL latency.


---

<!-- 513_SLOW_QUERY_LOG.md -->

# Slow Query Log

## What / Why
Database-level slow query log is authoritative for SQL performance.

## Mental Model
```text
Slow Query Log → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Slow Query Log:** Database-level slow query log is authoritative for SQL performance.


---

<!-- 514_EXPLAIN_PLAN.md -->

# Explain Plan

## What / Why
Use database EXPLAIN/EXPLAIN ANALYZE.

## Mental Model
```text
Explain Plan → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Explain Plan:** Use database EXPLAIN/EXPLAIN ANALYZE.


---

<!-- 515_INDEXING.md -->

# Indexing

## What / Why
ORM does not remove need for correct indexes.

## Mental Model
```text
Indexing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Indexing:** ORM does not remove need for correct indexes.


---

<!-- 516_COVERING_INDEX.md -->

# Covering Index

## What / Why
Database optimization for selected/filter columns.

## Mental Model
```text
Covering Index → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Covering Index:** Database optimization for selected/filter columns.


---

<!-- 517_SELECTIVITY.md -->

# Selectivity

## What / Why
Index usefulness depends on cardinality/query pattern.

## Mental Model
```text
Selectivity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Selectivity:** Index usefulness depends on cardinality/query pattern.


---

<!-- 518_CONNECTION_POOL.md -->

# Connection Pool

## What / Why
HikariCP commonly manages JDBC connections.

## Mental Model
```text
Connection Pool → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Connection Pool:** HikariCP commonly manages JDBC connections.


---

<!-- 519_POOL_SIZE_RULE.md -->

# Pool Size Rule

## What / Why
Size to database capacity/latency, not web request count.

## Mental Model
```text
Pool Size Rule → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pool Size Rule:** Size to database capacity/latency, not web request count.


---

<!-- 520_QUERY_TIMEOUT.md -->

# Query Timeout

## What / Why
Bound pathological database calls.

## Mental Model
```text
Query Timeout → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Query Timeout:** Bound pathological database calls.


---

<!-- 521_FETCH_SIZE.md -->

# Fetch Size

## What / Why
Control JDBC row fetching for large result streams.

## Mental Model
```text
Fetch Size → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch Size:** Control JDBC row fetching for large result streams.


---

<!-- 522_READ_ONLY_QUERY.md -->

# Read Only Query

## What / Why
Provider hints/transactions can reduce dirty-check overhead.

## Mental Model
```text
Read Only Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Read Only Query:** Provider hints/transactions can reduce dirty-check overhead.


---

<!-- 523_DTO_QUERY.md -->

# DTO Query

## What / Why
Avoid entity management for read-only reporting.

## Mental Model
```text
DTO Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **DTO Query:** Avoid entity management for read-only reporting.


---

<!-- 524_ENTITY_GRAPH_SIZE.md -->

# Entity Graph Size

## What / Why
Large managed graphs increase memory/flush cost.

## Mental Model
```text
Entity Graph Size → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Graph Size:** Large managed graphs increase memory/flush cost.


---

<!-- 525_REPOSITORY_STREAM.md -->

# Repository Stream

## What / Why
Repository query can return Java Stream for incremental consumption.

## Mental Model
```text
Repository Stream → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Stream:** Repository query can return Java Stream for incremental consumption.


---

<!-- 526_STREAM_TRANSACTION_SCOPE.md -->

# Stream Transaction Scope

## What / Why
Underlying JDBC resources must remain open; consume/close within transaction/resource scope.

## Mental Model
```text
Stream Transaction Scope → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Stream Transaction Scope:** Underlying JDBC resources must remain open; consume/close within transaction/resource scope.


---

<!-- 527_SCROLLABLE_RESULTS.md -->

# Scrollable Results

## What / Why
Hibernate supports provider-specific scrolling.

## Mental Model
```text
Scrollable Results → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Scrollable Results:** Hibernate supports provider-specific scrolling.


---

<!-- 528_PAGINATION_FOR_LARGE_DATA.md -->

# Pagination for Large Data

## What / Why
Prefer keyset/window pagination for deep large datasets.

## Mental Model
```text
Pagination for Large Data → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Pagination for Large Data:** Prefer keyset/window pagination for deep large datasets.


---

<!-- 529_CHUNK_PROCESSING.md -->

# Chunk Processing

## What / Why
Process large data in bounded pages/batches.

## Mental Model
```text
Chunk Processing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Chunk Processing:** Process large data in bounded pages/batches.


---

<!-- 530_ENTITY_DETACH.md -->

# Entity Detach

## What / Why
Detach/clear processed entities to bound persistence-context growth.

## Mental Model
```text
Entity Detach → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity Detach:** Detach/clear processed entities to bound persistence-context growth.


---

<!-- 531_JPA_IS_BLOCKING.md -->

# JPA Is Blocking

## What / Why
Spring Data JPA uses blocking JDBC/JPA semantics.

## Mental Model
```text
JPA Is Blocking → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA Is Blocking:** Spring Data JPA uses blocking JDBC/JPA semantics.


---

<!-- 532_REACTIVE_TRAP.md -->

# Reactive Trap

## What / Why
Wrapping JpaRepository in Mono does not make database access reactive.

## Mental Model
```text
Reactive Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Reactive Trap:** Wrapping JpaRepository in Mono does not make database access reactive.


---

<!-- 533_MULTI_TENANCY_STRATEGIES.md -->

# Multi Tenancy Strategies

## What / Why
Separate database, separate schema or discriminator/shared table.

## Mental Model
```text
Multi Tenancy Strategies → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Multi Tenancy Strategies:** Separate database, separate schema or discriminator/shared table.


---

<!-- 534_DATABASE_PER_TENANT.md -->

# Database Per Tenant

## What / Why
Strong isolation, more connection pools/operational overhead.

## Mental Model
```text
Database Per Tenant → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Database Per Tenant:** Strong isolation, more connection pools/operational overhead.


---

<!-- 535_SCHEMA_PER_TENANT.md -->

# Schema Per Tenant

## What / Why
Shared DB server with schema isolation.

## Mental Model
```text
Schema Per Tenant → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Schema Per Tenant:** Shared DB server with schema isolation.


---

<!-- 536_DISCRIMINATOR_TENANT.md -->

# Discriminator Tenant

## What / Why
Tenant column in shared tables.

## Mental Model
```text
Discriminator Tenant → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Discriminator Tenant:** Tenant column in shared tables.


---

<!-- 537_CURRENT_TENANT_IDENTIFIER.md -->

# Current Tenant Identifier

## What / Why
Provider resolves current tenant for connection/filtering.

## Mental Model
```text
Current Tenant Identifier → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Current Tenant Identifier:** Provider resolves current tenant for connection/filtering.


---

<!-- 538_MULTITENANTCONNECTIONPROVIDER.md -->

# MultiTenantConnectionProvider

## What / Why
Hibernate connection routing abstraction.

## Mental Model
```text
MultiTenantConnectionProvider → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **MultiTenantConnectionProvider:** Hibernate connection routing abstraction.


---

<!-- 539_TENANT_FILTER.md -->

# Tenant Filter

## What / Why
Discriminator designs require enforced tenant predicate.

## Mental Model
```text
Tenant Filter → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Tenant Filter:** Discriminator designs require enforced tenant predicate.


---

<!-- 540_TENANT_SECURITY.md -->

# Tenant Security

## What / Why
Never trust client tenant ID without authenticated authorization mapping.

## Mental Model
```text
Tenant Security → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Tenant Security:** Never trust client tenant ID without authenticated authorization mapping.


---

<!-- 541_TENANT_UNIQUE_CONSTRAINTS.md -->

# Tenant Unique Constraints

## What / Why
Include tenant key in uniqueness/index design.

## Mental Model
```text
Tenant Unique Constraints → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Tenant Unique Constraints:** Include tenant key in uniqueness/index design.


---

<!-- 542_TENANT_CACHE_ISOLATION.md -->

# Tenant Cache Isolation

## What / Why
Cache keys/regions must not leak across tenants.

## Mental Model
```text
Tenant Cache Isolation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Tenant Cache Isolation:** Cache keys/regions must not leak across tenants.


---

<!-- 543_TENANT_MIGRATIONS.md -->

# Tenant Migrations

## What / Why
Run schema migrations consistently across tenant DBs/schemas.

## Mental Model
```text
Tenant Migrations → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Tenant Migrations:** Run schema migrations consistently across tenant DBs/schemas.


---

<!-- 544_AGGREGATE_ROOT.md -->

# Aggregate Root

## What / Why
Transaction consistency boundary owning child entities/value objects.

## Mental Model
```text
Aggregate Root → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Aggregate Root:** Transaction consistency boundary owning child entities/value objects.


---

<!-- 545_REPOSITORY_PER_AGGREGATE.md -->

# Repository per Aggregate

## What / Why
Expose repository for aggregate root rather than every table.

## Mental Model
```text
Repository per Aggregate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository per Aggregate:** Expose repository for aggregate root rather than every table.


---

<!-- 546_ENTITY_VS_VALUE_OBJECT.md -->

# Entity vs Value Object

## What / Why
Entities have identity; embeddables/value objects use value semantics.

## Mental Model
```text
Entity vs Value Object → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Entity vs Value Object:** Entities have identity; embeddables/value objects use value semantics.


---

<!-- 547_CASCADE_INSIDE_AGGREGATE.md -->

# Cascade Inside Aggregate

## What / Why
Cascades fit aggregate ownership better than arbitrary graph propagation.

## Mental Model
```text
Cascade Inside Aggregate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Cascade Inside Aggregate:** Cascades fit aggregate ownership better than arbitrary graph propagation.


---

<!-- 548_ORPHANREMOVAL_AGGREGATE.md -->

# orphanRemoval Aggregate

## What / Why
Useful for privately owned children.

## Mental Model
```text
orphanRemoval Aggregate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **orphanRemoval Aggregate:** Useful for privately owned children.


---

<!-- 549_MANYTOMANY_DDD_TRAP.md -->

# ManyToMany DDD Trap

## What / Why
Direct many-to-many often hides association entity with domain attributes.

## Mental Model
```text
ManyToMany DDD Trap → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **ManyToMany DDD Trap:** Direct many-to-many often hides association entity with domain attributes.


---

<!-- 550_ASSOCIATION_ENTITY.md -->

# Association Entity

## What / Why
Model join table as entity when relation has lifecycle/data.

## Mental Model
```text
Association Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Association Entity:** Model join table as entity when relation has lifecycle/data.


---

<!-- 551_LAZY_AGGREGATE_BOUNDARY.md -->

# Lazy Aggregate Boundary

## What / Why
Avoid loading unrelated aggregates through deep ORM graph.

## Mental Model
```text
Lazy Aggregate Boundary → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Lazy Aggregate Boundary:** Avoid loading unrelated aggregates through deep ORM graph.


---

<!-- 552_DOMAIN_LOGIC_IN_ENTITY.md -->

# Domain Logic in Entity

## What / Why
Rich domain model can coexist with JPA when proxy/constructor/equality constraints are respected.

## Mental Model
```text
Domain Logic in Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Domain Logic in Entity:** Rich domain model can coexist with JPA when proxy/constructor/equality constraints are respected.


---

<!-- 553_REPOSITORY_ABSTRACTION.md -->

# Repository Abstraction

## What / Why
Domain should depend on repository contract, not leak EntityManager everywhere.

## Mental Model
```text
Repository Abstraction → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Abstraction:** Domain should depend on repository contract, not leak EntityManager everywhere.


---

<!-- 554_REPOSITORY_FRAGMENT.md -->

# Repository Fragment

## What / Why
Reusable custom implementation composed into repository proxy.

## Mental Model
```text
Repository Fragment → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Fragment:** Reusable custom implementation composed into repository proxy.


---

<!-- 555_CUSTOM_REPOSITORY_INTERFACE.md -->

# Custom Repository Interface

## What / Why
Declare additional domain-specific methods.

## Mental Model
```text
Custom Repository Interface → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Custom Repository Interface:** Declare additional domain-specific methods.


---

<!-- 556_FRAGMENT_IMPLEMENTATION.md -->

# Fragment Implementation

## What / Why
Spring discovers implementation by configured naming/fragment model.

## Mental Model
```text
Fragment Implementation → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fragment Implementation:** Spring discovers implementation by configured naming/fragment model.


---

<!-- 557_ENTITYMANAGER_INJECTION.md -->

# EntityManager Injection

## What / Why
Custom implementation can use EntityManager directly.

## Mental Model
```text
EntityManager Injection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityManager Injection:** Custom implementation can use EntityManager directly.


---

<!-- 558_JDBCTEMPLATE_IN_FRAGMENT.md -->

# JdbcTemplate in Fragment

## What / Why
Use SQL/JDBC selectively for query performance.

## Mental Model
```text
JdbcTemplate in Fragment → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JdbcTemplate in Fragment:** Use SQL/JDBC selectively for query performance.


---

<!-- 559_QUERYDSL_FRAGMENT.md -->

# Querydsl Fragment

## What / Why
Integrate Querydsl where chosen.

## Mental Model
```text
Querydsl Fragment → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Querydsl Fragment:** Integrate Querydsl where chosen.


---

<!-- 560_BASE_REPOSITORY_CUSTOMIZATION.md -->

# Base Repository Customization

## What / Why
Override common repository base class.

## Mental Model
```text
Base Repository Customization → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Base Repository Customization:** Override common repository base class.


---

<!-- 561_JPAREPOSITORYFACTORYBEAN.md -->

# JpaRepositoryFactoryBean

## What / Why
Advanced hook to customize repository factory.

## Mental Model
```text
JpaRepositoryFactoryBean → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JpaRepositoryFactoryBean:** Advanced hook to customize repository factory.


---

<!-- 562_CUSTOM_BASE_REPOSITORY.md -->

# Custom Base Repository

## What / Why
Centralize organization-specific methods carefully.

## Mental Model
```text
Custom Base Repository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Custom Base Repository:** Centralize organization-specific methods carefully.


---

<!-- 563_REPOSITORY_FRAGMENT_COMPOSITION.md -->

# Repository Fragment Composition

## What / Why
Prefer focused fragments over giant generic repository base.

## Mental Model
```text
Repository Fragment Composition → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Fragment Composition:** Prefer focused fragments over giant generic repository base.


---

<!-- 564_SPEL_ENTITY_NAME.md -->

# SpEL Entity Name

## What / Why
Use `#{#entityName}` in generic @Query.

## Mental Model
```text
SpEL Entity Name → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SpEL Entity Name:** Use `#{#entityName}` in generic @Query.


---

<!-- 565_SECURITY_PRINCIPAL_IN_QUERY.md -->

# Security Principal in Query

## What / Why
SpEL can reference authentication context through extensions where configured.

## Mental Model
```text
Security Principal in Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Security Principal in Query:** SpEL can reference authentication context through extensions where configured.


---

<!-- 566_EVALUATIONCONTEXTEXTENSION.md -->

# EvaluationContextExtension

## What / Why
Expose application context values to repository query SpEL.

## Mental Model
```text
EvaluationContextExtension → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EvaluationContextExtension:** Expose application context values to repository query SpEL.


---

<!-- 567_SPEL_RISK.md -->

# SpEL Risk

## What / Why
Dynamic expressions can obscure query behavior and security; prefer explicit parameters when possible.

## Mental Model
```text
SpEL Risk → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SpEL Risk:** Dynamic expressions can obscure query behavior and security; prefer explicit parameters when possible.


---

<!-- 568_OPTIONAL.md -->

# Optional

## What / Why
Zero or one result.

## Mental Model
```text
Optional → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optional:** Zero or one result.


---

<!-- 569_LIST.md -->

# List

## What / Why
Materialized multi-row result.

## Mental Model
```text
List → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **List:** Materialized multi-row result.


---

<!-- 570_SET.md -->

# Set

## What / Why
Unique materialized result.

## Mental Model
```text
Set → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Set:** Unique materialized result.


---

<!-- 571_STREAM.md -->

# Stream

## What / Why
Lazy JDBC-backed stream requiring close.

## Mental Model
```text
Stream → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Stream:** Lazy JDBC-backed stream requiring close.


---

<!-- 572_PAGE.md -->

# Page

## What / Why
Content plus total count metadata.

## Mental Model
```text
Page → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Page:** Content plus total count metadata.


---

<!-- 573_SLICE.md -->

# Slice

## What / Why
Content plus next-page indication.

## Mental Model
```text
Slice → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Slice:** Content plus next-page indication.


---

<!-- 574_WINDOW.md -->

# Window

## What / Why
Scrolling window.

## Mental Model
```text
Window → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Window:** Scrolling window.


---

<!-- 575_FUTURE_ASYNC_REPOSITORY.md -->

# Future Async Repository

## What / Why
@Async repository methods return Future/CompletableFuture but still execute blocking JPA on task executor.

## Mental Model
```text
Future Async Repository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Future Async Repository:** @Async repository methods return Future/CompletableFuture but still execute blocking JPA on task executor.


---

<!-- 576_COMPLETABLEFUTURE.md -->

# CompletableFuture

## What / Why
Asynchronous wrapper around blocking repository work.

## Mental Model
```text
CompletableFuture → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CompletableFuture:** Asynchronous wrapper around blocking repository work.


---

<!-- 577_VAVR_COLLECTIONS.md -->

# Vavr Collections

## What / Why
Spring Data supports selected alternative collection types.

## Mental Model
```text
Vavr Collections → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Vavr Collections:** Spring Data supports selected alternative collection types.


---

<!-- 578_NULLABILITY.md -->

# Nullability

## What / Why
Repository nullability annotations and Optional contracts clarify absence.

## Mental Model
```text
Nullability → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Nullability:** Repository nullability annotations and Optional contracts clarify absence.


---

<!-- 579_ASYNC_REPOSITORY.md -->

# @Async Repository

## What / Why
Runs blocking JPA method on task executor.

## Mental Model
```text
@Async Repository → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **@Async Repository:** Runs blocking JPA method on task executor.


---

<!-- 580_ASYNC_DOES_NOT_MEAN_REACTIVE.md -->

# Async Does Not Mean Reactive

## What / Why
JPA/JDBC remains blocking even when executed on background thread.

## Mental Model
```text
Async Does Not Mean Reactive → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Async Does Not Mean Reactive:** JPA/JDBC remains blocking even when executed on background thread.


---

<!-- 581_EXECUTOR_SIZING.md -->

# Executor Sizing

## What / Why
Async repository executor must be bounded relative to DB connection pool.

## Mental Model
```text
Executor Sizing → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Executor Sizing:** Async repository executor must be bounded relative to DB connection pool.


---

<!-- 582_TRANSACTION_PROPAGATION_ASYNC.md -->

# Transaction Propagation Async

## What / Why
Transaction context does not automatically cross arbitrary async thread boundary.

## Mental Model
```text
Transaction Propagation Async → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Transaction Propagation Async:** Transaction context does not automatically cross arbitrary async thread boundary.


---

<!-- 583_ASYNC_USE_CASE.md -->

# Async Use Case

## What / Why
Useful for independent background blocking work, not a replacement for R2DBC.

## Mental Model
```text
Async Use Case → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Async Use Case:** Useful for independent background blocking work, not a replacement for R2DBC.


---

<!-- 584_SPRING_DATA_JPA_4_1_1.md -->

# Spring Data JPA 4.1.1

## What / Why
Current stable Spring Data JPA baseline.

## Mental Model
```text
Spring Data JPA 4.1.1 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Spring Data JPA 4.1.1:** Current stable Spring Data JPA baseline.


---

<!-- 585_4_2_0_M1.md -->

# 4.2.0 M1

## What / Why
Current preview line; avoid treating milestone APIs as production baseline.

## Mental Model
```text
4.2.0 M1 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **4.2.0 M1:** Current preview line; avoid treating milestone APIs as production baseline.


---

<!-- 586_SPRING_DATA_COMMONS_4_1.md -->

# Spring Data Commons 4.1

## What / Why
Repository infrastructure generation paired with JPA 4.1.

## Mental Model
```text
Spring Data Commons 4.1 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Spring Data Commons 4.1:** Repository infrastructure generation paired with JPA 4.1.


---

<!-- 587_JAKARTA_NAMESPACE.md -->

# Jakarta Namespace

## What / Why
Modern Spring Data JPA uses `jakarta.persistence` APIs.

## Mental Model
```text
Jakarta Namespace → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Jakarta Namespace:** Modern Spring Data JPA uses `jakarta.persistence` APIs.


---

<!-- 588_SCROLL_API.md -->

# Scroll API

## What / Why
Window/ScrollPosition support for large result traversal.

## Mental Model
```text
Scroll API → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Scroll API:** Window/ScrollPosition support for large result traversal.


---

<!-- 589_FLUENT_SPECIFICATION_QUERY.md -->

# Fluent Specification Query

## What / Why
Modern JpaSpecificationExecutor supports fluent query customization/projections.

## Mental Model
```text
Fluent Specification Query → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fluent Specification Query:** Modern JpaSpecificationExecutor supports fluent query customization/projections.


---

<!-- 590_DELETE_SPECIFICATION.md -->

# Delete Specification

## What / Why
Modern repository APIs include Specification-based bulk delete capabilities.

## Mental Model
```text
Delete Specification → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Delete Specification:** Modern repository APIs include Specification-based bulk delete capabilities.


---

<!-- 591_REPOSITORY_MODERNIZATION.md -->

# Repository Modernization

## What / Why
Use ListCrudRepository and modern query/projection APIs where they simplify code.

## Mental Model
```text
Repository Modernization → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Repository Modernization:** Use ListCrudRepository and modern query/projection APIs where they simplify code.


---

<!-- 592_RECORD_EMBEDDABLES_3_2.md -->

# Record Embeddables 3.2

## What / Why
Java records may be used as embeddable value types.

## Mental Model
```text
Record Embeddables 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Record Embeddables 3.2:** Java records may be used as embeddable value types.


---

<!-- 593_INSTANT_3_2.md -->

# Instant 3.2

## What / Why
Instant basic mapping standardized.

## Mental Model
```text
Instant 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Instant 3.2:** Instant basic mapping standardized.


---

<!-- 594_YEAR_3_2.md -->

# Year 3.2

## What / Why
Year basic mapping standardized.

## Mental Model
```text
Year 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Year 3.2:** Year basic mapping standardized.


---

<!-- 595_SET_OPERATIONS_3_2.md -->

# Set Operations 3.2

## What / Why
JPQL/Criteria union, intersect and except added.

## Mental Model
```text
Set Operations 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Set Operations 3.2:** JPQL/Criteria union, intersect and except added.


---

<!-- 596_STRING_CONCATENATION_3_2.md -->

# String Concatenation 3.2

## What / Why
`||` operator added.

## Mental Model
```text
String Concatenation 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **String Concatenation 3.2:** `||` operator added.


---

<!-- 597_STRING_FUNCTIONS_3_2.md -->

# String Functions 3.2

## What / Why
left, right and replace added.

## Mental Model
```text
String Functions 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **String Functions 3.2:** left, right and replace added.


---

<!-- 598_CAST_3_2.md -->

# cast 3.2

## What / Why
Portable cast function added.

## Mental Model
```text
cast 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **cast 3.2:** Portable cast function added.


---

<!-- 599_ID_3_2.md -->

# id 3.2

## What / Why
ID function added.

## Mental Model
```text
id 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **id 3.2:** ID function added.


---

<!-- 600_VERSION_3_2.md -->

# version 3.2

## What / Why
Version function added.

## Mental Model
```text
version 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **version 3.2:** Version function added.


---

<!-- 601_NULL_PRECEDENCE_3_2.md -->

# Null Precedence 3.2

## What / Why
Ordering can specify null precedence.

## Mental Model
```text
Null Precedence 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Null Precedence 3.2:** Ordering can specify null precedence.


---

<!-- 602_GETSINGLERESULTORNULL_3_2.md -->

# getSingleResultOrNull 3.2

## What / Why
Query APIs can return null instead of throwing NoResultException for zero result.

## Mental Model
```text
getSingleResultOrNull 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **getSingleResultOrNull 3.2:** Query APIs can return null instead of throwing NoResultException for zero result.


---

<!-- 603_CRITERIASELECT_3_2.md -->

# CriteriaSelect 3.2

## What / Why
Common select criteria interface added.

## Mental Model
```text
CriteriaSelect 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **CriteriaSelect 3.2:** Common select criteria interface added.


---

<!-- 604_ENTITYTYPE_CRITERIA_JOIN_3_2.md -->

# EntityType Criteria Join 3.2

## What / Why
Criteria API expanded for EntityType joins/subqueries.

## Mental Model
```text
EntityType Criteria Join 3.2 → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityType Criteria Join 3.2:** Criteria API expanded for EntityType joins/subqueries.


---

<!-- 605_SQL_INJECTION.md -->

# SQL Injection

## What / Why
Use parameter binding; never concatenate untrusted SQL/JPQL fragments.

## Mental Model
```text
SQL Injection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **SQL Injection:** Use parameter binding; never concatenate untrusted SQL/JPQL fragments.


---

<!-- 606_DYNAMIC_SORT_INJECTION.md -->

# Dynamic Sort Injection

## What / Why
Validate user-selected sort properties against allowlist.

## Mental Model
```text
Dynamic Sort Injection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Dynamic Sort Injection:** Validate user-selected sort properties against allowlist.


---

<!-- 607_TENANT_PREDICATE.md -->

# Tenant Predicate

## What / Why
Enforce tenant ownership at persistence layer, not just controller.

## Mental Model
```text
Tenant Predicate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Tenant Predicate:** Enforce tenant ownership at persistence layer, not just controller.


---

<!-- 608_MASS_ASSIGNMENT.md -->

# Mass Assignment

## What / Why
Do not bind web DTO directly into managed entity blindly.

## Mental Model
```text
Mass Assignment → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Mass Assignment:** Do not bind web DTO directly into managed entity blindly.


---

<!-- 609_SENSITIVE_FIELD_PROJECTION.md -->

# Sensitive Field Projection

## What / Why
Do not expose entity/projection fields containing secrets/PII unnecessarily.

## Mental Model
```text
Sensitive Field Projection → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Sensitive Field Projection:** Do not expose entity/projection fields containing secrets/PII unnecessarily.


---

<!-- 610_ENCRYPTED_COLUMNS.md -->

# Encrypted Columns

## What / Why
Application/database encryption strategy is beyond JPA portable semantics.

## Mental Model
```text
Encrypted Columns → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Encrypted Columns:** Application/database encryption strategy is beyond JPA portable semantics.


---

<!-- 611_CREDENTIAL_LOGGING.md -->

# Credential Logging

## What / Why
Do not log JDBC credentials/bind sensitive parameters.

## Mental Model
```text
Credential Logging → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Credential Logging:** Do not log JDBC credentials/bind sensitive parameters.


---

<!-- 612_ROW_LEVEL_SECURITY.md -->

# Row Level Security

## What / Why
Database RLS can complement application authorization.

## Mental Model
```text
Row Level Security → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Row Level Security:** Database RLS can complement application authorization.


---

<!-- 613_SOFT_DELETE_SECURITY.md -->

# Soft Delete Security

## What / Why
Deleted rows must not reappear through native/unfiltered queries.

## Mental Model
```text
Soft Delete Security → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Soft Delete Security:** Deleted rows must not reappear through native/unfiltered queries.


---

<!-- 614_LAZYINITIALIZATIONEXCEPTION.md -->

# LazyInitializationException

## What / Why
Lazy association accessed outside active Hibernate session/persistence context.

## Mental Model
```text
LazyInitializationException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **LazyInitializationException:** Lazy association accessed outside active Hibernate session/persistence context.


---

<!-- 615_DETACHED_ENTITY_PASSED_TO_PERSIST.md -->

# Detached Entity Passed to Persist

## What / Why
Persist called on detached entity/incorrect aggregate cascade.

## Mental Model
```text
Detached Entity Passed to Persist → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Detached Entity Passed to Persist:** Persist called on detached entity/incorrect aggregate cascade.


---

<!-- 616_TRANSIENTOBJECTEXCEPTION.md -->

# TransientObjectException

## What / Why
Managed entity references unsaved transient entity without appropriate cascade/order.

## Mental Model
```text
TransientObjectException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **TransientObjectException:** Managed entity references unsaved transient entity without appropriate cascade/order.


---

<!-- 617_PERSISTENTOBJECTEXCEPTION.md -->

# PersistentObjectException

## What / Why
Entity lifecycle method conflicts with entity state.

## Mental Model
```text
PersistentObjectException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **PersistentObjectException:** Entity lifecycle method conflicts with entity state.


---

<!-- 618_ENTITYEXISTSEXCEPTION.md -->

# EntityExistsException

## What / Why
Persist attempted with conflicting existing identity.

## Mental Model
```text
EntityExistsException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **EntityExistsException:** Persist attempted with conflicting existing identity.


---

<!-- 619_OPTIMISTICLOCKEXCEPTION.md -->

# OptimisticLockException

## What / Why
Version mismatch due to concurrent modification.

## Mental Model
```text
OptimisticLockException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **OptimisticLockException:** Version mismatch due to concurrent modification.


---

<!-- 620_PESSIMISTICLOCKEXCEPTION.md -->

# PessimisticLockException

## What / Why
Database pessimistic lock failed.

## Mental Model
```text
PessimisticLockException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **PessimisticLockException:** Database pessimistic lock failed.


---

<!-- 621_LOCKTIMEOUTEXCEPTION.md -->

# LockTimeoutException

## What / Why
Lock acquisition exceeded timeout.

## Mental Model
```text
LockTimeoutException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **LockTimeoutException:** Lock acquisition exceeded timeout.


---

<!-- 622_TRANSACTIONREQUIREDEXCEPTION.md -->

# TransactionRequiredException

## What / Why
Write/lock operation requires active transaction.

## Mental Model
```text
TransactionRequiredException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **TransactionRequiredException:** Write/lock operation requires active transaction.


---

<!-- 623_NONUNIQUERESULTEXCEPTION.md -->

# NonUniqueResultException

## What / Why
Single-result query returned multiple rows.

## Mental Model
```text
NonUniqueResultException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NonUniqueResultException:** Single-result query returned multiple rows.


---

<!-- 624_NORESULTEXCEPTION.md -->

# NoResultException

## What / Why
Legacy getSingleResult returned zero rows.

## Mental Model
```text
NoResultException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **NoResultException:** Legacy getSingleResult returned zero rows.


---

<!-- 625_N_PLUS_ONE.md -->

# N Plus One

## What / Why
Unexpected repeated association SELECTs.

## Mental Model
```text
N Plus One → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **N Plus One:** Unexpected repeated association SELECTs.


---

<!-- 626_MULTIPLEBAGFETCHEXCEPTION.md -->

# MultipleBagFetchException

## What / Why
Hibernate cannot fetch multiple bag collections in one query.

## Mental Model
```text
MultipleBagFetchException → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **MultipleBagFetchException:** Hibernate cannot fetch multiple bag collections in one query.


---

<!-- 627_BATCH_NOT_WORKING.md -->

# Batch Not Working

## What / Why
IDENTITY, SQL shape, flush pattern or config prevents batching.

## Mental Model
```text
Batch Not Working → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Batch Not Working:** IDENTITY, SQL shape, flush pattern or config prevents batching.


---

<!-- 628_SAVE_DID_NOT_UPDATE.md -->

# Save Did Not Update

## What / Why
Entity detached/not dirty/transaction missing or update deferred until flush.

## Mental Model
```text
Save Did Not Update → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Save Did Not Update:** Entity detached/not dirty/transaction missing or update deferred until flush.


---

<!-- 629_DELETE_DID_NOT_CASCADE.md -->

# Delete Did Not Cascade

## What / Why
Cascade/orphan ownership mapping not configured as assumed.

## Mental Model
```text
Delete Did Not Cascade → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Delete Did Not Cascade:** Cascade/orphan ownership mapping not configured as assumed.


---

<!-- 630_DUPLICATE_KEY_ON_FLUSH.md -->

# Duplicate Key on Flush

## What / Why
Constraint violation appears at flush/commit rather than save call.

## Mental Model
```text
Duplicate Key on Flush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Duplicate Key on Flush:** Constraint violation appears at flush/commit rather than save call.


---

<!-- 631_UNEXPECTED_FLUSH.md -->

# Unexpected Flush

## What / Why
AUTO flush triggered before query/commit.

## Mental Model
```text
Unexpected Flush → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Unexpected Flush:** AUTO flush triggered before query/commit.


---

<!-- 632_STALE_DATA_AFTER_BULK_UPDATE.md -->

# Stale Data After Bulk Update

## What / Why
Persistence context still contains old managed state.

## Mental Model
```text
Stale Data After Bulk Update → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Stale Data After Bulk Update:** Persistence context still contains old managed state.


---

<!-- 633_PAGE_QUERY_SLOW.md -->

# Page Query Slow

## What / Why
Count query or OFFSET scan expensive.

## Mental Model
```text
Page Query Slow → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Page Query Slow:** Count query or OFFSET scan expensive.


---

<!-- 634_HIGH_MEMORY.md -->

# High Memory

## What / Why
Persistence context/entity graph/collection too large.

## Mental Model
```text
High Memory → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **High Memory:** Persistence context/entity graph/collection too large.


---

<!-- 635_CONNECTION_POOL_EXHAUSTED.md -->

# Connection Pool Exhausted

## What / Why
Long transactions/slow queries/high concurrency consume all JDBC connections.

## Mental Model
```text
Connection Pool Exhausted → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Connection Pool Exhausted:** Long transactions/slow queries/high concurrency consume all JDBC connections.


---

<!-- 636_GOLDEN_JPA_DEBUG_FLOW.md -->

# Golden JPA Debug Flow

## What / Why
Transaction → persistence context → mapping → generated SQL → DB plan/locks → repository abstraction.

## Mental Model
```text
Golden JPA Debug Flow → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Golden JPA Debug Flow:** Transaction → persistence context → mapping → generated SQL → DB plan/locks → repository abstraction.


---

<!-- 637_DESIGN_CRUD_SERVICE.md -->

# Design CRUD Service

## What / Why
Entity mappings + service transaction + repositories + validation + migrations.

## Mental Model
```text
Design CRUD Service → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design CRUD Service:** Entity mappings + service transaction + repositories + validation + migrations.


---

<!-- 638_DESIGN_READ_HEAVY_API.md -->

# Design Read Heavy API

## What / Why
DTO projections + indexes + keyset pagination + read-only transaction.

## Mental Model
```text
Design Read Heavy API → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Read Heavy API:** DTO projections + indexes + keyset pagination + read-only transaction.


---

<!-- 639_DESIGN_WRITE_HEAVY_IMPORT.md -->

# Design Write Heavy Import

## What / Why
Sequence IDs + JDBC batching + flush/clear + bulk SQL when appropriate.

## Mental Model
```text
Design Write Heavy Import → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Write Heavy Import:** Sequence IDs + JDBC batching + flush/clear + bulk SQL when appropriate.


---

<!-- 640_DESIGN_AGGREGATE_PERSISTENCE.md -->

# Design Aggregate Persistence

## What / Why
Repository per aggregate + cascade/orphan within ownership boundary.

## Mental Model
```text
Design Aggregate Persistence → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Aggregate Persistence:** Repository per aggregate + cascade/orphan within ownership boundary.


---

<!-- 641_DESIGN_AUDIT_HISTORY.md -->

# Design Audit History

## What / Why
Spring Data auditing for current metadata + Envers for revisions where justified.

## Mental Model
```text
Design Audit History → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Audit History:** Spring Data auditing for current metadata + Envers for revisions where justified.


---

<!-- 642_DESIGN_MULTI_TENANT_JPA.md -->

# Design Multi Tenant JPA

## What / Why
Tenant resolver + DB/schema/discriminator + security + migration/cache isolation.

## Mental Model
```text
Design Multi Tenant JPA → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Multi Tenant JPA:** Tenant resolver + DB/schema/discriminator + security + migration/cache isolation.


---

<!-- 643_DESIGN_SOFT_DELETE.md -->

# Design Soft Delete

## What / Why
Provider/native or filter approach + unique/index/query/audit strategy.

## Mental Model
```text
Design Soft Delete → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Soft Delete:** Provider/native or filter approach + unique/index/query/audit strategy.


---

<!-- 644_DESIGN_CONCURRENCY.md -->

# Design Concurrency

## What / Why
@Version optimistic lock + retries or pessimistic locks for hot critical rows.

## Mental Model
```text
Design Concurrency → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Concurrency:** @Version optimistic lock + retries or pessimistic locks for hot critical rows.


---

<!-- 645_DESIGN_OUTBOX.md -->

# Design Outbox

## What / Why
Entity/business transaction persists outbox record; relay publishes after commit.

## Mental Model
```text
Design Outbox → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Design Outbox:** Entity/business transaction persists outbox record; relay publishes after commit.


---

<!-- 646_JPA_VS_HIBERNATE.md -->

# JPA vs Hibernate

## What / Why
Spec vs provider.

## Mental Model
```text
JPA vs Hibernate → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA vs Hibernate:** Spec vs provider.


---

<!-- 647_JPA_VS_SPRING_DATA_JPA.md -->

# JPA vs Spring Data JPA

## What / Why
ORM API/semantics vs repository abstraction.

## Mental Model
```text
JPA vs Spring Data JPA → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA vs Spring Data JPA:** ORM API/semantics vs repository abstraction.


---

<!-- 648_JPAREPOSITORY_VS_ENTITYMANAGER.md -->

# JpaRepository vs EntityManager

## What / Why
High-level repository convenience vs direct persistence/query control.

## Mental Model
```text
JpaRepository vs EntityManager → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JpaRepository vs EntityManager:** High-level repository convenience vs direct persistence/query control.


---

<!-- 649_PERSIST_VS_MERGE.md -->

# persist vs merge

## What / Why
Persist makes new instance managed; merge copies state and returns another managed instance.

## Mental Model
```text
persist vs merge → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **persist vs merge:** Persist makes new instance managed; merge copies state and returns another managed instance.


---

<!-- 650_SAVE_VS_PERSIST.md -->

# save vs persist

## What / Why
Spring Data save chooses persist/merge; JPA persist has explicit lifecycle semantics.

## Mental Model
```text
save vs persist → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **save vs persist:** Spring Data save chooses persist/merge; JPA persist has explicit lifecycle semantics.


---

<!-- 651_LAZY_VS_EAGER.md -->

# LAZY vs EAGER

## What / Why
Fetch timing hints/requirements, not exact SQL join strategy.

## Mental Model
```text
LAZY vs EAGER → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **LAZY vs EAGER:** Fetch timing hints/requirements, not exact SQL join strategy.


---

<!-- 652_FETCH_JOIN_VS_ENTITYGRAPH.md -->

# Fetch Join vs EntityGraph

## What / Why
Query-specific JPQL fetch vs declarative fetch plan.

## Mental Model
```text
Fetch Join vs EntityGraph → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Fetch Join vs EntityGraph:** Query-specific JPQL fetch vs declarative fetch plan.


---

<!-- 653_PAGE_VS_SLICE_VS_WINDOW.md -->

# Page vs Slice vs Window

## What / Why
Total-count page vs no-count slice vs scrolling/keyset-oriented window.

## Mental Model
```text
Page vs Slice vs Window → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Page vs Slice vs Window:** Total-count page vs no-count slice vs scrolling/keyset-oriented window.


---

<!-- 654_SPECIFICATION_VS_QUERY_BY_EXAMPLE.md -->

# Specification vs Query by Example

## What / Why
Composable dynamic predicates vs simple probe-based matching.

## Mental Model
```text
Specification vs Query by Example → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Specification vs Query by Example:** Composable dynamic predicates vs simple probe-based matching.


---

<!-- 655_PROJECTION_VS_ENTITY.md -->

# Projection vs Entity

## What / Why
Read shape/DTO vs managed mutable persistence object.

## Mental Model
```text
Projection vs Entity → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Projection vs Entity:** Read shape/DTO vs managed mutable persistence object.


---

<!-- 656_OPTIMISTIC_VS_PESSIMISTIC.md -->

# Optimistic vs Pessimistic

## What / Why
Conflict detection vs database lock.

## Mental Model
```text
Optimistic vs Pessimistic → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Optimistic vs Pessimistic:** Conflict detection vs database lock.


---

<!-- 657_FIRST_VS_SECOND_LEVEL_CACHE.md -->

# First vs Second Level Cache

## What / Why
Persistence-context identity cache vs shared provider cache.

## Mental Model
```text
First vs Second Level Cache → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **First vs Second Level Cache:** Persistence-context identity cache vs shared provider cache.


---

<!-- 658_JPA_VS_R2DBC.md -->

# JPA vs R2DBC

## What / Why
Blocking ORM/persistence context vs reactive relational API.

## Mental Model
```text
JPA vs R2DBC → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **JPA vs R2DBC:** Blocking ORM/persistence context vs reactive relational API.


---

<!-- 659_WHEN_NOT_TO_USE_JPA.md -->

# When Not to Use JPA

## What / Why
Complex analytical SQL, bulk ETL, highly specialized DB features or reactive end-to-end stack may fit SQL/JdbcClient/jOOQ/R2DBC better.

## Mental Model
```text
When Not to Use JPA → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **When Not to Use JPA:** Complex analytical SQL, bulk ETL, highly specialized DB features or reactive end-to-end stack may fit SQL/JdbcClient/jOOQ/R2DBC better.


---

<!-- 660_SPRING_DATA_JPA_ANTI_PATTERNS.md -->

# Spring Data JPA Anti Patterns

## What / Why
Entity everywhere, EAGER everywhere, save managed entities, OSIV reliance, N+1, giant aggregates, no indexes, H2-only tests.

## Mental Model
```text
Spring Data JPA Anti Patterns → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Spring Data JPA Anti Patterns:** Entity everywhere, EAGER everywhere, save managed entities, OSIV reliance, N+1, giant aggregates, no indexes, H2-only tests.


---

<!-- 661_SPRING_DATA_JPA_INTERVIEW_TRAPS.md -->

# Spring Data JPA Interview Traps

## What / Why
High-value lifecycle/fetch/transaction/query/repository misconceptions.

## Mental Model
```text
Spring Data JPA Interview Traps → persistence context → generated SQL → database behavior
```

## How to Think About It
1. Is this a JPA rule, a Hibernate behavior, or a Spring Data abstraction?
2. What is the entity lifecycle state?
3. Is there an active transaction?
4. Which associations/columns are actually loaded?
5. When will SQL execute: now, flush, or commit?
6. What happens under concurrent transactions?
7. What SQL and execution plan does the database see?

## Production Questions
```text
Transaction boundary?
Fetch plan?
Query count?
Index?
Locking?
Batching?
Persistence-context size?
Migration?
Tenant/security?
Database plan?
```

## Common Trap
ORM convenience does not replace database engineering. Always connect the Java mapping/query to the actual SQL, indexes, locks, transaction isolation and execution plan.

## 20-Second Recall
> **Spring Data JPA Interview Traps:** High-value lifecycle/fetch/transaction/query/repository misconceptions.
