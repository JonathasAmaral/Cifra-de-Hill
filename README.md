# Cifra-de-Hill

Esse projeto é uma atividade acadêmica sobre criptografia utilizando o algorítimo da **Cifra de Hill**. A Cifra de Hill é uma técnica de criptografia poligráfica baseada em álgebra linear. Ela utiliza matrizes para criptografar blocos de texto, proporcionando maior segurança em comparação com cifras monoalfabéticas simples.

## Tecnologias Utilizadas

O projeto utiliza as seguintes tecnologias:

- **Java**: A linguagem principal utilizada para implementar o algoritmo de criptografia da Cifra de Hill.
- **JavaScript**: Utilizado para manipulações e interações na interface web.
- **CSS**: Para estilização da interface web, proporcionando um visual agradável e responsivo.
- **HTML**: A estrutura básica da interface web.

## O que é a Cifra de Hill?

A Cifra de Hill é um método de criptografia que transforma blocos de texto claro em blocos de texto cifrado utilizando multiplicação matricial. Foi inventada por Lester S. Hill em 1929. 

### Funcionamento

1. **Chave**: A chave da Cifra de Hill é uma matriz quadrada invertível de ordem n (n x n).
2. **Texto Claro**: O texto claro é dividido em blocos de tamanho n.
3. **Criptografia**: Cada bloco de texto claro é representado como um vetor coluna e multiplicado pela matriz chave, resultando em um vetor coluna de texto cifrado.
4. **Descriptografia**: Para descriptografar, o texto cifrado é multiplicado pela matriz inversa da chave.

### Exemplo

Se a chave for uma matriz 2x2 e o texto claro for "HI", os passos seriam:

1. Converter "HI" em números, por exemplo, H=7 e I=8.
2. Formar um vetor coluna:


## Contribuição

Se você deseja contribuir com este projeto, sinta-se à vontade para abrir issues e pull requests. Agradecemos sua ajuda!

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
