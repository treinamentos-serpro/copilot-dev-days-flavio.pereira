<div align="center">

# 🎲 Soc Ops

**Social Bingo for in-person mixers — powered by Spring Boot & GitHub Copilot**

Find people who match each prompt. First to get 5 in a row wins!

[![Java 21](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4-brightgreen?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![GitHub Copilot](https://img.shields.io/badge/GitHub%20Copilot-Lab-blue?logo=github&logoColor=white)](workshop/GUIDE.md)

[🎮 Live Demo](https://copilot-dev-days.github.io/agent-lab-java/) · [📚 Lab Guide](workshop/GUIDE.md) · 🌐 [Português](README.pt_BR.md) | [Español](README.es.md)

</div>

---

## ✨ What is Soc Ops?

Soc Ops is a **real-time social bingo game** built for workshops and team events. Each player gets a unique 5×5 bingo card filled with prompts like *"Has worked remotely for 3+ years"* or *"Speaks more than two languages"*. Mingle with the room, find matches, and flip your cells — first to 5 in a row wins!

It's also a **hands-on GitHub Copilot lab**: you'll use AI agents to redesign the UI, generate custom quiz themes, and build new game features — all with guided steps.

---

## 🗺️ Lab Guide

Work through the lab in order, or jump to any part:

| # | Part | What you'll do | Time |
|---|------|---------------|------|
| [00](workshop/00-overview.md) | **Overview & Checklist** | Get oriented, verify prerequisites | — |
| [01](workshop/01-setup.md) | **Setup & Context Engineering** | Wire up Copilot, generate workspace instructions | 15 min |
| [02](workshop/02-design.md) | **Design-First Frontend** | Redesign the UI with Plan Mode & cloud agents | 15 min |
| [03](workshop/03-quiz-master.md) | **Custom Quiz Master** | Create themed bingo prompts with a custom agent | 10 min |
| [04](workshop/04-multi-agent.md) | **Multi-Agent Development** | TDD Red→Green→Refactor, Pixel Jam, UX Review | 20 min |

> 📁 All guides are available in [`workshop/`](workshop/) for offline reading.

---

## 🚀 Quick Start

### Prerequisites
- [Java 21 JDK](https://adoptium.net/) or higher
- [Apache Maven 3.9+](https://maven.apache.org/) (or use the included Maven Wrapper)
- VS Code v1.107+ with GitHub Copilot (Pro / Business / Enterprise)

### Run locally

```bash
cd socops
./mvnw spring-boot:run
```

Open [http://localhost:8080](http://localhost:8080) and start a game.

### Other commands

```bash
# Build
./mvnw clean package

# Test
./mvnw test
```

> 🚢 Pushes to `main` deploy automatically to GitHub Pages.

---

## 🎭 Theme Ideas

Minimalist Mono · Retro Terminal · Cyberpunk Neon · Vaporwave Sunset · Dark Mode Noir · Pixel Arcade · Space Galaxy · Brutalist Blocks · Soft Pastel · Gradient Glass

## 🎲 Quiz Themes

Skill Bingo · Tech Life · Chaos Bingo · Travel · Fandom · Office Humor · Personality · Deep Chat · Opposites · Mystery

---

## 🔗 Resources

- [VS Code YouTube](https://www.youtube.com/code)
- [GitHub Copilot Docs](https://code.visualstudio.com/docs/copilot/overview)
- [Awesome Copilot](https://github.com/github/awesome-copilot)

---

<div align="center">

Made with ☕ Java and 🤖 GitHub Copilot

</div>
