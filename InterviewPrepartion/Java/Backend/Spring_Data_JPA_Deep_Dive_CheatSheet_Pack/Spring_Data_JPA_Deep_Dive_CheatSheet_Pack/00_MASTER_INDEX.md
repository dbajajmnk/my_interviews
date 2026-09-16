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
