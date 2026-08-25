# Copilot Instructions

## Project context

This repository contains a Spring Boot social bingo app called Soc Ops. The app logic is centered on board assembly, tile selection, and win detection. Keep business logic in the service layer and keep controllers thin.

When making changes:
- Preserve the existing game flow and DOM hooks used by the front-end game engine.
- Prefer small, deterministic edits over broad rewrites.
- Follow the existing Java 21 / Spring Boot 3.4 conventions already used in the project.

## Design guide

### Visual direction

Favor a Scandinavian calm aesthetic for the interface:
- muted sage greens, warm stone neutrals, soft ivory backgrounds
- generous whitespace and restrained layout density
- subtle borders and soft shadowing instead of harsh contrast
- rounded cards and gentle, airy panels
- understated color accents that feel premium rather than noisy

### Typography

Use a quiet editorial feel:
- serif or high-contrast headline typography for brand moments
- clean sans-serif body text for UI labels and game content
- ensure hierarchy is clear without excessive weight or decorative styling

### Interaction style

Keep interactions calm and intentional:
- use subtle motion and micro-interactions, not aggressive animation
- transitions should feel smooth and low-energy
- buttons and tiles should respond gently, never feel flashy or noisy

### Implementation constraints

When styling the app:
- keep class names consistent with the utility-based approach in `socops/src/main/resources/static/css/app.css`
- define shared theme tokens in `:root` before creating component-specific rules
- maintain readability and accessibility, especially contrast and touch targets
- avoid generic "AI slop" aesthetics: no overused purple gradients, stock layouts, or noisy clutter

### Front-end editing guidance

For UI work on the game screen:
- keep the board logic intact and avoid breaking JavaScript hooks
- redesign at the presentation layer only unless the request explicitly requires game logic changes
- prefer polished minimalism over overloaded visual effects
- use subtle depth and atmosphere through gradients, soft layers, and consistent spacing

## Validation

Before claiming work is complete, run the project checks defined in AGENTS.md:
- `cd socops && ./mvnw test`
- `cd socops && ./mvnw clean package`
