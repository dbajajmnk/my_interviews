# Composition API vs Options API

| Composition API | Options API |
|---|---|
| logic grouped by feature | logic grouped by option type |
| composables | mixins / option reuse |
| excellent TypeScript inference | simpler for some small components |
| `<script setup>` modern style | familiar classic Vue style |
| no component-instance `this` | uses `this` |

## Recommendation

For modern large Vue 3 applications:
```text
Composition API + <script setup>
```

But Options API remains fully supported and is important for legacy/enterprise maintenance.

## Interview Trap

Composition API is not “Vue 4” and Options API is not deprecated simply because Composition API is popular.
