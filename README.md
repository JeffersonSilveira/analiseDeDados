# Analise de dados
> Consiste em um sistema simples de importação de arquivos

O objetivo desse projeto é importar arquivo simples, ler e analisar os dados e gerar um relatório.

### Configuração

Uma vez feito o clone do projeto é necessário criar um arquivo de configuração chamado **perfil.conf** dentro da pasta **conf** com o seguinte:
```
usuario = "<nome_usuario>"
senha = "<senha>"
projeto = "<projeto>"
subProjeto = "<sub_projeto>"
tipoAtividade = "<tipo_atividade>"
```

Esses dados serão usados por "default" dentro da aplicação. Existem modos de sobrescreve-los, porém para garantir
um funcionamento estável é inteligente deixar esses campos já configurados.



