<p align="center">
  <pre>
    🔴 🟩 🟩
    🟩 🟩 
    🟩 🟩 🟩
    🟩 🟩
    ╔════════════════════════════════════════════════╗
    ║  I N S T I T U T O   F E D E R A L  ACOPIARA   ║
    ╚════════════════════════════════════════════════╝
  </pre>

  <table>
  <tr>
    <td><img src="https://img.shields.io/badge/Java-24%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"></td>
    <td><img src="https://img.shields.io/badge/Packages-Maven%20%7C%20JAR-blue?style=for-the-badge&logo=apachemaven&logoColor=white"></td>
    <td><img src="https://img.shields.io/badge/System-Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white"></td>
  </tr>
  <tr>
    <td><img src="https://img.shields.io/badge/Pull%20Requests-0-blue?style=for-the-badge&logo=github&logoColor=white"></td>
    <td><img src="https://img.shields.io/badge/Coverity%20Scan-Passing-brightgreen?style=for-the-badge"></td>
  </tr>
</table>

# Scanner de Phishing

Scanner de Phishing é um sistema desenvolvido em Java para detectar possíveis mensagens fraudulentas (phishing) através da análise textual de e-mails e arquivos `.txt`.

O projeto utiliza técnicas de normalização e análise de palavras-chave para identificar padrões frequentemente utilizados em golpes digitais, mesmo quando o texto tenta esconder informações usando caracteres especiais, acentos ou leetspeak.

---

# Objetivos do Projeto

- Detectar palavras e frases comuns em ataques de phishing
- Normalizar textos para evitar técnicas de disfarce
- Converter caracteres leetspeak (`0 → o`, `1 → i`, etc.)
- Remover acentos e caracteres especiais automaticamente
- Calcular uma pontuação de risco baseada em ocorrências suspeitas
- Classificar mensagens como:
  - Baixo risco
  - Possível phishing
  - Alto risco de phishing
- Organizar o sistema utilizando Programação Orientada a Objetos

---

# Features

- **Banco de palavras suspeitas** utilizando `HashMap`
- **Normalização textual avançada**
  - remoção de acentos
  - conversão para minúsculas
  - remoção de símbolos
  - detecção de leetspeak
- **Sistema de pontuação por peso**
  - palavras altamente suspeitas possuem maior valor
- **Detecção de frases completas e palavras individuais**
- **Leitura de arquivos `.txt`**
- **Relatório formatado com `printf`**
- **Classificação automática de risco**
- **Separação de responsabilidades em classes**
- **Compatível com boas práticas de POO**

---

# Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- HashMap
- Regex
- Normalizer API
- Programação Orientada a Objetos

---

# Estrutura do Projeto

```text


📁 src/
│
├── 🟦 Main.java
│
├── 🔵 BancoPhishing.java
│
└── 🔵 NormalizarTexto.java

📄 email1.txt
📄 email2.txt
📄 email3.txt
📄 email4.txt
