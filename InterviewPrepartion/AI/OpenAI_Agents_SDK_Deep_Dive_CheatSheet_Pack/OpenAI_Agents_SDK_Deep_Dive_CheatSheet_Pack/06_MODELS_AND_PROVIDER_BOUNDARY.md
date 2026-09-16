# Models and Provider Boundary

## Default

For OpenAI models, the Agents SDK uses the Responses API by default.

## Architecture Principle

Keep business logic dependent on Agent SDK/runtime abstractions rather than scattering raw provider calls throughout the application.

## Non-OpenAI / Alternative Model Paths

The SDK supports model/provider customization. Treat provider capability differences explicitly rather than assuming identical support.

## Interview Point

> Even when using an OpenAI-first SDK, I keep business logic separate from model-specific concerns so provider choice remains an architectural boundary.
