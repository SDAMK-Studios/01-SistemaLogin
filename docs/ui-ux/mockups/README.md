# 🖼️ Mockups e Design de Interface (`mockups/`)

## 📌 Introdução

A pasta `mockups/` armazena as representações visuais de alta fidelidade do **Sistema de Login** e das telas integradas ao seu ecossistema. 

Os mockups servem como guia estético e estrutural para o desenvolvimento da Interface Gráfica do Usuário (GUI), definindo a disposição dos elementos, a paleta de cores, a tipografia, a navegação entre cenários e a experiência do usuário (UX) antes e durante a implementação do código em Java.

---

## 🖼️ Mapeamento e Fluxo do Sistema (`SistemaLogin V1.1.0.png`)

O arquivo **`SistemaLogin V1.1.0.png`** apresenta a arquitetura visual e o fluxo de navegação completo da aplicação após a autenticação do usuário.

```text
               ┌──────────────┐
               │    Login     │
               └──────┬───────┘
                      │ (Leva para o Menu Principal)
                      ▼
               ┌──────────────┐
               │Menu Principal│
               └──────┬───────┘
          ┌───────────┴───────────┐
          │                       │
          ▼                       ▼
┌──────────────────┐    ┌──────────────────┐
│Agenda de Contatos│    │       Jogo       |
│  (Banco SQL)     │    │  (Mapa Pokémon)  │
└──────────────────┘    └──────────────────┘