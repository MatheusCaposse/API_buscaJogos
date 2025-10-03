🎮 AppJogo

O AppJogo é uma aplicação desenvolvida em Java com Spring Boot que consome dados de uma API de jogos e permite que os usuários pesquisem, salvem e consultem informações de jogos diretamente em um banco de dados. Além disso, o sistema pode gerar descrições automáticas dos jogos através de integração com a API Gemini.

✨ Funcionalidades
 - 🔍 Buscar jogos em uma API externa
 - 💾 Salvar jogos encontrados diretamente no banco de dados
 - 📋 Consultar jogos cadastrados
 - 📝 Visualizar detalhes de cada jogo
 - 🤖 Gerar descrição automática dos jogos via Gemini API

🛠️ Tecnologias Utilizadas
 - Java 17
 - Spring Boot
 - Spring Data JPA
 - Hibernate
 - Banco de Dados Relacional (PostgreSQL)
 - API Externa de Jogos
 - API Gemini

📂 Estrutura do Projeto
 - controller → Controladores REST
 - model → Entidades e records
 - repository → Interfaces JPA
 - service → Regras de negócio
 - AppJogo.java → Classe principal
 - application.properties → Configurações
 - 
📖 Exemplos de Uso
 - Buscar jogo: GET /jogos/buscar?nome=The Witcher
 - Salvar jogo: POST /jogos
 - Consultar jogos cadastrados: GET /jogos
