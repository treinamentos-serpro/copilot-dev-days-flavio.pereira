# AGENTS.md

## Mandatory development checklist

Before claiming work is complete, verify all three:

- Lint: run the project lint/quality step if configured for the repo.
- Build: `cd socops && ./mvnw clean package`
- Test: `cd socops && ./mvnw test`

## Project snapshot

This is a Spring Boot social bingo app. The main app lives in [socops](socops/), with Java sources in [socops/src/main/java](socops/src/main/java) and tests in [socops/src/test/java](socops/src/test/java).

See [README.md](README.md) and [workshop/GUIDE.md](workshop/GUIDE.md) for setup and workshop context.

## Conventions

- Use Java 21 and Spring Boot 3.4.
- Keep business logic in simple static helpers like [socops/src/main/java/com/socops/service/BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java).
- Keep controllers thin; HTTP concerns belong in [socops/src/main/java/com/socops/web/BingoRestController.java](socops/src/main/java/com/socops/web/BingoRestController.java).
- Favor small, deterministic logic over framework-heavy patterns.
- Keep changes aligned with board assembly, cell flipping, and win detection.
- Add or update JUnit coverage when changing game logic, especially win detection and edge cases.
- Preserve the existing Thymeleaf setup and styling conventions in [socops/src/main/resources/static/css/app.css](socops/src/main/resources/static/css/app.css).

## Useful references

- [socops/src/test/java/com/socops/service/BoardAssemblerTests.java](socops/src/test/java/com/socops/service/BoardAssemblerTests.java)
- [socops/src/main/resources/templates/game.html](socops/src/main/resources/templates/game.html)
- [socops/pom.xml](socops/pom.xml)

## Agent guidance

- Keep fixes minimal and domain-aligned.
- Inspect the board assembler and its tests before broad refactors.
- Prefer incremental validation over large rewrites.
- Link to existing docs instead of duplicating them.
