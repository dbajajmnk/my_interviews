# Required, Optional, Enums and Bounds

## Required Fields

Mark truly mandatory fields as required so missing values are caught early.

## Optional Fields

Use optionality deliberately. Too many optional fields weaken the contract.

## Enums

Enums are excellent for:
- routing;
- statuses;
- categories;
- policy decisions.

## Bounds

Use bounds where supported/appropriate:
- numeric ranges;
- string lengths;
- array sizes.

## Rule

If downstream code branches on a field, constrain that field as much as reasonably possible.
