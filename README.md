# 🔐 Sistema de Login

## 📌 Introdução

O **Sistema de Login** é um módulo fundamental desenvolvido no contexto da disciplina de Programação Orientada a Objetos (POO). Ele representa um dos componentes centrais da arquitetura do ecossistema da nossa empresa fictícia, sendo responsável por garantir o controle de acesso seguro, a autenticação e a autorização dos usuários.

Este sistema foi projetado aplicando conceitos fundamentais da orientação a objetos — como **encapsulamento**, **herança**, **polimorfismo** e **abstração** —, garantindo modularidade, manutenibilidade e escalabilidade do código-fonte.

---

## 📁 Estrutura do Diretório

A organização do repositório segue uma estrutura padronizada para separar código-fonte, recursos visuais, documentação técnica e materiais de suporte:

```text
SistemaLogin/
│
├── README.md              # Arquivo de documentação do módulo
├── LICENSE                # Licença de uso do projeto (MIT License)
├── .gitignore             # Arquivos e pastas ignorados pelo Git
│
├── src/                   # Código-fonte da aplicação em Java
│
├── resources/             # Recursos estáticos e visuais da interface
│   ├── icons/             # Ícones utilizados na UI
│   └── images/            # Imagens e logos
│
├── database/              # Modelagem e scripts de Banco de Dados
│   ├── DER/               # Diagrama Entidade-Relacionamento (Modelo Conceitual)
│   ├── DL/                # Diagrama Lógico (Modelo Lógico)
│   └── scripts/           # Scripts SQL (Criação de tabelas e inserção de dados)
│
├── docs/                  # Documentação técnica e visual do sistema
│   ├── uml/               # Diagramas UML (Classes, Casos de Uso, Sequência, etc.)
│   ├── ui-ux/             # Protótipos e design da interface do usuário
│   │   ├── wireframes/    # Esboços e estruturas de tela
│   │   ├── mockups/       # Designs de alta fidelidade
│   │   └── prototypes/    # Protótipos interativos
│   ├── diagrams/          # Outros diagramas explicativos do fluxo
│   └── presentations/     # Apresentações e slides do projeto
│
└── support/               # Materiais complementares e de auxílio
    ├── documents/         # Documentos de apoio e especificações
    ├── videos/            # Demonstrações em vídeo do sistema
    ├── tutorials/         # Guias e tutoriais de utilização e execução
    └── references/        # Referências bibliográficas e links úteis