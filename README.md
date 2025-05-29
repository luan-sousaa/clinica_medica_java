# 🏥 Clínica Médica em Java

Este projeto simula uma clínica médica utilizando conceitos de **Programação Orientada a Objetos (POO)** em Java, com foco em boas práticas como **encapsulamento, herança, polimorfismo e interfaces**. O objetivo principal é demonstrar um sistema básico que pode ser evoluído para aplicações maiores com banco de dados, interface gráfica e integração com APIs.

## ✨ Funcionalidades

- Cadastro e gestão de pacientes e médicos
- Agendamento de consultas
- Processamento de pagamentos
- Simulação de status de pagamento
- Implementação de interfaces e controle de exceções

## 📁 Estrutura do Projeto

br.com.clinica.lady/
├── Pagamento.java # Classe que implementa a interface Ipag
├── Paciente.java # Classe representando os pacientes
├── Medico.java # Classe representando os médicos
├── Consulta.java # Classe que modela as consultas
└── interface_pag/Ipag.java # Interface com métodos de pagamento

markdown
Copiar
Editar

## 🛠️ Tecnologias Utilizadas

- Java 17
- Paradigma de Programação Orientada a Objetos (POO)
- IDE recomendada: IntelliJ IDEA ou Eclipse

## 🧪 Exemplos de Código

### Exemplo de uso de interface (polimorfismo):

```java
Ipag pagamento = new Pagamento(101, 202);
pagamento.processar_pagamento("PIX");
pagamento.pagar_consulta(150.00);
pagamento.consultar_status_pagamento(true);
Exemplo de tratamento de exceções:
java
Copiar
Editar
if (valor <= 0) {
    throw new IllegalArgumentException("Valor inválido.");
}
📌 Aprendizados
Este projeto foi essencial para:

Consolidar conceitos de Java e POO

Praticar controle de exceções (try-catch)

Aplicar polimorfismo via interfaces

Criar um projeto Java modularizado e comentado
