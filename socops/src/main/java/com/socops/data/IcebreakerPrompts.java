package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "ESPAÇO LIVRE";

    public static final List<String> ALL_PROMPTS = List.of(
            "já programou em mais de uma linguagem",
            "tem um atalho de teclado favorito",
            "já criou um projeto por diversão",
            "prefere teclado mecânico",
            "já participou de um hackathon",
            "tem um aplicativo indispensável",
            "já corrigiu um bug de madrugada",
            "usa tema escuro no editor",
            "já montou ou atualizou um computador",
            "tem uma playlist para trabalhar",
            "já ensinou alguém a usar uma tecnologia",
            "sabe explicar uma tecnologia de forma simples",
            "já automatizou uma tarefa repetitiva",
            "tem um gadget que não vive sem",
            "já trabalhou em um projeto open source",
            "já encontrou uma solução em um fórum",
            "prefere linha de comando a interface gráfica",
            "já perdeu horas por causa de um detalhe no código",
            "tem uma extensão favorita no navegador",
            "já fez um curso de tecnologia por conta própria",
            "conhece um easter egg de algum software",
            "já apresentou uma ideia usando tecnologia",
            "pode mostrar um truque digital em cinco segundos",
            "aceita jogar pedra, papel e tesoura"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
