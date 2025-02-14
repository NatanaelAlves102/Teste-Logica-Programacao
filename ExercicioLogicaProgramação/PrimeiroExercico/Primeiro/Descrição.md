Desafio: Jogo do Número Secreto
Crie um programa que gera um número aleatório entre 1 e 100 e pede para o usuário adivinhar.

O programa deve dizer se o palpite do usuário está maior ou menor que o número secreto.
O jogo continua até o usuário acertar.
No final, exiba o número de tentativas usadas.



📝 Exemplo de execução esperada:
less
Copiar
Editar
Tente adivinhar o número entre 1 e 100:
Digite um número: 50
Muito alto! Tente novamente.
Digite um número: 25
Muito baixo! Tente novamente.
Digite um número: 37
Parabéns! Você acertou em 3 tentativas.



🎯 Dicas para implementar:
Gerar um número aleatório: Use Random ou Math.random().
Repetição: Use um loop while para continuar até acertar.
Entrada do usuário: Use Scanner para ler os palpites.
Contador de tentativas: Incremente uma variável a cada palpite.