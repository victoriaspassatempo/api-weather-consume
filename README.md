# Instruções para Usar o Projeto de Consulta da Previsão do Tempo

### Este projeto utiliza a OpenWeatherMap API para fornecer informações sobre a previsão do tempo. Siga as etapas abaixo para configurar e utilizar o projeto.

## Passo 1: Gerar uma API Key na OpenWeatherMap

1. Acesse o site da OpenWeatherMap em (https://openweathermap.org)
2. Faça login na sua conta ou registre-se para obter uma nova conta.
3. Após fazer login, clique no seu nome e aparecerá um menu.
4. Selecione My API Keys ou "Minhas Chaves de API".
5. Você pode gerar uma chave ou utilizar a default.
7. Copie a chave de API gerada. Você precisará dessa chave para configurar o projeto.

## Passo 2: Configurar a Chave de API no Aplication Properties

1. Abra o arquivo `application.properties` do projeto.
2. Substitua pela sua chave, onde se encontra: {{SUA_CHAVE_AQUI}} pela chave de API que você gerou na OpenWeatherMap.

## Passo 3: Executar o Projeto

1. Certifique-se de que todas as dependências do projeto estejam corretamente configuradas.
2. Inicie a aplicação.
3. Após iniciar a aplicação, você pode acessar o endpoint da API (curl http://localhost:8080/weather/{{cidade}}) para obter informações sobre a previsão do tempo.

## Exemplos de Uso
1. http://localhost:8080/weather/SÃO+PAULO
2. http://localhost:8080/weather/SÃO PAULO
Ela vai funcionar corretamente, pois esta utilizando encode que a API necessita para localizar a cidade, por ser uma API global é possivel consultar outras cidades ou paises.

##Response: 
```json

[
    [
        {
            "name": "São Paulo",
            "main": {
                "temp": 19.54,
                "temp_min": 18.2,
                "temp_max": 21.36
            }
        }
    ]
]
````
P.S: A API original retorna a temperatura em Kelvin, contudo foi alterada para Celsius para melhor entendimento do Tempo, pois é o padrão utilizado no Brasil.


P.S²: Fique a vontade para dar feedback! :smile: 
